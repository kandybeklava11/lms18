import java.lang.ref.SoftReference;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    /*
     private String name;
    private String surName;
     private String gender;
     private LocalDate dateofStart;
    private EDUCATIONCENTER educationCenter;
    private int year;

    public Student(String name, String surName, String gender, LocalDate dateofStart, EDUCATIONCENTER educationCenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.year = Period.between(dateofStart,LocalDate.now()).getYears();
        this.educationCenter = educationCenter;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateofStart() {
        return dateofStart;
    }

    public void setDateofStart(LocalDate dateofStart) {
        this.dateofStart = dateofStart;
    }

    public EDUCATIONCENTER getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EDUCATIONCENTER educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender='" + gender + '\'' +
                ", educationCenter=" + educationCenter +
                ", year=" + year +
                '}';
    }

     */
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


