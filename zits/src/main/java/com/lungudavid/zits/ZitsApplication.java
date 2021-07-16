package com.lungudavid.zits;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.lungudavid.zits"})
@EnableJpaRepositories(basePackages="com.lungudavid.zits.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.lungudavid.zits.model")
public class ZitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZitsApplication.class, args);
		System.out.println("Your site is working");
	}

}
