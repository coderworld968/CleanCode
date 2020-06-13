package com.coderworld968.clean.code;

import com.coderworld968.EmailSender;
import com.coderworld968.Event;

public class EmailAlertAction implements AlertAction {
    private EmailSender emailSender;

    public EmailAlertAction(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public String actionType() {
        return "email";
    }

    @Override
    public void process(Event event) {
        emailSender.sendEmail(event);
    }
}
