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
public class ProxyMain {
    public static void main(String[] args) {
        
        final Image Image1=new ProxyImage("100 Mb file");
        final Image Image2=new ProxyImage("200Mb file");
        
        System.out.println("Calling Image1 for first time ");
        Image1.displayImage();
        
        System.out.println("***********************************");
        System.out.println("Calling Image1 for second time ");
        Image1.displayImage();
        
        System.out.println("***********************************");
        System.out.println("Calling Image1 for third time ");
        Image1.displayImage();
        
        
    }
}
