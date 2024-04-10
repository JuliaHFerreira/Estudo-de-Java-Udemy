package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItens = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItens;
	}
	
	public void addOrderItem(OrderItem orderItem) {
		orderItens.add(orderItem);	
	}
	
	public void removeOrderItem(OrderItem orderItem) {
		orderItens.remove(orderItem);	
	}
	
	public Double total() {
		double result=0;
		for(OrderItem o : orderItens) {
			result += o.subTotal();
		}
		return result;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for(OrderItem o : orderItens) {
			sb.append(o.getProduct().getName()+ ", $" + String.format("%.2f", o.getProduct().getPrice()) + ", Quantity: " + o.getQuantity() + ", Subtotal: $" + String.format("%.2f", o.subTotal()) + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
	
}
