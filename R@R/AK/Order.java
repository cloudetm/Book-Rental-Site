package model;

import java.util.Set; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the Order database table.
 * 
 */
@Entity
@Table(name="Order")

public class Order{

	@Id
	@Column(name="orderId")
	private int orderId;
    @Column(name="orderDate")
	private BigInteger orderDate;
    @Column(name="status")
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