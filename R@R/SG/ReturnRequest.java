package net.contact.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="returnrequest")
public class ReturnRequest {

	 @Id  
	 @Column(name = "REQUEST_ID")  
	 @GeneratedValue(generator = "gen")   
	 @GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "bookRequest"))  
	 private int request_id;  
	  
	 @Column(name = "REQUEST_STATUS")  
	 private String request_status;  
	  
	 @Column(name = "REQUEST_DATE")  
	 private String request_date;  
	  
	 @Column(name = "REQUEST_ADDRESS")  
	 private String request_address;  
	    
	 @OneToOne  
	 @PrimaryKeyJoinColumn  
	 private BookRequest bookRequest;

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public String getRequest_status() {
		return request_status;
	}

	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}

	public String getRequest_date() {
		return request_date;
	}

	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}

	public String getRequest_address() {
		return request_address;
	}

	public void setRequest_address(String request_address) {
		this.request_address = request_address;
	}

	public BookRequest getBookRequest() {
		return bookRequest;
	}

	public void setBookRequest(BookRequest bookRequest) {
		this.bookRequest = bookRequest;
	}

	
	 

}
