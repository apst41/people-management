package org.example;

import javax.swing.*;
import java.util.Scanner;

import static org.example.FileUtil.readFileAsString;

public class Main {

   private static DatabaseUtil databaseUtil = new DatabaseUtil();

    private static StudentService  studentService = new StudentService(databaseUtil);
    private static TeacherService teacherService = new TeacherService(databaseUtil);
    private static PersonService personService = new PersonService(databaseUtil);
    public static void main(String[] args) {
        String password = readFileAsString("src/main/resources/password.txt");


        Scanner scanner = new Scanner(System.in);
        for (int i =0;i< 3;i++) {
            System.out.println("Pls enter password");

            String inputPassword = scanner.nextLine();

            if(password.equals(inputPassword)){

               while (true){
                   System.out.println("Press 1 to Add Student Details ");
                   System.out.println("Press 2 to Remove Student Details ");
                   System.out.println("Press 3 to Add Teacher Details ");
                   System.out.println("Press 4 to Remove Teacher Details    ");
                   System.out.println("Press 5 to Query Data ");
                   System.out.println("Press 6 to exit ");

                   String input =   scanner.nextLine();

                   switch (input) {
                       case "1" -> studentService.addStudent(scanner);
                       case "2" -> studentService.deleteStudent(scanner);
                       case "3" -> teacherService.addTeacher(scanner);
                       case "4" -> teacherService.deleteTeacher(scanner);
                       case "5" -> System.out.println(helper(scanner));
                       case "6" -> System.exit(0);
                       default -> {
                           System.out.println("Invalid input: " + input);
                           return;
                       }
                   }
               }


            }

        }

        throw new IllegalArgumentException("Your maximum wrong passoword limit exceeded");
    }

    private static String helper(Scanner scanner){
        System.out.println("pls enter query");
       String query =  scanner.nextLine();

       if (Constants.STUDENT_QUERY.equalsIgnoreCase(query)){
           return studentService.getAllStudents();
       }
       else if (Constants.TEACHER_QUERY.equalsIgnoreCase(query)){
           return teacherService.getAllTeachers();
       } else if (Constants.PERSON_QUERY.equalsIgnoreCase(query)) {
           return personService.getAllPersons();

       } else {
           return "not a valid query";
       }

    }
}