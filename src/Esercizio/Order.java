package Esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products; 
	private Customer customer;
	
	public Order(long _id, String _status, LocalDate _orderDate, LocalDate _deliveryDate, List<Product> _products, Customer _customer ) {
		
		this.id = _id;
		this.status = _status;
		this.orderDate = _orderDate;
		this.deliveryDate = _deliveryDate;
		this.products = _products;
		this.customer = _customer;
		
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", products=" + products + ", customer=" + customer + "]";
	}
	
	

}
