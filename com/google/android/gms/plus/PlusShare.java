package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.List;

public final class PlusShare {
    public static class Builder {
        private final Context mContext;
        private final Intent mIntent;
        private boolean zzaHj;
        private ArrayList zzaHk;

        public Builder(Activity launchingActivity) {
            this.mContext = launchingActivity;
            this.mIntent = new Intent().setAction("android.intent.action.SEND");
            this.mIntent.addFlags(0x80000);
            if(launchingActivity != null && launchingActivity.getComponentName() != null) {
                this.zzaHj = true;
            }
        }

        public Builder(Context context) {
            this.mContext = context;
            this.mIntent = new Intent().setAction("android.intent.action.SEND");
        }

        public Builder addCallToAction(String label, Uri uri, String deepLinkId) {
            zzu.zza(this.zzaHj, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
            zzu.zzb(uri != null && !TextUtils.isEmpty(uri.toString()), "Must provide a call to action URL");
            Bundle bundle0 = new Bundle();
            if(!TextUtils.isEmpty(label)) {
                bundle0.putString("label", label);
            }
            bundle0.putString("url", uri.toString());
            if(!TextUtils.isEmpty(deepLinkId)) {
                zzu.zza(PlusShare.zzdU(deepLinkId), "The specified deep-link ID was malformed.");
                bundle0.putString("deepLinkId", deepLinkId);
            }
            this.mIntent.putExtra("com.google.android.apps.plus.CALL_TO_ACTION", bundle0);
            this.mIntent.putExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", true);
            this.mIntent.setType("text/plain");
            return this;
        }

        public Builder addStream(Uri streamUri) {
            Uri uri1 = (Uri)this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            if(uri1 == null) {
                return this.setStream(streamUri);
            }
            if(this.zzaHk == null) {
                this.zzaHk = new ArrayList();
            }
            this.zzaHk.add(uri1);
            this.zzaHk.add(streamUri);
            return this;
        }

        public Intent getIntent() {
            boolean z = true;
            boolean z1 = this.zzaHk != null && this.zzaHk.size() > 1;
            boolean z2 = "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
            boolean z3 = this.mIntent.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
            zzu.zza(!z1 || !z3, "Call-to-action buttons are only available for URLs.");
            zzu.zza(!z3 || this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL"), "The content URL is required for interactive posts.");
            if(z3 && !this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL") && !this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) {
                z = false;
            }
            zzu.zza(z, "Must set content URL or content deep-link ID to use a call-to-action button.");
            if(this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) {
                zzu.zza(PlusShare.zzdU(this.mIntent.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")), "The specified deep-link ID was malformed.");
            }
            if(!z1 && z2) {
                this.mIntent.setAction("android.intent.action.SEND");
                if(this.zzaHk == null || this.zzaHk.isEmpty()) {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                }
                else {
                    Parcelable parcelable0 = (Parcelable)this.zzaHk.get(0);
                    this.mIntent.putExtra("android.intent.extra.STREAM", parcelable0);
                }
                this.zzaHk = null;
            }
            if(z1 && !z2) {
                this.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
                if(this.zzaHk == null || this.zzaHk.isEmpty()) {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                }
                else {
                    this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.zzaHk);
                }
            }
            if("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(this.mIntent.getAction())) {
                this.mIntent.setPackage("com.google.android.gms");
                return this.mIntent;
            }
            if(!this.mIntent.hasExtra("android.intent.extra.STREAM")) {
                this.mIntent.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
                this.mIntent.setPackage("com.google.android.gms");
                return this.mIntent;
            }
            this.mIntent.setPackage("com.google.android.apps.plus");
            return this.mIntent;
        }

        public Builder setContentDeepLinkId(String deepLinkId) {
            return this.setContentDeepLinkId(deepLinkId, null, null, null);
        }

        public Builder setContentDeepLinkId(String deepLinkId, String title, String description, Uri thumbnailUri) {
            zzu.zzb(this.zzaHj, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
            zzu.zzb(!TextUtils.isEmpty(deepLinkId), "The deepLinkId parameter is required.");
            Bundle bundle0 = PlusShare.zza(title, description, thumbnailUri);
            this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", deepLinkId);
            this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", bundle0);
            this.mIntent.setType("text/plain");
            return this;
        }

        public Builder setContentUrl(Uri uri) {
            String s = uri == null ? null : uri.toString();
            if(TextUtils.isEmpty(s)) {
                this.mIntent.removeExtra("com.google.android.apps.plus.CONTENT_URL");
                return this;
            }
            this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_URL", s);
            return this;
        }

        public Builder setRecipients(Person user, List list0) {
            String s = user == null ? "0" : user.getId();
            this.mIntent.putExtra("com.google.android.apps.plus.SENDER_ID", s);
            int v = list0 == null ? 0 : list0.size();
            if(v == 0) {
                this.mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_IDS");
                this.mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES");
                return this;
            }
            ArrayList arrayList0 = new ArrayList(v);
            ArrayList arrayList1 = new ArrayList(v);
            for(Object object0: list0) {
                arrayList0.add(((Person)object0).getId());
                arrayList1.add(((Person)object0).getDisplayName());
            }
            this.mIntent.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS", arrayList0);
            this.mIntent.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES", arrayList1);
            return this;
        }

        public Builder setStream(Uri streamUri) {
            this.zzaHk = null;
            this.mIntent.putExtra("android.intent.extra.STREAM", streamUri);
            return this;
        }

        public Builder setText(CharSequence text) {
            this.mIntent.putExtra("android.intent.extra.TEXT", text);
            return this;
        }

        public Builder setType(String mimeType) {
            this.mIntent.setType(mimeType);
            return this;
        }
    }

    public static final String EXTRA_CALL_TO_ACTION = "com.google.android.apps.plus.CALL_TO_ACTION";
    public static final String EXTRA_CONTENT_DEEP_LINK_ID = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
    public static final String EXTRA_CONTENT_DEEP_LINK_METADATA = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
    public static final String EXTRA_CONTENT_URL = "com.google.android.apps.plus.CONTENT_URL";
    public static final String EXTRA_IS_INTERACTIVE_POST = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
    public static final String EXTRA_SENDER_ID = "com.google.android.apps.plus.SENDER_ID";
    public static final String KEY_CALL_TO_ACTION_DEEP_LINK_ID = "deepLinkId";
    public static final String KEY_CALL_TO_ACTION_LABEL = "label";
    public static final String KEY_CALL_TO_ACTION_URL = "url";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION = "description";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL = "thumbnailUrl";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_TITLE = "title";
    public static final String PARAM_CONTENT_DEEP_LINK_ID = "deep_link_id";

    @Deprecated
    protected PlusShare() {
        throw new AssertionError();
    }

    public static Person createPerson(String id, String displayName) {
        if(TextUtils.isEmpty(id)) {
            throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
        }
        if(TextUtils.isEmpty(displayName)) {
            throw new IllegalArgumentException("Display name must not be empty.");
        }
        return new PersonEntity(displayName, id, null, 0, null);
    }

    public static String getDeepLinkId(Intent intent) {
        return intent == null || intent.getData() == null ? null : intent.getData().getQueryParameter("deep_link_id");
    }

    public static Bundle zza(String s, String s1, Uri uri0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("title", s);
        bundle0.putString("description", s1);
        if(uri0 != null) {
            bundle0.putString("thumbnailUrl", uri0.toString());
        }
        return bundle0;
    }

    protected static boolean zzdU(String s) {
        if(TextUtils.isEmpty(s)) {
            Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
            return false;
        }
        if(s.contains(" ")) {
            Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
            return false;
        }
        return true;
    }
}

