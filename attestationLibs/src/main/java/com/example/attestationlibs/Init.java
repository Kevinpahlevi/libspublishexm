package com.example.attestationlibs;

import android.util.Log;

public class Init {
    public void talk() {
        System.out.print("THIS FROM PUBLISH LIBRARY");
    }
    public void testlog() {
        Log.i("libs", "testlog: THIS FROM LIBS");
    }
    public String word() {
        return "RETURN STRING";
    }
}
