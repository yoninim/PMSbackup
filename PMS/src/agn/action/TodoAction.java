package agn.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import agn.model.Card;
import agn.model.Users;
import agn.service.AlarmService;

public class TodoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AlarmService service = AlarmService.getInstance();
		Users user = null;
		
		HttpSession session = request.getSession();
		user = (Users) session.getAttribute("user");
		int unum = user.getUser_num();
		
		List<Card> list = service.todoAlarmService(unum);
		
		request.setAttribute("list", list);
		
		forward.setPath("../pl/alarm.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
