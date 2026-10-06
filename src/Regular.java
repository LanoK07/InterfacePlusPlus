
// If a class implements an interface then the implementing class must provide the definition of the
// abstract methods of the interface

// Rule: If a class inherit and implements then extends must be performed before implements

public class Regular extends AbstractClass implements Interface_A, Interface_B{

    @Override
    public void method_1_A() {
        System.out.println("Regular class is implementing method_1_A");
    }

    @Override
    public void method_2_A() {
        System.out.println("Regular class is implementing method_2_A");
    }
   //  @Override
     //public void display_information(){
       // }
    @Override
    public void Method_1_B() {
        System.out.println("Regular class is implementing method_1_B");
    }

    @Override
    public void Method_2_B() {
        System.out.println("Regular class is implementing method_2_B");
    }
    public void abstract_method_AC(){
        System.out.println("Regular class is defining abstract_method_AC");
    }
    public void Method_1_C(){
        System.out.println("Regular class is defining method_1_C");
    }

    @Override
    public void method_1_D() {
        System.out.println("Regular class is defining method_1_D");
    }

    @Override
    public void abstract_method_E() {
        System.out.println("Regular class is implementing abstract_method_E");
    }
}
