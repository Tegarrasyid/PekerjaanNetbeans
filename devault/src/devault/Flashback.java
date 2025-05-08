/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devault;

/**
 *
 * @author TEGAR RASYID
 */
public class Flashback {
    public static int bil1, bil2, jumlah;
    
    public static void main(String[] args) {
        bil1=2;
        bil2=3;
        
        switch(bil1){
            case 2: {
                System.out.println("Bil1 + 2 benar " +bil1);
                break;
            }
            case 3 :{
                System.out.println("Bil2 + 3 benar " +bil2);
                break;
            }
            default:{
                
            }
        }

    }
}