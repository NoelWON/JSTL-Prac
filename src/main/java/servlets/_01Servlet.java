package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 값
		
		int iVal = 10;
		long lVal = 101;
		float fVal = 3.14f;
		boolean bVal = false;
		String sVal = "hello";
		
		request.setAttribute("iVal",iVal);
		request.setAttribute("lVal",lVal);
		request.setAttribute("fVal",fVal);
		request.setAttribute("bVal",bVal);
		request.setAttribute("sVal",sVal);
		
		// 값을 가지고 있는 객체
		UserVo vo = new UserVo();
		vo.setNo(1L);
		vo.setName("둘리");
		
		request.setAttribute("vo", vo);
		// null 객체일 경우
		Object obj = null;
		request.setAttribute("obj", obj);
		
		// Map 객체 key value 를 가지는 자료구조
		Map<String,Object> map = new HashMap<>();
		map.put("iVal", iVal);
		map.put("lVal", lVal);
		map.put("fVal", fVal);
		
		request.setAttribute("map", map);
		
		
		
		request.getRequestDispatcher("/WEB-INF/views/01.jsp")
		.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
