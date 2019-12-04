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
public class Circle extends Painter{
    public void draw(int s , int a){    //overloading as different parameter from super(parent)
    System.out.println("Drawing int In Circle ..........");
    }
    
    @Override
    public void draw(String s){
    System.out.println("Drawing String In Circle ..........");
    }
    public void print(){
    System.out.println("Printing Hereeeee..........");
    }
}
