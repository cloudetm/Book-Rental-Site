package net.contact.form;


import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="PUBLISHER")
public class Publisher {
 
    @Id
    @Column(name="PUBLISHER_ID")
    private String publisher_id;
     
    @Column(name="PUBLICATION_NAME")
    private String publication_name;
     
    @Column(name="PUBLICATION_ADDRESS")
    private String publication_address;
     
    @OneToMany(mappedBy="publisher")
    private Set<Book> book;

	public String getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(String publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getPublication_name() {
		return publication_name;
	}

	public void setPublication_name(String publication_name) {
		this.publication_name = publication_name;
	}

	public String getPublication_address() {
		return publication_address;
	}

	public void setPublication_address(String publication_address) {
		this.publication_address = publication_address;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}
 
    
}