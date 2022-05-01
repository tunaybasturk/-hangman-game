package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] kelimeler = {"bilgisayar", "programlama", "yazilim","masa","gomlek","kalem","tablo","saksi","papatya"};


        char EvetHayır='E';
        int sayac=0;
        int a=0;
        String kopya="";
        while (EvetHayır=='E'){

            if(sayac==0) {
                a = (0 + (int) (Math.random() * kelimeler.length));
                sayac++;
                kopya=kelimeler[a];

                for(int i=0;i<kelimeler[a].length();i++){
                    kopya=kopya.replace(kopya.charAt(i), '*');
                }

            }

            String [] harf_dizisi=new String[kelimeler[a].length()];
            for(int i =0;i<kelimeler[a].length();i++){
                harf_dizisi[i]= String.valueOf(kelimeler[a].charAt(i));
            }





            int harf_index;
            char girdii = 0;

            if(kopya.contains("*")) {
                System.out.println("Kelimeden bir harf girin  "+kopya+ " > ");
                Scanner girdi = new Scanner(System.in);
                girdii= girdi.next().charAt(0);
            }
            if(kopya.contains(String.valueOf(girdii))){
                System.out.println(girdii+" karakteri kelimede mevcuttur.");
            }

            if(kelimeler[a].contains(String.valueOf(girdii)) && kopya.contains("*")){
                for(int i=0;i< harf_dizisi.length;i++){
                    if(harf_dizisi[i].contains(String.valueOf(girdii))){
                        harf_index = i;

                        char[] tutucuchararray = kopya.toCharArray();
                        tutucuchararray[harf_index] = girdii;
                        kopya = String.valueOf(tutucuchararray);
                    }
                }


            }
            else if(!kelimeler[a].contains(String.valueOf(girdii)) && kopya.contains("*")){
                System.out.println(girdii+ " harfi kelimede yoktur");
            }
            else if(!kopya.contains("*")){
                System.out.println("Kelime: "+ kopya );
                sayac=0;
                System.out.println("Yeni bir kelime için tahmin yapmak istiyor musunuz? E veya H>");
                Scanner çıktı = new Scanner(System.in);
                char cikis;
                cikis=çıktı.next().charAt(0);
                if(cikis=='H'){
                    EvetHayır='H';
                    System.out.println("Program Sonlaniyor ...");
                }
                if(cikis=='E'){
                    EvetHayır='E';
                }

            }



        }








    }

}
