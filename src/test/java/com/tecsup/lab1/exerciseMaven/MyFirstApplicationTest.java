package com.tecsup.lab1.exerciseMaven;


import org.junit.Assert;
import org.junit.Test;
import com.tecsup.lab1.exerciseMaven.MyApplication;

public class MyFirstApplicationTest {
	@Test
	public void testApp() {
		MyApplication appObject = new MyApplication();
		Assert.assertEquals(appObject.reverseString("Hola!"), "!aloH");
	}
	@Test
	public void arrT() {
		MyApplication appObject = new MyApplication();
		int [] i = {1,2,3};
		Assert.assertArrayEquals(appObject.arrays(), i);
	}
}
