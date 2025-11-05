package week09.milano.id.ac.umn;

public class c implements a, b{
    public void displayA() {
        System.out.println("Display A");
    }
    public void displayB() {
        System.out.println("Display B");
    }

    public static void main(String[] args) {
        c c = new c();
        c.displayA();
        c.displayB();
    }
}

