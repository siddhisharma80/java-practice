//OOPS PROGRAMS.
    //polymorphism program 
/*class Demo {
     void show() {
        System.out.println("Hello");
    }

    void show(int a) {
        System.out.println("Value: " + a);
    }

    public static void main(String[] args) {
        Demo d = new Demo();


        d.show();
        d.show(10);
    }
}
*/
// inheritance program

/*class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}*/
   
//abstraction program 


/*abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}*/
//  encaplaution 

/*class Student {
    private int age = 20;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(21);
        System.out.println("Age: " + s.getAge());
    }
}



*/