package Task_OOPs;
public class PolymorphismDemo {

    public static void main(String[] args) {

        // Parent reference → Student object
        Worker w1 = new StudentWorker();
        w1.work();   // Calls Student version

        // Parent reference → Employee object
        Worker w2 = new EmployeeWorker();
        w2.work();   // Calls Employee version
    }
}

// Parent Class
class Worker {
    public void work() {
        System.out.println("Worker is doing some work");
    }
}

// Student overrides work()
class StudentWorker extends Worker {
    @Override
    public void work() {
        System.out.println("Student is studying");
    }
}

// Employee overrides work()
class EmployeeWorker extends Worker {
    @Override
    public void work() {
        System.out.println("Employee is doing office work");
    }
}