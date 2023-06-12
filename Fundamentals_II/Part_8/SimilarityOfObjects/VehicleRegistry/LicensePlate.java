package Fundamentals_II.Part_8.SimilarityOfObjects.VehicleRegistry;

import java.util.Objects;

public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final LicensePlate compared = (LicensePlate) obj;

        return this.country.equals(compared.country) &&
                this.liNumber.equals(compared.liNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, liNumber);
    }
}
