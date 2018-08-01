
package jobsheeet7;

import java.util.Scanner;


public class Jobsheeet7 {
    public static void main(String[] args) {
        String identitas = "Akbar Baihaqi Putra Aji / X RPL 5 / 4";
        System.out.println("Identitas : "+ identitas );
    
     Scanner scanner = new Scanner(System.in);
     System.out.print("NIlai a ?");
     int a = scanner.nextInt();
     
     System.out.println("nIF.. l");
     if(a<5) System.out.println("nilai a kurang dari 5");
     
     System.out.println("\nIF.. 2");
     if(a==5)
         System.out.println("nilai a sama dengan 5");
     
     System.out.println("\nIF.. 3");
     if(a>5) {
         System.out.println("isi variabel a : "+a);
         System.out.println("nilai a lebih dari 5");
     }
    
  
    }
}
