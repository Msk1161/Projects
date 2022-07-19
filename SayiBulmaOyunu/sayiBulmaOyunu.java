package SayiBulmaOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class sayiBulmaOyunu {
    static int [] sayiArr =new int[4];

    public static void main(String[] args) {
        System.out.println("==== SAYI BULMA OYUNU ====\n" +
                "Bilgisayar hafizasinda random olarak dort basamakli \n" +
                "(1000 ile 9999 arasi) bir sayi tutacaktir.\n" +
                "Kullanici her seferinde 4 basamakli sayi girerek bu sayiyi bulmaya calisacaktir.\n" +
                "Girilen her sayi sonunda bilgisayar + (yeri dogru olan sayi adedini )\n" +
                "ve - (yeri yanlis olan sayi adedini ) ile donus yapacaktir. ");
        System.out.println("========= BASLIYOR ==========");
        sayiUret();

        Scanner scan = new Scanner(System.in);
        int[] girilenArr=new int[4];
        int arti=0;
        int eksi=0;
        int kacKeredeBuldun=0;
        int birler=0, onlar=0, yuzler=0,binler=0;
        int varmi=0;
        int test=0;

        do{
            arti=0;eksi=0;test=0;varmi=0;
            System.out.println("Lutfen 4 basamakli rakamlari birbirinden farkli bir sayi giriniz ");
            int girilenSayi= scan.nextInt();
            birler=girilenSayi%10; girilenArr[3]=birler;
            onlar=(girilenSayi/10)%10; girilenArr[2]=onlar;
            yuzler=(girilenSayi/100)%10; girilenArr[1]=yuzler;
            binler=girilenSayi/1000; girilenArr[0]=binler;
            for (int i = 0; i <girilenArr.length ; i++) {
                for (int j = 0; j <girilenArr.length ; j++) {
                    if (girilenArr[i]==girilenArr[j]){
                        test++;
                    }
                }
            }
            if (girilenSayi<1000 || girilenSayi>9999){
                System.out.println("Girilen "+girilenSayi+" sayisi dort basamakli degildir.");
            }else if (test>4){
                System.out.println("Girilen "+girilenSayi+" sayisi icinde ayni rakam vardir.");
            } else{
                for (int i = 0; i <girilenArr.length ; i++) {
                    for (int j = 0; j <sayiArr.length ; j++) {
                        if(girilenArr[i]==sayiArr[j]){
                            varmi++;
                        }
                    }
                }
                for (int i = 0; i <girilenArr.length ; i++) {
                     if(girilenArr[i]==sayiArr[i]){
                            arti++;
                    }
               }
                eksi=varmi-arti;
                kacKeredeBuldun++;
                if (arti==4){
                    System.out.println("Sayiniz : " + Arrays.toString(girilenArr));
                    System.out.println("+ "+arti +" Tebrikler. " + kacKeredeBuldun + ". denemede buldunuz.");
                    System.out.println("Tutulan Sayi : " + Arrays.toString(sayiArr));
                } else{
                    System.out.println("Sayiniz : " + Arrays.toString(girilenArr));
                    System.out.println("+ " + arti + ", - "+eksi);
                }
            }
        }while(arti<4);
    }
    private static void sayiUret() {
        Random rnd=new Random();
        int low=1000;
        int high=9999;
        int test=0;
        do {
            int sayi = rnd.nextInt(high - low) + low;
            //System.out.println("sayi" + sayi);
           int birler = sayi % 10;
            sayiArr[3] = birler;
            int onlar = (sayi / 10) % 10;
            sayiArr[2] = onlar;
            int yuzler = (sayi / 100) % 10;
            sayiArr[1] = yuzler;
            int binler = sayi / 1000;
            sayiArr[0] = binler;
            //System.out.println("Array " + Arrays.toString(sayiArr));
            for (int i = 0; i <sayiArr.length ; i++) {
                for (int j = 0; j <sayiArr.length ; j++) {
                    if (sayiArr[i]==sayiArr[j]){
                        test++;
                }
                 }
             }
            //System.out.println("test = " + test);
            if (test==4){
                break;

            } else {
                test=0;
            }
        }while (test<4);
   }

}
