package com;

import java.util.Random;
public class Roll {
	Random rn = new Random();
	public Roll(){
		//stuff
	}
	public int D2(){
		int roll = rn.nextInt(2);
		return roll;
	}
	public int D6(){
		int roll = rn.nextInt(6);
		return roll;
	}
	public int D20(){
		int roll = rn.nextInt(20);
		return roll;
	}

}
