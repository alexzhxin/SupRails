package com.supinfo.suprails.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@Entity
@DiscriminatorValue("passenger")
public class PassengerTrain extends Train {

    private Integer seatQuantity;

    public Integer getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(Integer seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerTrain that = (PassengerTrain) o;

        if (seatQuantity != null ? !seatQuantity.equals(that.seatQuantity) : that.seatQuantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (seatQuantity != null ? seatQuantity.hashCode() : 0);
        return result;
    }
}
