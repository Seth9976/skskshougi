package org.cocos2dx.lib;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public class Cocos2dxHandler extends Handler {
    public static class DialogMessage {
        public String message;
        public String titile;

        public DialogMessage(String title, String message) {
            this.titile = title;
            this.message = message;
        }
    }

    public static final int HANDLER_SHOW_DIALOG = 1;
    private WeakReference mActivity;

    public Cocos2dxHandler(Cocos2dxActivity activity) {
        this.mActivity = new WeakReference(activity);
    }

    @Override  // android.os.Handler
    public void handleMessage(Message msg) {
        if(msg.what != 1) {
            return;
        }
        this.showDialog(msg);
    }

    private void showDialog(Message msg) {
        Cocos2dxActivity theActivity = (Cocos2dxActivity)this.mActivity.get();
        DialogMessage dialogMessage = (DialogMessage)msg.obj;
        new AlertDialog.Builder(theActivity).setTitle(dialogMessage.titile).setMessage(dialogMessage.message).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
            }
        }).create().show();
    }
}

