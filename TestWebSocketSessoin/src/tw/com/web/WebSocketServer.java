package tw.com.web;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class WebSocketServer {
	@OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {
	    session.getBasicRemote().sendText("����T���F: �u" + message + "�v");

        int sendMessages = 0;
        while (sendMessages < 10) {
            Thread.sleep(500);
            sendMessages++;
            session.getBasicRemote().sendText(
                    "Servelt Send msg:" + sendMessages + " ���T��"
            );
        }
        session.getBasicRemote().sendText("�e���աI");
    }
  }

