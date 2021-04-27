package org.serguei;

import java.util.Scanner;

public class Palindrom {
	
	

 public static void main (String argv []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Veuillez saisir le palindrome à tester :");
     String str = sc.nextLine();
     System.out.println("Vous avez saisi : " + str);
   
     
     System.out.println( "votre mot est palindrom :" + Palindrom.isPalindrom(str));
 }
 
 
 
 
 public static boolean isPalindrom (String str){
     int x = 0;     
     String p =str.replaceAll(" ","");
     char[] tab = p.toCharArray();    
     int y =p.length()-1;  
     
     while (y>x && tab[x]==tab[y]){
         x++;
         y--;
     }
     if (y<=x)
     return true;
     else
     return false;
 }

}
