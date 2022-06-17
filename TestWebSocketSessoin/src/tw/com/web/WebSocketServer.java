package tw.com.web;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class WebSocketServer {
	@OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {
	    session.getBasicRemote().sendText("收到訊息了: 「" + message + "」");

        int sendMessages = 0;
        while (sendMessages < 10) {
            Thread.sleep(500);
            sendMessages++;
            session.getBasicRemote().sendText(
                    "Servelt Send msg:" + sendMessages + " 筆訊息"
            );
        }
        session.getBasicRemote().sendText("送完啦！");
    }
  }

