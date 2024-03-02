package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public PersonService(DatabaseUtil databaseUtil) {
        this.databaseUtil = databaseUtil;
    }

    private final   DatabaseUtil databaseUtil ;



    public String getAllPersons(){

            List<Student> students = databaseUtil.getAllStudent();
            List<Teacher> teachers = databaseUtil.getAllTeachers();
            List<Person> personList = new ArrayList<>();
            personList.addAll(students);
            personList.addAll(teachers);
           return personList.toString();

    }

}
