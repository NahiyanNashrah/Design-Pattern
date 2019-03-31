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
public class CompositeMain {
    public static StringBuffer compositeBuilder = new StringBuffer();
    
    public static void main(String[] args) {
        Menu breakfastMenu = new Menu("Breakfast");
        Menu lunchMenu = new Menu("Lunch");
        Menu dinnerMenu = new Menu("Dinner");
        
        MenuItem oats = new MenuItem("Oats");
        MenuItem rice = new MenuItem("Rice");
        MenuItem vegetable = new MenuItem("vegetable");
        MenuItem chicken = new MenuItem("chicken");
        MenuItem bread = new MenuItem("bread");
        MenuItem fish = new MenuItem("fish");
        MenuItem friedRice = new MenuItem("friderice");
        
       breakfastMenu.add(oats);
       breakfastMenu.add(bread);
       
       lunchMenu.add(rice);
       lunchMenu.add(vegetable);
       lunchMenu.add(chicken);
       breakfastMenu.print();
       lunchMenu.print();
       
       
        
    }
}
