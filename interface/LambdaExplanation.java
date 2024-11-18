class LambdaExplanation
{
    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(3*x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
		fobj.normalFun();
    }
}


	// Labda Sysntx

	// ()       ->     System.out.println("Zero parameter lambda");
	// ^         ^               ^
   // Lambda   Arrow Token       Body Of Lambda

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);
	// void abstractFunRun(int x); // we cannot  create functional interface object when same arugument in mumtiple method . it gives compile time error

    // A non-abstract (or default) function
    default void normalFun()
    {
		fun();
       System.out.println("Hello");
    }
    private void fun(){
	    System.out.println("I am private method");
	}
	
}

