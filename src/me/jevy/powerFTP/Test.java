package me.jevy.powerFTP;

import java.io.File;
import java.util.Scanner;

public abstract class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((new File("")).getAbsolutePath());
		Scanner c = new Scanner(System.in);
		System.out.println("Test:" + c.next()+c.next()+c.next());
	}

}
