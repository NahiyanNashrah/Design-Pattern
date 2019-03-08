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
public class Burger implements Bun{

    private int num;

    public Burger(int num) {
        this.num = num;
    }
    
    
    
    @Override
    public void make() {
        System.out.println("Burger: "+num);
    }
    
}
