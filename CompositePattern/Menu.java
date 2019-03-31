/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Menu implements IMenu{

    private String name;
    private ArrayList includeList = new ArrayList();

    public Menu(String name) {
        this.name = name;
    }
    
   public void add(Object obj){
       includeList.add(obj);
   }
    
    /**
     *
     */
    @Override
    public void print() {
       System.out.println(CompositeMain.compositeBuilder + name);
        CompositeMain.compositeBuilder.append("   ");
         for (Object includedLists : includeList) {
            // Leverage the "lowest common denominator"
            IMenu obj = (IMenu) includedLists;
            obj.print();
        }
          CompositeMain.compositeBuilder.setLength(CompositeMain.compositeBuilder.length() - 3);
    }
    
}
