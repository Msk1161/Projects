package RakamiMetneCevir;

import java.util.Arrays;

public class Rakamlar {
    public static void main(String[] args) {
        /*
        int[][] arr={{1,2},{4,5},{7,9}}; veilen array'de ayni index'e sahip degerlerinin toplanmasi ile ikinci bir array olusturalim/
        yeniArr={1+4+7, 2+5+9} bu degerlerinin toplamindan olusmali
         */
        int[][] arr={{1,2},{4,5,3},{7,9}}; // [2][1]  :[0][0]+[1][0]+[2][0] - [0][1]+[1][1]+[2][1]
        //System.out.println(arr[2][1]);
        // 1+4+7, 2+5+9 yeni array olusturalim
        //System.out.println(arr.length); // 3
        //System.out.println(arr[0].length); //3
        int yeniArrUzunluk=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length>yeniArrUzunluk);
            yeniArrUzunluk=arr[i].length;

        }
        int[] newArr=new int[yeniArrUzunluk+1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j] = newArr[j] + arr[i][j];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    }


