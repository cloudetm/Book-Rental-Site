package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Customer database table.
 * 
 */
@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String custEmail;

	@Lob
	private String custAddress;

	private String custCity;

	private String custCountry;

	@Temporal(TemporalType.DATE)
	private Date custDOB;

	private String custFirstName;

	private byte custIsVerified;

	private String custLanguage;

	private String custLastName;

	private String custMiddleName;

	private BigInteger custMobileNo;

	private String custPasskey;

	private String custPassword;

	private BigInteger custPincode;

	private BigInteger custRegDate;

	private String custState;

	@OneToMany(mappedBy="Customer")
	private List<Order> orders;
	
	@OneToMany(mappedBy="SubscriptionOrder")
	private List<SubscriptionOrder> subsOrders;
	
	public Customer() {
	}

	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustAddress() {
		return this.custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustCity() {
		return this.custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustCountry() {
		return this.custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	public Date getCustDOB() {
		return this.custDOB;
	}

	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustFirstName() {
		return this.custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public byte getCustIsVerified() {
		return this.custIsVerified;
	}

	public void setCustIsVerified(byte custIsVerified) {
		this.custIsVerified = custIsVerified;
	}

	public String getCustLanguage() {
		return this.custLanguage;
	}

	public void setCustLanguage(String custLanguage) {
		this.custLanguage = custLanguage;
	}

	public String getCustLastName() {
		return this.custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustMiddleName() {
		return this.custMiddleName;
	}

	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}

	public BigInteger getCustMobileNo() {
		return this.custMobileNo;
	}

	public void setCustMobileNo(BigInteger custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	public String getCustPasskey() {
		return this.custPasskey;
	}

	public void setCustPasskey(String custPasskey) {
		this.custPasskey = custPasskey;
	}

	public String getCustPassword() {
		return this.custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public BigInteger getCustPincode() {
		return this.custPincode;
	}

	public void setCustPincode(BigInteger custPincode) {
		this.custPincode = custPincode;
	}

	public BigInteger getCustRegDate() {
		return this.custRegDate;
	}

	public void setCustRegDate(BigInteger custRegDate) {
		this.custRegDate = custRegDate;
	}

	public String getCustState() {
		return this.custState;
	}

	public void setCustState(String custState) {
		this.custState = custState;
	}

	public List<Book> getBooks1() {
		return this.books1;
	}

	public void setBooks1(List<Book> books1) {
		this.books1 = books1;
	}

	public List<Order> getOrders(){
		return orders;
	}

	public void setOrders(List<Order> orders){
		this.orders = orders;
	}
	
	public List<SubscriptionOreder> getSubsOrders{
		return subsOrders;
	}
	
	
}