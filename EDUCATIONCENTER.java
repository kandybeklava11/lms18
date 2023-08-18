import java.time.LocalDate;
import java.time.Period;

public abstract class EDUCATIONCENTER {
  
        private String name;
        private String country;
        private LocalDate localDate;
        private int foundationYear;

        private int year;


        public EDUCATIONCENTER(String name, String country, LocalDate localDate, int foundationYear) {
            this.name = name;
            this.country = country;
            this.year = Period.between(localDate,LocalDate.now()).getYears();
            this.foundationYear = foundationYear;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EDUCATIONCENTER{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", foundationYear=" + foundationYear +
                ", year=" + year +
                '}';
    }
}



