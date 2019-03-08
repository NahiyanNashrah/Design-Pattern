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
public class SimpleCommandCenter {
    ICommand obj;

    public SimpleCommandCenter() {
    }
    
    public void setCommand(ICommand objCommand){
        obj=objCommand;
    }
    
    public void pressOnButton(){
        obj.execute();
    }
    
     public void pressOffButton(){
        obj.execute();
    }

    public SimpleCommandCenter(ICommand obj) {
        this.obj = obj;
    }
     
    public void undo(){
        obj.undo();
    }
}
