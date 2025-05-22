/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asat;

/**
 *
 * @author TEGAR RASYID
 */
public class ASAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("Hallo");
        Propertiku objectproperti01 = new Propertiku();
        Propertiku objectproperti03 = new Propertiku();
        Propertiku objectproperti04 = new Propertiku();
        Turunankesatu objectpropertiku02 = new Turunankesatu();
        objectproperti01.setX(10);
        objectpropertiku02.setX(20);
        
        int a = objectproperti01.getX();
        int b = objectpropertiku02.getX();
        String c = objectproperti03.getW();

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        bebas u = new bebas();
        u.catatan01();
        System.out.println("");
        
        Interface01 p = new Hello();
        p.sayHello01();
        p.myDictionary01();
        
        Hello r = new baru();
        r.sayHello01();
        r.myDictionary01();
        
        
        Integer angka1 = 10;
        Double angka2 = 3.14;
        String teks = "Hello";
        
        if(angka1 instanceof Integer){
            System.out.println("angka1 adalah Integer");
        }if(angka2 instanceof Double){
            System.out.println("angka2 adalah Double");
        }if(teks instanceof String){
            System.out.println("teks adalah String");
        }
    }
    
}
