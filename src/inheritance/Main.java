package inheritance;

public class Main {

    public static void main(String[] args) {
        SuperClass superClass= new SuperClass();
        SubClass subClass = new SubClass();

        System.out.println("st: "+ SuperClass.st);
        subClass.modSuperVars();
        System.out.println("st: "+ SuperClass.st);
        System.out.println("x: "+ subClass.x);
        subClass.runSuperMethods();

    }
}
