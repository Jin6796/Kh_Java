package practice;

public class Array {

	public static void main(String[] args) {
		int[]jumsu;
		jumsu = new int[5];// 길이가 5인 jumsu 배열을 생성.
		
		jumsu[3]=100;
		int third = jumsu[3];
		
		System.out.println(jumsu[3]);
		System.out.println(third);
		
		int x = jumsu.length;
		System.out.println("jumsu의 길이는 "+x);
		
		for(int i=0;i<jumsu.length;i++) {
			System.out.println("jumsu["+i+"]="+jumsu[i]);
		}
	 	
	}

}
