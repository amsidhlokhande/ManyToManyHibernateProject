package com.amsidh.hibernate.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.amsidh.hibernate.domains.UserDetails;
import com.amsidh.hibernate.domains.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("First User");

		
		UserDetails user2 = new UserDetails();
		user2.setUserName("Second User");

		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("CAR");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("BIKE");


		
		user.getVehicleList().add(vehicle);
		user.getVehicleList().add(vehicle2);
		
		user2.getVehicleList().add(vehicle);
		user2.getVehicleList().add(vehicle2);
		
		
		vehicle.getListOfUserDetails().add(user);
		vehicle.getListOfUserDetails().add(user2);
		
		vehicle2.getListOfUserDetails().add(user);
		vehicle2.getListOfUserDetails().add(user2);
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();

	}

}
