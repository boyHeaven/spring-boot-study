package com.xuebin.socket.impl;

import com.xuebin.socket.DefaultEchoService;
import org.springframework.util.StringUtils;

/**
 * @Date: 2022/9/10 13:29
 * @Author: xuebin.yang
 */
public class DefaultEchoServiceImpl implements DefaultEchoService {

    private final String messageFormat;

    public DefaultEchoServiceImpl(String messageFormat) {
        this.messageFormat = StringUtils.hasLength(messageFormat) ? messageFormat : "%s";
    }

    @Override
    public String getFormatMessage(String message) {
        return String.format(messageFormat, message);
    }
}
