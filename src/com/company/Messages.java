package com.company;
import java.util.Date;
import java.util.ArrayList;

/**
 * Created by ss683 on 1/30/17.
 */

public class Messages {

    public Messages(String n, String n2, String m, Date d)
    {
        phoneNumber = n;
        otherPhoneNumber = n2;
        message = m;
        date = d;
    }

    public String[] MessageMaker()
    {
        String messageDetails = "From: " +phoneNumber + " To: " + otherPhoneNumber + " Message: " + message + " Sent on: " + date;
        MessageList myMessageList = new MessageList(messageDetails, size);
        String[] diego = myMessageList.getMessageList();
        return diego;
    }


    public String phoneNumber = "";
    public String otherPhoneNumber = "";
    public String message = "";
    public Date date;
    public int size;
}
