package YiyecekOtomatiGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class yiyecekler {
    static List<String> urunlerimiz= new ArrayList<>();
    static List<Integer> fiyatlar= new ArrayList<>();
    static List<Integer> urunNo= new ArrayList<>();

    static List<Integer> sepetList= new ArrayList<>();
    static String input="";
    static String giris;
    static int toplam;
    static Scanner scan = new Scanner(System.in);

    public static void urunSec(String input) {
        char cikis;
        int girisSayisi;
        do{
            System.out.print("Almak istediginiz urunun numarasini giriniz : ");
            giris = scan.next();
            girisSayisi=Integer.parseInt(giris);

            do{
                if (girisSayisi>=1 && girisSayisi<=urunlerimiz.size()){
                    sepetList.add((girisSayisi));
                    toplam= toplam + (fiyatlar.get(girisSayisi-1));
                    System.out.println("Bir adet " + urunlerimiz.get(girisSayisi-1) + " sepete eklenmistir");
                }else{
                    System.out.print("Yanlis girdiniz . lutfen 1 ile "+ urunlerimiz.size() + " arasi bir sayi giriniz : ");
                }
            }while (girisSayisi<1 || girisSayisi>urunlerimiz.size());

            System.out.print("Odeme icin Q'ya, yeni urun icin Y' yaziniz : ");
            cikis=scan.next().toLowerCase().charAt(0);

        }while(cikis!='q');
        odemeyeGit(giris);
    }
    private static void odemeyeGit(String giris) {
        int toplamTahsilat = 0;
        int tahsilat = 0;
        System.out.print("Odeme icin miktar giriniz : ");
        tahsilat = scan.nextInt();

        do {
            toplamTahsilat = toplamTahsilat + tahsilat;

            if (toplamTahsilat < toplam) {
                System.out.print("Yetersiz bakiye En az " + (toplam - toplamTahsilat) + " $ daha odemeniz gerekir : ");
                tahsilat= scan.nextInt();
            }
        } while (toplamTahsilat<toplam);
        System.out.println("No  Urun          Fiyat" + "\n--  -----------   ----- ");
        for (int i = 0; i < sepetList.size(); i++) {
            System.out.printf("%-3d %-13s %-3d $\n", sepetList.get(i), urunlerimiz.get(sepetList.get(i)-1), fiyatlar.get(sepetList.get(i)-1));
        }
        System.out.println("Toplam Tutar .... " +toplam+"  $");
        System.out.println("Odenen....... : " + toplamTahsilat + " $. Para ussu : " + (toplamTahsilat-toplam)+" $");
        System.out.println("Iyi gunler. Tesekkurler");

    }
    public static void urunEkle() {
        urunlerimiz.add("Lahmacun");    fiyatlar.add(3);    urunNo.add(1);
        urunlerimiz.add("Pizza");       fiyatlar.add(5);    urunNo.add(2);
        urunlerimiz.add("Pide");        fiyatlar.add(4);    urunNo.add(3);
        urunlerimiz.add("Kebap");       fiyatlar.add(6);    urunNo.add(4);
        urunlerimiz.add("Hamburger");   fiyatlar.add(3);    urunNo.add(5);
        urunlerimiz.add("Durum");       fiyatlar.add(4);    urunNo.add(6);
        urunlerimiz.add("Et Doner");    fiyatlar.add(6);    urunNo.add(7);
        urunlerimiz.add("Tavuk Doner"); fiyatlar.add(3);    urunNo.add(8);
        urunlerimiz.add("Pilav");       fiyatlar.add(1);    urunNo.add(9);
        urunlerimiz.add("Tas Kebap");   fiyatlar.add(3);    urunNo.add(10);
        urunlerimiz.add("Baklava");     fiyatlar.add(7);    urunNo.add(11);
        urunlerimiz.add("Kadayif");     fiyatlar.add(5);    urunNo.add(12);
        urunlerimiz.add("Kunefe");      fiyatlar.add(6);    urunNo.add(13);
        urunlerimiz.add("Gullac");      fiyatlar.add(4);    urunNo.add(14);
    }
}
