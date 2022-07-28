package YiyecekOtomatiGroup;

import static YiyecekOtomatiGroup.yiyecekler.*;

public class musteri {
    public static void main(String[] args) {
        urunEkle();
        System.out.println("=================== Hosgeldiniz ===================");

        System.out.println("No  Urun          Fiyat       No  Urun          Fiyat" + "\n--  -----------   -----       --  -----------   -----");
        for (int i = 0; i < urunlerimiz.size(); i+=2) {
            System.out.printf("%-3d %-13s  %-3d $  |   %-3d %-13s %-3d $ \n", urunNo.get(i), urunlerimiz.get(i), fiyatlar.get(i), urunNo.get(i+1), urunlerimiz.get(i+1), fiyatlar.get(i+1));
        }
        urunSec(giris);

    }
}
