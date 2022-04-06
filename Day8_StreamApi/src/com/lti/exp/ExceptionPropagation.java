package com.lti.exp;

class ExceptionPropagation {

	void method3() {
		int result = 100 / 0; // Exception Generated
		System.out.println(result);
	}

	void method2() {
		method3();
	}

	void method1() {
		
			method2();
		
	}

	public static void main(String args[]) {
		
		ExceptionPropagation obj = new ExceptionPropagation();
		
		try
		{
		obj.method1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}