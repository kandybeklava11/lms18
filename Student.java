import java.lang.ref.SoftReference;
import java.time.LocalDate;
import java.time.Period;

public class Student {

        private String firstName;
        private String lastName;
        private String gender;
        private LocalDate dateOfStart;
        private EDUCATIONCENTER educationCenter;

        public Student(String firstName, String lastName, String gender, LocalDate dateOfStart, EDUCATIONCENTER educationCenter) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.dateOfStart = dateOfStart;
            this.educationCenter = educationCenter;
        }

        // Геттеры и сеттеры для полей класса Student

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EDUCATIONCENTER getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EDUCATIONCENTER educationCenter) {
        this.educationCenter = educationCenter;
    }
}


