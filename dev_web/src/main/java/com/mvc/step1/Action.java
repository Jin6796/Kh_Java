package com.mvc.step1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
//      내가 오버라이드 된 메소드를 내 입맛에 맞게 바꿔서 처리해 보겠다. 
      public ActionForward execute(HttpServletRequest req, HttpServletResponse res) 
    		  throws ServletException, IOException;
}