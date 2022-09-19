package com.a;

class Card {
	String kind; 
	int number; 

	Card() { 
		this("SPADE", 1); 
	} 

	Card(String kind, int number) {
		 this.kind = kind; 
		 this.number = number; 
	} 

	public String toString(){
		return "kind: " + kind + ", number: " + number;
// Card 인스턴스의 kind와 number을 문자열로 반환한다.
  }
} 

class Ex9_4 { 
	public static void main(String[] args) {
		Card a = new Card();
		Card b = new Card("HEART", 10);
		System.out.println(a.toString()); 
		System.out.println(b.toString()); 
		
	}
}