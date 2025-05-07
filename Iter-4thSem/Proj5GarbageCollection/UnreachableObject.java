package Proj5GarbageCollection;

public class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public static void show() {
        UnreachableObject obj = new UnreachableObject("Inner Object");
        obj.display();
    }

    public static void display() {
        UnreachableObject tempObj = new UnreachableObject("Temporary Object");
        tempObj = null; // Marking for garbage collection
        System.out.println("Display method invoked");
    }

    public static void main(String[] args) {
        show();

        // Explicitly invoke garbage collector
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object '" + this.name + "' is successfully garbage collected.");
        
    }
}
