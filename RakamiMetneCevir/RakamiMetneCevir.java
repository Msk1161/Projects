package RakamiMetneCevir;

import java.util.Arrays;
import java.util.Scanner;

public class RakamiMetneCevir {
    public static void main(String[] args) {
        // Kullanıcı Tarafından Girilen 1-999 arasındaki herhangi bir sayıyı Metin şeklinde Yazan Java Programı
        // Örneğin : 735 girilince ==> " Yediyüz Otuz Beş "  yazacak
        // Örneğin : 61 girilince  ==> " Altmış Bir " yazacak
        // Örneğin : 3 girilince ==> "Üç" yazacak
        /*
        String[] bir= {" ","bir","iki","uc","dort","bes","alti","yedi","sekiz","dokuz" };
        String[] on= {" ","on","yirmi","otuz","kirk","elli","altmis","yetmis","seksen","doksan" };
        String[] yuz= {" ","yuz","ikiyuz","ucyuz","dortyuz","besyuz","altiyuz","yediyuz","sekizyuz","dokuzyuz" };
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : "); //735
        int sayi=scan.nextInt();
        int birler=sayi%10;  /5
        int onlar=(sayi/10)%10; // 3
        int yuzler=sayi/100; //7

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
*/
        /*
        int[][] arr={{1,2},{4,5},{7,9}}; veilen array'de ayni index'e sahip degerlerinin toplanmasi ile ikinci bir array olusturalim/
        yeniArr={1+4+7, 2+5+9} bu degerlerinin toplamindan olusmali
         */
        int[][] arr={{1,2},{4,5},{7,9}}; // [2][1]  :[0][0]+[1][0]+[2][0] - [0][1]+[1][1]+[2][1]
        //System.out.println(arr[2][1]);
        // 1+4+7, 2+5+9 yeni array olusturalim
        //System.out.println(arr.length); // 3
        //System.out.println(arr[0].length); //3
        int toplam1=0;
        int toplam2=0;
        int[] arr1=new int[2];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(j==0) {

                    toplam1 = toplam1 + arr[i][j];
                }else

                    toplam2=toplam2 + arr[i][j];

            }

        }

        System.out.println(toplam1);
        System.out.println(toplam2);

    }
}
