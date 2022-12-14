package ajdbc.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import oracle.vo.DeptVO;

public class DeptController {
	DeptVO gdVO = null;
	private final String _DEL = "delete";
	private final String _INS = "insert";
	private final String _UPD = "update";
	private final String _SEL = "select";
	DeptDao deptdao = null;
	DeptView deptview = null;
	
	
	public DeptController() {}
	public DeptController(DeptView deptview) {
		this.deptview = deptview;	
		deptdao = new DeptDao(deptview);
	}
	
	public DeptController(DeptVO pdVO) {
		this.gdVO = pdVO;
	}
	public DeptVO send(DeptVO pdVO) {
		DeptVO rdVO = new DeptVO();
		String command = pdVO.getCommand();
		int result = 0;
		// 너 삭제할거야?		
		if(_DEL.equals(command)) {
			result = deptdao.deptDelete(pdVO.getDeptno());
			if(result == 1) rdVO.setResult(result);
		}
		// 부서정보 등록할거야?
		else if(_INS.equals(command)) {
			result = deptdao.deptInsert(pdVO);
			if(result == 1) rdVO.setResult(result);
		}
		// 부서정보 수정 누른거야?
		else if(_UPD.equals(command)) {
			result = deptdao.deptUpdate(pdVO);
			if(result == 1) rdVO.setResult(result);
		}
		// 부서정보 상세보기 원해?
		else if(_SEL.equals(command)) {
			rdVO=deptdao.deptSelectDetail(pdVO.getDeptno());
		}
		return rdVO;
	}
	public List<Map<String,Object>> deptSelectAll() {
		List<Map<String,Object>> deptList = new ArrayList<>();
		deptList = deptdao.deptSelectAll();
		return deptList;
		
	}
}
