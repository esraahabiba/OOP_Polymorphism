/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author gt
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Painter p1 = new Painter();
        p1.draw("a");
        Painter p2 = new Painter();
        p2.draw(2.5);
        Painter p3 = new Painter();
        p3.draw(5);
        Painter p4 = new Painter();
        p2.draw(5, "a");
        Circle c1 = new Circle();
        c1.draw(0, 0); // child method
        c1.draw("a");  // from parent 
        c1.draw("a");  // overriding here ....will print child copy as runtime deal with object not referance as compile time
         Painter pc = new Circle(); // referance of type painter but object of type circle
         pc.draw("a"); // if there is no draw in circle ,, it will print draw of type painter
        // pc.print(); // compilation error as referance of type painter not circle
    }

}
