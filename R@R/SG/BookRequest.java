package net.contact.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKREQUEST")
public class BookRequest {

	/**
	 * @param args
	 */

	@Id
	@Column(name = "REQUEST_ID")
	@GeneratedValue
	private Integer request_id;

	@Column(name = "REQUEST_TYPE")
	private String request_type;

	@Column(name = "REQUEST_STATUS")
	private String request_status;

	@Column(name = "REQUEST_DATE")
	private String request_date;

	@Column(name = "REQUEST_ADDRESS")
	private String request_address;

	@Column(name = "HOLDING")
	private String holding = "no";

	@ManyToOne
	@JoinColumn(name = "CUST_ID")
	private Register register;

	@ManyToOne
	@JoinColumn(name = "ISBN")
	private Book book;

	@OneToOne(mappedBy = "bookRequest")
	private ReturnRequest returnRequest;

	public ReturnRequest getReturnRequest() {
		return returnRequest;
	}

	public void setReturnRequest(ReturnRequest returnRequest) {
		this.returnRequest = returnRequest;
	}

	public Integer getRequest_id() {
		return request_id;
	}

	public void setRequest_id(Integer request_id) {
		this.request_id = request_id;
	}

	public String getRequest_type() {
		return request_type;
	}

	public void setRequest_type(String request_type) {
		this.request_type = request_type;
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

	public String getHolding() {
		return holding;
	}

	public void setHolding(String holding) {
		this.holding = holding;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
