package com.a;

public class Dan99_4 {
	int i=2; int j=1;
	public void dan99_4() {
		while(i<=9) {
			System.out.print("["+i+"단]\n");
			while(j<=9) {
				if(i!=2 && i!=9) {
					System.out.println("생략");
					break;
				}
				System.out.println(i+" x "+j+" = "+ (i*j));
				j++; 
			}
			i++;
			j=1;
			System.out.print("\n");
		}
			
	}
	
	public static void main(String[] args) {
		Dan99_4 d = new Dan99_4();
		d.dan99_4();
	}
}