package com.studentapp.main;

import java.util.InputMismatchException;

import com.studentapp.exception.NumberExceedException;
import com.studentapp.util.KeyboardUtil;

public class Main {
	static int[] sub = new int[4];
	static String[] subn = new String[4];
	static double percentage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subn[0] = "Maths";
		subn[1] = "English";
		subn[2] = "Science";
		subn[3] = "SocialScience";
		System.out.println("Student Application System");
		System.out.println("---------------------------");
		int ns = KeyboardUtil.getInt("1.Calculate Percentage for a Student\n2.Exit");
		boolean flag1 = true;
		while (flag1 == true) {
			if (ns == 1) {
				getinp();
			} else {
				System.exit(1);
			}
			percentage = calculate();

			if (percentage >= 90) {
				System.out.println("Percentage is " + percentage + " and performance grade is Excellent");
			}
			if (percentage >= 80 && percentage < 90) {
				System.out.println("Percentage is " + percentage + " and performance grade is Very Good");
			}
			if (percentage >= 60 && percentage < 80) {
				System.out.println("Percentage is " + percentage + " and performance grade is Good");
			}
			if (percentage >= 40 && percentage < 60) {
				System.out.println("Percentage is " + percentage + " and performance grade is Average");
			}
			if (percentage < 40) {
				System.out.println("Percentage is " + percentage + " and performance grade is Poor");
			}

			int rs = KeyboardUtil
					.getInt("1.Continue calculating the percentage\n2.Exit\nPress 1 or 2 to enter the option:");
			if (rs == 1) {
				flag1 = true;
			} else {
				flag1 = false;
			}
		}
	}

	private static double calculate() {
		// TODO Auto-generated method stub
		int total = sub[0] + sub[1] + sub[2] + sub[3];
		percentage = total * 100 / 400;
		return percentage;

	}

	private static void getinp() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 3; i++) {
			boolean flag = true;
			while (flag == true) {
				try {
					sub[i] = KeyboardUtil.getInt("Enter the Marks secured in " + subn[i] + ":");
					if (sub[i] > 100 || sub[i] < 0) {
						flag = true;
						throw new NumberExceedException();
					}
					flag = false;
				} catch (NumberExceedException e) {
					System.out.println("Marks out of range. Enter valid marks between 1 and 100!");
				} catch (InputMismatchException e) {
					System.out.println("Enter valid Marks!");
				}
			}
		}

	}
}
