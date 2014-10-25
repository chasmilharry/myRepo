package com.harry.testing;

import java.util.Scanner;
import java.lang.System;

public class WhatIsYourName {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		
		System.out.println("Hello, what is your name?");
		
		name = keyboard.nextLine();
		
		System.out.print("Hello ");
		System.out.print(name);
		System.out.println("!");
		
		keyboard.close();
	}

}
