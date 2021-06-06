package ru.ntr.springbootapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


@Configuration

public class HibernateXMLConf {

    @Bean
    public EntityManagerFactory entityManagerFactory() {

        return new org.hibernate.cfg.Configuration()
                .configure()
                .buildSessionFactory();
    }

    @Bean
    public EntityManager entityManager() {
        return entityManagerFactory().createEntityManager();
    }


}
