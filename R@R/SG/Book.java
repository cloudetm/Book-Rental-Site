package net.contact.form;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 
@Entity
@Table(name="BOOK")
public class Book {
     
    @Id
    @Column(name="ISBN")
    private String isbn;
     
    @Column(name="BOOK_TITLE")
    private String book_title;
    
    @Column(name="BOOK_IMG")
    private String book_img;
 
    @Column(name="BOOK_DESP")
    private String book_desp;
     
    @Column(name="TOTAL_COPIES")
    private Integer total_copies;
 
    @Column(name="PRICE")
    private Integer price;
    
    @ManyToOne
    @JoinColumn(name="AUTHOR_ID")
    private Author author;
    
    @ManyToOne
    @JoinColumn(name="PUBLISHER_ID")
    private Publisher publisher;
    
    @Column(name="RATING")
    private Integer rating;
    
    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    
    @OneToMany(mappedBy="book")
    private Set<VirtualShelf> virtualShelf;


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getBook_title() {
		return book_title;
	}


	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}


	public String getBook_img() {
		return book_img;
	}


	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}


	public String getBook_desp() {
		return book_desp;
	}


	public void setBook_desp(String book_desp) {
		this.book_desp = book_desp;
	}


	public Integer getTotal_copies() {
		return total_copies;
	}


	public void setTotal_copies(Integer total_copies) {
		this.total_copies = total_copies;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public Publisher getPublisher() {
		return publisher;
	}


	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Set<VirtualShelf> getVirtualShelf() {
		return virtualShelf;
	}


	public void setVirtualShelf(Set<VirtualShelf> virtualShelf) {
		this.virtualShelf = virtualShelf;
	}
    
	
    
    
}