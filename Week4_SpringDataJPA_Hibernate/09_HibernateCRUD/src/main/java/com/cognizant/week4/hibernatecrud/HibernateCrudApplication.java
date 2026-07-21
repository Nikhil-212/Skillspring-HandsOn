package com.cognizant.week4.hibernatecrud;

import jakarta.persistence.EntityManagerFactory; import org.hibernate.SessionFactory; import org.springframework.boot.SpringApplication; import org.springframework.boot.autoconfigure.SpringBootApplication; import org.springframework.context.annotation.Bean;
@SpringBootApplication public class HibernateCrudApplication { public static void main(String[] args) { SpringApplication.run(HibernateCrudApplication.class, args); } @Bean public SessionFactory sessionFactory(EntityManagerFactory entityManagerFactory) { return entityManagerFactory.unwrap(SessionFactory.class); } }
