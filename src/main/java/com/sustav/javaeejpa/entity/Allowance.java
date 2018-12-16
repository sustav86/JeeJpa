package com.sustav.javaeejpa.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Anton Sustavov
 * @since 2018/11/24
 */
@Entity
public class Allowance extends AbstractEntity {

    @NotNull(message = "Allowance amount must be set")
    private BigDecimal allowanceAmount;

    @NotEmpty(message = "Allowance name must be set")
    private String allowanceName;


    public BigDecimal getAllowanceAmount() {
        return allowanceAmount;
    }

    public void setAllowanceAmount(BigDecimal allowanceAmount) {
        this.allowanceAmount = allowanceAmount;
    }

    public String getAllowanceName() {
        return allowanceName;
    }

    public void setAllowanceName(String allowanceName) {
        this.allowanceName = allowanceName;
    }
}
