package Fundamentals_I.Part_5.ObjectsAndReferences.DatingApp;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        //this.advance(1);
        if (day < 30) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
        /*this.day++;

        if (this.day > 30) {
            this.month++;
            this.day = 1;

            if (this.month > 12) {
                this.year++;
                this.month = 1;
            }
        }*/
    }

    public void advance(int howManyDays) {
        /*if (this.month <= 12 && this.day + howManyDays <= 30) {
            this.day += howManyDays;
        } else if (this.month < 12 && this.day + howManyDays > 30) {
            this.day = this.day + howManyDays - 30;
            this.month++;
        } else if (this.month == 12 && this.day + howManyDays > 30) {
            this.day = this.day + howManyDays - 30;
            this.month = 1;
            this.year++;
        }*/

        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        return this.year == compared.year && this.month == compared.month
                && this.day < compared.day;
    }
}
