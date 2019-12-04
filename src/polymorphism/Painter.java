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
public class Painter {
    public void draw(String s){
    System.out.println("Drawing String ..........");
    }
      public void draw(int s){
    System.out.println("Drawing int ..........");
    }
      public void draw(double s){
    System.out.println("Drawing Double ..........");
    }
      public void draw(int s,String a){
    System.out.println("Drawing int and String ..........");
    }
      /* public int draw(int s,String a){
    System.out.println("Drawing int ..........");          // return type don't make different
    return 0 ;} */ 
    
}
