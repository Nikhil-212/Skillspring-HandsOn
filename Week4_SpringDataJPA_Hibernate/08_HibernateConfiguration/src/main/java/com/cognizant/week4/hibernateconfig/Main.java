package com.cognizant.week4.hibernateconfig;

import org.hibernate.SessionFactory; import org.hibernate.cfg.Configuration;
public class Main { public static void main(String[] args) { try (SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory()) { System.out.println("SessionFactory created: " + sessionFactory.isOpen()); } } }
