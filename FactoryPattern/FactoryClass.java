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

public class FactoryClass {
    ImageReader reader;
    public ImageReader getType(String s){
       if(s.contains(".gif"))
        return new GifReader(s);
       else if(s.contains(".jpeg"))
           return new JpegReader(s);
       else 
        return null;
    }
}
