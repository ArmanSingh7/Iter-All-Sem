package Proj5GarbageCollection;

class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Memory for student " + name + " released.");
    }
}

public class p7Universityenrollment {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Creating student objects
        Student student1 = new Student("John", 20, "Computer Science");
        Student student2 = new Student("Alice", 21, "Mathematics");

        // Printing memory usage before making objects unreachable
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used before making objects unreachable: " + initialMemory + " bytes");

        // Making objects unreachable
        student1 = null;
        student2 = null;

        // Running garbage collection
        runtime.gc();

        // Calculating memory usage after garbage collection
        long memoryAfterGC = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used after garbage collection: " + memoryAfterGC + " bytes");
    }
}
