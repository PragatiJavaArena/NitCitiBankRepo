package com.nt.beans;

public class TryWithSystemexit {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.exit(0);
		}
		finally {
			System.out.println("in finnaly");
		}
		System.out.println("after try/finally");

	}

}
