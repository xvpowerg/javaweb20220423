package tw.com.web.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Count {
	public static final  String COUNT_KEY = "count";
	public static void setCount(
			HttpServletRequest req,int count) {
	HttpSession session = req.getSession();
	session.setAttribute(COUNT_KEY, count);
	}
	public static int getCount(HttpServletRequest req) {
		HttpSession session = req.getSession();
		Object object =  session.getAttribute(COUNT_KEY);
		if (object == null) {
			return 0;
		}
	   return (Integer) object;
	}
	
	public static int addAndUpdateToSession(
			HttpServletRequest req,int addV) {
		int count = getCount(req);
		count += addV;
		setCount(req,count);
		return count;
	}
}
