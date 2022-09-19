package com.a;

public class While_3 {
	public void selftest() {
	 int i = 1; int hap = 0;
		while(i<=100) {
			if(i%3==0) { 
			hap += i;	
			System.out.println("값 "+i+"는 3의 배수입니다.");
			}
			i++;
		} 
		System.out.println("1부터 100까지 중 3의 배수들의 합은 " + hap + "입니다.");
		}
	public static void main(String[] args) {
		While_3 w3 = new While_3();
		w3.selftest();
	}

}
