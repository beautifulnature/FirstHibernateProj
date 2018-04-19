package org.javabrains.koushik.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.koushik.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		/*UserDetails user = new UserDetails();
		user.setUserName("Test User");*/
		/*Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");*/
		
		/*Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Zeep");*/
		
		/*TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porsche");
		car.setSteeringWheel("Porsche Steering Wheel");*/
		
		/*user.getVehicles().add(vehicle);
		user.getVehicles().add(vehicle2);*/
		/*vehicle.setUser(user);
		vehicle2.setUser(user);*/
		/*vehicle.getUserList().add(user);
		vehicle2.getUserList().add(user);*/
		
		//user.setVehicle(vehicle);
		
		/*Address addr1 = new Address();
		addr1.setStreet("Street 1");
		addr1.setCity("city 1");
		addr1.setState("state 1");
		addr1.setPincode("pincode 1");*/
		
		//user.setHomeAddress(addr1);
		
		/*Address addr2 = new Address();
		addr2.setStreet("Street 2");
		addr2.setCity("city 2");
		addr2.setState("state 2");
		addr2.setPincode("pincode 2");*/
		
		//user.setOfficeAddress(addr2);
		/*user.getListofAddresses().add(addr1);
		user.getListofAddresses().add(addr2);*/
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetails user where user.userId = 1");
		query.setCacheable(true);
		List<UserDetails> users = (List<UserDetails>) query.list();
		
		
		//UserDetails user = (UserDetails) session.get(UserDetails.class, 2);
		/*System.out.println(user.getUserName());
		user.setUserName("Update User");
		System.out.println(user.getUserName());
		
		UserDetails user2 = (UserDetails) session.get(UserDetails.class, 2);
		System.out.println(user2.getUserName());*/
		
		//String minUserId = "5";
		//String userName = "User6";
		/*Query query = session.createQuery("from UserDetails where userId > :userId and userName = :userName");
		query.setInteger("userId", Integer.parseInt(minUserId));
		query.setString("userName", userName);*/
		/*Query query = session.getNamedQuery("UserDetails_byId");
		query.setInteger("userId", 1);*/
		//query.setFirstResult(5);
		//query.setMaxResults(4);
		
		/*Query query = session.getNamedQuery("UserDetails_byName");
		query.setString("username", "User9");*/
		
		/*UserDetails exampleUser = new UserDetails();
		exampleUser.setUserId(5);
		exampleUser.setUserName("User%");
		
		Example example = Example.create(exampleUser).enableLike();
		
		Criteria criteria = session.createCriteria(UserDetails.class)
								.add(example);*/
								/*.addOrder(Order.desc("userId"))*/;
		/*criteria.add(Restrictions.like("userName", "%User%"))
			.add(Restrictions.between("userId", 5, 50));*/
		/*criteria.add(Restrictions.or(Restrictions.between("userId", 1, 4),
				Restrictions.between("userId", 7, 50)));*/
		
		//List<UserDetails> users = (List<UserDetails>) criteria.list()/*query.list()*/;
		//List<String> userNames = (List<String>) query.list();
		session.getTransaction().commit();
		session.close();
		/*for (UserDetails userDetails : users) {
			System.out.println(userDetails.getUserName());
		}*/
		/*for (String userName : userNames) {
			System.out.println(userName);
		}*/
		
		
		//session.beginTransaction();
		//session.save(user);
		//session.persist(user);
		/*session.save(vehicle);
		session.save(vehicle2);*/
		/*session.save(vehicle);
		session.save(car);
		session.save(bike);*/
		/*for (int i = 0; i < 10; i++) {
			UserDetails user = new UserDetails();
			user.setUserName("User " + i);
			session.save(user);
		}*/
		//UserDetails user = (UserDetails) session.get(UserDetails.class, 7);
		//session.delete(user);
		/*user.setUserName("Updated user");
		session.update(user);*/
		/*session.save(user);
		user.setUserName("Updated User");
		user.setUserName("Updated User Again");*/
		//UserDetails user = (UserDetails) session.get(UserDetails.class, 1);
		
		
		/*session.getTransaction().commit();
		session.close();*/
		
		//user.setUserName("Updated name");
		
		//System.out.println("User name pulled up is: " + user.getUserName());
		/*user = null;
		
		session = sessionFactory.openSession();
		user = (UserDetails) session.get(UserDetails.class, 1);
		session.close();
		System.out.println(user.getListofAddresses().size());*/
		//user.setUserName("Updated user after session close");
		
		/*session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(user);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();*/
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		//UserDetails user3 = (UserDetails) session2.get(UserDetails.class, 2);
		Query query2 = session2.createQuery("from UserDetails user where user.userId = 1");
		query2.setCacheable(true);
		List<UserDetails> users2 = (List<UserDetails>) query2.list();
		
		session2.getTransaction().commit();
		session2.close();
	}
}
