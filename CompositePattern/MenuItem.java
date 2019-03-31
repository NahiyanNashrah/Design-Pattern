/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

/**
 *
 * @author User
 */
public class MenuItem implements IMenu{

    private  String name;

    public MenuItem(String name) {
        this.name = name;
    }
    
    
    @Override
    public void print() {
       System.out.println(CompositeMain.compositeBuilder + name);
    }
    
}
