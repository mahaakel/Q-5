package Ex_5.Ex_5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Ex_5.Ex_5.statusClass.Status;

public class AppTest {
	
//	  Test case for Route 1
//	   This test with gold status and  cart total of 3000, credit rating
//	   of 600,  the checkout  approved.(A-B-C-D-F-L)
	 
	@Test
	public void Route1() {
		double cart = 3000.0;
		int creditCard = 600;
		statusClass.Status status = Status.gold;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
		
	}
	
	
//	  Test case for Route 2
//	   This test with gold status and  cart total of 4000, credit rating
//	   of 700,  the checkout  approved.(A-B-C-D-E-F-L)
	
	
	@Test
	public void Route2() {
		double cart = 4000.0;
		int creditCard = 700;
		statusClass.Status status = Status.gold;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}
	
	
	

//	  Test case for Route 3
//	   This test with gold status and  cart total of 5000, credit rating
//	   of 100,  the checkout is not approved.(A-B-C-D-E-L)
	
	@Test
	public void Route3() {
		double cart = 5000.0;
		int creditCard = 100;
		statusClass.Status status = Status.gold;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}
	

//	  Test case for Route 4
//	   This test with silver status and  cart total of 2000, credit rating
//	   of 100,  the checkout approved.(A-B-C-G-H-F-L)
	@Test
	public void Route4() {
		double cart = 2000.0;
		int creditCard = 100;
		statusClass.Status status = Status.silver;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	
//	  Test case for Route 5
//	   This test with gold silver and  cart total of 3000, credit rating
//	   of 800,  the checkout is approved.(A-B-C-G-H-J-F-L)
	@Test
	public void Route5() {
		double cart = 3000.0;
		int creditCard = 800;
		statusClass.Status status = Status.silver;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}
	
	

//	  Test case for Route 6
//	   This test with silver status and  cart total of 5000, credit rating
//	   of 700,  the checkout is not approved.(A-B-C-G-H-J-L)
	@Test
	public void Route6() {
		double cart = 5000.0;
		int creditCard = 700;
		statusClass.Status status = Status.silver;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	
	
	
//	  Test case for Route 7
//	   This test with other status and  cart total of 1000, credit rating
//	   of 100,  the checkout is  approved.(A-B-C-G-I-F-L)
	@Test
	public void Route7() {
		double cart = 1000.0;
		int creditCard = 100;
		statusClass.Status status = Status.other;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}
	
	
//	  Test case for Route 8
//	   This test with other status and  cart total of 2000, credit rating
//	   of 1000,  the checkout is  approved.(A-B-C-G-I-K-F-L)
	@Test
	public void Route8() {
		double cart = 2000.0;
		int creditCard = 1000;
		statusClass.Status status = Status.other;
		boolean expected = true;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

	
	
//	  Test case for Route 9
//	   This test with other status and  cart total of 3000, credit rating
//	   of 200,  the checkout is not approved.(A-B-C-G-I-K-L)
	@Test
	public void Route9() {
		double cart = 3000.0;
		int creditCard = 200;
		statusClass.Status status = Status.other;
		boolean expected = false;
		assertEquals(expected, App.checkOut(cart, creditCard, status));
	}

}
	
	
	
	
	

	
	
    
    
	
	
	
	

