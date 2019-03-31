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
public class NoCoin implements State{


    public void check(Coin c) {
        c.set_state(new HaveCoin());
        System.out.println("Coin inserted");
    }

   
    public void rejected() {
         System.out.println("No coin");
        
    }
    
}
