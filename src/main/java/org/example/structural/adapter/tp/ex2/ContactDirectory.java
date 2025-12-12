package org.example.structural.adapter.tp.ex2;

import java.util.HashMap;
import java.util.Map;

public class ContactDirectory {
    private Map<String, String> map = new HashMap<>();

    public ContactDirectory() {
        map.put("0300000001", "a@a.com" );
        map.put("0300000002", "b@a.com");
    }

    public String getEmail(String phoneNumber ) {
        return map.get(phoneNumber);
    }


}
