/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author User
 */
public class Accepted implements State{

    @Override
    public void check(Coin c) {
        c.set_state(new Dispense());
        System.out.println("Dispense");
        
    }

    @Override
    public void rejected() {
         System.out.println("Rejected");
        
    }
    
}
