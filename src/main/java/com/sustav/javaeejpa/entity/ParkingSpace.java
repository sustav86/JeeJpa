package com.sustav.javaeejpa.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Anton Sustavov
 * @since 2018/12/15
 */
@Entity
public class ParkingSpace extends AbstractEntity {

    private String parkingLotNumber;

    @OneToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;


    public String getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(String parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
