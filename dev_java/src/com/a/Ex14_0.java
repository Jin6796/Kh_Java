package com.a;

import java.util.function.Predicate;

public class Ex14_0 {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;

		Predicate<Integer> notP = p.negate();         // i<100이 아닌 것 ==> i>=100
		Predicate<Integer> all = notP.and(q).or(r);   // 100 <= i && i < 200 || i%2==0 
		Predicate<Integer> all2 = notP.and(q.or(r));  // 100 <= i && (i < 200 || i%2==0)

		// 
		System.out.println(notP.test(2)); // false
		System.out.println(all.test(2)); 
		System.out.println(all2.test(2));
	}

}
