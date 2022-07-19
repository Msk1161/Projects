package Marketting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    static List<String> manavUrunler=new ArrayList<>();
    static List<Double> manavFiyatlar=new ArrayList<>();
    static List<String> sarkuteriUrunler=new ArrayList<>();
    static List<Double> sarkuteriFiyatlar=new ArrayList<>();
    static List<String> marketUrunler=new ArrayList<>();
    static List<Double> marketFiyatlar=new ArrayList<>();
    static List<String> kasapUrunler=new ArrayList<>();
    static List<Double> kasapFiyatlar=new ArrayList<>();
    //static int user=1;
    //static String sifre="admin";
    static String sepet="";
    static double genelToplam=0;
    static int menu=0;


    public static void main(String[] args) {
        admin.manavUrunEkle();
        admin.sarkuteruUrunEkle();
        admin.marketurunEkle();
        admin.kasapUrunEkle();
        Scanner scan=new Scanner(System.in);
        int user=0;
        String sifreGir="";
        for (int i = 1; i <=2 ; i++) {
            System.out.print("Kullanici tipini seciniz.\n(Alisveris icin :1'i, Yonetim icin :2'yi yaziniz ==> ");
            user = scan.nextInt();
            if (user==1){
                //System.out.println("user");
                users.user();
                i++;
            } else if (user==2){
                do{
                    System.out.println("Lutfen sifrenizi giriniz : ");
                    sifreGir=scan.next().toLowerCase();
                    if (sifreGir.equals("admin")){
                        System.out.println("Sifre Dogru");
                        admin.menuUrunEkle();
                    } else System.out.println("Sifre yanlis, tekrar deneyiniz");
                }while (!sifreGir.equals("admin"));

                i++;
            } else {
                i=0;
            }
       }


    }
    public static void bolumSec() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu SATIS");
        System.out.println("---------------");
        System.out.println("1  Manav");
        System.out.println("2  Sarkuteri");
        System.out.println("3  Market");
        System.out.println("4  Kasap");
        System.out.println("== ===========");
        System.out.print("Lutfen, SATIS icin secmek istediginiz bolumun numarasini giriniz : ");


        int menu = scan.nextInt();
        if (menu == 1) {
            users.manav(menu);
        } else if (menu == 2) {
            users.sarkuteri(menu);
        } else if (menu == 3) {
            users.market(menu);
        } else if (menu == 4) {
            users.kasap(menu);
        } else {
            System.out.println("Yanlis girdiniz ");
            bolumSec();
        }

    }






}
