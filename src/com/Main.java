package com;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		Roll lucky = new Roll();
		
		System.out.println("Hello what is your name");
		String name = kb.nextLine();
		
		System.out.println("Welcome " + name + " you are about to embark on a mythical journey.");
		
		int fork = lucky.D2();
		
		int wepT = 0;
		String wepAns = "";
		
		if (fork == 0){
			System.out.println("select your wepon 's' for sword 'b' for bow ");
			wepAns =  kb.next();
			
		}
		else if (fork == 1){
			System.out.println("select your wepon 'm' for mace 'w' for wand");
			wepAns = kb.next();
		}
        
		char wepChar = wepAns.charAt(0);
		
		 switch (wepChar) {
			 case 1:
				 wepT = 0;
				 break;
			 case 2:
				 wepT = 1;
				 break;
			 case 3:
				 wepT = 2;
				 break;
			 case 4:
				 wepT = 3;
				 break;
			 default:
				 break;
		 }

		Adven you = new Adven(name,wepT);



	}

}
