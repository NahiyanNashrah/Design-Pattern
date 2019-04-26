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
public class RealImage implements Image{
    
    String filename = null;

    public RealImage(String filename) {
        this.filename=filename;
        loadingImageFromDisk();
    }

    public void loadingImageFromDisk(){
        System.out.println("Loading "+filename);
    }
    
    

    @Override
    public void displayImage() {
        System.out.println("Dispalying "+filename);
    }

    
    
}
