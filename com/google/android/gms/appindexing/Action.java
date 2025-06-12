package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;

public final class Action extends Thing {
    public static final class Builder extends com.google.android.gms.appindexing.Thing.Builder {
        public Builder(String actionType) {
            zzu.zzu(actionType);
            super.put("type", actionType);
        }

        public Action build() {
            zzu.zzb(this.zzNW.get("object"), "setObject is required before calling build().");
            zzu.zzb(this.zzNW.get("type"), "setType is required before calling build().");
            Bundle bundle0 = (Bundle)this.zzNW.getParcelable("object");
            zzu.zzb(bundle0.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            zzu.zzb(bundle0.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            return new Action(this.zzNW, null);
        }

        @Override  // com.google.android.gms.appindexing.Thing$Builder
        public Thing build() {
            return this.build();
        }

        public Builder put(String key, Thing value) {
            return (Builder)super.put(key, value);
        }

        public Builder put(String key, String value) {
            return (Builder)super.put(key, value);
        }

        @Override  // com.google.android.gms.appindexing.Thing$Builder
        public com.google.android.gms.appindexing.Thing.Builder put(String x0, Thing x1) {
            return this.put(x0, x1);
        }

        @Override  // com.google.android.gms.appindexing.Thing$Builder
        public com.google.android.gms.appindexing.Thing.Builder put(String x0, String x1) {
            return this.put(x0, x1);
        }

        public Builder setActionStatus(String actionStatusType) {
            zzu.zzu(actionStatusType);
            return (Builder)super.put("actionStatus", actionStatusType);
        }

        public Builder setName(String name) {
            return (Builder)super.put("name", name);
        }

        @Override  // com.google.android.gms.appindexing.Thing$Builder
        public com.google.android.gms.appindexing.Thing.Builder setName(String x0) {
            return this.setName(x0);
        }

        public Builder setObject(Thing thing) {
            zzu.zzu(thing);
            return (Builder)super.put("object", thing);
        }

        public Builder setUrl(Uri url) {
            if(url != null) {
                super.put("url", url.toString());
            }
            return this;
        }

        @Override  // com.google.android.gms.appindexing.Thing$Builder
        public com.google.android.gms.appindexing.Thing.Builder setUrl(Uri x0) {
            return this.setUrl(x0);
        }
    }

    public static final String STATUS_TYPE_ACTIVE = "http://schema.org/ActiveActionStatus";
    public static final String STATUS_TYPE_COMPLETED = "http://schema.org/CompletedActionStatus";
    public static final String STATUS_TYPE_FAILED = "http://schema.org/FailedActionStatus";
    public static final String TYPE_ACTIVATE = "http://schema.org/ActivateAction";
    public static final String TYPE_ADD = "http://schema.org/AddAction";
    public static final String TYPE_BOOKMARK = "http://schema.org/BookmarkAction";
    public static final String TYPE_COMMUNICATE = "http://schema.org/CommunicateAction";
    public static final String TYPE_FILM = "http://schema.org/FilmAction";
    public static final String TYPE_LIKE = "http://schema.org/LikeAction";
    public static final String TYPE_LISTEN = "http://schema.org/ListenAction";
    public static final String TYPE_PHOTOGRAPH = "http://schema.org/PhotographAction";
    public static final String TYPE_RESERVE = "http://schema.org/ReserveAction";
    public static final String TYPE_SEARCH = "http://schema.org/SearchAction";
    public static final String TYPE_VIEW = "http://schema.org/ViewAction";
    public static final String TYPE_WANT = "http://schema.org/WantAction";
    public static final String TYPE_WATCH = "http://schema.org/WatchAction";

    private Action(Bundle propertyBundle) {
        super(propertyBundle);
    }

    Action(Bundle x0, com.google.android.gms.appindexing.Action.1 x1) {
        this(x0);
    }

    public static Action newAction(String actionType, String objectName, Uri objectAppUri) {
        return Action.newAction(actionType, objectName, null, objectAppUri);
    }

    public static Action newAction(String actionType, String objectName, Uri objectId, Uri objectAppUri) {
        Builder action$Builder0 = new Builder(actionType);
        com.google.android.gms.appindexing.Thing.Builder thing$Builder0 = new com.google.android.gms.appindexing.Thing.Builder().setName(objectName);
        return objectId == null ? action$Builder0.setObject(thing$Builder0.setId(null).setUrl(objectAppUri).build()).build() : action$Builder0.setObject(thing$Builder0.setId(objectId.toString()).setUrl(objectAppUri).build()).build();
    }

    class com.google.android.gms.appindexing.Action.1 {
    }

}

