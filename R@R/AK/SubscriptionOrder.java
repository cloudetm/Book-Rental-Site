package model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the SubscriptionOrder database table.
 * 
 */
@Entity
	@Table(name="SubscriptionOrder")
public class SubscriptionOrder{
	

	@Id
		@Column(name="subsOrderId")
	private int subsOrderId;
	    @Column(name="subsOrderDate")
	private BigInteger subsOrderDate;
	    @Column(name="subsOrderStatus")
	private byte subsOrderStatus;

	//bi-directional many-to-one association to SubscriptionPlan
	@ManyToOne
	@JoinColumn(name="subsId")
	private SubscriptionPlan subscriptionPlan;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="custEmail")
	private Customer customer;

	public SubscriptionOrder() {
	}

	public int getSubsOrderId() {
		return subsOrderId;
	}

	public void setSubsOrderId(int subsOrderId) {
		this.subsOrderId = subsOrderId;
	}

	public BigInteger getSubsOrderDate() {
		return subsOrderDate;
	}

	public void setSubsOrderDate(BigInteger subsOrderDate) {
		this.subsOrderDate = subsOrderDate;
	}

	public byte getSubsOrderStatus() {
		return subsOrderStatus;
	}

	public void setSubsOrderStatus(byte subsOrderStatus) {
		this.subsOrderStatus = subsOrderStatus;
	}

	public SubscriptionPlan getSubscriptionPlan() {
		return subscriptionPlan;
	}

	public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}