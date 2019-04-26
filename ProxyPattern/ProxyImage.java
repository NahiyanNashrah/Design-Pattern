/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

/**
 *
 * @author User
 */
public class ProxyImage implements Image{
    
    private RealImage image=null;
    String filename=null;

    public ProxyImage(String filename) {
        this.filename=filename;
    }
    
    
    

    @Override
    public void displayImage() {
        if(image==null)
            image=new RealImage(filename);
        System.out.println("Displaying "+filename);
    }
    
}
