package Java.Interfaces.InterfacesSolvingDiamondProblem;

// Interface A - Defines a method show()
interface A {
    void show();
}

// Interface B - Extends A
interface B extends A {
    default void show() {
        System.out.println("B's show()");
    }
}

// Interface C - Extends A
interface C extends A {
    default void show() {
        System.out.println("C's show()");
    }
}

// Class D - Implements B and C, resolving ambiguity
class D implements B, C {
    // Explicitly overriding show() to resolve ambiguity
    public void show() {
        System.out.println("D's show() - Resolving Diamond Problem");
        B.super.show(); // Choose which parent's method to call
        C.super.show();
    }
}

// Main class to test
public class DiamondProblemDemoSolution {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
