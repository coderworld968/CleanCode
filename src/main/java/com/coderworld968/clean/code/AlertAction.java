package com.coderworld968.clean.code;


import com.coderworld968.Event;

public interface AlertAction {

    String actionType();

    void process(Event event);

}
