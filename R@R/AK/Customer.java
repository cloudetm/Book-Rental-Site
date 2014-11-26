package model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the Customer database table.
 * 
 */
@Entity
@Table(name="Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="custEmail")
	private String custEmail;

	@Column(name="custAddress")
	private String custAddress;

	@Column(name="custCity")
	private String custCity;
	
	@Column(name="custCountry")
	private String custCountry;

	@Column(name="custDOB")
	private Date custDOB;

	@Column(name="custFirstName")
	private String custFirstName;
	
	@Column(name="custIsVerified")
	private byte custIsVerified;

	@Column(name="custLanguage")
	private String custLanguage;
	
	@Column(name="custLastName")
	private String custLastName;
	
@Column(name="custMiddleName")
	private String custMiddleName;
	
@Column(name="custMobileNo")
	private BigInteger custMobileNo;
	
@Column(name="custPasskey")
	private String custPasskey;
	
@Column(name="custPassword")
	private String custPassword;
	
@Column(name="custPincode")
	private BigInteger custPincode;
	
@Column(name="custRegDate")
	private BigInteger custRegDate;
	
@Column(name="custState")
	private String custState;

	@OneToMany(mappedBy="Customer")
	private List<Order> orders;
	
	@OneToMany(mappedBy="SubscriptionOrder")
	private List<SubscriptionOrder> subsOrders;
	
	
	public String getcustEmail() {
		return custEmail;
	}

	public void setcustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustCountry() {
		return custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	public Date getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public byte getCustIsVerified() {
		return custIsVerified;
	}

	public void setCustIsVerified(byte custIsVerified) {
		this.custIsVerified = custIsVerified;
	}

	public String getCustLanguage() {
		return custLanguage;
	}

	public void setCustLanguage(String custLanguage) {
		this.custLanguage = custLanguage;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustMiddleName() {
		return custMiddleName;
	}

	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}

	public BigInteger getCustMobileNo() {
		return custMobileNo;
	}

	public void setCustMobileNo(BigInteger custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	public String getCustPasskey() {
		return custPasskey;
	}

	public void setCustPasskey(String custPasskey) {
		this.custPasskey = custPasskey;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public BigInteger getCustPincode() {
		return custPincode;
	}

	public void setCustPincode(BigInteger custPincode) {
		this.custPincode = custPincode;
	}

	public BigInteger getCustRegDate() {
		return custRegDate;
	}

	public void setCustRegDate(BigInteger custRegDate) {
		this.custRegDate = custRegDate;
	}

	public String getCustState() {
		return custState;
	}

	public void setCustState(String custState) {
		this.custState = custState;
	}

	public List<Book> getBooks1() {
		return books1;
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}