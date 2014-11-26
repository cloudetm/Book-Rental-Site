package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Order database table.
 * 
 */
@Entity
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int orderId;

	private BigInteger orderDate;

	private String status;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="custEmail")
	private Customer customer;

	//bi-directional many-to-many association to Book
	@ManyToMany
	@JoinTable(
		name="OrderedCart"
		, joinColumns={
			@JoinColumn(name="orderId")
			}
		, joinColumns={
			@JoinColumn(name="bookId")
			}
		)
	private List<Book> books;

	public Order() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public BigInteger getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(BigInteger orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Book> getBooks() {
		return this.books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}