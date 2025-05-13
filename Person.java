import java.time.Year;

class Person {
    String name;
    String dob;
    int birthYear;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;

        if (dob.charAt(2) == '-') {
            this.birthYear = Integer.parseInt(dob.substring(6));
            this.birthYear = Integer.parseInt(dob.substring(0, 4));
        }
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String employeeId;
    double salary;

    public Employee(String name, String dob, String employeeId, double salary) {
        super(name, dob);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}