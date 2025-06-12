package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.zzu;

public class SupportErrorDialogFragment extends DialogFragment {
    private Dialog mDialog;
    private DialogInterface.OnCancelListener zzVH;

    public SupportErrorDialogFragment() {
        this.mDialog = null;
        this.zzVH = null;
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog) {
        return SupportErrorDialogFragment.newInstance(dialog, null);
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener cancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment0 = new SupportErrorDialogFragment();
        Dialog dialog1 = (Dialog)zzu.zzb(dialog, "Cannot display null dialog");
        dialog1.setOnCancelListener(null);
        dialog1.setOnDismissListener(null);
        supportErrorDialogFragment0.mDialog = dialog1;
        if(cancelListener != null) {
            supportErrorDialogFragment0.zzVH = cancelListener;
        }
        return supportErrorDialogFragment0;
    }

    public void onCancel(DialogInterface dialog) {
        if(this.zzVH != null) {
            this.zzVH.onCancel(dialog);
        }
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if(this.mDialog == null) {
            this.setShowsDialog(false);
        }
        return this.mDialog;
    }

    public void show(FragmentManager manager, String tag) {
        super.show(manager, tag);
    }
}

