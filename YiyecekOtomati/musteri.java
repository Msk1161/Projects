package YiyecekOtomati;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static YiyecekOtomati.yiyecekler.*;
public class musteri {
    static List<String> urunlerimiz = new ArrayList<>();
    static List<Integer> fiyatlar = new ArrayList<>();
    static String input = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        urunEkle();
        System.out.println("=== HOS GELDINIZ ===");
        anaMenu();
    }
}
