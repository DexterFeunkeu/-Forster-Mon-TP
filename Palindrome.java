package dexprod;

import java.util.*;
 
class Palindrome
{
  public static void main(String args[])
  {
    String inputString;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Veillez entrer un mot de votre choix");
    inputString = in.nextLine(); 
 
    int length  = inputString.length();
    int i, begin, end, middle;
 
    begin  = 0;
    end    = length - 1;
    middle = (begin + end)/2;
 
    for (i = begin; i <= middle; i++) {
      if (inputString.charAt(begin) == inputString.charAt(end)) {
        begin++;
        end--;
      }
      else {
        break;
      }
    }
    if (i == middle + 1) {
      System.out.println("Le mot entrer est un palindrome ! ");
    }
    else {
      System.out.println("Le mot entrer n'est pas un palindrome !");
    } 	
  }
}