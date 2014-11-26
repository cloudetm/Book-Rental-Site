package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the SubscriptionOrder database table.
 * 
 */
@Entity
public class SubscriptionOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int subsOrderId;

	private BigInteger subsOrderDate;

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
		return this.subsOrderId;
	}

	public void setSubsOrderId(int subsOrderId) {
		this.subsOrderId = subsOrderId;
	}

	public BigInteger getSubsOrderDate() {
		return this.subsOrderDate;
	}

	public void setSubsOrderDate(BigInteger subsOrderDate) {
		this.subsOrderDate = subsOrderDate;
	}

	public byte getSubsOrderStatus() {
		return this.subsOrderStatus;
	}

	public void setSubsOrderStatus(byte subsOrderStatus) {
		this.subsOrderStatus = subsOrderStatus;
	}

	public SubscriptionPlan getSubscriptionPlan() {
		return this.subscriptionPlan;
	}

	public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}