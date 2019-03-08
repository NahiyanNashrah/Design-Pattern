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
public class FanOffCommand implements ICommand{
    private FanOff fanOff;
            FanOn fanOn;
   

    public FanOffCommand(FanOff fanOff,FanOn fanOn) {
        this.fanOff = fanOff;
        this.fanOn=fanOn;
    }

    
    @Override
    public void execute() {
        fanOff.offFan();
    }

    @Override
    public void undo() {
       fanOn.onFan();
    }
    
}
