package com.coderworld968.bad.code;

import com.coderworld968.EmailSender;
import com.coderworld968.Event;
import com.coderworld968.WeChatSender;

public class AlertSystem {

    private EmailSender emailSender;
    private WeChatSender weChatSender;

    public AlertSystem() {
        this.emailSender = new EmailSender();
        this.weChatSender = new WeChatSender();
    }

    public void sendEmail(Event event) {
        // do something...
    }

    public void sendWeChat(Event event) {
        // do something...
    }

    public void process(String actionType, Event event) {
        // do something..
        if (actionType.equals("email")) {
            emailSender.sendEmail(event);
        } else if (actionType.equals("wechat")) {
            weChatSender.sendWeChat(event);
        } else {
            // do something
        }
    }

    public static void main(String[] args) {
        String actionType = "";
        Event event = new Event();
        AlertSystem system = new AlertSystem();
        system.process(actionType,event);
    }
}
