package com.ndh.mfa;

public class HolderSecurity {
    private HolderSecurity() {

    };

    private static MfaAuthentication mfa = null;

    // public static HolderSecurity getInstance = new HolderSecurity();

    public static void setData(MfaAuthentication ma) {
        mfa = ma;
    }

    public static MfaAuthentication getData() {
        return mfa;
    }
}
