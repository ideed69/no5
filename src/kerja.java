
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SeZa
 */
public class kerja {
       public static void main(String []args){
     Scanner input=new Scanner(System.in);
     
     String paparan = null;
     char kodujian;
   
   
     
     System.out.println(" A: KERANI                B: JURUTEKNIK");
     System.out.println(" C: PENTADBIR             D: PENGURUS");
  
   
       
     System.out.println("Pilih kod pekerjaan anda : ");
     kodujian=input.next().charAt(0);
     
     if(kodujian=='A'){
         paparan="Capaian data sahaja";
       }
     else if(kodujian=='B'){
         paparan="Capaian sistem sahaja";
     }
     else if(kodujian=='C'){
         paparan="Capaian sistem dan data";
     }
     else if(kodujian=='D'){
         paparan="Capaian keseluruhan";
     }
 
    
     
     System.out.println("Kod kerja: "+kodujian);
     System.out.println("Paparan: "+paparan);
    }
}
