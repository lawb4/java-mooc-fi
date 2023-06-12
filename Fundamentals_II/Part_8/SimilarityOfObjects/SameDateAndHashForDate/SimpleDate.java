package Fundamentals_II.Part_8.SimilarityOfObjects.SameDateAndHashForDate;

import java.util.Objects;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        return this.year == other.year
                && this.month == other.month
                && this.day < other.day;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (comparedObject == null) {
            return false;
        }

        if (getClass() != comparedObject.getClass()) {
            return false;
        }

        final SimpleDate comparedDate = (SimpleDate) comparedObject;

        return this.day == comparedDate.day &&
                this.month == comparedDate.month &&
                this.year == comparedDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
