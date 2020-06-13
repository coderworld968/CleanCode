package com.coderworld968.clean.code;

import com.coderworld968.Event;
import com.coderworld968.WeChatSender;

public class WeChatAlertAction implements AlertAction {
    private WeChatSender weChatSender;

    public WeChatAlertAction(WeChatSender weChatSender) {
        this.weChatSender = weChatSender;
    }

    @Override
    public String actionType() {
        return "wechat";
    }

    @Override
    public void process(Event event) {
        // do something
    }
}
