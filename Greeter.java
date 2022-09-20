/*
// This class represents a Greeter object that displays
// a hello message on the console
public class Greeter
{
  public void sayHello()
  {
    System.out.println("Hello, World!");
  }
}
*/

// Version 2

// This class creates a Greeter object that displays
// a hello message in a dialog box.

import javax.swing.JOptionPane;

public class Greeter
{
  public void sayHello()
  {
    JOptionPane.showMessageDialog(null,
    "Hello, World!", "Greeter",
    JOptionPane.INFORMATION_MESSAGE);
  }
}
