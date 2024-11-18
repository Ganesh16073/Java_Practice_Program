class A {
 public void show() //internal meaning = default void show() 
 {
 System.out.println("I am A ");
 }
}
class B extends A {
 public void show() { // if we use void return type then child logic will excuted.
						// if we use Static then Parent logic will excuted
 System.out.println("I am B");
 }
}
public class InheritenceRefrenceApp {
 public static void main(String[] args) {
 A a1 = new B();
 a1.show(); 
}
}
