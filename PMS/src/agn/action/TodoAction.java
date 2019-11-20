package agn.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import agn.model.Card;
import agn.service.AlarmService;

public class TodoAction implements AlarmAction {

	@Override
	public AlarmActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AlarmActionForward forward = new AlarmActionForward();
		AlarmService service = AlarmService.getInstance();
		
		List<Card> list = service.todoAlarmService();
		
		request.setAttribute("list", list);
		
		forward.setPath("/alarm.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
