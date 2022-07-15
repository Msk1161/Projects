package mainManu;

public class admin {
    public static void main(String[] args) {
    menu.bolumSec();
    adm();
    manavUrunEkle();
    sarkuteruUrunEkle();
    marketurunEkle();
    kasapUrunEkle();

    }

    private static void adm() {
        menu.bolumSec();
    }
    public static void manavUrunEkle() {
        menu.manavUrunler.add("Domates");menu.manavFiyatlar.add(2.10);
        menu.manavUrunler.add("Patates");menu.manavFiyatlar.add(3.20);
        menu.manavUrunler.add("Biber  ");menu.manavFiyatlar.add(1.50);
        menu.manavUrunler.add("Sogan  ");menu.manavFiyatlar.add(2.30);
        menu.manavUrunler.add("Havuc  ");menu.manavFiyatlar.add(3.10);
        menu.manavUrunler.add("Elma   ");menu.manavFiyatlar.add(1.20);
        menu.manavUrunler.add("Muz    ");menu.manavFiyatlar.add(1.90);
        menu.manavUrunler.add("Cilek  ");menu.manavFiyatlar.add(6.10);
        menu.manavUrunler.add("Kavun  ");menu.manavFiyatlar.add(4.30);
        //menu.manavUrunler.add("Uzum   ");menu.manavFiyatlar.add(2.70);
        //menu.manavUrunler.add("Limon  ");menu.manavFiyatlar.add(0.50);

    }

    public static void sarkuteruUrunEkle() {
        menu.sarkuteriUrunler.add("Peynir ");menu.sarkuteriFiyatlar.add(15.00);
        menu.sarkuteriUrunler.add("Yag    ");menu.sarkuteriFiyatlar.add(10.00);
        menu.sarkuteriUrunler.add("Zeytin ");menu.sarkuteriFiyatlar.add(11.00);
        menu.sarkuteriUrunler.add("Pekmez ");menu.sarkuteriFiyatlar.add(12.00);
        menu.sarkuteriUrunler.add("Sucuk  ");menu.sarkuteriFiyatlar.add(13.00);
    }
    public static void marketurunEkle() {
        menu.marketUrunler.add("Cay    ");menu.marketFiyatlar.add(7.00);
        menu.marketUrunler.add("Pirinc ");menu.marketFiyatlar.add(2.00);
        menu.marketUrunler.add("Bulgur ");menu.marketFiyatlar.add(1.80);
        menu.marketUrunler.add("Su     ");menu.marketFiyatlar.add(0.25);
        menu.marketUrunler.add("Ekmek  ");menu.marketFiyatlar.add(0.50);
    }
    public static void kasapUrunEkle() {
        menu.kasapUrunler.add("Kuzu Et");menu.kasapFiyatlar.add(7.50);
        menu.kasapUrunler.add("Dana Et");menu.kasapFiyatlar.add(6.50);
        menu.kasapUrunler.add("Kiyma  ");menu.kasapFiyatlar.add(5.00);
        menu.kasapUrunler.add("Tavuk  ");menu.kasapFiyatlar.add(4.50);
        menu.kasapUrunler.add("Ciger  ");menu.kasapFiyatlar.add(6.00);
    }
}
