package com.a;

public class Dan99 {
	
	public void dan99() {
		for(int i=2; i<=9; i++) {
			if(i!=2)
				i = 9;
			System.out.println("["+i+"단]");
			for(int j=1; j<=9; j++) {
				if(i!=2 && i!=9)
					break;
				System.out.println(i+" x "+j+" = "+ (i*j));
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Dan99 d = new Dan99();
		d.dan99();
	}
}