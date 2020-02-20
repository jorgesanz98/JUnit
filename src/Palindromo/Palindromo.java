package Palindromo;

import java.util.Scanner;

public class Palindromo 
{	
	public Palindromo() 
	{
	}
	public boolean palindromo(String a) {
		boolean res = true;
		int i = 0; //1
		if(a.length() % 2 == 0) { //2
			while(i < a.length()/2 && res) { //3 y //4
				res = a.charAt(i) == a.charAt((a.length()-1)-i); //5
				i++;
			}
		} else {
			while(i < (a.length()/2)+1 && res) { //6
				res = a.charAt(i) == a.charAt((a.length()-1)-i); //7
				i++;
			}
		}
		return res; //8
	}
}

