/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KekhususanKarnivora;

import interface01.Impementasi;

/**
 *
 * @author TEGAR RASYID
 */
public class Harimau implements Impementasi{

    @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau bersuara roarr");
    }

    @Override
    public void berjalan() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau berjalan dengan empat kaki(lari)");
    }

    @Override
    public void bernafas() {
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau bernafas dengan paru paru");
    }

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau bergerak dengan Bebas");
    }
    
}
