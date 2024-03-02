package org.example;


import java.util.Scanner;

public class StudentService {

    private final DatabaseUtil databaseUtil;


    public StudentService(DatabaseUtil databaseUtil) {
        this.databaseUtil = databaseUtil;
    }

    public void addStudent(Scanner scanner) {
        System.out.println("enter FirstName");
        String firstName = scanner.nextLine();
        System.out.println("enter MiddleName");
        String middleName = scanner.nextLine();
        System.out.println("enter LastName");
        String lastName = scanner.nextLine();
        System.out.println("enter ContactNumber");
        String contactNo = scanner.nextLine();
        System.out.println("enter Address");
        String address = scanner.nextLine();
        System.out.println("enter roll no");
        String rollNo = scanner.nextLine();
        System.out.println("enter marks");
        String marks = scanner.nextLine();
        Student student = new Student();
        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setMiddleName(lastName);
        student.setContactNumber(contactNo);
        student.setAddress(address);
        student.setMarks(marks);
        student.setRollNumber(rollNo);
        student.setMarks(marks);

        databaseUtil.addStudent(student);
    }

    public void deleteStudent(Scanner scanner){
        System.out.println("enter student first name to delete");
        String firstName = scanner.nextLine();
        databaseUtil.deleteStudent(firstName);
    }

    public String getAllStudents(){
        return databaseUtil.getAllStudent().toString();
    }

}
