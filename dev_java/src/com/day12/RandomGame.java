package com.day12;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	// static이 있는 메소드에 대해서는 인스턴스화 없이 "클래스타입.메소드명"으로 호출이 가능함
	public static void gameStart () {
		//임의의 숫자를 채번하는 메소드를 제공하는 클래스임. >> 0.0 ~ 1.0
		Random r = new Random();// 선언부 r = new 생성부  >> 참조형 Random클래스의 변수 r
		// 사용자가 값을 입력하기 전에 채번해야 한다.
	    int dap = r.nextInt(20);//0이상10미만사이의 정수를 리턴해 준다. // 세미콜론으로 끝나면 메소드를 호출하는 것.
	    Scanner scan = new Scanner(System.in);// 파라미터에 System.변수 (입력장치) /// 사용자가 입력한 값을 읽어올 때

	    System.out.println("0부터 20까지의 숫자를 입력하시오.");         /// 안내메세지: 유효범위는 0에서 9사이.
	    String str = null;                                     /// 사용자가 입력한 값을 담을 변수 선언
	                                                           /// 17번라인: 몇 번을 반복할지 횟수를 정하고 싶으면 'for문'을 배워야 한다.
	    while((str=scan.next()) != null){                      /// str=scan.next(); / 사용자가 입력한 값이 null이 아니면 계속 돌아라!!!!
	        if(Integer.parseInt(str)==dap){                    /// 입력한 값이 채번한 값과 같니? 네: 프린트, 아니요: else if로 이동
	            System.out.println("답과 일치하는 숫자입니다.");
	            break;
	        }
	        else if(Integer.parseInt(str) > dap){              /// if문 조건에 수렴하지 않으면 아래로 온다. >> 힌트문 제공 "요구사항"
	            System.out.println("더 낮은 숫자를 입력하세요.");
	        }
	        else if(Integer.parseInt(str) < dap){
	            System.out.println("더 높은 숫자를 입력하세요.");
	        } 	
	    } //while ended
	    System.out.println("프로그램을 종료합니다.");
} //////////////// [[[ end of gameStart ]]] ////////////////////
    public static void main(String[] args){
     // 메소드 호출 시 구현된 메소드 앞에 static이 있으면 인스턴스화 없이 "클래스 타입.메소드명()" 호출이 가능하다.
    	RandomGame.gameStart();
    	
    }
    
} ////////////////// [[[ end of main ]]] ///////////////////////

