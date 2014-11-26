package net.contact.form;


import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="CATEGORY")
public class Category {
 
    @Id
    @Column(name="CATEGORY_ID")
    private String category_id="cat_1";
     
    @Column(name="CATEGORY_NAME")
    private String category_name;
     
     
    @OneToMany(mappedBy="category")
    private Set<Book> book;


	public String getCategory_id() {
		return category_id;
	}


	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public Set<Book> getBook() {
		return book;
	}


	public void setBook(Set<Book> book) {
		this.book = book;
	}
 
    
}