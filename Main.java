import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Pharmacy
        /*
        Medicine medicine1 = new Medicine("Analgin", 50, 200);
        Medicine medicine2 = new Medicine("Paretstamol", 30, 150);
        Medicine medicine3 = new Medicine("Tailalhot", 15, 500);
        Medicine medicine4 = new Medicine("Ibufen", 260, 80);
        Medicine medicine5 = new Medicine("Metanol", 345, 30);
        Medicine medicine6 = new Medicine("No Grip", 799, 60);

        Medicine[] medici1 = {medicine1, medicine2};
        Medicine[] medici2 = {medicine3, medicine4};
        Medicine[] medici3 = {medicine5, medicine6};

        Worker worker1 = new Worker("Papa Rimski", 78, "PapaRimski@email.com ");
        Worker worker2 = new Worker("Tashiev", 64, "Tashiev@email.com ");
        Worker worker3 = new Worker("JoBaidon", 70, "JoBaidon@email.com ");

        Worker[] worke1 = {worker1};
        Worker[] worke2 = {worker2};
        Worker[] worke3 = {worker3};

        Pharmacy pharmacy1 = new Pharmacy("Neman", "Ahunbaeva 165", medici1, worke1);
        Pharmacy pharmacy2 = new Pharmacy("Balabolot", "Chortekova 99", medici2, worke2);
        Pharmacy pharmacy3 = new Pharmacy("Kyzbolot", "Avatarov 85", medici3, worke3);

        Pharmacy[] phrmec = {pharmacy1, pharmacy2, pharmacy3};
        Db db = new Db(phrmec);

        // Получение всех медикаментов по имени аптеки
        Medicine[] pharmacy1Medicines = db.getAllMabicineByPharmasyName("Neman");
        if (pharmacy1Medicines != null) {
            System.out.println("Medicines in Neman Pharmacy:");
            for (Medicine medicine : pharmacy1Medicines) {
                System.out.println(medicine);
            }
        } else {
            System.out.println("Pharmacy not found.");
        }

        // Получение всех работников, отсортированных по адресу аптеки
        Worker[] sortedWorkers = db.getAllSortedByPharmacyAdress("Chortekova 99");
        if (sortedWorkers != null) {
            System.out.println("Workers in Pharmacy at Chortekova 99:");
            for (Worker worker : sortedWorkers) {
                System.out.println(worker);
            }
            // Добавление медикамента в аптеку
            Medicine newMedicine = new Medicine("New Medicine", 100, 50);
            String addMedicineResult = db.addMadicineToPharmacy("Neman", newMedicine);
            System.out.println(addMedicineResult);

            // Обновление цены медикамента
            String updateMedicineResult = pharmacy1.updateMedicinePrice("Analgin", 70);
            System.out.println(updateMedicineResult);

            // Удаление медикамента по имени
            String deleteMedicineResult = pharmacy1.deleteMedicineByName("Paretstamol");
            System.out.println(deleteMedicineResult);

            // Удаление работника по имени


            // Получение аптеки по имени работника
            System.out.println(db.getPharmacyByWowkersName("JoBaidon"));
            //     if (pharmacyByWorker != null) {

         //   } else {
          //      System.out.println("Worker not found.");
          //  }
            String deleteWorkerResult = pharmacy1.deleteWorkerByName("Papa Rimski");
            System.out.println(deleteWorkerResult);
        }
         */
        /*
        EDUCATIONCENTER educationcenter = new School("Peaksoft","KG",LocalDate.of(1945,5,29));
        EDUCATIONCENTER educationcenter2 = new University("Samarkand","Uz",LocalDate.of(1976,4,28));
        EDUCATIONCENTER educationcenter3 = new College("Bermet","KG",LocalDate.of(1975,7,13));

        Student student  =new Student("Daul","Makarov","Male", LocalDate.of(2015,9,1),educationcenter);
        Student student2 =new Student("Mambet","Mambetov","Male", LocalDate.of(1999,6,23),educationcenter2);
        Student student3 =new Student("Adam","Taratov","Male", LocalDate.of(1954,3,25),educationcenter3);
        Student student4 =new Student("Baka","Bashanoc","Male", LocalDate.of(1954,3,25),educationcenter);
        Student student5 =new Student("Dair","Triantus","Male", LocalDate.of(1954,3,25),educationcenter2);
        Student student6 =new Student("Laka","Lasulov","Male", LocalDate.of(1954,3,25),educationcenter3);
        Student student7 =new Student("Jaka","Kuliev","Male", LocalDate.of(1954,3,25),educationcenter);
        Student student8 =new Student("Luku","Tashiev","Male", LocalDate.of(1954,3,25),educationcenter2);
        Student student9 =new Student("Mane","Atambaev","Male", LocalDate.of(1954,3,25),educationcenter3);
        Student student10=new Student("Lampur","Mirzuev","Male", LocalDate.of(1954,3,25),educationcenter);

        Student[] students={student,student2,student3,student4,student5,
        student6,student7,student8,student9,student10};



                    for (Student studentt : students) {
                        System.out.println(studentt);
            }


         */
//EDUCATIONCENTER educationcenter=new School("Nakari","Canada",LocalDate.of(2000,05,3)) ;
//EDUCATIONCENTER educationcenter2=new University("Nakari","Canada",LocalDate.of(2000,05,3)) ;
//EDUCATIONCENTER educationcenter3=new College("Nakari","Canada",LocalDate.of(2000,05,3)) ;
//
//
//        Student[] students = {
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter2 ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter3 ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter2 ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter3 ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter2 ),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20), educationcenter3),
//                new Student("NurAli", "Asanov", "Male", LocalDate.of(2000, 03, 20),educationcenter ),
//
//        };
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





