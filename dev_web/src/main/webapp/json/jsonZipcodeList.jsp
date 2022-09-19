<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.Map, java.util.HashMap, java.util.ArrayList" %>
<%@ page import="com.util.DBConnectionMgr, java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement, java.sql.ResultSet" %>
<%@ page import="com.google.gson.Gson" %>
<%
	String dong = null;
		if(request.getParameter("dong") == null){
		   dong = "역삼";
		}else {
		   dong = request.getParameter("dong");
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DBConnectionMgr dbMgr = new DBConnectionMgr();
		List<Map<String, Object>> zipList = null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT address, zipcode            ");
		sql.append(" FROM ZIPCODE_T                    ");
	    sql.append(" WHERE dong LIKE '%'||?||'%'");
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dong);
			rs = pstmt.executeQuery();
			zipList = new ArrayList<>();
			Map<String, Object> rmap = null;
			while (rs.next()) {
				rmap = new HashMap<>();
				rmap.put("address", rs.getString("address"));
				rmap.put("zipcode", rs.getString("zipcode"));
		//		rmap.put("zipcode",  rs.getString(2));
				zipList.add(rmap);
			}
			Gson g = new Gson();
			String imsi = g.toJson(zipList);
		out.println(imsi);
		} catch (Exception e) {
		out.println("Exception : " + e.toString());
		}
%>