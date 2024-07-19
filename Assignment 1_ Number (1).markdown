Value Types (Primitive Types) Stored in stack memory. They represent simple data types and include integers, floating-point numbers, characters, booleans, and many more. 
Reference Types (Any else not primitive) variable holds a reference (memory address) to the actual object. Reference types include classes, arrays, interfaces, enums, and objects. Reference types are stored on Heap.

There are many differences between the two, but the most noticeable is Variables of reference types store references to their data (objects), while variables of value types directly contain their data. With reference types, two variables can reference the same object; therefore, operations on one variable can affect the object referenced by the other variable

Example:

``` java
public class ValueType {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 20;

        System.out.println("a: " + a); 
        System.out.println("b: " + b); 
    }
}
```

``` java
public class reference {
    int angka;

    public reference(int angka) {
        this.angka = angka;
    }
    
    public static void main(String[] args) {
        reference ref1 = new reference(5);

       
        reference ref2 = ref1;

        
        ref2.angka = 10;

    
        System.out.println("ref1.angka: " + ref1.angka); 
        System.out.println("ref2.angka: " + ref2.angka); 
    }
}
```