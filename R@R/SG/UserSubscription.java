package net.contact.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="USERSUBSCRIPTION")
public class UserSubscription {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="STATUS")
    private String status;
    
    @Column(name="START_DATE")
    private String start_date;
 
    @Column(name="END_DATE")
    private String end_date;

    @Column(name="BOOK_NO")
    private Integer book_no;
 
    @ManyToOne
    @JoinColumn(name="CUST_ID")
    private Register register;
    
    
    @ManyToOne
    @JoinColumn(name="SUBS_ID")
    private Subscription subscription;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getStart_date() {
		return start_date;
	}


	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}


	public String getEnd_date() {
		return end_date;
	}


	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	public Integer getBook_no() {
		return book_no;
	}


	public void setBook_no(Integer book_no) {
		this.book_no = book_no;
	}


	public Register getRegister() {
		return register;
	}


	public void setRegister(Register register) {
		this.register = register;
	}


	public Subscription getSubscription() {
		return subscription;
	}


	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}


    
}