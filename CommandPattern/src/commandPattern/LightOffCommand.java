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
public class LightOffCommand implements ICommand{
    private Light light;

    public LightOffCommand(Light light) {
        this.light=light;
    }

    
    @Override
    public void execute() {
        light.lightOff();
    }
    
    public void undo(){
        light.lightOn();
    }
}
