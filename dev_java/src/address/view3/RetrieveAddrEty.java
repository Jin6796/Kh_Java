package address.view3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class RetrieveAddrEty {
//	AddressVO addressvo = null;
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
//	public RetrieveAddrEty(AddressVO addressvo) {
//		this.addressvo = addressvo;
//	}
//	
	/***************************************************************************
	 * 회원정보 중 상세보기 구현 - 1건 조회
	 * SELECT id, name, address, DECODE(gender,'1','남','여') as "성별"
            , relationship, comments, registedate, birthday
         FROM mkaddrtb
        WHERE id = 5
	 * @param vo : 사용자가 선택한 값
	 * @return AddressVO : 조회 결과 1건을 담음
	 **************************************************************************/
	public AddressVO retrieve(AddressVO vo) { 
		System.out.println("RetrieveAddrEty retrieve(AddressVO vo) 호출 성공");
		AddressVO rVO = null;
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT id, name, address, telephone, relationship      ");
		sql.append("  , DECODE(gender, 1, '남자', '여자') gender, birthday, comments, registedate    ");
		sql.append("  FROM mkaddrtb                                                               ");
		sql.append(" WHERE id = ?                                                                 ");
		
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, vo.getId());
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				rVO = new AddressVO();
				rVO = new AddressVO();
				rVO.setId(rs.getInt("id"));
				rVO.setName(rs.getString("name"));
				rVO.setAddress(rs.getString("address"));
				rVO.setTelephone(rs.getString("telephone"));
				rVO.setGender(rs.getString("gender"));
				rVO.setRelationship(rs.getString("relationship"));
				rVO.setBirthday(rs.getString("birthday"));
				rVO.setComments(rs.getString("comments"));
				rVO.setRegistedate(rs.getString("registedate"));
			}
//			if (rVO != null) {
//				vo.setId(rVO.getId());
//				vo.setName(rVO.getName());
//				vo.setAddress(rVO.getAddress());
//				vo.setTelephone(rVO.getTelephone());
//				vo.setGender(rVO.getGender());
//				vo.setRelationship(rVO.getRelationship());
//				vo.setBirthday(rVO.getBirthday());
//				vo.setComments(rVO.getComments());
//				vo.setRegistedate(rVO.getRegistedate());
//			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			DBConnectionMgr.freeConnection(rs, pstmt, con);
		}
		return rVO;
	}
	/***************************************************************************
	 * 회원 목록 보기 구현 - n건 조회
	 * SELECT id, name, address, DECODE(gender,'1','남','여') as "성별"
            , relationship, birthday, comments, registedate
         FROM mkaddrtb
	 * @param vo : 사용자가 선택한 값
	 * @return AddressVO : 조회 결과 1건을 담음
	 **************************************************************************/
	public AddressVO[] retrieve() {
		System.out.println("RetrieveAddrEty retrieve() 호출 성공");		
		AddressVO[] vos = null;
//		나중에 list/map으로 시도해보기.		
//		List<Map<String, Object>> imsi = new ArrayList<>();
		Vector<AddressVO> imsi = new Vector<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id, name, address, telephone, gender         ");
		sql.append("     , relationship, birthday, comments, registedate");
		sql.append("  FROM mkaddrtb  ");
		sql.append(" ORDER BY id     ");
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			
//			Map<String, Object> arr = null;
//			while (rs.next()) {
//				arr = new HashMap<>();
//				arr.put("id", rs.getInt("id"));
//				arr.put("name",  rs.getString("name"));
//				arr.put("address",  rs.getString("address"));
//				arr.put("telephone",  rs.getString("telephone"));
//				arr.put("gender",  rs.getString("gender"));
//				arr.put("relationship",  rs.getString("relationship"));
//				arr.put("birthday",  rs.getString("birthday"));
//				arr.put("comments",  rs.getString("comments"));
//				arr.put("registedate",  rs.getString("registedate"));
//				imsi.add(arr);
//			}
//			Iterator<Map<String,Object>> iter = imsi.iterator();
//			Object keys[] = null;
//			while (iter.hasNext()) {
//				Map<String, Object> data = iter.next();
//				keys = data.keySet().toArray();
//				Vector<Object> oneRow = new Vector<>();
//				oneRow.add(data.get(keys[2]));
//				oneRow.add(data.get(keys[1]));
//				oneRow.add(data.get(keys[0]));
//			}

			AddressVO raVO = null;
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String telephone = rs.getString("telephone");
				String gender = rs.getString("gender");
				String relationship = rs.getString("relationship");
				String comments = rs.getString("comments");
				String registedate = rs.getString("registedate");
				String birthday = rs.getString("birthday");
				raVO = new AddressVO(name, address,telephone, gender
						, relationship, comments, registedate, birthday, id);
				imsi.add(raVO);
				
			}
			vos = new AddressVO[imsi.size()];
			imsi.copyInto(vos);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(rs, pstmt, con);
		}
		return vos;
	}
}

/*
ID,NAME,ADDRESS,TELEPHONE,GENDER,RELATIONSHIP,BIRTHDAY,COMMENTS,REGISTEDATE
3,나초보,서울시 마포구 공덕동,025556968,2,2,19801215,주연테크,REGISTEDATE
1,홍길동,서울시 영등포구 당산동,111,1,동창,19901010,222,20081117
2,이순신,서울시 서초구 양재동,222,2,회사동료,19901110,333,20100113
4,강감찬,경기도 광명시,11,1,동창,19801120,테스트합니다.,2011-03-20
9,나초조,4455,44455,1,44555,19800702,자영업,20110320
7,223,223,223,2,223,223,223,20190609
10,조조,경기도 화성시,44455,1,44555,19800702,자영업,20110320
*/