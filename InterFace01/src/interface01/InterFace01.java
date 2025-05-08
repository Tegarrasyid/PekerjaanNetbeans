/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface01;

import Kekhususan.Beruang;
import Kekhususan.Monyet;
import Kekhususan.Tikus;
import KekhususanHerbivora.Kambing;
import KekhususanHerbivora.Kelinci;
import KekhususanHerbivora.Sapi;
import KekhususanKarnivora.Harimau;
import KekhususanKarnivora.Kucing;
import KekhususanKarnivora.Serigala;

/**
 *
 * @author TEGAR RASYID
 */
public class InterFace01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia  objectManusia = new Manusia();
        objectManusia.bergerak();
        objectManusia.bersuara();
        System.out.println("");
        
        Serigala  objectSerigala = new Serigala();
        objectSerigala.bergerak();
        System.out.println("");
        
        Kucing  objectKucing = new Kucing();
        objectKucing.bergerak();
        System.out.println("");
        
        Harimau  objectHarimau = new Harimau();
        objectHarimau.bergerak();
        System.out.println("");
        
        Sapi  objectSapi = new Sapi();
        objectSapi.bergerak();
        System.out.println("");
        
        Kelinci  objectKelinci = new Kelinci();
        objectKelinci.bergerak();
        System.out.println("");
        
        Kambing  objectKambing = new Kambing();
        objectKambing.bergerak();
        System.out.println("");
        
        Tikus  objectTikus = new Tikus();
        objectTikus.bergerak();
        System.out.println("");
        
        Monyet  objectMonyet = new Monyet();
        objectMonyet.bergerak();
        System.out.println("");
        
        Beruang  objectBeruang = new Beruang();
        objectBeruang.bergerak();
        System.out.println("");
        
    }
    
}
