//wrapper class using value of method
public class Q9 {
    public static void main(String[] args) {
       // Convert int, float, double, and boolean as string types
       String intString = "42";
       String floatString = "3.14";
       String doubleString = "2.71828";
       String boolString = "true";

       // Convert them to respective object types using valueOf method
       Integer integerValue = Integer.valueOf(intString);
       Float floatValueObject = Float.valueOf(floatString);
       Double doubleValueObject = Double.valueOf(doubleString);
       Boolean boolValueObject = Boolean.valueOf(boolString);

       // Display the converted values
       System.out.println("Converted Integer: " + integerValue);
       System.out.println("Converted Float: " + floatValueObject);
       System.out.println("Converted Double: " + doubleValueObject);
       System.out.println("Converted Boolean: " + boolValueObject);
   }
}