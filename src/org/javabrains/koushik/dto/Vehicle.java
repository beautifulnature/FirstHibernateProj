package org.javabrains.koushik.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="VEHICLE_TYPE", discriminatorType=DiscriminatorType.STRING)*/
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	
	/*@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name="USER_ID")
	private UserDetails user;*/
	/*@ManyToMany(mappedBy="vehicles")
	private Collection<UserDetails> userList = new ArrayList<>();*/
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	/*public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}*/
	/*public Collection<UserDetails> getUserList() {
		return userList;
	}*/
}
