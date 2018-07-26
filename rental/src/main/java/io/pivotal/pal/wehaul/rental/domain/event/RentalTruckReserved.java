package io.pivotal.pal.wehaul.rental.domain.event;

import io.pivotal.pal.wehaul.rental.domain.RentalTruck;

import java.util.Objects;

public class RentalTruckReserved {

    private final String vin;

    public RentalTruckReserved(RentalTruck truck) {
        this.vin = truck.getVin();
    }

    public String getVin() {
        return vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentalTruckReserved that = (RentalTruckReserved) o;
        return Objects.equals(vin, that.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public String toString() {
        return "RentalTruckReserved{" +
                "vin='" + vin + '\'' +
                '}';
    }
}