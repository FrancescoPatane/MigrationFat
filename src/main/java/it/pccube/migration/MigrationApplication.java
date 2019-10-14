package it.pccube.migration;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import it.pccube.migration.service.ProcedureService;

@SpringBootApplication

@ComponentScan("it.mef.persistence")
@ComponentScan("it.pccube.migration")
//@ComponentScan("it.mef.persistence.dizionari.entity")
@EntityScan(basePackages = { "it.mef.persistence.dizionari.entity", "it.mef.persistence.entity" })

//@ComponentScan({"it.pccube.migration","it.mef.persistence"})

public class MigrationApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MigrationApplication.class, args);
	}

}
