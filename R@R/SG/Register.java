package net.contact.form;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="CUSTOMER")
public class Register {
     
    @Id
    @Column(name="CUST_ID")
    @GeneratedValue
    private Integer cust_id;
     
    @Column(name="CUST_NAME")
    private String cust_name;
    
    @Column(name="CUST_DOB")
    private Date cust_DOB;
 
    @Column(name="CUST_EMAIL")
    private String cust_email;
     
    @Column(name="PHONE_NO")
    private String phone_no;
 
    @Column(name="ADDRESS")
    private String address;
    
    @Column(name="STATE")
    private String state;
    
    @Column(name="PIN_NO")
    private String pin_no;
    
    @Column(name="PASSWORD")
    private String password;
    
    @Column(name="SUBS_ID")
    private String subs_id;
    
    @Column(name="ROLE", columnDefinition="default user")
    private String role="user";
    
    @Column(name="GENDER")
    private String gender;
    
    @OneToMany(mappedBy="register")
    private Set<UserSubscription> userSubscription;
    
    @OneToMany(mappedBy="register")
    private Set<VirtualShelf> virtualShelf;

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Date getCust_DOB() {
		return cust_DOB;
	}

	public void setCust_DOB(Date cust_DOB) {
		this.cust_DOB = cust_DOB;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin_no() {
		return pin_no;
	}

	public void setPin_no(String pin_no) {
		this.pin_no = pin_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubs_id() {
		return subs_id;
	}

	public void setSubs_id(String subs_id) {
		this.subs_id = subs_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<UserSubscription> getUserSubscription() {
		return userSubscription;
	}

	public void setUserSubscription(Set<UserSubscription> userSubscription) {
		this.userSubscription = userSubscription;
	}

	public Set<VirtualShelf> getVirtualShelf() {
		return virtualShelf;
	}

	public void setVirtualShelf(Set<VirtualShelf> virtualShelf) {
		this.virtualShelf = virtualShelf;
	}


    
}