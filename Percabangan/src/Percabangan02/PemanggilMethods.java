/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan02;

/**
 *
 * @author TEGAR RASYID
 */
public class PemanggilMethods {
    public static void main(String[] args) {
        Methods object01 = new Methods();
        object01.tulis();
        object01.tulis02();
        Method01 object02 = new Method01();
        object02.tulis();
        object02.tulis02();
        object02.tambah();
        object02.tambah01(21, 12);
        object02.kali(24, 7);
        object02.kurang(63, 42);
        object02.bagi(81, 3);
    }
}
