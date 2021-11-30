/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author MIHAN
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape circle = new Circle();
       System.out.println("Normal without border Shape info is: ");
       circle.draw();
       
       System.out.println();
       
       Shape redCircle = new RedShapeDecorator(new Circle());
       System.out.println("Border color and Shape info is: ");
       redCircle.draw();
       
       System.out.println();
       
       Shape redRectangle = new RedShapeDecorator(new Rectangle());
       System.out.println("Border color and Shape info is: ");
       redRectangle.draw();
    }
    
}
