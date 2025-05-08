/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface01;

/**
 *
 * @author TEGAR RASYID
 */
public class Manusia implements Impementasi{

    @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Manusia bersuara Hehey");
    }

    @Override
    public void berjalan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Manusia berjalan dengan dua kaki");
    }

    @Override
    public void bernafas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Manusia bernafas menggunakan paru paru");
    }

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Manusia bergerak Bebas");
    }
    
    
}
