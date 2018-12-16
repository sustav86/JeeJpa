package com.sustav.javaeejpa.service;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @author Anton Sustavov
 * @since 2018/11/24
 */
@DataSourceDefinition(
        className = "com.mysql.cj.jdbc.Driver",
        name = "java:global/jdbc/MyDS",
        url = "jdbc:mysql://localhost:3306/payroll",
        user = "root",
        password = "root")
@Stateless
public class PersistenceService {

    @Inject
    EntityManager entityManager;
}
