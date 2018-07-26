package io.pivotal.pal.wehaul.rental.domain.event;

import io.pivotal.pal.wehaul.rental.domain.RentalTruck;

import java.util.Objects;

public class RentalTruckDroppedOff {

    private final String vin;
    private final int distanceTraveled;

    public RentalTruckDroppedOff(RentalTruck truck, int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
        this.vin = truck.getVin();
    }

    public String getVin() {
        return vin;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentalTruckDroppedOff that = (RentalTruckDroppedOff) o;
        return distanceTraveled == that.distanceTraveled &&
                Objects.equals(vin, that.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, distanceTraveled);
    }

    @Override
    public String toString() {
        return "RentalTruckDroppedOff{" +
                "vin='" + vin + '\'' +
                ", distanceTraveled=" + distanceTraveled +
                '}';
    }
}