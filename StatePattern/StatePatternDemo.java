/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Coin c = new Coin();
        while (true) {
            System.out.print("Press ENTER");
            getLine();
            c.check();
            c.reject();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
