package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a person with various attributes and behaviors.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String hairColor;
    private String eyeColor;

    /**
     * Creates a new Person instance with the provided attributes.
     *
     * @param firstName  The first name of the person.
     * @param lastName   The last name of the person.
     * @param age        The age of the person.
     * @param gender     The gender of the person.
     * @param height     The height of the person in meters.
     * @param weight     The weight of the person in kilograms.
     * @param hairColor  The hair color of the person.
     * @param eyeColor   The eye color of the person.
     */
    public Person(String firstName, String lastName, int age, String gender,
                  double height, double weight, String hairColor, String eyeColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    /**
     * Makes the person walk.
     */
    public void walk() {
        System.out.println(firstName + " is walking.");
    }

    /**
     * Makes the person talk with the provided message.
     *
     * @param message The message to be spoken.
     */
    public void talk(String message) {
        System.out.println(firstName + " says: " + message);
    }

    /**
     * Calculates and returns the Body Mass Index (BMI) of the person.
     *
     * @return The BMI value.
     */
    public double getBMI() {
        double bmi = weight / (height * height);
        System.out.println(firstName + "'s BMI: " + bmi);
        return bmi;
    }

    /**
     * Returns the full name of the person.
     *
     * @return The full name.
     */
    public String getFullName() {
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        return fullName;
    }

    /**
     * The main method to create and test Person instances.
     *
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30, "Male", 1.75, 70.0,
                                    "Brown", "Blue");
        Person person2 = new Person("Jane", "Smith", 28, "Female", 1.60, 55.0,
                                    "Blonde", "Green");

        person1.walk();
        person2.talk("Hello, how are you?");
        person1.getBMI();
    }
}
