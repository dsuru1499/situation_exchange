package situation_exchange.common;

import java.util.Objects;
import java.util.function.Consumer;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

import lombok.extern.log4j.Log4j;

@Log4j
public class MonitorSubscriber<T> implements Subscriber<T> {

	private Monitor monitor;
	private Consumer<? super T> onNext;
	private Consumer<? super Throwable> onError;
	private Runnable onComplete;
	private String label;

	public MonitorSubscriber(String label, Consumer<? super T> onNext, Consumer<? super Throwable> onError, Runnable onComplete) {
		this.label = label;
		Objects.requireNonNull(onNext, "onNext");
		this.onNext = onNext;
		this.onError = onError;
		this.onComplete = onComplete;
	}

	@Override
	public void onSubscribe(Subscription s) {
		monitor = MonitorFactory.start(label);
		s.request(Long.MAX_VALUE);
	}

	@Override
	public void onNext(T t) {
		onNext.accept(t);
	}

	@Override
	public void onError(Throwable t) {
		try {
			if (onError != null)
				onError.accept(t);
		} finally {
			stop();
		}
	}

	@Override
	public void onComplete() {
		try {
			if (onComplete != null)
				onComplete.run();
		} finally {
			stop();
		}
	}

	protected void stop() {
		log.info(Color.YELLOW + monitor.stop() + Color.NORMAL);
	}

	public static <T> MonitorSubscriber<T> create(String label, Consumer<? super T> onNext) {
		return MonitorSubscriber.create(label, onNext, null, null);
	}

	public static <T> MonitorSubscriber<T> create(String label, Consumer<? super T> onNext, Consumer<? super Throwable> onError) {
		return MonitorSubscriber.create(label, onNext, onError, null);
	}

	public static <T> MonitorSubscriber<T> create(String label, Consumer<? super T> onNext, Consumer<? super Throwable> onError,
			Runnable onComplete) {
		return new MonitorSubscriber<>(label, onNext, onError, onComplete);
	}
}