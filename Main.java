import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EDUCATIONCENTER educationcenter=new School("Nakari","Canada",LocalDate.of(2000,05,3),1914) ;
        EDUCATIONCENTER educationcenter2=new University("Moskovsky","Canada",LocalDate.of(1950,05,3),1950) ;
        EDUCATIONCENTER educationcenter3=new College("Pashinko","Canada",LocalDate.of(1900,05,3),1960) ;
                Student[] students = {
                        // Заполните массив students объектами класса Student
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 3, 20), educationcenter),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(1950, 2, 24), educationcenter2),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(1980, 3, 23), educationcenter3),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(1999, 5, 13), educationcenter),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(2003, 4, 24), educationcenter2),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(2017, 3, 18), educationcenter3),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(2014, 5, 20), educationcenter),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(2001, 4, 19), educationcenter2),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(1960, 3, 29), educationcenter3),
                        new Student("NurAli", "Asanov", "Male", LocalDate.of(1993, 6, 20), educationcenter),
                };
                for (Student student : students) {
                    System.out.println("Education Center: " + student.getEducationCenter().getName());
                    System.out.println("Education Center Country: " + student.getEducationCenter().getCountry());
                    System.out.println("Education Center Foundation Year: " + student.getEducationCenter().getFoundationYear());
                    System.out.println();
                    System.out.println("Student: " + student.getFirstName() + " " + student.getLastName()+"\nMale: "+student.getGender()+"\nDate of Start "+student.getDateOfStart());
                    System.out.println("-----------------------------------------------------------------------------");
                    // Дополнительная логика для определения продолжительности обучения

                }
            }
        }





