package net.contact.form;
	import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
	 
	@Entity
	@Table(name="subscription")
	public class Subscription {
	     
	    @Id
	    @Column(name="SUBS_ID")
	    private String subs_id;
	    
	    @Column(name="SUBS_NAME")
	    private String subs_name;
	     
	    @Column(name="PRICE")
	    private String price;
	    
	    @Column(name="BOOK_NO")
	    private Integer book_no;
	 
	    @Column(name="TIME_PERIOD")
	    private Integer time_period;
	     
	    @Column(name="OFFER")
	    private String offer;

	    @OneToMany(mappedBy="subscription")
	    private Set<UserSubscription> usersubscription;

		public String getSubs_id() {
			return subs_id;
		}

		public void setSubs_id(String subs_id) {
			this.subs_id = subs_id;
		}

		public String getSubs_name() {
			return subs_name;
		}

		public void setSubs_name(String subs_name) {
			this.subs_name = subs_name;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public Integer getBook_no() {
			return book_no;
		}

		public void setBook_no(Integer book_no) {
			this.book_no = book_no;
		}

		public Integer getTime_period() {
			return time_period;
		}

		public void setTime_period(Integer time_period) {
			this.time_period = time_period;
		}

		public String getOffer() {
			return offer;
		}

		public void setOffer(String offer) {
			this.offer = offer;
		}

		public Set<UserSubscription> getUsersubscription() {
			return usersubscription;
		}

		public void setUsersubscription(Set<UserSubscription> usersubscription) {
			this.usersubscription = usersubscription;
		}
	    
		
		
	    
	}
	