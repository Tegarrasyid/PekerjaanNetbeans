/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konsep;

/**
 *
 * @author TEGAR RASYID
 */
public class kensep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama1;
        int angka1;
        
        nama1 = "Nama saya";
        System.out.print("Nama saya juga ");
        System.out.println(nama1);
        System.out.println("");
        
          HDarat sapi = new HDarat();
          HDarat Harimau = new HDarat();
          HDarat Kuda = new HDarat();
          HDarat Kucing = new HDarat();
        
        sapi.makan = "Sapi Makan Rumput";
        System.out.println(sapi.makan);
         Harimau.makan = "Harimau Makan Daging";
        System.out.println(Harimau.makan);
         Kuda.makan = "Kuda Makan Rumput";
        System.out.println(Kuda.makan);
        Kucing.makan = "Kucing Makan ikan";
        System.out.println(Kucing.makan);
        
      System.out.println("");
      
        HLaut hiu = new HLaut();
        HLaut cumicumi = new HLaut();
        HLaut paus = new HLaut();
        HLaut lobster = new HLaut();
    
        hiu.makan = "Hiu Makan Daging";
        System.out.println(hiu.makan);
         cumicumi.makan = "cumicumi Makan ikan kecil";
        System.out.println(cumicumi.makan);
         paus.makan = "Paus Makan ikan";
        System.out.println(paus.makan);
        lobster.makan = "lobster Makan ikan kecil";
        System.out.println(lobster.makan);
        
        System.out.println("");
        
        HUdara Merpati = new HUdara();
        HUdara Elang = new HUdara();
        HUdara Kelelawar = new HUdara();
        HUdara Burung_Pipit = new HUdara();
        
        
        Merpati.makan = "Merpati Makan Jagung";
        System.out.println(Merpati.makan);
         Elang.makan = "Elang Makan Daging";
        System.out.println(Elang.makan);
         Kelelawar.makan = "Kelelawar Makan Serangga";
        System.out.println(Kelelawar.makan);
        Burung_Pipit.makan = "Burung_Pipit Makan Biji bijian";
        System.out.println(Burung_Pipit.makan);
        
    }
    
}
