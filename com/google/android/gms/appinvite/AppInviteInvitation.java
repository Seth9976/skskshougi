package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.zzu;

public final class AppInviteInvitation {
    public static final class IntentBuilder {
        public static final int MAX_MESSAGE_LENGTH = 100;
        public static final int PROJECT_PLATFORM_IOS = 1;
        private final Intent mIntent;

        public IntentBuilder(CharSequence title) {
            zzu.zzu(title);
            this.mIntent = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");
            this.mIntent.putExtra("com.google.android.gms.appinvite.TITLE", title);
            this.mIntent.setPackage("com.google.android.gms");
        }

        public Intent build() {
            return this.mIntent;
        }

        public IntentBuilder setAccount(Account account) {
            if(account != null && "com.google".equals(account.type)) {
                this.mIntent.putExtra("com.google.android.gms.appinvite.ACCOUNT_NAME", account);
                return this;
            }
            this.mIntent.removeExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
            return this;
        }

        public IntentBuilder setDeepLink(Uri deepLink) {
            if(deepLink != null) {
                this.mIntent.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", deepLink);
                return this;
            }
            this.mIntent.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
            return this;
        }

        public IntentBuilder setGoogleAnalyticsTrackingId(String trackingId) {
            this.mIntent.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", trackingId);
            return this;
        }

        public IntentBuilder setMessage(CharSequence message) {
            if(message != null && message.length() > 100) {
                throw new IllegalArgumentException("Message must be 100 chars or less.");
            }
            this.mIntent.putExtra("com.google.android.gms.appinvite.MESSAGE", message);
            return this;
        }

        public IntentBuilder setOtherPlatformsTargetApplication(int targetPlatform, String clientId) {
            if(targetPlatform == 1) {
                this.mIntent.putExtra("com.google.android.gms.appinvite.iosTargetApplication", clientId);
            }
            return this;
        }
    }

    public static String[] getInvitationIds(int resultCode, Intent result) {
        return resultCode == -1 ? result.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS") : null;
    }
}

