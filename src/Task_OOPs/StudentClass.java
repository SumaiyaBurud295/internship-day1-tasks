package Task_OOPs;
class Student {
    public static void main(String[] args) {

        //Creating a Student object
        Student s1 = new Student(1, "Safa", 10, "Computer Science");

        //Calling methods
        s1.study();
        s1.displayInfo();

    }

    // Private attributes (Encapsulation)
    private int id;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method 1
    public void study() {
        System.out.println(name + " is studying " + course);
    }

    // Method 2
    public void displayInfo() {
        System.out.println(this.toString());
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method
    @Override
    public String toString() {
        return "Student {\n" +
                " id '" + id + "',\n" +
                " name = " + name + ",\n" +
                " age = " + age + ",\n" +
                " course = " + course + ",\n" +
                "}";
    }
}
