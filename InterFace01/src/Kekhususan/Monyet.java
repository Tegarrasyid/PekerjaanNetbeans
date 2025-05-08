/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kekhususan;

import interface01.Impementasi;

/**
 *
 * @author TEGAR RASYID
 */
public class Monyet implements Impementasi{

        @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Monyet bersuara uu aa uu aa");
    }

    @Override
    public void berjalan() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Monyet berjalan menggunakan dua kaki");
    }

    @Override
    public void bernafas() {
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Monyet bernafas menggunakan paru paru");
    }

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Monyet bergerak Bebas");
    }
    
}
