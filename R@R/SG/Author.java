package net.contact.form;


import java.io.Serializable;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="AUTHOR")
public class Author implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="AUTHOR_ID")
    private String author_id;
     
    @Column(name="AUTHOR_NAME")
    private String author_name;
     
    @Column(name="AUTH_EMAIL")
    private String author_email;
     
    @Column(name="AUTHOR_ADDRESS")
    private String author_address;
     
    @OneToMany(mappedBy="author")
    private Set<Book> book;

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAuthor_email() {
		return author_email;
	}

	public void setAuthor_email(String author_email) {
		this.author_email = author_email;
	}

	public String getAuthor_address() {
		return author_address;
	}

	public void setAuthor_address(String author_address) {
		this.author_address = author_address;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   
	
	
    
}