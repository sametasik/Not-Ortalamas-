package Giris;

import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                int mat, fizik, turkce, kimya, tarih, muzik;
                Scanner input = new Scanner(System.in);
                System.out.print("Matematik Notunuz:    ");
                mat = input.nextInt();
                System.out.print("Fizik Notunuz:    ");
                fizik = input.nextInt();
                System.out.print("Türkçe Notunuz:    ");
                turkce = input.nextInt();
                System.out.print("Kimya Notunuz:    ");
                kimya = input.nextInt();
                System.out.print("Tarih Notunuz:    ");
                tarih = input.nextInt();
                System.out.print("Müzik Notunuz:    ");
                muzik = input.nextInt();
                double sonuc = (mat + fizik + turkce + kimya + tarih + muzik) / 6.0;
                System.out.println("Not Ortalamanız : " + sonuc);
                boolean kosul1 = sonuc >= 60;
                String str = kosul1 ? "Sınıfı Geçti":"Sınıfta Kaldı";
                System.out.println(str);

            }



        }