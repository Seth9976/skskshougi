package org.cocos2dx.lib;

public class Cocos2dxLuaJavaBridge {
    public static native int callLuaFunctionWithString(int arg0, String arg1) {
    }

    public static native int callLuaGlobalFunctionWithString(String arg0, String arg1) {
    }

    public static native int releaseLuaFunction(int arg0) {
    }

    public static native int retainLuaFunction(int arg0) {
    }
}

