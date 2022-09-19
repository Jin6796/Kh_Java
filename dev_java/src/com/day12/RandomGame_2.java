package com.day12;

import java.util.Random;
import java.util.Scanner;

public class RandomGame_2 {
	public static void gameStart () {
		Random r = new Random();
	    int dap = r.nextInt(10);
	    Scanner scan = new Scanner(System.in);

	    System.out.println("0부터 9까지의 숫자를 입력하시오.");         
//	    String str = null;
	    int i=scan.nextInt();
	    
	    while(i != 30){                      
	        if(i==dap){                   
	            System.out.println("정답입니다.");
	            break;
	        }
	        else if(i > dap){              
	            System.out.println("더 낮은 숫자를 입력하세요.");
	        }
	        else if(i < dap){
	            System.out.println("더 높은 숫자를 입력하세요.");
	        } 	
	    }//  while ended
	    System.out.println("프로그램을 종료합니다.");
} //////////////// [[[ end of gameStart_2 ]]] ////////////////////
    public static void main(String[] args){
     
    }
} ////////////////// [[[ end of main ]]] ///////////////////////

