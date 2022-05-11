package io.yukiohama.lombokaspectjdemo;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.aspectj.AnnotationTransactionAspect;

@Configuration
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
class MyConfig {

    @Bean
    PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
        AnnotationTransactionAspect.aspectOf().setTransactionManager(transactionManager);
        return transactionManager;
    }
}
