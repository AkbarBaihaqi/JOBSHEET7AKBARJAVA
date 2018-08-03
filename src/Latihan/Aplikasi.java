/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Aplikasi {
    public static void main(String[]args){
        
    
        String identitas = "AKBAR BAIHAQI PUTRA AJI PRATAMA / XR5 / 05";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n SARAN RESEP DARI BAHAN MILIK ANDA\n");
        
        
        System.out.println("BAHAN PERTAMA : ");
        System.out.println("1. Pisang ");
        System.out.println("2. Telur ");
        System.out.println("3.Masukkan pilihan anda : ");
        int bahan1 = scanner.nextInt();
        
      if(bahan1 == 1 || bahan1 == 2);
      
          System.out.println("BAHAN KEDUA : ");
          if (bahan1 == 1) {
              System.out.println("1.SUSU");
              System.out.println("2.MINYAK GORENG");
              System.out.println("3.TIDAK ADA");
          }else{
              System.out.println("1.Minyak goreng");
              System.out.println("2.Roti");
              System.out.println("TIDAK ADA");
          }
          System.out.print("MASUKKAN NO PILIHAN ANDA : ");
          int bahan2 = scanner.nextInt();
      
          
          
          if(bahan2 >= 1 && bahan2<= 3)
          {
              if(bahan1==1)
                  switch(bahan2)
                     {
                      
                      case 1:System.out.println("Anda dapat membuat mata telur sapi");break;
                      case 2:System.out.println("Anda dapat membuat Sandwich telur");break;
                      case 3:System.out.println("Anda dapat membuat telur");break;
                      
                      
                      
                  }
      }else 
              
        System.out.println("MOHON MAAF PILIHAN TIDAK DI TENTUKAN, "+
                "TIDAK BISA MEMBERIKAN SARAN RESEP");
      }
    }
    

