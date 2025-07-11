package UAS;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DetailManhua[] koleksi = new DetailManhua[2];
        try {
             for (int i = 0; i < koleksi.length; i++) {
                 System.out.print("Judul Manhua ke-" + (i + 1) + ": ");
                String judul = input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();
                System.out.print("Status Baca (Ongoing/Completed): ");
                String status = input.nextLine();
                System.out.print("Chapter terakhir dibaca: ");
                int chapter = Integer.parseInt(input.nextLine());

               
                
           
        

        

