/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author User
 */
public class JpegReader implements ImageReader{

    private String jpeg;

    public JpegReader(String image) {
        jpeg =image;
        decodeImage();
    }
    
    @Override
    public void decodeImage() {
            System.out.println("Given "+jpeg.toString()+" image is decoded");
    }
    
}
