package model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the SubscriptionPlan database table.
 * 
 */
@Entity
	@Table(name="SubscriptionPlan")
public class SubscriptionPlan{
	

	@Id
	@Column(name="subsId")
	private int subsId;
	    @Column(name="subsDeliveries")
	private int subsDeliveries;
	    @Column(name="subsDeliveryCharges")
	private int subsDeliveryCharges;
	    @Column(name="subsDuration")
	private int subsDuration;
	    @Column(name="subsMaxMagzines")
	private int subsMaxMagzines;
	    @Column(name="subsMembershipFee")
	private int subsMembershipFee;
	    @Column(name="subsName")
	private String subsName;
	    @Column(name="subsPerDelivery")
	private int subsPerDelivery;
	    @Column(name="subsRefundableSecurity")
	private int subsRefundableSecurity;
	    @Column(name="subsSubscriptionFee")
	private BigDecimal subsSubscriptionFee;
	    @Column(name="subsSuitableFor")
	private String subsSuitableFor;
	    @Column(name="subsTotalBooks")
	private int subsTotalBooks;

	//bi-directional many-to-one association to SubscriptionOrder
	@OneToMany(mappedBy="subscriptionPlan")
	private List<SubscriptionOrder> subscriptionOrders;

	public SubscriptionPlan() {
	}

	public int getSubsId() {
		return subsId;
	}

	public void setSubsId(int subsId) {
		this.subsId = subsId;
	}

	public int getSubsDeliveries() {
		return subsDeliveries;
	}

	public void setSubsDeliveries(int subsDeliveries) {
		this.subsDeliveries = subsDeliveries;
	}

	public int getSubsDeliveryCharges() {
		return subsDeliveryCharges;
	}

	public void setSubsDeliveryCharges(int subsDeliveryCharges) {
		this.subsDeliveryCharges = subsDeliveryCharges;
	}

	public int getSubsDuration() {
		return subsDuration;
	}

	public void setSubsDuration(int subsDuration) {
		this.subsDuration = subsDuration;
	}

	public int getSubsMaxMagzines() {
		return subsMaxMagzines;
	}

	public void setSubsMaxMagzines(int subsMaxMagzines) {
		this.subsMaxMagzines = subsMaxMagzines;
	}

	public int getSubsMembershipFee() {
		return subsMembershipFee;
	}

	public void setSubsMembershipFee(int subsMembershipFee) {
		this.subsMembershipFee = subsMembershipFee;
	}

	public String getSubsName() {
		return subsName;
	}

	public void setSubsName(String subsName) {
		this.subsName = subsName;
	}

	public int getSubsPerDelivery() {
		return subsPerDelivery;
	}

	public void setSubsPerDelivery(int subsPerDelivery) {
		this.subsPerDelivery = subsPerDelivery;
	}

	public int getSubsRefundableSecurity() {
		return subsRefundableSecurity;
	}

	public void setSubsRefundableSecurity(int subsRefundableSecurity) {
		this.subsRefundableSecurity = subsRefundableSecurity;
	}

	public BigDecimal getSubsSubscriptionFee() {
		return subsSubscriptionFee;
	}

	public void setSubsSubscriptionFee(BigDecimal subsSubscriptionFee) {
		this.subsSubscriptionFee = subsSubscriptionFee;
	}

	public String getSubsSuitableFor() {
		return subsSuitableFor;
	}

	public void setSubsSuitableFor(String subsSuitableFor) {
		this.subsSuitableFor = subsSuitableFor;
	}

	public int getSubsTotalBooks() {
		return subsTotalBooks;
	}

	public void setSubsTotalBooks(int subsTotalBooks) {
		this.subsTotalBooks = subsTotalBooks;
	}

	public List<SubscriptionOrder> getSubscriptionOrders() {
		return subscriptionOrders;
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