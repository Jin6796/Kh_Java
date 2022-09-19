package com.day13;

import java.util.Random;
import java.util.Scanner;

import com.day12.RandomGame;
 
public class RandomGame_V2 {
	//컴퓨터가 채번하는 일을 전담하는 메소드 구현
	public void randomNumber() {
		int i = 5; 
		Random r = new Random();
	    int dap = r.nextInt(10);
		System.out.println(dap);} 
	
	//사용자가 입력하는 값을 받아서 판정하는 메소드에 전달하기
	public void userInput() {
	    Scanner scan = new Scanner(System.in);
	    String str = null;                                
	    str = scan.next();

	}
	public void gameStart () { 
		Scanner scan = new Scanner(System.in);
		String str = null;  	    	
		str = scan.next();
		
	    System.out.println("0부터 9까지의 숫자를 입력하시오.");
	    for(int cnt=1;cnt<6;cnt++){      
	    	if (cnt==5) {
	    		System.out.println("주어진 기회를 모두 소진하였습니다."); 
	    		break;}
	        if(Integer.parseInt(str)==cnt){             
	            System.out.println("답과 일치하는 숫자입니다.");
	            break;
	        }
	        else if(Integer.parseInt(str) > cnt){        
	            System.out.println("더 낮은 숫자를 입력하세요.");
	        }
	        else if(Integer.parseInt(str) < cnt){
	            System.out.println("더 높은 숫자를 입력하세요.");
	        } 	
	    }//while ended
	    System.out.println("프로그램을 종료합니다.");
} //////////////// [[[ end of gameStart ]]] ////////////////////
    public static void main(String[] args){
    	
    	RandomGame_V2 rv2 = new RandomGame_V2();
    	rv2.gameStart();
    	rv2.userInput();
    	rv2.randomNumber();
    	
    }
    
} ////////////////// [[[ end of main ]]] ///////////////////////

