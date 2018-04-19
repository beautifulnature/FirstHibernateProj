package org.javabrains.koushik.dto;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="UserDetails_byId",
		query="from UserDetails where userId = :userId")
/*@NamedNativeQuery(name="UserDetails_byName", 
		query="select * from userdetails where username = :username",
		resultClass=UserDetails.class)*/
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
//@Table(name="USER_DETAILS")
public class UserDetails {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;
	
	/*@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;*/
	
	/*@OneToMany(cascade=CascadeType.PERSIST) (mappedBy="user")
	@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"),
				inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
	//@ManyToMany
	//private Collection<Vehicle> vehicles = new ArrayList<>();
	
	/*@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADDRESS",
			joinColumns=@JoinColumn(name="USER_ID"))
	private Collection<Address> listofAddresses = new ArrayList<>();*/
	/*@GenericGenerator(name="hilo-gen", strategy="hilo")
	@CollectionId(columns = {@Column(name = "ADDRESS_ID")} , generator = "hilo-gen", type = @Type(type="long"))*/
	//private List<Address> listofAddresses = new ArrayList<>();
	
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
	@AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
	@AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
	@AttributeOverride(name="pincode", column=@Column(name="HOME_PIN_CODE"))
	})
	private Address homeAddress;
	
	@Embedded
	private Address officeAddress;*/
	
	/*
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	private String address;
	private String description;
	*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	*/
	/*public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}*/
	/*public Set<Address> getListofAddresses() {
		return listofAddresses;
	}*/
	/*public void setListofAddresses(Set<Address> listofAddresses) {
		this.listofAddresses = listofAddresses;
	}*/
	/*public List<Address> getListofAddresses() {
		return listofAddresses;
	}*/
	/*public Collection<Address> getListofAddresses() {
		return listofAddresses;
	}*/
	/*public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	/*public Collection<Vehicle> getVehicles() {
		return vehicles;
	}*/
}
