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
public class GifReader implements ImageReader{

    private String gif;

    public GifReader(String image) {
        gif = image;
        decodeImage();
    }
    
    @Override
    public void decodeImage() {
        System.out.println("Gif image is decoded");
    }
    
}
