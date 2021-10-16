package com.example.attestationlibs;

import android.content.Context;
import android.util.Log;

import com.fingerprintjs.android.fingerprint.Configuration;
import com.fingerprintjs.android.fingerprint.FingerprintResult;
import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.FingerprinterFactory;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

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
    public void finger(Context context) {
        Fingerprinter fingerprinter = FingerprinterFactory
               .getInstance(context, new Configuration(3));

        fingerprinter.getFingerprint(StabilityLevel.OPTIMAL, new Function1<FingerprintResult, Unit>() {
            @Override
            public Unit invoke(FingerprintResult fingerprintResult) {
                String fingerprint = fingerprintResult.getFingerprint();
                Log.d("libs", "FINGERPRINT ID FROM LIBS => " +fingerprint);
                return null;
            }
        });
    }
}
