package Java.Interfaces.InterfacesSolvingDiamondProblem;

// Parent class A
class A {
    void show() {
        System.out.println("A's show()");
    }
}

// Class B extends A
class B extends A {
}

// Class C also extends A
class C extends A {
}

// ❌ Java does NOT allow this - Compilation Error
// Class D trying to extend both B and C
class D extends B, C {  // ERROR: Java does not support multiple inheritance
}

public class DiamondProblemJava {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();  // ❌ Compilation error: Cannot inherit from multiple classes
    }
}
