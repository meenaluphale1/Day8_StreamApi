package com.lti.exp;

public class TestReturnNull {

	public static void main(String[] args) {
		int k = 100;

		try {
			int i = 0;
			int j = 500 / i;
			System.out.println(" j " + j);
			//return ;
		} catch (Exception e) {
			System.out.println(" plz check value i is zero");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		   // return ;
		} finally {
			System.out.println("finally ");
			// return ;
		}

		System.out.println("K" + k);

	}
}
