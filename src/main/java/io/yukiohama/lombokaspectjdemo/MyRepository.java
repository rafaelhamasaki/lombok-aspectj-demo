package io.yukiohama.lombokaspectjdemo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(MyEntity myEntity) {
        em.persist(myEntity);
    }
}
