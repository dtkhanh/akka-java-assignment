/**
 * 
 */
package shopping.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shopping.order.entity.OrderStatus;

import java.time.LocalDateTime;

/**
 * @author loinguyenx
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
	private String orderId;
	private OrderStatus orderStatus;
	private long productId;
	private long quantity;
	private LocalDateTime orderDate;
	private long amount;
}
