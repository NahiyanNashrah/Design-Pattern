/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decoration;

/**
 *
 * @author User
 */
public class Meat extends Decorator{
    
    public Meat(Bun bun) {
        super(bun);
    }
    @Override
    public void make(){
        super.make();
        System.out.println(" Meat");
    }
}
