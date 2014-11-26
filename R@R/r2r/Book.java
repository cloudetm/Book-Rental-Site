package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the Book database table.
 * 
 */
@Entity
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int bookId;

	private String author;

	private String description;

	private String genre;

	private String image;

	private String isbn;

	private String publishedOn;

	private String publisher;

	private BigDecimal rating;

	private byte status;

	private String title;

	//bi-directional many-to-many association to Customer
	@ManyToMany
	@JoinTable(
		name="Cart"
		, joinColumns={
			@JoinColumn(name="bookId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="custEmail")
			}
		)
	private List<Customer> customers1;

	//bi-directional many-to-many association to Order
	@ManyToMany(mappedBy="books")
	private List<Order> orders;

	//bi-directional many-to-many association to Customer
	@ManyToMany
	@JoinTable(
		name="Wishlist"
		, joinColumns={
			@JoinColumn(name="bookId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="custEmail")
			}
		)
	private List<Customer> customers2;

	public Book() {
	}

	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublishedOn() {
		return this.publishedOn;
	}

	public void setPublishedOn(String publishedOn) {
		this.publishedOn = publishedOn;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BigDecimal getRating() {
		return this.rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Customer> getCustomers1() {
		return this.customers1;
	}

	public void setCustomers1(List<Customer> customers1) {
		this.customers1 = customers1;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Customer> getCustomers2() {
		return this.customers2;
	}

	public void setCustomers2(List<Customer> customers2) {
		this.customers2 = customers2;
	}

}