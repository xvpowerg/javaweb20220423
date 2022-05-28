package tw.com.listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MyHttpSessionAttListener implements HttpSessionAttributeListener {
		@Override
		public void attributeAdded(HttpSessionBindingEvent event) {
			// TODO Auto-generated method stub
			String name = event.getName();
			String value = event.getValue().toString();
			System.out.println("Added:"+name+":"+value+":"+new Date());
		}
		
		@Override
		public void attributeRemoved(HttpSessionBindingEvent event) {
			String name = event.getName();
			String value = event.getValue().toString();
			System.out.println("Removed:"+name+":"+value);
			
		}
}
