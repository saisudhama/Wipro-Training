package com.wipro.day4.lambda.calculator;

public class Calci {

	public static void main(String[] args) {
		
		Add add = (int n1, int n2) -> (n1+n2);
		Sub sub = (int n1, int n2) -> (Math.abs(n1-n2));
		Mul mul = (int n1, int n2) -> (n1*n2);
		Div div = (int n1, int n2) -> {
			
			if(n1 == 0 || n2 == 0) { return 0; }
			
			else if(n1 >= n2) { return (float) n1/n2; }
			
			return (float) n2/n1;
			
		};
		
		System.out.println(add.add(2, 3));
		System.out.println(sub.sub(5, 9));
		System.out.println(mul.mul(9, 7));
		System.out.println(div.div(99, 111));

	}

}
