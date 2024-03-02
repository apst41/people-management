package org.example;

public class Person {



   String firstName;
    String middleName;
    String lastName;
    String contactNumber;
    String address;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getMiddleName() {
      return middleName;
   }

   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getContactNumber() {
      return contactNumber;
   }

   public void setContactNumber(String contactNumber) {
      this.contactNumber = contactNumber;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   @Override
   public String toString() {
      return "Person{" +
              "firstName='" + firstName + '\'' +
              ", middleName='" + middleName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", contactNumber='" + contactNumber + '\'' +
              ", address='" + address + '\'' +
              '}';
   }
}
