package it.pccube.migration.configuration;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.hibernate.SessionFactory;
//import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

@Configuration
//@ComponentScan("it.mef.persistence")
//@Transactional
public class HibernateConfiguration {
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public SessionFactory getSessionFactory() {
	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
	        throw new NullPointerException("factory is not a hibernate factory");
	    }
	    return entityManagerFactory.unwrap(SessionFactory.class);
	}
	
//	@Bean
//	public LocalSessionFactoryBean sessionfactory(){
//	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
////	    sessionFactory.setDataSource(dataSource());
//	    sessionFactory.setPackagesToScan(new String[] {"it.mef.persistence.dizionari.entity"});
////	    sessionFactory.setHibernateProperties(hibernateProperties());
//	    return sessionFactory;
//	}
	

	/*
     *     Spring boot doesn't create SessionFactory bean, so we have to create it manually, using EntityManagerFactory
     */
//    @Bean
//    public SessionFactory sessionFactory( EntityManagerFactory entityManagerFactory )
//    {
//        return entityManagerFactory.unwrap( SessionFactory.class );
//    }
	
//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory() {
//	    return new HibernateJpaSessionFactoryBean();
//	}

//	@Bean
//	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
//	    return hemf.getSessionFactory();
//	}
	
	
	
//	@Bean
//	public SessionFactory sessionFactory(@Qualifier("entityManagerFactory") EntityManagerFactory emf) {
//	     return emf.unwrap(SessionFactory.class);
//	}
//	
//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
//	    HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
//	    fact.setEntityManagerFactory(emf);
//	    return fact;
//	}
}
