/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;


public class FactoryMain {
    public static void main(String[] args) {
       
        FactoryClass factoryClass=new FactoryClass();
        String image="photo.jpeg";
        factoryClass.getType(image);
        
    }
}
