package com.hillel.klysenko.lesson12;

public class Main  {
    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Ivan", "Ivanov",
                "14", "02", 1995, "123@gmail.com", "0965634243",
                67, "120/8", 3400);
        FitnessTracker person2 = new FitnessTracker("Anna", "Ivanova",
                "03", "04", 1991,  "1232@gmail.com", "09624399012",
                60.1, "125/80", 6400);
        FitnessTracker person3 = new FitnessTracker("Innokentyi", "Petroff",
                "12", "01", 1988, "inopetr@gmail.com", "09656544543",
                91.2, "140/97", 4463);
        FitnessTracker person4 = new FitnessTracker("Stepan", "Bandera",
                "01", "01", 1979, "gloryofukraine@gmail.com", "0961111111",
                87, "130/85", 12500);
        FitnessTracker person5 = new FitnessTracker("Olena", "Bublikova",
                "27", "12", 2003, "lena23@gmail.com", "0962205632",
                52.9, "122/77", 7010);
        person1.printAccountInfo();
        person2.printAccountInfo();
        person3.printAccountInfo();
        person4.printAccountInfo();
        person5.printAccountInfo();
        System.out.println();
        person2.setSurname("Pyatochkina");
        person2.setWeight(55.7);
        person2.printAccountInfo();
        person3.setWeight(79.5);
        person3.setPreassure("139/89");
        person3.setNumberOfStepsPerDay(5321);
        person3.printAccountInfo();

    }
}
