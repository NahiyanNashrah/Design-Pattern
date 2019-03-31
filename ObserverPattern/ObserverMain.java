/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ObserverMain {
    public static void main(String[] args) {
        Product samsungLEDTv = new Product("Samsung LED Tv", "LED Tv", "60000", "not available");
        Person david = new Person("David", samsungLEDTv);
        Person john = new Person("John", samsungLEDTv);
        
        ArrayList<Observer>subscriber = samsungLEDTv.getObsevers();
        System.out.println("Subscribers list ");
        for(Iterator<Observer>i = subscriber.iterator();i.hasNext(); ){
            Person person = (Person)i.next();
            System.out.println(person.getPersonName());
        }
        System.out.println();
         System.out.println("Samsung LED Tv current state "+samsungLEDTv.getAvailability());
          System.out.println();
           samsungLEDTv.setAvailability("Available");
    }
}
