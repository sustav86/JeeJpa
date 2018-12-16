package com.sustav.javaeejpa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * @author Anton Sustavov
 * @since 2018/11/24
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "tax_id"))
public class Tax extends AbstractEntity {

    @Column(name = "TAX_RATE")
    private BigDecimal taxRate;

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

}
