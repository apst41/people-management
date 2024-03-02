package org.example;

public class Student extends Person{
   String rollNumber;
   String marks;

   public String getRollNumber() {
      return rollNumber;
   }

   public void setRollNumber(String rollNumber) {
      this.rollNumber = rollNumber;
   }

   public String getMarks() {
      return marks;
   }

   public void setMarks(String marks) {
      this.marks = marks;
   }

   @Override
   public String toString() {
      return "Student{" +
              "rollNumber='" + rollNumber + '\'' +
              ", marks='" + marks + '\'' +
              '}';
   }
}
