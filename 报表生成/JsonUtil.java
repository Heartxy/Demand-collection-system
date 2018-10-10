package xhj.wdc.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class JsonUtil {
	// 唯一的一个printWriter
	private static PrintWriter out = null;

	private JsonUtil() {
	}

	// 把输入的列表转换成json字符串输出
	public static void list2jsonString(List list, HttpServletResponse resp) {
		if (list == null)
			System.out.println("null");
		else {
			try {
				out = resp.getWriter();
				String jsonString = JSON.toJSONString(list);
				out.print(jsonString); // 转换成JSON字符串然后用print输出
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}