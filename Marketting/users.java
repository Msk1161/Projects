package Marketting;

import java.util.Scanner;

import static Marketting.menu.*;

public class users {
    //static int urunNo=0;
    public static void main(String[] args) {
        bolumSec();
        user();
    }

    public static void user() {
        bolumSec();
    }

    public static void manav(String menu) {
        Scanner scan = new Scanner(System.in);
        String evethayir = "";
        int urunNo = 0;
        double toplam = 0;
        double istenenKg;

        String sele = "";
        System.out.println("<-- Manav Urulerinin Listesi -->");
        System.out.println("No  Urun     Fiyat" + "\n-- ------- -----");
        for (int i = 0; i < manavUrunler.size(); i++) {
            System.out.printf("%-3d %-8s %-5.2f TL\n",(i + 1),manavUrunler.get(i), manavFiyatlar.get(i));

        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("Almak istediginiz urunun, urun No'sunu giriniz : ");
            urunNo = scan.nextInt();
            urunNo--;
            if (urunNo>=0 && urunNo<=manavUrunler.size()) {
                //System.out.println("urun No :" +urunNo+manavUrunler.size());
                i++;
                 } else {
                    System.out.println("Yanlis girdiniz ");
                    i--;
                }
            }

        String urunAdi = manavUrunler.get(urunNo);
        double kgFiyati = manavFiyatlar.get(urunNo);
        System.out.print("Kac kilo " + urunAdi + " almak istediginizi giriniz : ");
        istenenKg = scan.nextDouble();
        toplam = toplam + (kgFiyati * istenenKg);
        sele = sele + istenenKg + " Kg " + urunAdi + " :" + toplam + " TL";
        System.out.printf("%-5.2f %-8s %-5.2f TL\n",istenenKg, urunAdi, toplam);
        //System.out.println("");

        genelToplam= genelToplam +toplam;
        sepet = sepet + "\n" + sele;

        System.out.print("baska urun almak istiyormusunuz ? E veya H harfini kullaniniz : ");
        evethayir = scan.next().toUpperCase();

        if (evethayir.equals("E")) {
            bolumSec();
        } else {
            System.out.print(" Alinan urunler : " + "\n" + "________________" + sepet + " TL");
            System.out.println("");
            System.out.printf("Toplam tutar : %-5.2f TL\n", genelToplam );

        }
        }
    public static void sarkuteri(String menu) {
        Scanner scan = new Scanner(System.in);
        String evethayir = "";
        int urunNo = 0;
        double toplam = 0;
        double istenenKg;

        String sele = "";
        System.out.println("<-- Sarkuteri Urulerinin Listesi -->");
        System.out.println("No  Urun     Fiyat" + "\n-- ------- -----");
        for (int i = 0; i <sarkuteriUrunler.size() ; i++) {
            System.out.printf("%-3d %-8s %-5.2f TL\n",(i+1), sarkuteriUrunler.get(i),sarkuteriFiyatlar.get(i));

        }

        for (int i = 1; i <= 2; i++) {
            System.out.print("Almak istediginiz urunun, urun No'sunu giriniz : ");
            urunNo = scan.nextInt();
            urunNo--;
            if (urunNo>=0 && urunNo<=sarkuteriUrunler.size()) {
                //System.out.println("urun No :" +urunNo+manavUrunler.size());
                i++;
            } else {
                System.out.println("Yanlis girdiniz ");
                i--;
            }
        }

        String urunAdi = sarkuteriUrunler.get(urunNo);
        double kgFiyati = sarkuteriFiyatlar.get(urunNo);
        System.out.print("Kac kilo " + urunAdi + " almak istediginizi giriniz : ");
        istenenKg = scan.nextDouble();
        toplam = toplam + (kgFiyati * istenenKg);
        sele = sele + istenenKg + " Kg " + urunAdi + " :" + toplam + " TL";
        System.out.printf("%-5.2f %-8s %-5.2f TL\n",istenenKg, urunAdi, toplam);

        genelToplam= genelToplam +toplam;
        sepet = sepet + "\n" + sele;

        System.out.print("baska urun almak istiyormusunuz ? E veya H harfini kullaniniz : ");
        evethayir = scan.next().toUpperCase();

        if (evethayir.equals("E")) {
            bolumSec();
        } else {
            System.out.print(" Alinan urunler : " + "\n" + "________________" + sepet + " TL");
            System.out.println("");
            System.out.printf("Toplam tutar : %-5.2f TL\n", genelToplam );

        }

    }
    public static void market(String menu) {
        Scanner scan = new Scanner(System.in);
        String evethayir = "";
        int urunNo = 0;
        double toplam = 0;
        double istenenKg;

        String sele = "";
        System.out.println("<-- Market Urulerinin Listesi -->");
        System.out.println("No  Urun     Fiyat" + "\n-- ------- -----");
        for (int i = 0; i <marketUrunler.size() ; i++) {
            System.out.printf("%-3d %-8s %-5.2f TL\n",(i+1), marketUrunler.get(i),marketFiyatlar.get(i));

        }

        for (int i = 1; i <= 2; i++) {
            System.out.print("Almak istediginiz urunun, urun No'sunu giriniz : ");
            urunNo = scan.nextInt();
            urunNo--;
            if (urunNo>=0 && urunNo<=marketUrunler.size()) {
                //System.out.println("urun No :" +urunNo+manavUrunler.size());
                i++;
            } else {
                System.out.println("Yanlis girdiniz ");
                i--;
            }
        }

        String urunAdi = marketUrunler.get(urunNo);
        double kgFiyati = marketFiyatlar.get(urunNo);
        System.out.print("Kac kilo " + urunAdi + " almak istediginizi giriniz : ");
        istenenKg = scan.nextDouble();
        toplam = toplam + (kgFiyati * istenenKg);
        sele = sele + istenenKg + " Kg " + urunAdi + " :" + toplam + " TL";
        System.out.printf("%-5.2f %-8s %-5.2f TL\n",istenenKg, urunAdi, toplam);

        genelToplam= genelToplam +toplam;
        sepet = sepet + "\n" + sele;

        System.out.print("baska urun almak istiyormusunuz ? E veya H harfini kullaniniz : ");
        evethayir = scan.next().toUpperCase();

        if (evethayir.equals("E")) {
            bolumSec();
        } else {
            System.out.print(" Alinan urunler : " + "\n" + "________________" + sepet + " TL");
            System.out.println("");
            System.out.printf("Toplam tutar : %-5.2f TL\n", genelToplam );

        }

    }
    public static void kasap(String menu) {
        Scanner scan = new Scanner(System.in);
        String evethayir = "";
        int urunNo = 0;
        double toplam = 0;
        double istenenKg;

        String sele = "";
        System.out.println("<-- Kasap Urulerinin Listesi -->");
        System.out.println("No Urun    Fiyat" + "\n-- ------- -----");
        for (int i = 0; i <kasapUrunler.size() ; i++) {
            System.out.printf("%-3d %-8s %-5.2f TL\n",(i+1), kasapUrunler.get(i),kasapFiyatlar.get(i));

        }

        for (int i = 1; i <= 2; i++) {
            System.out.print("Almak istediginiz urunun, urun No'sunu giriniz : ");
            urunNo = scan.nextInt();
            urunNo--;
            if (urunNo>=0 && urunNo<=kasapUrunler.size()) {
                //System.out.println("urun No :" +urunNo+manavUrunler.size());
                i++;
            } else {
                System.out.println("Yanlis girdiniz ");
                i--;
            }
        }

        String urunAdi = kasapUrunler.get(urunNo);
        double kgFiyati = kasapFiyatlar.get(urunNo);
        System.out.print("Kac kilo " + urunAdi + " almak istediginizi giriniz : ");
        istenenKg = scan.nextDouble();
        toplam = toplam + (kgFiyati * istenenKg);
        sele = sele + istenenKg + " Kg " + urunAdi + " :" + toplam + " TL";
        System.out.printf("%-5.2f %-8s %-5.2f TL\n",istenenKg, urunAdi, toplam);

        genelToplam= genelToplam +toplam;
        sepet = sepet + "\n" + sele;

        System.out.print("baska urun almak istiyormusunuz ? E veya H harfini kullaniniz : ");
        evethayir = scan.next().toUpperCase();

        if (evethayir.equals("E")) {
            bolumSec();
        } else {
            System.out.print(" Alinan urunler : " + "\n" + "________________" + sepet + " TL");
            System.out.println("");
            System.out.printf("Toplam tutar : %-5.2f TL\n", genelToplam );

        }

    }
     }
