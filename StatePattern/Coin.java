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
public class Coin {
    private State currentState;

    public Coin() {
        currentState=new NoCoin();
    }
    
    public void set_state(State s) {
        currentState = s;
    }
    
    public void check(){
        currentState.check(this);
    }
    public void reject(){
        currentState.rejected();
    }
}
