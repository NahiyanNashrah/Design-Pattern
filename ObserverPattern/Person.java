/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author User
 */
public class Person implements Observer{

    private String personName;

    public Person(String personName,Subject subject) {
        this.personName = personName;
        subject.addObserver(this);
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    @Override
    public void update(String availability) {
        System.out.println("Hello "+personName+" ,Product is now "+availability+" on flipkart");
    }
    
}
