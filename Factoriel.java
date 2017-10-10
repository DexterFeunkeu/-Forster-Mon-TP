package dexprod;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Déclaration des variables du programme
        int n ;
        int fact ;
        int i ;
        
        //Initialisation des variables du programme
        System.out.println("Entrer la valeur de N = ");
		Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        fact = 1;
        i = 1;
        
        //Boucl
        while(i<=n) { 
        	fact = fact * i ;
        	i = i +1;
        }
        
        System.out.println(n + "! vaut " + fact);
	}

}
