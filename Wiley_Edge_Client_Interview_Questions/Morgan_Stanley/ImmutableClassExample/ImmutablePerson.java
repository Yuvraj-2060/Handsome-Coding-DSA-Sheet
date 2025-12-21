package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley.ImmutableClassExample;


//In Java, you can create an immutable class by following these key principles:
//
//     1.   Make the class final to prevent inheritance.
//     2.   Make all fields private and final to ensure they cannot be modified after initialization.
//     3.   Do not provide any setter methods. Instead, initialize the fields through the constructor.
//     4.   Ensure that mutable objects contained within the class are not exposed directly.
public final class ImmutablePerson {
    private final String firstName;
    private final String lastName;
    private final int age;

    // Constructor to initialize the fields
    public ImmutablePerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter methods to access the fields
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // No setter methods provided

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
