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
public class CommandMain {
    public static void main(String[] args) {
        
    SimpleCommandCenter center = new SimpleCommandCenter();
    
    FanOff fanOff = new FanOff();
    FanOn fanOn = new FanOn();
    Light light=new Light();
    
    FanOffCommand offCommand = new FanOffCommand(fanOff,fanOn);
    FanOnCommand onCommand = new FanOnCommand(fanOn,fanOff);
    
    LightOffCommand offCommand1=new LightOffCommand(light);
    LightOnCommand onCommand1=new LightOnCommand(light);
    
    center.setCommand(onCommand);
    center.pressOnButton();
    
    center.setCommand(offCommand);
    center.pressOffButton();
    center.setCommand((ICommand) onCommand1);
    center.pressOnButton();
    center.setCommand((ICommand) offCommand1);
    center.pressOffButton();
    center.undo();
    }
}
