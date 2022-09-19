package com.day13;

import java.util.Random;
import java.util.Scanner;

import com.day12.RandomGame;
 
public class RandomGame_V1 {
	public void gameStart () {
		// 요구사항 - 게임 유저들에게 회차 정보를 제공하세요
		// 회차를 카운트 해야하는 경우는 언제일까요?
		// 정답을 맞췄을 때 - 게임 종료
		// 힌트를 제공하면 기회를 한 번 잃어버린다.
		int cnt = 5; 
		Random r = new Random();
	    int dap = r.nextInt(10);
	    Scanner scan = new Scanner(System.in);
	    System.out.println("0부터 9까지의 숫자를 입력하시오.");
	    String str = null;                                
	    // 만일 i가 6이라면 for문 안에 실행문이 진행이 될 수 있을까?
	    for(int cnt1=1;cnt1<6;cnt1++){      
	    	str = scan.next();
	    	// 만약 i 값이 5이면 진행되어야하는가?:네 
	    	// 6이면 어디로 가야하지?: for문 밖
	    	// if if는 매번 조건을 따지지만 else if문을 사용하면
	    	// 첫번째 조건이 만족되었을 경우 아래 조건은 따지지 않고 if문 블록을 탈출한다.
	    	if (cnt1==5) {
	    		System.out.println("주어진 기회를 모두 소진하였습니다."); 
	    		break;}
	        if(Integer.parseInt(str)==dap){             
	            System.out.println("답과 일치하는 숫자입니다.");
	            break;
	        }
	        else if(Integer.parseInt(str) > dap){        
	            System.out.println("더 낮은 숫자를 입력하세요.");
	        }
	        else if(Integer.parseInt(str) < dap){
	            System.out.println("더 높은 숫자를 입력하세요.");
	        } 	
	        // 그렇다면 과연 언제 for문을 탈출할 수 있을까?
	        // 5번의 기회 중에서 세 번째에 정답을 맞추면 나간다.
	        // 다섯 번을 초과해서 사용자가 정답을 입력할 수 있나요? > 아니오
	    }//while ended
	    System.out.println("프로그램을 종료합니다.");
} //////////////// [[[ end of gameStart ]]] ////////////////////
    public static void main(String[] args){
    	
    	RandomGame_V1 rv = new RandomGame_V1();
    	rv.gameStart();
    	
    }
    
} ////////////////// [[[ end of main ]]] ///////////////////////

