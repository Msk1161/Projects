package Marketting;

import java.util.Scanner;

import static Marketting.menu.*;

public class admin {
    public static void main(String[] args) {
    manavUrunEkle();
    sarkuteruUrunEkle();
    marketurunEkle();
    kasapUrunEkle();

    }

    public static void menuUrunEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu URUN EKLE");
        System.out.println("---------------");
        System.out.println("1  Manav");
        System.out.println("2  Sarkuteri");
        System.out.println("3  Market");
        System.out.println("4  Kasap");
        System.out.println("== ===========");
        System.out.print("Lutfen, urun EKLEMEK istediginiz bolumun numarasini giriniz : ");


        int menu = scan.nextInt();
        if (menu == 1) {
            manavYeniUrunEkle(menu);
        } else if (menu == 2) {
            sarkuteriYeniUrunEkle(menu);
        } else if (menu == 3) {
            marketYeniUrunEkle(menu);
        } else if (menu == 4) {
            kasapYeniUrunEkle(menu);
        } else {
            System.out.println("Yanlis girdiniz ");
            menuUrunEkle();
        }
    }

    private static void manavYeniUrunEkle(int menu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<-- Manav Urulerinin Listesi -->");
        System.out.println("No Urun    Fiyat" + "\n-- ------- -----");
        for (int i = 0; i < manavUrunler.size(); i++) {
            System.out.print((i + 1) + " " + manavUrunler.get(i) + " " + manavFiyatlar.get(i) + " TL");
            System.out.println("");
        }
        String cikis="";
        String yeniUrunAdi="";
        double yeniUrunFiyati=0;
            System.out.print("Yukardaki listeye eklemek istediginiz yeni urunun adini giriniz : ");
            yeniUrunAdi = scan.nextLine();
            for (int j = yeniUrunAdi.length(); j <8 ; j++) {
                yeniUrunAdi= yeniUrunAdi +" ";
            }
            manavUrunler.add(yeniUrunAdi);

        System.out.print("Eklediginiz "+ yeniUrunAdi + " satis fiyatini giriniz : ");
        yeniUrunFiyati = scan.nextDouble();
        manavFiyatlar.add(yeniUrunFiyati);

        System.out.println("Urun eklemeye devam etmek istiyorsaniz E, satisa donmek icin H, bitirmek icin X yaziniz:");
        cikis=scan.next().toUpperCase();
        if (cikis.equals("E")){
            menuUrunEkle();
        } else if (cikis.equals("H")){
            bolumSec();
        }

    }

    private static void sarkuteriYeniUrunEkle(int menu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<-- Sarkuteri Urulerinin Listesi -->");
        System.out.println("No Urun    Fiyat" + "\n-- ------- -----");
        for (int i = 0; i < sarkuteriUrunler.size(); i++) {
            System.out.print((i + 1) + " " + sarkuteriUrunler.get(i) + " " + sarkuteriFiyatlar.get(i) + " TL");
            System.out.println("");
        }
        String cikis="";
        String yeniUrunAdi="";
        double yeniUrunFiyati=0;
        System.out.print("Yukardaki listeye eklemek istediginiz yeni urunun adini giriniz : ");
        yeniUrunAdi = scan.nextLine();
        for (int j = yeniUrunAdi.length(); j <8 ; j++) {
            yeniUrunAdi= yeniUrunAdi +" ";
        }
        sarkuteriUrunler.add(yeniUrunAdi);

        System.out.print("Eklediginiz "+ yeniUrunAdi + " satis fiyatini giriniz : ");
        yeniUrunFiyati = scan.nextDouble();
        sarkuteriFiyatlar.add(yeniUrunFiyati);

        System.out.println("Urun eklemeye devam etmek istiyorsaniz E, satisa donmek icin H, bitirmek icin X yaziniz:");
        cikis=scan.next().toUpperCase();
        if (cikis.equals("E")){
            menuUrunEkle();
        } else if (cikis.equals("H")){
            bolumSec();
        }
    }

    private static void marketYeniUrunEkle(int menu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<-- Market Urulerinin Listesi -->");
        System.out.println("No Urun    Fiyat" + "\n-- ------- -----");
        for (int i = 0; i < marketUrunler.size(); i++) {
            System.out.print((i + 1) + " " + marketUrunler.get(i) + " " + marketFiyatlar.get(i) + " TL");
            System.out.println("");
        }
        String cikis="";
        String yeniUrunAdi="";
        double yeniUrunFiyati=0;
        System.out.print("Yukardaki listeye eklemek istediginiz yeni urunun adini giriniz : ");
        yeniUrunAdi = scan.nextLine();
        for (int j = yeniUrunAdi.length(); j <8 ; j++) {
            yeniUrunAdi= yeniUrunAdi +" ";
        }
        marketUrunler.add(yeniUrunAdi);

        System.out.print("Eklediginiz "+ yeniUrunAdi + " satis fiyatini giriniz : ");
        yeniUrunFiyati = scan.nextDouble();
        marketFiyatlar.add(yeniUrunFiyati);

        System.out.println("Urun eklemeye devam etmek istiyorsaniz E, satisa donmek icin H, bitirmek icin X yaziniz:");
        cikis=scan.next().toUpperCase();
        if (cikis.equals("E")){
            menuUrunEkle();
        } else if (cikis.equals("H")){
            bolumSec();
        }
    }

    private static void kasapYeniUrunEkle(int menu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<-- Kasap Urulerinin Listesi -->");
        System.out.println("No Urun    Fiyat" + "\n-- ------- -----");
        for (int i = 0; i < kasapUrunler.size(); i++) {
            System.out.print((i + 1) + " " + kasapUrunler.get(i) + " " + kasapFiyatlar.get(i) + " TL");
            System.out.println("");
        }
        String cikis="";
        String yeniUrunAdi="";
        double yeniUrunFiyati=0;
        System.out.print("Yukardaki listeye eklemek istediginiz yeni urunun adini giriniz : ");
        yeniUrunAdi = scan.nextLine();
        for (int j = yeniUrunAdi.length(); j <8 ; j++) {
            yeniUrunAdi= yeniUrunAdi +" ";
        }
        kasapUrunler.add(yeniUrunAdi);

        System.out.print("Eklediginiz "+ yeniUrunAdi + " satis fiyatini giriniz : ");
        yeniUrunFiyati = scan.nextDouble();
        kasapFiyatlar.add(yeniUrunFiyati);

        System.out.println("Urun eklemeye devam etmek istiyorsaniz E, satisa donmek icin H, bitirmek icin X yaziniz:");
        cikis=scan.next().toUpperCase();
        if (cikis.equals("E")){
            menuUrunEkle();
        } else if (cikis.equals("H")){
            bolumSec();
        }
    }


    public static void manavUrunEkle() {
        manavUrunler.add("Domates"); manavFiyatlar.add(2.10);
        manavUrunler.add("Patates"); manavFiyatlar.add(3.20);
        manavUrunler.add("Biber  "); manavFiyatlar.add(1.50);
        manavUrunler.add("Sogan  "); manavFiyatlar.add(2.30);
        manavUrunler.add("Havuc  "); manavFiyatlar.add(3.10);
        manavUrunler.add("Elma   "); manavFiyatlar.add(1.20);
        manavUrunler.add("Muz    "); manavFiyatlar.add(1.90);
        manavUrunler.add("Cilek  "); manavFiyatlar.add(6.10);
        manavUrunler.add("Kavun  "); manavFiyatlar.add(4.30);
        //manavUrunler.add("Uzum   "); manavFiyatlar.add(2.70);
        //manavUrunler.add("Limon  "); manavFiyatlar.add(0.50);

    }

    public static void sarkuteruUrunEkle() {
        sarkuteriUrunler.add("Peynir "); sarkuteriFiyatlar.add(15.00);
        sarkuteriUrunler.add("Yag    "); sarkuteriFiyatlar.add(10.00);
        sarkuteriUrunler.add("Zeytin "); sarkuteriFiyatlar.add(11.00);
        sarkuteriUrunler.add("Pekmez "); sarkuteriFiyatlar.add(12.00);
        sarkuteriUrunler.add("Sucuk  "); sarkuteriFiyatlar.add(13.00);
    }
    public static void marketurunEkle() {
        marketUrunler.add("Cay    "); marketFiyatlar.add(7.00);
        marketUrunler.add("Pirinc "); marketFiyatlar.add(2.00);
        marketUrunler.add("Bulgur "); marketFiyatlar.add(1.80);
        marketUrunler.add("Su     "); marketFiyatlar.add(0.25);
        marketUrunler.add("Ekmek  "); marketFiyatlar.add(0.50);
    }
    public static void kasapUrunEkle() {
        kasapUrunler.add("Kuzu Et"); kasapFiyatlar.add(7.50);
        kasapUrunler.add("Dana Et"); kasapFiyatlar.add(6.50);
        kasapUrunler.add("Kiyma  "); kasapFiyatlar.add(5.00);
        kasapUrunler.add("Tavuk  "); kasapFiyatlar.add(4.50);
        kasapUrunler.add("Ciger  "); kasapFiyatlar.add(6.00);
    }
}
