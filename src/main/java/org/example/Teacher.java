package org.example;

public class Teacher extends Person {
   String  employeeId;
   String salary;
   String bonus;

   public String getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(String employeeId) {
      this.employeeId = employeeId;
   }

   public String getSalary() {
      return salary;
   }

   public void setSalary(String salary) {
      this.salary = salary;
   }

   public String getBonus() {
      return bonus;
   }

   public void setBonus(String bonus) {
      this.bonus = bonus;
   }

   @Override
   public String toString() {
      return "Teacher{" +
              "employeeId='" + employeeId + '\'' +
              ", salary='" + salary + '\'' +
              ", bonus='" + bonus + '\'' +
              '}';
   }
}
