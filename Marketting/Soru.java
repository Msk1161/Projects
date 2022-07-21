package Marketting;

import static Marketting.menu.sarkuteriFiyatlar;
import static Marketting.menu.sarkuteriUrunler;

public class Soru {
    /*
====================PROJEMIZ===================================
  * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
     1 manav,
     2 sarkuteri,
     3 market
     secime gor ,
     4-urunleri listele ve
     5-fiyatlari gelsin
  *
  * Basrili Market alış-veriş programı.
     1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

     No   Ürün    Fiyat
     ===== ======= ========
     00 Domates 2.10 TL
     01 Patates 3.20 TL
     02 Biber   1.50 TL
     03 Soğan   2.30 TL
     04 Havuç   3.10 TL
     05 Elma    1.20 TL
     06 Muz     1.90 TL
     07 Çilek   6.10 TL
     08 Kavun   4.30 TL
     09 Üzüm    2.70 TL
     10 Limon   0.50 TL

  * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
  * 3. Adım: Kaç kg satın almak istediğini sorunuz.
    4. Adım: Alınacak bu ürünü
  * sepete ekleyiniz ve Sepeti yazdırınız.
    5. Başka bir ürün alıp almak
  * istemediğini sorunuz.
    6. Eğer devam etmek istiyorsa yeniden ürün seçme
  * kısmına yönlendiriniz.
    7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
  * ödeme sonrasında programı bitiriniz
  */
    public static void main(String[] args) {
        for (int i = 0; i < sarkuteriUrunler.size(); i++) {
            //System.out.print((i + 1) + " " + sarkuteriUrunler.get(i) + " " + sarkuteriFiyatlar.get(i) + " TL");
            System.out.printf(" %-4d  %-10s  %.3f\n", i, sarkuteriUrunler.get(i), sarkuteriFiyatlar.get(i));
            // printf ("  0%-3.of  %-10s  % 4)
            System.out.println("");

            //% -10.10 S veya s
            //  1. 10 karakter yer verir - isaretiyle sola veya saga yaslar
            //  2. 10 karakter uzunlugu
            //  3. S/s stringin buyuk kucuk olmasini saglar
        }
    }
}