package inheritance;

public class SuperClass {

    public int x;
    static int st;

    //use of final keyword to prevent polymorphism
     final static void printSomething(){
        System.out.println("Im in SuperClass");
    }

     void nonStFun(){
        System.out.println("Im a non-static function of super class");
    }
    static void stFun(){
        System.out.println("Im a static function of Super class");
    }


}
