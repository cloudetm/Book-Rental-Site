package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the SubscriptionPlan database table.
 * 
 */
@Entity
public class SubscriptionPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int subsId;

	private int subsDeliveries;

	private int subsDeliveryCharges;

	private int subsDuration;

	private int subsMaxMagzines;

	private int subsMembershipFee;

	private String subsName;

	private int subsPerDelivery;

	private int subsRefundableSecurity;

	private BigDecimal subsSubscriptionFee;

	private String subsSuitableFor;

	private int subsTotalBooks;

	//bi-directional many-to-one association to SubscriptionOrder
	@OneToMany(mappedBy="subscriptionPlan")
	private List<SubscriptionOrder> subscriptionOrders;

	public SubscriptionPlan() {
	}

	public int getSubsId() {
		return this.subsId;
	}

	public void setSubsId(int subsId) {
		this.subsId = subsId;
	}

	public int getSubsDeliveries() {
		return this.subsDeliveries;
	}

	public void setSubsDeliveries(int subsDeliveries) {
		this.subsDeliveries = subsDeliveries;
	}

	public int getSubsDeliveryCharges() {
		return this.subsDeliveryCharges;
	}

	public void setSubsDeliveryCharges(int subsDeliveryCharges) {
		this.subsDeliveryCharges = subsDeliveryCharges;
	}

	public int getSubsDuration() {
		return this.subsDuration;
	}

	public void setSubsDuration(int subsDuration) {
		this.subsDuration = subsDuration;
	}

	public int getSubsMaxMagzines() {
		return this.subsMaxMagzines;
	}

	public void setSubsMaxMagzines(int subsMaxMagzines) {
		this.subsMaxMagzines = subsMaxMagzines;
	}

	public int getSubsMembershipFee() {
		return this.subsMembershipFee;
	}

	public void setSubsMembershipFee(int subsMembershipFee) {
		this.subsMembershipFee = subsMembershipFee;
	}

	public String getSubsName() {
		return this.subsName;
	}

	public void setSubsName(String subsName) {
		this.subsName = subsName;
	}

	public int getSubsPerDelivery() {
		return this.subsPerDelivery;
	}

	public void setSubsPerDelivery(int subsPerDelivery) {
		this.subsPerDelivery = subsPerDelivery;
	}

	public int getSubsRefundableSecurity() {
		return this.subsRefundableSecurity;
	}

	public void setSubsRefundableSecurity(int subsRefundableSecurity) {
		this.subsRefundableSecurity = subsRefundableSecurity;
	}

	public BigDecimal getSubsSubscriptionFee() {
		return this.subsSubscriptionFee;
	}

	public void setSubsSubscriptionFee(BigDecimal subsSubscriptionFee) {
		this.subsSubscriptionFee = subsSubscriptionFee;
	}

	public String getSubsSuitableFor() {
		return this.subsSuitableFor;
	}

	public void setSubsSuitableFor(String subsSuitableFor) {
		this.subsSuitableFor = subsSuitableFor;
	}

	public int getSubsTotalBooks() {
		return this.subsTotalBooks;
	}

	public void setSubsTotalBooks(int subsTotalBooks) {
		this.subsTotalBooks = subsTotalBooks;
	}

	public List<SubscriptionOrder> getSubscriptionOrders() {
		return this.subscriptionOrders;
	}

	public void setSubscriptionOrders(List<SubscriptionOrder> subscriptionOrders) {
		this.subscriptionOrders = subscriptionOrders;
	}

	public SubscriptionOrder addSubscriptionOrder(SubscriptionOrder subscriptionOrder) {
		getSubscriptionOrders().add(subscriptionOrder);
		subscriptionOrder.setSubscriptionPlan(this);

		return subscriptionOrder;
	}

	public SubscriptionOrder removeSubscriptionOrder(SubscriptionOrder subscriptionOrder) {
		getSubscriptionOrders().remove(subscriptionOrder);
		subscriptionOrder.setSubscriptionPlan(null);

		return subscriptionOrder;
	}

}