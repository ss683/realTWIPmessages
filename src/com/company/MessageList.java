package com.company;
import java.util.ArrayList;

/**
 * Created by ss683 on 1/30/17.
 */
public class MessageList {

    public MessageList(String f, int length)
    {
        size = length;
        completeDetails = f;
        MessageList.add(0, completeDetails);

    }

    public String[] getMessageList()
    {
        String[] meList = MessageList.toArray(new String[0]);
        return meList;
    }
    ArrayList<String> MessageList = new ArrayList<String>();
    String completeDetails = " ";
    public int count;
    public StringBuffer fullList;
    public String Stringfulllist = "";
    public int size;
}
