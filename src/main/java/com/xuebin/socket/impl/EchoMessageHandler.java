package com.xuebin.socket.impl;

import com.xuebin.socket.DefaultEchoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @Date: 2022/9/10 13:33
 * @Author: xuebin.yang
 */
public class EchoMessageHandler extends TextWebSocketHandler {

    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(EchoMessageHandler.class);

    private final DefaultEchoService defaultEchoService;
    
    public EchoMessageHandler(DefaultEchoService defaultEchoService) {
        this.defaultEchoService = defaultEchoService;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println(session.getRemoteAddress() + "已经链接到服务器");
        LOGGER.info(session.getRemoteAddress() + "已经链接到服务器");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        session.close(CloseStatus.SERVER_ERROR);


    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String formatMessage = defaultEchoService.getFormatMessage(message.getPayload());
        session.sendMessage(new TextMessage(formatMessage));

    }
}
