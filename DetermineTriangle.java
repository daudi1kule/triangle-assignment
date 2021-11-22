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
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
        // b = args[1];
        // c = args[2];
        // String[] triangle =  [a, b, c]
        // switch to int values limit to 100
        String msg = null;
        if(x ==y && y == z) {
            // return triangle is equilateral - 3 sides
            msg = "All sides are equal. Triangle is Equilateral! \n";
            System.out.println(msg);
        } else if (x == y || y==z || x==z) {
            // two sides will be equal
            // get diff in the 2 sides
            msg = "Only two sides are equal. Triangle is isosceles! \n";
            System.out.println(msg);
        } else {
            // triangle is scalene
            msg = "No sides are equal. Triangle is Scalene! \n";
            System.out.println(msg);
        }

        // determine length of sides
        // if all sides = equal then is a equilateral
        // if 2 sides = equal then is isosceles
        // if no equal sides = equal then triangle is scalene
        System.out.println("End of File execution");

    }

}