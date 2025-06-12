package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

public class Cocos2dxTypefaces {
    private static final HashMap sTypefaceCache;

    static {
        Cocos2dxTypefaces.sTypefaceCache = new HashMap();
    }

    public static Typeface get(Context context, String assetName) {
        synchronized(Cocos2dxTypefaces.class) {
            if(!Cocos2dxTypefaces.sTypefaceCache.containsKey(assetName)) {
                Typeface typeface = assetName.startsWith("/") ? Typeface.createFromFile(assetName) : Typeface.createFromAsset(context.getAssets(), assetName);
                Cocos2dxTypefaces.sTypefaceCache.put(assetName, typeface);
            }
            return (Typeface)Cocos2dxTypefaces.sTypefaceCache.get(assetName);
        }
    }
}

