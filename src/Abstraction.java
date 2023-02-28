abstract class Parent2{
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
 abstract class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
//    @Override
//    public void greet2(){
//        System.out.println("Good afternoon");
//    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        //Parent2 p = new Parent2();
        Child2 c = new Child2()
        {
            @Override
            public void greet2() {
                System.out.println("checking");
            }
        };
        c.greet();
        c.greet2();
//        Child3 c3 = new Child3() {
//            @Override
//            public void greet() {
//
//            }
//
//            @Override
//            public void greet2() {
//
//            }
//        };
    }
}