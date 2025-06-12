package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;

public class Thing {
    public static class Builder {
        final Bundle zzNW;

        public Builder() {
            this.zzNW = new Bundle();
        }

        public Thing build() {
            return new Thing(this.zzNW);
        }

        public Builder put(String key, Thing value) {
            zzu.zzu(key);
            if(value != null) {
                this.zzNW.putParcelable(key, value.zzNV);
            }
            return this;
        }

        public Builder put(String key, String value) {
            zzu.zzu(key);
            if(value != null) {
                this.zzNW.putString(key, value);
            }
            return this;
        }

        public Builder setDescription(String description) {
            this.put("description", description);
            return this;
        }

        public Builder setId(String id) {
            if(id != null) {
                this.put("id", id);
            }
            return this;
        }

        public Builder setName(String name) {
            zzu.zzu(name);
            this.put("name", name);
            return this;
        }

        public Builder setType(String type) {
            this.put("type", type);
            return this;
        }

        public Builder setUrl(Uri url) {
            zzu.zzu(url);
            this.put("url", url.toString());
            return this;
        }
    }

    final Bundle zzNV;

    Thing(Bundle propertyBundle) {
        this.zzNV = propertyBundle;
    }

    public Bundle zzkP() {
        return this.zzNV;
    }
}

