package Task_OOPs;
class Employee {

    public static void main(String[] args) {

        //Creating Employee objects
        Employee e1 = new Employee(101, "Sidra", "Developer", 50000);
        Employee e2 = new Employee(102, "Simran", "Manager", 75000);

        //Calling methods
        e1.work();
        e1.displayDetails();

        e2.work();
        e2.displayDetails();

    }

    // Private fields
    private int empId;
    private String name;
    private String position;
    private double salary;

    // Constructor
    public Employee(int empId, String name, String position, double salary) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Method 1
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    // Method 2
    public void displayDetails() {
        System.out.println(this.toString());
    }

    // Getters & Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // toString method
    @Override
    public String toString() {
        return "Employee {\n" +
                "    empId = " + empId + ",\n" +
                "    name = '" + name + "',\n" +
                "    position = '" + position + "',\n" +
                "    salary = " + salary + "\n" +
                "}";
    }

}
