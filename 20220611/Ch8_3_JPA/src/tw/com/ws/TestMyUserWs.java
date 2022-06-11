package tw.com.ws;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@Path("myuser")
@Produces(MediaType.APPLICATION_JSON)
public class TestMyUserWs {
	@EJB
	private MyUserBeanLocal myUserBean;
	
	@POST //Post©I¥s
	public String register(@FormParam("account") String acc,
			@FormParam("password") String pwd) {
		MyUser myuser = new MyUser();	
		if (acc.isEmpty() || pwd.isEmpty()) {
			return "{\"status\":false}";
		}
		myuser.setAccount(acc);
		myuser.setPassword(pwd);
		boolean pass =  myUserBean.register(myuser);
		
		if (pass) {
			return "{\"status\":true}";
		}
			
		return "{\"status\":false}";
	}
}
