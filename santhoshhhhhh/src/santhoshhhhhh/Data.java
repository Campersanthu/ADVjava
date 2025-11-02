package santhoshhhhhh;

public class Data {
    public static void main(String[] args) {
        int age = 24;
        double salary = 40000.80;
        char grade = 'A';
        boolean isEmployed = true;
        String name = "Santosh";
        byte smallNumber = 25;
        short mediumNumber = 200;
        long largeNumber = 100000L;
        float interestRate = 3.3f;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Small Number (byte): " + smallNumber);
        System.out.println("Medium Number (short): " + mediumNumber);
        System.out.println("Large Number (long): " + largeNumber);
        System.out.println("Interest Rate (float): " + interestRate);

        byte castedSalary = (byte) salary;
        double castedAge = (double) age;

        System.out.println("Casted Salary (double to byte): " + castedSalary);
        int yearsToRetirement = 65 - age;
        System.out.println("Years to Retirement: " + yearsToRetirement);
    }
}
