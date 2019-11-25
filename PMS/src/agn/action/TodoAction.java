package agn.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import agn.model.Card;
import agn.service.AlarmService;
import net.sf.json.JSONArray;

public class TodoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AlarmService service = AlarmService.getInstance();
		
		
		int unum = Integer.parseInt(request.getParameter("user_num"));
		
		List<Card> list = service.todoAlarmService(unum);
		
		request.setAttribute("list", list);
		
		forward.setPath("../pl/alarm.jsp");
		forward.setRedirect(false);
		
		
		String jsonli = JSONArray.fromObject(list).toString();
		System.out.println(jsonli);
		
		JSONArray jsonlist = new JSONArray();
		jsonlist.add(list);
		System.out.println(jsonlist);
		
		
		return forward;
	}

}
