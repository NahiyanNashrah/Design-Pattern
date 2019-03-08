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
abstract class Decorator implements Bun{
    private Bun bun;

    public Decorator(Bun bun) {
        this.bun = bun;
    }
    
    @Override
    public void make(){
        bun.make();
    }
}
