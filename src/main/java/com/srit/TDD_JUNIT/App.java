package com.srit.TDD_JUNIT;

import java.util.*;
public class App {
   public static void main(String args[]) {
       @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
      String str = sc.nextLine();
      if (str.charAt(0)=='A' && str.charAt(1)=='A')
      {
      
      
        System.out.println(removeCharAt(str, 0));
      }
      
   }
   public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 2);
   }
}