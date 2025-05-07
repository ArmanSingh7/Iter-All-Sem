
public class program6 {
    public static void main(String[] args) {
        // Experiment 1: Boxed String
        Box<String> stringBox = new Box<>("Hello");
        Box<String> anotherStringBox = stringBox;

        System.out.println("Experiment 1:");
        System.out.println("Initial Contents:");
        System.out.println("stringBox: " + stringBox.getItem());
        System.out.println("anotherStringBox: " + anotherStringBox.getItem());

        anotherStringBox.setItem("World");

        System.out.println("After Changing Contents:");
        System.out.println("stringBox: " + stringBox.getItem());
        System.out.println("anotherStringBox: " + anotherStringBox.getItem());

        // Experiment 2: Boxed Integer
        Box<Integer> intBox = new Box<>(10);
        Box<Integer> anotherIntBox = intBox;

        System.out.println("\nExperiment 2:");
        System.out.println("Initial Contents:");
        System.out.println("intBox: " + intBox.getItem());
        System.out.println("anotherIntBox: " + anotherIntBox.getItem());

        anotherIntBox.setItem(20);

        System.out.println("After Changing Contents:");
        System.out.println("intBox: " + intBox.getItem());
        System.out.println("anotherIntBox: " + anotherIntBox.getItem());

        // Experiment 3: Boxed Object
        Box<Object> objectBox = new Box<>();
        Box<Object> anotherObjectBox = objectBox;

        System.out.println("\nExperiment 3:");
        System.out.println("Putting a String in the Object Box:");
        objectBox.setItem("Hello, World!");
        System.out.println("objectBox: " + objectBox.getItem());
        System.out.println("anotherObjectBox: " + anotherObjectBox.getItem());

        System.out.println("\nPutting an Integer in the Object Box:");
        objectBox.setItem(42);
        System.out.println("objectBox: " + objectBox.getItem());
        System.out.println("anotherObjectBox: " + anotherObjectBox.getItem());
    }
}

class Box<T> {
    private T item;

    public Box() {
    }

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}