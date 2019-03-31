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
public class HaveCoin implements State{

    @Override
    public void check(Coin c) {
        c.set_state(new Accepted());
        System.out.println("Coin accepted");
    }
    @Override
    public void rejected() {
         System.out.println("Have coin");
        
    }
    
}
