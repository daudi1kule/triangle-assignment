import javax.swing.*;

public class DetermineTriangle {
    // call main method
    public static void main(String[] args) {
        System.out.print("Triagle Identifier! Enter sides of any given triangle \n");

        // get sides of the triangle
        String a = JOptionPane.showInputDialog("Enter size for a", 1);
        System.out.println("a is : " + a + " \n");
        // b
        String b = JOptionPane.showInputDialog("Enter size for b", 1);
        System.out.println("b is : " + b+ " \n");
        // c
        String c = JOptionPane.showInputDialog("Enter size for c", 1);
        System.out.println("c is : " + c+ " \n");
        // b = args[1];
        // c = args[2];
        String[] triangle =  [a, b, c]

        // determine length of sides
        // if all sides = equal then is a equilateral
        // if 2 sides = equal then is isosceles
        // if no equal sides = equal then triangle is scalene


    }

}