### DOG CLASS
``` java
public class Dog {
    private String color;
    private String name;
    private String breed;

    
    public Dog(String color, String name, String breed) {
        this.color = color;
        this.name = name;
        this.breed = breed;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println(name + " is wagging the tail.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public static void main(String[] args) {
        Dog waggingDog = new Dog("Brown", "Blackie", "Golden");
        waggingDog.wagTail();

        Dog barkingDog = new Dog("Dirt", "Max", "German Shepherd");
        barkingDog.bark();

        Dog eatingDog = new Dog("White", "Relax", "Labrador Retriever");
        eatingDog.eat();
    }
}
```

### Teacher And Subject Class

``` java
package Tugas;

 public class Teacher {
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
```
``` java
package Tugas;

public class Subject {
    private String name;
    private int classId;

    
    public Subject(String name) {
        this.name = name;
    }

    public Subject(String name, int classId) {
        this.name = name;
        this.classId = classId;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
```

## Main

``` java
package Tugas;

public class Main {
    public static void main(String[] args) {
        
        Subject math = new Subject("Mathematics", 1);
        System.out.println("Subject : " + math.getName() + ", Class ID: " + math.getClassId());
        Teacher tam = new Teacher("Tam", 30, "Mathematics");
        System.out.println("Teacher : " + tam.getName() + ", Age: " + tam.getAge() + ", Subject: " + tam.getSubject());
        System.out.println("Teacher " + tam.getName() + " teaching " + tam.getSubject() + " for Class " + math.getClassId());
 
    }
}
```


