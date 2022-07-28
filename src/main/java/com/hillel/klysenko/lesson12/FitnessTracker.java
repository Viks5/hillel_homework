package com.hillel.klysenko.lesson12;

public class FitnessTracker {
        private String name;
        private  String surname;
        private String dayOfBirth;
        private String mounthOfBirth;
        private int yearOfBirth;
        private int ageFullYears;
        private final int YEAR = 2020;
        private String email;
        private String phoneNumber;
        private  double weight;
        private  String preassure;
        private  int numberOfStepsPerDay;

        public FitnessTracker(String name, String surname, String dayOfBirth, String mounthOfBirth,int yearOfBirth,
                 String email, String phoneNumber, double weight,
                              String preassure, int numberOfStepsPerDay) {
                this.name = name;
                this.dayOfBirth = dayOfBirth;
                this.mounthOfBirth = mounthOfBirth;
                this.yearOfBirth = yearOfBirth;
                this.ageFullYears = YEAR - yearOfBirth; //считала, что возраст определяется состоянием на конец 2020 года,
                                                        // если на начало года должно быть еще -1
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.surname = surname;
                this.weight = weight;
                this.preassure = preassure;
                this.numberOfStepsPerDay = numberOfStepsPerDay;
  }
        public String getName() {
                return name;
        }
        public String getDayOfBirth() {
                return dayOfBirth;
        }
        public String getMounthOfBirth() {
                return mounthOfBirth;
        }
        public int getYearOfBirth() {
                return yearOfBirth;
        }
        public int getAgeFullYears() {
                return ageFullYears;
        }
        public String getEmail() {
                return email;
        }
        public String getPhoneNumber() {
                return phoneNumber;
        }
        public void setSurname(String surname) {
                this.surname = surname;
        }
        public void setWeight(double weight) {
                this.weight = weight;
        }
        public void setPreassure(String preassure) {
                this.preassure = preassure;
        }
        public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
                this.numberOfStepsPerDay = numberOfStepsPerDay;
        }
        void printAccountInfo() {
         System.out.println("Name: " + name +
                 ", surname: " + surname +
                 ", date of birth: " + dayOfBirth + "."
                 + mounthOfBirth + "." + yearOfBirth +
                 ", age (full years): " + ageFullYears +
                 ", email: " + email +
                 ", phone number: " + phoneNumber +
                 ", weight: " + weight +
                 ", preassure: " + preassure +
                 ", number of steps per day: " + numberOfStepsPerDay);
 }
}
