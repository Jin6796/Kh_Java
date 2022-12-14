package com.mvc.step3;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.util.HashMapBinder;
// POJO 프레임워크가 갖고있는 복잡도에 대해 생각해보세요
// 새로운 업무가 추가되는 경우 유연하게 조립이 가능한지에 대해 이야기해보세요
// 뭔가 수정되어지는 부분들이 복잡도가 증가되고 있나?
// ActionSupport 클래스와 의존관계에 있나? - 수정해야하는 부분이 있는지
// Controller3 인터페이스와 의존관계에 있나? - 어떤 점이 불편하지?
// HandlerMapping 클래스와 의존관계에 있나?
public class DeptController implements Controller3 {
	Logger logger = Logger.getLogger(DeptController.class);
	private DeptLogic deptLogic = new DeptLogic();
	
	// @RequestParam은 스프링이 사용자가 입력한 값을 주입해주는 역할을 함. POJO에서는 사용불가!
//	public String deptInsert(@RequestParam Map<String, Object> pMap) {
	public String deptInsert(HttpServletRequest req, HttpServletResponse res) {
	      int result = 0;
	      Map<String, Object> pMap = new HashMap<>();
	      HashMapBinder hmb = new HashMapBinder(req);
	      hmb.bind(pMap);
	      result = deptLogic.deptInsert(pMap);
	      return "redirect:deptList.sp";
	   }
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res, Map<String, Object> pMap) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object login(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object clogin(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object memberList(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object boardList(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object boardInsert(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object boardDetail(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object boardUpdate(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object boardDelete(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object doEmp(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}
}
