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
public class Tikus implements Impementasi{

      @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tikus bersuara cit cit cit");
    }

    @Override
    public void berjalan() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tikus berjalan dengan empat kaki");
    }

    @Override
    public void bernafas() {
        ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tikus bernafas dengan paru paru");
    }

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tikus bergerak Bebas");
    }
}
