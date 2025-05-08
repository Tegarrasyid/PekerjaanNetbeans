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
public class Kucing implements Impementasi{

    @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bersuaraa meaw meaw");
    }

    @Override
    public void berjalan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing berjalan menggunakan empat kaki");
    }

    @Override
    public void bernafas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bernafas menggunakan paru paru");
    }

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bergerak dengan bebas ");
    }
    
}
