package com.studentapp.util;

import java.util.Scanner;

public class KeyboardUtil {

	@SuppressWarnings("resource")
	public static int getInt(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static String getString(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
}
