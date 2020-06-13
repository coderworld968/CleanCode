package com.coderworld968.clean.code;

import com.coderworld968.EmailSender;
import com.coderworld968.Event;
import com.coderworld968.WeChatSender;
import java.util.ArrayList;
import java.util.List;

public class AlertSystem {

    private List<AlertAction> alertList;

    public AlertSystem(List<AlertAction> alertList) {
        this.alertList = alertList;
    }

    public void process(String type, Event event) {
        alertList.forEach(alertAction -> {
            if (alertAction.actionType().equals(type)) {
                alertAction.process(event);
            }
        });
    }

    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        AlertAction emailAlert = new EmailAlertAction(emailSender);
        WeChatSender weChatSender = new WeChatSender();
        AlertAction weChatAlert = new WeChatAlertAction(weChatSender);
        List<AlertAction> alertList = new ArrayList<AlertAction>();
        alertList.add(emailAlert);
        alertList.add(weChatAlert);

        AlertSystem system = new AlertSystem(alertList);
        String type = "";
        Event event = new Event();
        system.process(type, event);
    }

}
