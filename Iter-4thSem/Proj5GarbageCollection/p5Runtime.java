package Proj5GarbageCollection;

	class DataClass {
	    private int integerData;
	    private double doubleData;

	    public DataClass() {
	        // Default constructor
	    }

	    public void initializeData(int intValue, double doubleValue) {
	        this.integerData = intValue;
	        this.doubleData = doubleValue;
	    }

	    public void setData(int intValue, double doubleValue) {
	        this.integerData = intValue;
	        this.doubleData = doubleValue;
	    }

	    public void updateData(int intValueToAdd, double doubleValueToAdd) {
	        this.integerData += intValueToAdd;
	        this.doubleData += doubleValueToAdd;
	    }
	}
	public class p5Runtime {

	    public static void main(String[] args) {
	        Runtime runtime = Runtime.getRuntime();
	        // Creating two objects of DataClass
	        DataClass obj1 = new DataClass();
	        DataClass obj2 = new DataClass();
	        // Initializing and updating data members
	        obj1.initializeData(10, 5.5);
	        obj1.updateData(5, 2.5);

	        obj2.initializeData(20, 10.5);
	        obj2.updateData(8, 4.2);

	        // Calculating memory usage before making objects unreachable
	        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
	        System.out.println("Memory used before making objects unreachable: " + initialMemory + " bytes");
	        // Making objects unreachable
	        obj1 = null;
	        obj2 = null;
	        // Running garbage collection
	        runtime.gc();
	        // Calculating memory usage after garbage collection
	        long memoryAfterGC = runtime.totalMemory() - runtime.freeMemory();
	        System.out.println("Memory used after garbage collection: " + memoryAfterGC + " bytes");

	        // Total memory allocated
	        long totalMemory = runtime.totalMemory();
	        System.out.println("Total memory allocated: " + totalMemory + " bytes");
	    }
	}
