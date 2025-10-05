package org.lionhead.day01;

import org.lionhead.day01.enums.UserLevel;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, String> map = new HashMap<>();

    public UserLevel getUserLevelBy(){
        String uidByThread = getUidByThread();
        // Normal Gold Silver
        return UserLevel.NORMAL;
    }

    public String getUidByThread() {
        return "test_uid";
    }

    public void setUidByThread(String uidByThread) {
        // map.put(Thread.currentThread().getName(), uidByThread);
        map.put("uid", uidByThread);
    }

}
