/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author april nf
 */
public class Random {

    int a[] = new int[10];

    void random() {
        for (int i = 0; i < a.length; i++) {
            do {
                a[i] = (int) (1 + Math.random() * 10);
            } while (cek(a, a[i], i));
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j] + " " + j);
        }
    }

    private boolean cek(int[] all, int a, int i) {
        boolean sama = false;
        if (i != 0) {
            for (int j = 0; j < i; j++) {
                if (all[j] == a) {
                    System.out.println(all[j] + " ya " + a + " ke " + i);
                    sama = true;
                }
            }
        }
        return sama;
    }

    public static void main(String[] args) {
        Random a = new Random();
        a.random();
    }
}
