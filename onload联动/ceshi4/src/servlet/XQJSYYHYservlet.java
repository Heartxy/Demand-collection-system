package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import bean.XQJSYYHY1;
import bean.XQJSYYHY2;
import bean.XQJSYYHY3;
import dao.XQJSYYHYdao;
import util.StringUtil;

/**
 * Servlet implementation class XQJSYYHYservlet
 */
@WebServlet("/servlet/XQJSYYHYservlet")
public class XQJSYYHYservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XQJSYYHYservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if("preType".equals(method)){
			preType(req,resp);			//XQJSYYHY----一级菜单
		}else if("Type2".equals(method)){
			Type2(req,resp);
		}else if("Type3".equals(method)){
			Type3(req,resp);
		}
	}

	//XQJSYYHY应用行业----一级菜单
	private void preType(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		XQJSYYHYdao xqdao = new XQJSYYHYdao();
		List<XQJSYYHY1> XQJSYYHY1 = xqdao.getTypeList1();//获得一级菜单
		
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(JSON.toJSONString(XQJSYYHY1));
		out.flush();
		out.close();
	}
	
	//XQJSYYHY应用行业----二级菜单
		private void Type2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			int T1id=StringUtil.StringToInt(req.getParameter("T1id"));
			XQJSYYHYdao xqdao = new XQJSYYHYdao();
			List<XQJSYYHY2> XQJSYYHY2 = xqdao.getTypeList2(T1id);//获得一级菜单
			resp.setCharacterEncoding("utf-8");
			PrintWriter out = resp.getWriter();
			out.print(JSON.toJSONString(XQJSYYHY2));
			out.flush();
			out.close();
		}
		
		//XQJSYYHY应用行业----三级菜单
		private void Type3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			int T2id=StringUtil.StringToInt(req.getParameter("T2id"));
			XQJSYYHYdao xqdao = new XQJSYYHYdao();
			List<XQJSYYHY3> XQJSYYHY3 = xqdao.getTypeList3(T2id);//获得一级菜单
			
			resp.setCharacterEncoding("utf-8");
			PrintWriter out = resp.getWriter();
			out.print(JSON.toJSONString(XQJSYYHY3));
			out.flush();
			out.close();
		}
}
