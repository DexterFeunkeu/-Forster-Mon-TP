package dexprod;

import java.util.Scanner;

public class Paire {

	public static void main(String[] args) {
		int n;
		System.out.println(" Entrer la valeur d'un entier n: ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        int r = n%2;
        if(r==0){
        	System.out.println(" L'entier que vous venez d'entrer est paire !");
        }
        else {
        	System.out.println(" L'entier que vous venez d'entrer est impair !");
        }
        	
        }
	}


