package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class DatabaseUtil {


   private  List<Student> studentStorage;

    private  List<Teacher> teacherStorage ;

    public DatabaseUtil() {
        this.studentStorage = new ArrayList<>();
        this.teacherStorage = new ArrayList<>();

    }

public void addStudent(Student student){
        studentStorage.add(student);
}

public void addTeacher(Teacher teacher){
    teacherStorage.add(teacher);
}

public void deleteTeacher(String name){
   teacherStorage = teacherStorage.stream().filter(teacher-> !teacher.getFirstName().equals(name)).toList();
}

public void deleteStudent(String name) {
    studentStorage = studentStorage.stream().filter(student-> !student.getFirstName().equals(name)).toList();
}

public List<Student> getAllStudent(){
        return studentStorage;
}

public List<Teacher> getAllTeachers(){
        return teacherStorage;
}


}
