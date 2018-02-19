package com.tecsup.lab1.exerciseMaven;

/**
 * Hello world!
 *
 */
public class MyApplication 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String str = "Hola!";

		MyApplication appObject = new MyApplication();
		System.out.println("La cadena invertida de \"" + str + "\" es \"" + appObject.reverseString(str) + "\"");
	}	

	public String reverseString(String src) {
		return new StringBuilder(src).reverse().toString();
	}
	
	public int[] arrays() {
		int [] i = {1,2,3};
	return i;
	}
}
