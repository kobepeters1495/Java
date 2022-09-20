// This application displays a hello message on
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method.
public class HelloApp2                        // HelloApp2 class begins here
{
  public static void main(String[] args)      // main method is declared
  {
    Greeter myGreeterObject = new Greeter();  // 1st line in main method body has variable myGreeterObject
    myGreeterObject.sayHello();               // which holds objects created from the Greeter class
  }
}
