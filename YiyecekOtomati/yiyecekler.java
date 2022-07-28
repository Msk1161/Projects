package YiyecekOtomati;

import static YiyecekOtomati.musteri.*;
import static YiyecekOtomati.aciklamalar.*;
import static YiyecekOtomati.aciklamalar.giris;

public class yiyecekler {
    public static void urunEkle() {
        urunlerimiz.add("Lahmacun");fiyatlar.add(3);
        urunlerimiz.add("Pizza");fiyatlar.add(5);
        urunlerimiz.add("Pide");fiyatlar.add(4);
        urunlerimiz.add("Kebap");fiyatlar.add(6);
        urunlerimiz.add("Hamburger");fiyatlar.add(3);
        urunlerimiz.add("Durum");fiyatlar.add(4);
        urunlerimiz.add("Et Doner");fiyatlar.add(6);
        urunlerimiz.add("Tavuk Doner");fiyatlar.add(3);
        urunlerimiz.add("Pilav");fiyatlar.add(1);
        urunlerimiz.add("Tas Kebap");fiyatlar.add(3);
        urunlerimiz.add("Baklava");fiyatlar.add(7);
        urunlerimiz.add("Kadayif");fiyatlar.add(5);
        urunlerimiz.add("Kunefe");fiyatlar.add(6);
        urunlerimiz.add("Gullac");fiyatlar.add(4);
        //urunlerimiz.add("Sutlac");fiyatlar.add(4);
    }
    public static void anaMenu(){
        do {
            System.out.print("<-- Lutfen Menu icin 1'i, Odeme icin 2'yi yaziniz -->");
            input = scan.next().substring(0, 1);
            switch (input) {
                case "1":
                    System.out.println("No  Urun          Fiyat       No  Urun          Fiyat" + "\n--  -----------   -----       --  -----------   -----");
                    for (int i = 0; i < urunlerimiz.size(); i+=2) {
                        System.out.printf("%-3d %-13s %-3d $  ||   %-3d %-13s %-3d $ \n", (i + 1), urunlerimiz.get(i), fiyatlar.get(i), (i + 2), urunlerimiz.get(i+1), fiyatlar.get(i+1));
                    }
                    menuSec(giris);
                    break;
                case "2":
                    odemeyeGit(giris);
                    break;
                default:
                    System.out.println("yanlis giris yaptiniz...");

            }
        } while (!input.equals("1") && !input.equals("2"));
    }
    public static void menuSec(String giris) {
        int girisSayi;
        char cikis;

        do {
            System.out.print("Almak istediginiz urunun numarasini giriniz : ");
            giris = scan.next();
            girisSayi=Integer.parseInt(giris);
            do {
                if (girisSayi >= 1 && girisSayi <= urunlerimiz.size()) {
                    sepetUrunler.add(urunlerimiz.get(girisSayi - 1));
                    sepetFiyatlar.add(fiyatlar.get(girisSayi - 1));
                    toplam1 = toplam1 + (fiyatlar.get(girisSayi - 1));
                    System.out.println("Urun sepete eklenmistir");
                    //anaMenu();
                } else {
                    System.out.println("Yanlis girdiniz. Lutfen 1 ile " + urunlerimiz.size() + " arasi bir sayi giriniz.");
                }
            } while (girisSayi<1 || girisSayi>urunlerimiz.size());
            System.out.println("Odeme icin 'Q'ya, Yeni Urun eklemek icin 'N'yi giriniz.");
            cikis= scan.next().toLowerCase().charAt(0);
            }while (cikis!='q');
        odemeyeGit(giris);
    }
    public static void odemeyeGit(String giris) {
        System.out.print("Odeme icin miktar giriniz : ");
        int toplamTahsilat=0;
        tahsilat= scan.nextInt();
        toplamTahsilat=toplamTahsilat+tahsilat;
        if(toplamTahsilat<toplam1){
            System.out.print("Yetersiz bakiye. En az "+(toplam1-toplamTahsilat) + " $ daha odeme yapmalisiniz : ");
            tahsilat= scan.nextInt();
            toplamTahsilat=toplamTahsilat+tahsilat;
            if(toplamTahsilat<toplam1){
                System.out.print("Yetersiz bakiye. En az "+(toplam1-toplamTahsilat) + " $ daha odeme yapmalisiniz : ");
                tahsilat= scan.nextInt();
                toplamTahsilat=toplamTahsilat+tahsilat;
            }
        }
        System.out.println("No  Urun          Fiyat" + "\n--  -----------   ----- ");
                for (int i = 0; i < sepetUrunler.size(); i++){
                    System.out.printf("%-3d %-13s %-3d $\n", (i + 1), sepetUrunler.get(i), sepetFiyatlar.get(i));
                }
                System.out.println("Toplam tutar......"+toplam1+"  $");
                System.out.println("Odenen : " + toplamTahsilat+ " $. Para ussu : "+(toplamTahsilat- toplam1)+" $");
                System.out.println("Iyi Gunler. Bizi tercih ettiginiz icin TESEKKURLER");
    }
}
