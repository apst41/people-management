package org.example;

import java.util.Scanner;

public class TeacherService {
    private DatabaseUtil databaseUtil;
    public TeacherService(DatabaseUtil databaseUtil) {
        this.databaseUtil = databaseUtil;
    }

    public void addTeacher(Scanner scanner) {
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
        System.out.println("enter employeeId");
        String employeeId = scanner.nextLine();
        System.out.println("enter salary");
        String salary = scanner.nextLine();
        System.out.println("enter bonus");
        String bonus = scanner.nextLine();
        Teacher teacher = new Teacher();
        teacher.setFirstName(firstName);
        teacher.setMiddleName(middleName);
        teacher.setMiddleName(lastName);
        teacher.setContactNumber(contactNo);
        teacher.setAddress(address);
        teacher.setEmployeeId(employeeId);
        teacher.setSalary(salary);
        teacher.setBonus(bonus);
        databaseUtil.addTeacher(teacher);
    }

    public void deleteTeacher(Scanner scanner) {
        System.out.println("enter teacher first name to delete");
        String firstName = scanner.nextLine();
        databaseUtil.deleteTeacher(firstName);
    }

    public String getAllTeachers(){
       return databaseUtil.getAllTeachers().toString();
    }
}
