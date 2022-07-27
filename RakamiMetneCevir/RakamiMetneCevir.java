package RakamiMetneCevir;

import java.util.Arrays;
import java.util.Scanner;

public class RakamiMetneCevir {
    public static void main(String[] args) {
        // Kullanıcı Tarafından Girilen 1-999 arasındaki herhangi bir sayıyı Metin şeklinde Yazan Java Programı
        // Örneğin : 735 girilince ==> " Yediyüz Otuz Beş "  yazacak
        // Örneğin : 61 girilince  ==> " Altmış Bir " yazacak
        // Örneğin : 3 girilince ==> "Üç" yazacak

        String[] bir= {"","bir","iki","uc","dort","bes","alti","yedi","sekiz","dokuz" };
        String[] on= {"","on","yirmi","otuz","kirk","elli","altmis","yetmis","seksen","doksan" };
        String[] yuz= {"","yuz","ikiyuz","ucyuz","dortyuz","besyuz","altiyuz","yediyuz","sekizyuz","dokuzyuz" };

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : "); //735298
        int sayi=scan.nextInt();
        int birler=sayi%10;  //5
        int onlar=(sayi/10)%10; // 3
        int yuzler=(sayi/100)%10; //7
        int binler=(sayi/1000)%10; //2
        int onbinler=(sayi/10000)%10; //9
        int yuzbinler=sayi/100000; //8

        for (int i = 0; i <yuz.length ; i++) {
            if (yuzbinler==i){
                System.out.print(yuz[i]+" ");
            }
        }for (int i = 0; i <on.length ; i++) {
            if (onbinler==i){
                System.out.print(on[i]+"");
            }
        }
        if(sayi>=1000) {
            for (int i = 0; i < bir.length; i++) {
                if (binler == i) {
                    System.out.print(bir[i] + "bin ");
                }
            }
        }
        for (int i = 0; i <yuz.length ; i++) {
            if (yuzler==i){
                System.out.print(yuz[i]+" ");
            }
        }
        for (int i = 0; i <on.length ; i++) {
            if (onlar==i){
                System.out.print(on[i]+" ");
            }
        }
        for (int i = 0; i <bir.length ; i++) {
            if (birler==i){
                System.out.print(bir[i]);
            }
        }


    }
}
