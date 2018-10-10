package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.T_DCWJXX;
import bean.xkfl1;
import util.DBUtil;
import util.StringUtil;


/* 建立与数据库的连接。
向数据库发起查询请求。
处理数据库返回结果*/


public class T_DCWJXXdao {
	/*
	public List<XKFLBbean> xf(){
		String sql="select * from xkflb";
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		List<XKFLBbean> beans=new ArrayList<XKFLBbean>();
		XKFLBbean bean=null;
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			while(rs.next()){
				bean=new XKFLBbean();
				int xid1=rs.getInt("xid");
				String xname1=rs.getString("xname");
				bean.set(xid1, xname1);
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

*/	
    
    
    
	//多条件查询
	public List<T_DCWJXX> searchn(int WJID,String JSXQMC,int dession,int date1,String TXDZ){
		
		String sql="";
		
		if(date1==0&&dession==0){
			sql=" select *  from t_dcwjxx where  WJID='"+WJID+"' and "
					+"JSXQMC like '"+JSXQMC +"' and TXDZ like '"+TXDZ+"'";
			
		}
		if(WJID==0&&JSXQMC==null){
			sql=" select *  from t_dcwjxx where  dession='"+dession +"'and"+
							"date='"+date1+"' and TXDZ like '"+TXDZ+"'";
		}
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		System.out.println(WJID);
		
		
		List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
		T_DCWJXX xx1=null;

		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			System.out.println(conn.createStatement());
			
			while(rs.next()){
				xx1= new  T_DCWJXX();
				xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
						rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
						rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
						rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
						rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
						rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
						rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
				xx.add(xx1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return xx;
		
		
	}
	
	
	//����
	public T_DCWJXX juti(int wjid){
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		T_DCWJXX xx1=null;
		
		String sql="select * from t_dcwjxx where WJID='"+wjid+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			if(rs.next()){
				xx1= new  T_DCWJXX();
				xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
						rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
						rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
						rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
						rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
						rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
						rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return xx1;
		
	}

	//�����������Ʋ���
	public List<T_DCWJXX> searchn(String jSXQMC,int uid){
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
		T_DCWJXX xx1=null;
		
		String sql="select * from t_dcwjxx where JSXQMC='"+jSXQMC+"'  and uid ='"+uid+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			if(rs.next()){
				xx1= new  T_DCWJXX();
				xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
						rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
						rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
						rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
						rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
						rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
						rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
				xx.add(xx1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return xx;
		
	}

	//�������
	public List<T_DCWJXX> search(int wjid){
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
		T_DCWJXX xx1=null;
		
		String sql="select * from t_dcwjxx where WJID='"+wjid+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			if(rs.next()){
				xx1= new  T_DCWJXX();
				xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
						rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
						rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
						rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
						rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
						rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
						rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
				xx.add(xx1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return xx;
		
	}
	
	
	//��ͨ�û�
		public List<T_DCWJXX> searchx(int wjid ,int uid){
			Connection conn=null;
			Statement state=null;
			ResultSet rs=null;
			List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
			T_DCWJXX xx1=null;
			
			String sql="select * from t_dcwjxx where WJID='"+wjid+"'  and uid='"+uid+"'";
			
			conn=DBUtil.getConn();
			try {
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				if(rs.next()){
					xx1= new  T_DCWJXX();
					xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
							rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
							rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
							rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
							rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
							rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
							rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
					xx.add(xx1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DBUtil.close(rs, state, conn);
			}
			
			
			return xx;
			
		}
	
		
   //��ͨ�û��������Ʋ���
		public List<T_DCWJXX> searchn(String jSXQMC){
			Connection conn=null;
			Statement state=null;
			ResultSet rs=null;
			List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
			T_DCWJXX xx1=null;
			
			String sql="select * from t_dcwjxx where JSXQMC='"+jSXQMC+"'";
			
			conn=DBUtil.getConn();
			try {
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				if(rs.next()){
					xx1= new  T_DCWJXX();
					xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
							rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
							rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
							rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
							rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
							rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
							rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
					xx.add(xx1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DBUtil.close(rs, state, conn);
			}
			
			
			return xx;
			
		}

		

	//���������Ʋ�ѯ�Ƿ����
	public boolean chaj(String jSXQMC){
		boolean flag=false;
		
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		String sql="select * from t_dcwjxx where JSXQMC='"+jSXQMC+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			if(rs.next()){
				flag=true;//���ڸñ��
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return flag;
	}

	

	//��ѯid�Ƿ����
	public boolean WJID(int  wJID){
		boolean flag=false;
		
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		String sql="select * from t_dcwjxx where WJID='"+wJID+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			if(rs.next()){
				flag=true;//���ڸñ��
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return flag;
	}
	
	
	//��id�����Ʋ�ѯ�Ƿ����
	public boolean chawj(int  wJID,String jSXQMC){
		boolean flag=false;
		
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		String sql="select * from t_dcwjxx where WJID='"+wJID+"' and JSXQMC='"+jSXQMC+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			if(rs.next()){
				flag=true;//���ڸñ��
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return flag;
	}

	
	
	//以上是查询没修正的
	//以下是修正过的
	
	
	//获取数据库中数据总量
		public int getCount(){
			ResultSet rs=null;
			Statement stmt=null;
			Connection conn=null;
			
			int size=0;
			
			try{
				conn=DBUtil.getConn();
				stmt=conn.createStatement();
				rs=stmt.executeQuery("select count(*)count from t_dcwjxx");
				
				if(rs.next())
					size=rs.getInt("count");
			}catch(SQLException se){
				se.printStackTrace();
			}
			finally
			{
				DBUtil.close(rs,stmt, conn);
			}
			return size;
		}
		
		//获取每一个分页的数据
		public List<T_DCWJXX> getListByPage(int start ,int size){  //第一个参数是起始位置，第二个参数是一页显示的记录数
			String sql="select * from t_dcwjxx limit "+start+","+size;
			Connection conn=DBUtil.getConn();
			Statement stmt=null;
			ResultSet rs=null;
			
			List<T_DCWJXX> xxs = new ArrayList<T_DCWJXX>();
			T_DCWJXX xx=null;
			
			try{
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				
				while(rs.next()){
					xx= new  T_DCWJXX();
					xx.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
							rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
							rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
							rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
							rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
							rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
							rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
					
					xxs.add(xx);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			DBUtil.close(rs, stmt, conn);
			}
			System.out.println(start+" "+size);
			return xxs;
		}
		
		
	
	//审核不通过
	public Boolean shenhe1(int wjid,int dession,String advice){
		Connection conn=null;
		Statement state=null;
		boolean f=false;
		
		String sql="update t_dcwjxx set dession='"+dession+"' and advice='"+advice+"' where WJID='"+wjid+"'";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			int i=state.executeUpdate(sql);
			if(i==1){
				f=true;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(state, conn);
		}
		return f;
	}

	
	//审核通过
		public Boolean shenhe2(int wjid,int dession){
			Connection conn=null;
			Statement state=null;
			boolean f=false;
			
			String sql="update t_dcwjxx set dession='"+dession+"' where WJID ='"+wjid+"'";
			
			conn=DBUtil.getConn();
			try {
				state=conn.createStatement();
				int i=state.executeUpdate(sql);
				if(i==1){
					f=true;
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DBUtil.close(state, conn);
			}
			return f;
		}

	
	//需求填报
	public boolean tianbao(T_DCWJXX xxbean){
		boolean flag=false;
		
		Connection conn=null;
		Statement state=null;
		

		String sql="insert into t_dcwjxx(uid,WJID,JGQC,GKGLBM,TXDZ,SZDY,WZ,DZYX,"
				+ "FRDB,YZBM,LXR,GDDH,YDDH,CZ,JGSX,JGJJ,JSXQMC,XQSX1,XQSX2,JSXQGS,"
				+ "GJZ,NTRZJZE,JSXQJJFS,HZYXDW,KJHDLX,XKFL,XQJSSSLY,XQJSYYHY,"
				+ "date) values('"+
		xxbean.getUid()+"','"+
		xxbean.getWJID()+"','"+
		xxbean.getJGQC()+"','"+
		xxbean.getGKGLBM()+"','"+
		xxbean.getTXDZ()+"','"+
		xxbean.getSZDY()+"','"+
		xxbean.getWZ()+"','"+
		xxbean.getDZYX()+"','"+
		
		xxbean.getFRDB()+"','"+
		xxbean.getYZBM()+"','"+
		xxbean.getLXR()+"','"+
		xxbean.getGDDH()+"','"+
		xxbean.getYDDH()+"','"+
		xxbean.getCZ()+"','"+
		xxbean.getJGSX()+"','"+
		xxbean.getJGJJ()+"','"+
		xxbean.getJSXQMC()+"','"+
		xxbean.getXQSX1()+"','"+
		xxbean.getXQSX2()+"','"+
		xxbean.getJSXQGS()+"','"+
		
		xxbean.getGJZ()+"','"+
		xxbean.getNTRZJZE()+"','"+
		xxbean.getJSXQJJFS()+"','"+
		xxbean.getHZYXDW()+"','"+
		xxbean.getKJHDLX()+"','"+
		xxbean.getXKFL()+"','"+
		xxbean.getXQJSSSLY()+"','"+
		xxbean.getXQJSYYHY()+"','"+
		xxbean.getDate()+"')";
		
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			int a=state.executeUpdate(sql);
			if(a==1){
			 flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(state, conn);
		}
		
		return flag;
	}
	

	//审核浏览 ----所有需求
	public List<T_DCWJXX> all(){
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
		T_DCWJXX xx1=null;
		
		String sql="select * from t_dcwjxx";
		
		conn=DBUtil.getConn();
		try {
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			while(rs.next()){
				xx1= new  T_DCWJXX();
				xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
						rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
						rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
						rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
						rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
						rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
						rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
				xx.add(xx1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, state, conn);
		}
		
		
		return xx;
		
	}
	
	//需求浏览 ----自己uid对应的需求
		public List<T_DCWJXX> allx(int uid){
			Connection conn=null;
			Statement state=null;
			ResultSet rs=null;
			List<T_DCWJXX> xx=new ArrayList<T_DCWJXX>();
			T_DCWJXX xx1=null;
			
			String sql="select * from t_dcwjxx where uid='"+uid+"'";
			
			conn=DBUtil.getConn();
			try {
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				while(rs.next()){
					xx1= new  T_DCWJXX();
					xx1.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
							rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
							rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
							rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
							rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
							rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
							rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
					xx.add(xx1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				DBUtil.close(rs, state, conn);
			}
			
			
			return xx;
			
		}
		
		
		
}
