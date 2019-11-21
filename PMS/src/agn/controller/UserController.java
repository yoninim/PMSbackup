package agn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agn.action.Action;
import agn.action.ActionForward;
import agn.action.LoginAction;
import agn.action.LoginFormAction;
import agn.action.UserInsertAction;
import agn.action.UserInsertFormAction;

@WebServlet("/user/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
        super();
    }
	
	 public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
	    	String path = request.getPathInfo().substring(1);
	    	System.out.println(path);
	    	Action action = null;
	    	ActionForward forward = null;
	    	
	    	if(path.equals("userinsertForm.do")) {
	    		action = new UserInsertFormAction();
	    		
	    		try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		
	    	}else if(path.equals("user_join.do")) {
	    		action = new UserInsertAction();
	    		try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}else if(path.equals("login.do")) {
	    		action = new LoginFormAction();
	    		
	    		try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}else if(path.equals("user_login.do")) {
	    		action = new LoginAction();
	    		
	    		try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}
	    	
	    	
			if (forward != null) {
				if (forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				} else {
					RequestDispatcher rd = request.getRequestDispatcher(forward.getPath());
					rd.forward(request, response);
				}

			}
	    	
	    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
