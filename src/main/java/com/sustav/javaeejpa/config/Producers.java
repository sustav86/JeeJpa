package com.sustav.javaeejpa.config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Anton Sustavov
 * @since 2018/11/24
 */
public class Producers {

    @Produces
    @PersistenceContext
    EntityManager entityManager;
}
