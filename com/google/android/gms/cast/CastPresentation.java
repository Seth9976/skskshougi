package com.google.android.gms.cast;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

public abstract class CastPresentation extends Presentation {
    public CastPresentation(Context serviceContext, Display display) {
        super(serviceContext, display);
        this.zzlf();
    }

    public CastPresentation(Context serviceContext, Display display, int theme) {
        super(serviceContext, display, theme);
        this.zzlf();
    }

    private void zzlf() {
        Window window0 = this.getWindow();
        if(window0 != null) {
            window0.setType(2030);
            window0.addFlags(0x10000000);
            window0.addFlags(0x1000000);
            window0.addFlags(0x400);
        }
    }
}

