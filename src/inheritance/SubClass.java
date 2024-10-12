package inheritance;

public class SubClass extends SuperClass {

    void modSuperVars() {
        super.st=100;  //modifying static vars
        super.x=4; //modifying non-static vars
    }

    void runSuperMethods(){
       super.stFun(); //running super class's static function
       super.nonStFun(); // running super class's non-static function
    }

}
