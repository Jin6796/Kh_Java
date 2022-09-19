package com.quiz;

class Data3 {
		int x;                                      //x=0

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x=10;                                     //d.x=10
		
		Data3 d2 = copy(d);                         // 15번으로 이동
		System.out.println("d.x="+d.x);
		System.out.println("d2.x="+d2.x);
		
	}
		static Data3 copy(Data3 d) {                //d.x값 복사 (10)
			Data3 tmp = new Data3();
			tmp.x = d.x ;                           //tmp.x에 d.x값 대입 (10)
			return tmp;                             //tmp.x=10 > 11번으로 이동
		}
}
