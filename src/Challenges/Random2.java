/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.Scanner;

/**
 *
 * @author april nf
 */
public class Random2 {

    /*
    deklrasai variabel array a untuk input data
    array b untuk menyimpan hasil random dari data array a
     */
    int a[] = new int[10];
    int b[] = new int[10];

    /*
    Method untuk membuat data yang akan digunakan untuk dirandom
     */
    int [] data() {
        System.out.println("BEFORE");
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println(a[i]);
        }
        return a;
    }

    /*
    method unutk merandom angka dari data array a
     */
    int [] random() {
        for (int i = 0; i < b.length; i++) {
            do {
                b[i] = (int) (a.length * Math.random() + 1);
            } while (cek(b, b[i], i));
        }
        System.out.println("AFTER");
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
        return b;
    }

    /*
    Method untuk cek apakah angka ada yg berulang di array
    all = variabel array
    a = nilai dari array pada index ke - i
    i = index array yang akan dicek
     */
    private boolean cek(int[] all, int a, int i) {
        boolean sama = false;
        if (i != 0) {
            for (int j = 0; j < i; j++) {
                if (all[j] == a) {
                    //Jika angka berulang
                    System.out.println("ya" + i);
                    sama = true;
                }
                System.out.println("no" + i);
            }
        }
        return sama;
    }

    public static void main(String[] args) {
        /*
        
         */
        Random2 r = new Random2();
        r.data();
        r.random();
    }
}
