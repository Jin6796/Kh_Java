package com.a;

public class For_3 {
	public void selftest() {
		int i = 0; int hap = 0;
		for(i=0; i<=100 ; i++) {
			if(i%3==0) { 
				hap += i;
			}
		} System.out.println("1부터 100까지 중 3의 배수들의 합은 " + hap + "입니다.");
	}
	public static void main(String[] args) {
		For_3 f3 = new For_3();
		f3.selftest();
	}

}
