package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import bean.XQJSYYHY1;
import bean.XQJSYYHY2;
import bean.XQJSYYHY3;
import bean.XQJSYYHY1;
import util.DBUtil;

public class XQJSYYHYdao {

	
	//一级
	public List<XQJSYYHY1> getTypeList1(){
		List<XQJSYYHY1> beans =new ArrayList<XQJSYYHY1>();
		XQJSYYHY1 bean=null;
		
		String sql="select * from XQJSYYHY1";
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			while(rs.next()){
				bean=new XQJSYYHY1();
				int xid=rs.getInt("xid");
				String xname=rs.getString("xname");
				bean.set(xid, xname);
				beans.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		return beans;
	}
	
	//二级
	public List<XQJSYYHY2> getTypeList2( int T2id){
		List<XQJSYYHY2> beans =new ArrayList<XQJSYYHY2>();
		XQJSYYHY2 bean=null;
		
		String sql="select * from XQJSYYHY2 where pid='"+T2id+"'";
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			while(rs.next()){
				bean=new XQJSYYHY2();
				int xid=rs.getInt("xid");
				String name=rs.getString("xname");
				int pid=rs.getInt("pid");
				bean.set(xid,name,pid);
				beans.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		return beans;
	}
	
	//三级
		public List<XQJSYYHY3> getTypeList3( int T3id){
			List<XQJSYYHY3> beans =new ArrayList<XQJSYYHY3>();
			XQJSYYHY3 bean=null;
			
			String sql="select * from XQJSYYHY3 where pid='"+T3id+"'";
			Connection conn=null;
			Statement state=null;
			ResultSet rs=null;
			
			
			conn=DBUtil.getConn();
			try {
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				while(rs.next()){
					bean=new XQJSYYHY3();
					int xid=rs.getInt("xid");
					String xname=rs.getString("xname");
					int pid=rs.getInt("pid");
					bean.set(xid,xname,pid);
					beans.add(bean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DBUtil.close(rs, state, conn);
			}
			return beans;
		}
		
		
}
