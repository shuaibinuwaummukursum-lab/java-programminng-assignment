class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double basicSalary;

    FullTimeEmployee(double salary) {
        basicSalary = salary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(double hours, double rate) {
        hoursWorked = hours;
        hourlyRate = rate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class TestEmployee {

    public static void main(String[] args) {

        Employee f = new FullTimeEmployee(70000);
        Employee p = new PartTimeEmployee(80, 500);

        System.out.println("Full Time Salary: " + f.calculateSalary());
        System.out.println("Part Time Salary: " + p.calculateSalary());
    }
}