package agn.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AlarmAction {
	public AlarmActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
