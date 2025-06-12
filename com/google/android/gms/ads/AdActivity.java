package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzex;

public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzex zznG;

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(this.zznG != null) {
            try {
                this.zznG.onBackPressed();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onBackPressed to ad overlay:", remoteException0);
            }
        }
        super.onBackPressed();
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.zznG = zzew.zzb(this);
        if(this.zznG == null) {
            zzb.zzaC("Could not create ad overlay.");
            this.finish();
            return;
        }
        try {
            this.zznG.onCreate(savedInstanceState);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward onCreate to ad overlay:", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        if(this.zznG != null) {
            try {
                this.zznG.onDestroy();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onDestroy to ad overlay:", remoteException0);
            }
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    protected void onPause() {
        if(this.zznG != null) {
            try {
                this.zznG.onPause();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onPause to ad overlay:", remoteException0);
                this.finish();
            }
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        try {
            if(this.zznG != null) {
                this.zznG.onRestart();
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward onRestart to ad overlay:", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if(this.zznG != null) {
                this.zznG.onResume();
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward onResume to ad overlay:", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        if(this.zznG != null) {
            try {
                this.zznG.onSaveInstanceState(outState);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onSaveInstanceState to ad overlay:", remoteException0);
                this.finish();
            }
        }
        super.onSaveInstanceState(outState);
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            if(this.zznG != null) {
                this.zznG.onStart();
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not forward onStart to ad overlay:", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected void onStop() {
        if(this.zznG != null) {
            try {
                this.zznG.onStop();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward onStop to ad overlay:", remoteException0);
                this.finish();
            }
        }
        super.onStop();
    }

    @Override  // android.app.Activity
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        this.zzaE();
    }

    @Override  // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.zzaE();
    }

    @Override  // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        this.zzaE();
    }

    private void zzaE() {
        if(this.zznG != null) {
            try {
                this.zznG.zzaE();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not forward setContentViewSet to ad overlay:", remoteException0);
            }
        }
    }
}

