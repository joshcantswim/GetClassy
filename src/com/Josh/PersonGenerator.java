package com.Josh;
import java.util.Scanner;

public class PersonGenerator {

    public static void main(String[] args) {

         String ID;
         String firstName;
         String lastName;
         String title;
         int YOB;
         String trash;

        Scanner in = new Scanner(System.in);
        Scanner inTwo = new Scanner(System.in);
    do {

        System.out.println("Enter ID: ");
        ID = in.nextLine();

        System.out.println("Enter First Name: ");
        firstName = in.nextLine();

        System.out.println("Enter Last Name: ");
        lastName = in.nextLine();

        System.out.println("Enter Title: ");
        title = in.nextLine();

        System.out.println("Enter YOB: ");
        YOB = in.nextInt();

        Person examplePerson = new Person(ID, firstName, lastName, title, YOB);

        System.out.println(examplePerson.toCSVDataRecord());

        trash = in.nextLine();

    } while(SafeInput.getYNConfirm(inTwo, "Would you like to enter another person?")==true);

    }
}
