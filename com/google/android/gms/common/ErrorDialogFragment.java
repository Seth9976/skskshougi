package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;

public class ErrorDialogFragment extends DialogFragment {
    private Dialog mDialog;
    private DialogInterface.OnCancelListener zzVH;

    public ErrorDialogFragment() {
        this.mDialog = null;
        this.zzVH = null;
    }

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        return ErrorDialogFragment.newInstance(dialog, null);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener cancelListener) {
        ErrorDialogFragment errorDialogFragment0 = new ErrorDialogFragment();
        Dialog dialog1 = (Dialog)zzu.zzb(dialog, "Cannot display null dialog");
        dialog1.setOnCancelListener(null);
        dialog1.setOnDismissListener(null);
        errorDialogFragment0.mDialog = dialog1;
        if(cancelListener != null) {
            errorDialogFragment0.zzVH = cancelListener;
        }
        return errorDialogFragment0;
    }

    @Override  // android.app.DialogFragment
    public void onCancel(DialogInterface dialog) {
        if(this.zzVH != null) {
            this.zzVH.onCancel(dialog);
        }
    }

    @Override  // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if(this.mDialog == null) {
            this.setShowsDialog(false);
        }
        return this.mDialog;
    }

    @Override  // android.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        super.show(manager, tag);
    }
}

