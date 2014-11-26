package net.contact.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Generated;
 
@Entity
@Table(name="VIRTUALSHELF")
public class VirtualShelf {
     
    @Id
    @Column(name="LIB_ID")
    @GeneratedValue
    private String lib_id;
     
    @Column(name="DATE_ADDED")
    private String date_added;
    
    //Column to specify whether user issued the book earlier or not
    @Column(name="READ_STATUS",columnDefinition="default no")
    private String read_status="no";
 
    //Column to specify whether user is currently holding the book  not
    @Column(name="HOLDING",columnDefinition="default no")
    private String holding="no";
     
    //Column to specify whether user has placed and request against this book. It changes to "processed" once the book is issued
    @Column(name="REQUEST_PLACED",columnDefinition="default none")
    private String request_placed="none";
 
    
    @ManyToOne
    @JoinColumn(name="ISBN")
    private Book book;
    
    @ManyToOne
    @JoinColumn(name="CUST_ID")
    private Register register;
  
    
    //Getters and setters
	public String getLib_id() {
		return lib_id;
	}

	public void setLib_id(String lib_id) {
		this.lib_id = lib_id;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public String getRead_status() {
		return read_status;
	}

	public void setRead_status(String read_status) {
		this.read_status = read_status;
	}

	public String getHolding() {
		return holding;
	}

	public void setHolding(String holding) {
		this.holding = holding;
	}

	public String getRequest_placed() {
		return request_placed;
	}

	public void setRequest_placed(String request_placed) {
		this.request_placed = request_placed;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

    
    
	

}
