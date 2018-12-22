package com.sustav.javaeejpa.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Collection;

/**
 * @author Anton Sustavov
 * @since 2018/12/16
 */
@Entity
public class Project extends AbstractEntity {

    private String projectName;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;

    @ManyToMany
    @JoinTable(name = "PROJ_EMPLOYEES",
            joinColumns = @JoinColumn(name = "PROJ_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMP_IM"))
    private Collection<Employee> employees;

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(LocalDate projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public LocalDate getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(LocalDate projectEndDate) {
        this.projectEndDate = projectEndDate;
    }
}
