package codeWars;

public class Test {
    int instanceVar = 42;
    static int staticVar = 99;

    public void show() {
        System.out.println("Instance Method in Test");
    }

    public static void display() {
        System.out.println("Static Method in Test");
    }
}

class Test1 extends Test {
    int instanceVar = 100; // hides base class instanceVar
    static int staticVar = 200; // hides base class staticVar

    public void show() {
        System.out.println("Instance Method in Test1");
    }

    public static void display() {
        System.out.println("Static Method in Test1");
    }

    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4,5};
//        for(int i = 0; i < 5; ++i)
//        System.out.println(arr[i]);
//        int x = 1/0;
//        Test t = new Test1();  // Upcasting
//
//        // Static methods – resolved at compile time (class reference matters)
//        t.display(); // Calls Test.display() because reference type is Test
//
//        // Instance methods – resolved at runtime (object type matters)
//        t.show(); // Calls Test1.show() because object is Test1
//
//        // Variables – resolved using reference type
//        System.out.println("Instance var: " + t.instanceVar); // prints Test's instanceVar
//        System.out.println("Static var: " + t.staticVar); // prints Test's staticVar
try {
        int arr[] = {1,2,3,4,5};
        for(int i = 0; i < 5; ++i)
        System.out.println(arr[i]);
        int x = 1/0;
     } catch (ArrayIndexOutOfBoundsException a) {
    System.out.println("A");
}catch (ArithmeticException b) {
    System.out.println("B");
}

}
}

