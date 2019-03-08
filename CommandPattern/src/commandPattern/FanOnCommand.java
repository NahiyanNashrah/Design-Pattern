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
public class FanOnCommand implements ICommand{

    private FanOn fanOn;
            FanOff fanOff;

    public FanOnCommand(FanOn fanOn,FanOff fanOff) {
        this.fanOn = fanOn;
        this.fanOff = fanOff;
    }
    
    @Override
    public void execute() {
        fanOn.onFan();
    }

    @Override
    public void undo() {
        fanOff.offFan();
    }
    
}
