/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPattern;

/**
 *
 * @author User
 */
public class LightOnCommand implements ICommand{

    private Light light;

    public LightOnCommand(Light light) {
        this.light=light;
    }
    
    
    @Override
    public void execute() {
        light.lightOn();
    }
    
    @Override
     public void undo(){
        light.lightOff();
    }
}
