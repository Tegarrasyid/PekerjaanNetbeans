/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refresh01;

/**
 *
 * @author TEGAR RASYID
 */
public class Refresh01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        c=2;
        c+=3;
        c--;
        System.out.println("isi variabel c sekarang adalah "+ c);
        matematikaDasar matematika01 = new matematikaDasar();
        matematika01.penambahan();
        System.out.println("isi variabel d adalah "+ matematika01.penambahan());
        System.out.println(" ");
        matematika01.penambahan01(2, 3);
        System.out.println("angka pertama adalah " + matematika01.g);
        System.out.println("angka kedua adalah " + matematika01.h);
        System.out.println("angka j adalah "+ matematika01.j); 
        System.out.println(" ");
        matematika01.pengurangan(18, 8);
        System.out.println("angka pertama adalah " + matematika01.g);
        System.out.println("angka kedua adalah " + matematika01.h);
        System.out.println(" ");
        matematika01.perkalian(5, 7);
        System.out.println("angka pertama adalah " + matematika01.g);
        System.out.println("angka kedua adalah " + matematika01.h);
        
    }
    
}
