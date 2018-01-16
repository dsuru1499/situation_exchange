package situation_exchange.common;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public abstract class DefaultParameters {

	private LocalDateTime now = LocalDateTime.now();

}
