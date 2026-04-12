class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double basicSalary;

    FullTimeEmployee(double salary) {
        this.basicSalary = salary;
    }

    @Override
    double calculateSalary() {
        return basicSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(double hours, double rate) {
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Ummuh {
    public static void main(String[] args) {

        Employee fullTime = new FullTimeEmployee(7000);
        Employee partTime = new PartTimeEmployee(80, 500);

        System.out.println("Full Time Salary: " + fullTime.calculateSalary());
        System.out.println("Part Time Salary: " + partTime.calculateSalary());
    }
}