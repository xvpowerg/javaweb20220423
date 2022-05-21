package tw.com.web.http;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebTools {
	private static final Map<String,MyHttpSession> myHttpSessionMap 
						= new HashMap<>();	
	public static final String MY_HTTP_SESSION_ID = "My_HTTP_SESSION_ID";
		
	public static MyHttpSession getMyHttpSession(HttpServletRequest req,
			HttpServletResponse resp,boolean create) {		
	Cookie[] cookies = 	req.getCookies();
	String mySessionId = "";
	if (cookies != null) {
		Stream<Cookie> cookStream  = Stream.of(cookies);
		
		Optional<Cookie> opCookie =  cookStream.filter(c->c.getName().
				equals(MY_HTTP_SESSION_ID)).findFirst();
		
			if (opCookie.isPresent()) {
				mySessionId = opCookie.get().getValue();
			}
		
	}
	
	if (mySessionId.isEmpty() && create==false) {
		return null;		
	}
	
	MyHttpSession session = null;
		if (mySessionId.isEmpty() || 
		   !myHttpSessionMap.containsKey(mySessionId)||
		    myHttpSessionMap.get(mySessionId) == null) {
			
			mySessionId =Integer.toHexString(ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE)) ;
			Cookie sessidCook = new Cookie(MY_HTTP_SESSION_ID,mySessionId);
			resp.addCookie(sessidCook);
			
			session = new MyHttpSession();
			myHttpSessionMap.put(mySessionId, session);
		}else {
			session =myHttpSessionMap.get(mySessionId); 
		}

		return session;	
	}
	
	public static MyHttpSession getMyHttpSession(HttpServletRequest req,
			HttpServletResponse resp) {
		return getMyHttpSession( req,resp,true);
	}
}
