/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Product implements Subject{

    private ArrayList<Observer>observers = new ArrayList<Observer>();
    
    private String productName,
                    productType,
                    productPrice,
                    availability;
    
    public ArrayList<Observer> getObsevers(){
        return observers;
    }

    public Product(String productName, String productType, String productPrice, String availability) {
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }
    
    
    
    public void setAvailability(String availability){
        this.availability=availability;
        System.out.println("Availability changed from not available to available");
        notifyObserver();
    }
    
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Product Name : "+this.productName+" , Product Type : "+this.productType+" , Product Price : "
        +this.productPrice+" is available now.So notifying all the users.");
        System.out.println();
        
        for(Observer observer : observers)
            observer.update(this.availability);
    }
    
}
