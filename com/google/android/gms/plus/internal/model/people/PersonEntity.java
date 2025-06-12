package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PersonEntity extends FastSafeParcelableJsonResponse implements Person {
    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse implements AgeRange {
        public static final zzb CREATOR;
        final int zzCY;
        private static final HashMap zzaHP;
        final Set zzaHQ;
        int zzaJh;
        int zzaJi;

        static {
            AgeRangeEntity.CREATOR = new zzb();
            AgeRangeEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zzi("max", 2);
            AgeRangeEntity.zzaHP.put("max", fastJsonResponse$Field0);
            Field fastJsonResponse$Field1 = Field.zzi("min", 3);
            AgeRangeEntity.zzaHP.put("min", fastJsonResponse$Field1);
        }

        public AgeRangeEntity() {
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        AgeRangeEntity(Set set0, int versionCode, int max, int min) {
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzaJh = max;
            this.zzaJi = min;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: AgeRangeEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((AgeRangeEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((AgeRangeEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((AgeRangeEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$AgeRange
        public int getMax() {
            return this.zzaJh;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$AgeRange
        public int getMin() {
            return this.zzaJi;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$AgeRange
        public boolean hasMax() {
            return this.zzaHQ.contains(2);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$AgeRange
        public boolean hasMin() {
            return this.zzaHQ.contains(3);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: AgeRangeEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzb.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            switch(fastJsonResponse$Field0.zzot()) {
                case 2: {
                    return this.zzaJh;
                }
                case 3: {
                    return this.zzaJi;
                }
                default: {
                    throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                }
            }
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return AgeRangeEntity.zzaHP;
        }

        public AgeRangeEntity zzxK() [...] // Inlined contents
    }

    public static final class CoverEntity extends FastSafeParcelableJsonResponse implements Cover {
        public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse implements CoverInfo {
            public static final zzd CREATOR;
            final int zzCY;
            private static final HashMap zzaHP;
            final Set zzaHQ;
            int zzaJm;
            int zzaJn;

            static {
                CoverInfoEntity.CREATOR = new zzd();
                CoverInfoEntity.zzaHP = new HashMap();
                Field fastJsonResponse$Field0 = Field.zzi("leftImageOffset", 2);
                CoverInfoEntity.zzaHP.put("leftImageOffset", fastJsonResponse$Field0);
                Field fastJsonResponse$Field1 = Field.zzi("topImageOffset", 3);
                CoverInfoEntity.zzaHP.put("topImageOffset", fastJsonResponse$Field1);
            }

            public CoverInfoEntity() {
                this.zzCY = 1;
                this.zzaHQ = new HashSet();
            }

            CoverInfoEntity(Set set0, int versionCode, int leftImageOffset, int topImageOffset) {
                this.zzaHQ = set0;
                this.zzCY = versionCode;
                this.zzaJm = leftImageOffset;
                this.zzaJn = topImageOffset;
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                if(!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if(this == obj) {
                    return true;
                }
                for(Object object1: CoverInfoEntity.zzaHP.values()) {
                    Field fastJsonResponse$Field0 = (Field)object1;
                    if(this.zza(fastJsonResponse$Field0)) {
                        if(((CoverInfoEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((CoverInfoEntity)obj).zzb(fastJsonResponse$Field0))) {
                            continue;
                        }
                        return false;
                    }
                    if(((CoverInfoEntity)obj).zza(fastJsonResponse$Field0)) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }

            @Override  // com.google.android.gms.common.data.Freezable
            public Object freeze() {
                return this;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverInfo
            public int getLeftImageOffset() {
                return this.zzaJm;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverInfo
            public int getTopImageOffset() {
                return this.zzaJn;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverInfo
            public boolean hasLeftImageOffset() {
                return this.zzaHQ.contains(2);
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverInfo
            public boolean hasTopImageOffset() {
                return this.zzaHQ.contains(3);
            }

            @Override
            public int hashCode() {
                int v = 0;
                for(Object object0: CoverInfoEntity.zzaHP.values()) {
                    Field fastJsonResponse$Field0 = (Field)object0;
                    v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
                }
                return v;
            }

            @Override  // com.google.android.gms.common.data.Freezable
            public boolean isDataValid() {
                return true;
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(Parcel out, int flags) {
                zzd.zza(this, out, flags);
            }

            @Override  // com.google.android.gms.common.server.response.FastJsonResponse
            protected boolean zza(Field fastJsonResponse$Field0) {
                return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
            }

            @Override  // com.google.android.gms.common.server.response.FastJsonResponse
            protected Object zzb(Field fastJsonResponse$Field0) {
                switch(fastJsonResponse$Field0.zzot()) {
                    case 2: {
                        return this.zzaJm;
                    }
                    case 3: {
                        return this.zzaJn;
                    }
                    default: {
                        throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                    }
                }
            }

            @Override  // com.google.android.gms.common.server.response.FastJsonResponse
            public Map zzom() {
                return this.zzxF();
            }

            public HashMap zzxF() {
                return CoverInfoEntity.zzaHP;
            }

            public CoverInfoEntity zzxM() [...] // Inlined contents
        }

        public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse implements CoverPhoto {
            public static final zze CREATOR;
            final int zzCY;
            String zzF;
            private static final HashMap zzaHP;
            final Set zzaHQ;
            int zznM;
            int zznN;

            static {
                CoverPhotoEntity.CREATOR = new zze();
                CoverPhotoEntity.zzaHP = new HashMap();
                Field fastJsonResponse$Field0 = Field.zzi("height", 2);
                CoverPhotoEntity.zzaHP.put("height", fastJsonResponse$Field0);
                Field fastJsonResponse$Field1 = Field.zzl("url", 3);
                CoverPhotoEntity.zzaHP.put("url", fastJsonResponse$Field1);
                Field fastJsonResponse$Field2 = Field.zzi("width", 4);
                CoverPhotoEntity.zzaHP.put("width", fastJsonResponse$Field2);
            }

            public CoverPhotoEntity() {
                this.zzCY = 1;
                this.zzaHQ = new HashSet();
            }

            CoverPhotoEntity(Set set0, int versionCode, int height, String url, int width) {
                this.zzaHQ = set0;
                this.zzCY = versionCode;
                this.zznN = height;
                this.zzF = url;
                this.zznM = width;
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                if(!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if(this == obj) {
                    return true;
                }
                for(Object object1: CoverPhotoEntity.zzaHP.values()) {
                    Field fastJsonResponse$Field0 = (Field)object1;
                    if(this.zza(fastJsonResponse$Field0)) {
                        if(((CoverPhotoEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((CoverPhotoEntity)obj).zzb(fastJsonResponse$Field0))) {
                            continue;
                        }
                        return false;
                    }
                    if(((CoverPhotoEntity)obj).zza(fastJsonResponse$Field0)) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }

            @Override  // com.google.android.gms.common.data.Freezable
            public Object freeze() {
                return this;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto
            public int getHeight() {
                return this.zznN;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto
            public String getUrl() {
                return this.zzF;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto
            public int getWidth() {
                return this.zznM;
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto
            public boolean hasHeight() {
                return this.zzaHQ.contains(2);
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto
            public boolean hasUrl() {
                return this.zzaHQ.contains(3);
            }

            @Override  // com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto
            public boolean hasWidth() {
                return this.zzaHQ.contains(4);
            }

            @Override
            public int hashCode() {
                int v = 0;
                for(Object object0: CoverPhotoEntity.zzaHP.values()) {
                    Field fastJsonResponse$Field0 = (Field)object0;
                    v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
                }
                return v;
            }

            @Override  // com.google.android.gms.common.data.Freezable
            public boolean isDataValid() {
                return true;
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(Parcel out, int flags) {
                zze.zza(this, out, flags);
            }

            @Override  // com.google.android.gms.common.server.response.FastJsonResponse
            protected boolean zza(Field fastJsonResponse$Field0) {
                return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
            }

            @Override  // com.google.android.gms.common.server.response.FastJsonResponse
            protected Object zzb(Field fastJsonResponse$Field0) {
                switch(fastJsonResponse$Field0.zzot()) {
                    case 2: {
                        return this.zznN;
                    }
                    case 3: {
                        return this.zzF;
                    }
                    case 4: {
                        return this.zznM;
                    }
                    default: {
                        throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                    }
                }
            }

            @Override  // com.google.android.gms.common.server.response.FastJsonResponse
            public Map zzom() {
                return this.zzxF();
            }

            public HashMap zzxF() {
                return CoverPhotoEntity.zzaHP;
            }

            public CoverPhotoEntity zzxN() [...] // Inlined contents
        }

        public static final zzc CREATOR;
        final int zzCY;
        private static final HashMap zzaHP;
        final Set zzaHQ;
        CoverInfoEntity zzaJj;
        CoverPhotoEntity zzaJk;
        int zzaJl;

        static {
            CoverEntity.CREATOR = new zzc();
            CoverEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zza("coverInfo", 2, CoverInfoEntity.class);
            CoverEntity.zzaHP.put("coverInfo", fastJsonResponse$Field0);
            Field fastJsonResponse$Field1 = Field.zza("coverPhoto", 3, CoverPhotoEntity.class);
            CoverEntity.zzaHP.put("coverPhoto", fastJsonResponse$Field1);
            Field fastJsonResponse$Field2 = Field.zza("layout", 4, new StringToIntConverter().zzh("banner", 0), false);
            CoverEntity.zzaHP.put("layout", fastJsonResponse$Field2);
        }

        public CoverEntity() {
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        CoverEntity(Set set0, int versionCode, CoverInfoEntity coverInfo, CoverPhotoEntity coverPhoto, int layout) {
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzaJj = coverInfo;
            this.zzaJk = coverPhoto;
            this.zzaJl = layout;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof CoverEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: CoverEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((CoverEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((CoverEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((CoverEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Cover
        public CoverInfo getCoverInfo() {
            return this.zzaJj;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Cover
        public CoverPhoto getCoverPhoto() {
            return this.zzaJk;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Cover
        public int getLayout() {
            return this.zzaJl;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Cover
        public boolean hasCoverInfo() {
            return this.zzaHQ.contains(2);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Cover
        public boolean hasCoverPhoto() {
            return this.zzaHQ.contains(3);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Cover
        public boolean hasLayout() {
            return this.zzaHQ.contains(4);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: CoverEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzc.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            switch(fastJsonResponse$Field0.zzot()) {
                case 2: {
                    return this.zzaJj;
                }
                case 3: {
                    return this.zzaJk;
                }
                case 4: {
                    return this.zzaJl;
                }
                default: {
                    throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                }
            }
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return CoverEntity.zzaHP;
        }

        public CoverEntity zzxL() [...] // Inlined contents
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse implements Image {
        public static final zzf CREATOR;
        final int zzCY;
        String zzF;
        private static final HashMap zzaHP;
        final Set zzaHQ;

        static {
            ImageEntity.CREATOR = new zzf();
            ImageEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zzl("url", 2);
            ImageEntity.zzaHP.put("url", fastJsonResponse$Field0);
        }

        public ImageEntity() {
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        public ImageEntity(String url) {
            this.zzaHQ = new HashSet();
            this.zzCY = 1;
            this.zzF = url;
            this.zzaHQ.add(2);
        }

        ImageEntity(Set set0, int versionCode, String url) {
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzF = url;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof ImageEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: ImageEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((ImageEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((ImageEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((ImageEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Image
        public String getUrl() {
            return this.zzF;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Image
        public boolean hasUrl() {
            return this.zzaHQ.contains(2);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: ImageEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzf.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            if(fastJsonResponse$Field0.zzot() != 2) {
                throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
            }
            return this.zzF;
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return ImageEntity.zzaHP;
        }

        public ImageEntity zzxO() [...] // Inlined contents
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse implements Name {
        public static final zzg CREATOR;
        final int zzCY;
        private static final HashMap zzaHP;
        final Set zzaHQ;
        String zzaIo;
        String zzaIr;
        String zzaJo;
        String zzaJp;
        String zzaJq;
        String zzaJr;

        static {
            NameEntity.CREATOR = new zzg();
            NameEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zzl("familyName", 2);
            NameEntity.zzaHP.put("familyName", fastJsonResponse$Field0);
            Field fastJsonResponse$Field1 = Field.zzl("formatted", 3);
            NameEntity.zzaHP.put("formatted", fastJsonResponse$Field1);
            Field fastJsonResponse$Field2 = Field.zzl("givenName", 4);
            NameEntity.zzaHP.put("givenName", fastJsonResponse$Field2);
            Field fastJsonResponse$Field3 = Field.zzl("honorificPrefix", 5);
            NameEntity.zzaHP.put("honorificPrefix", fastJsonResponse$Field3);
            Field fastJsonResponse$Field4 = Field.zzl("honorificSuffix", 6);
            NameEntity.zzaHP.put("honorificSuffix", fastJsonResponse$Field4);
            Field fastJsonResponse$Field5 = Field.zzl("middleName", 7);
            NameEntity.zzaHP.put("middleName", fastJsonResponse$Field5);
        }

        public NameEntity() {
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        NameEntity(Set set0, int versionCode, String familyName, String formatted, String givenName, String honorificPrefix, String honorificSuffix, String middleName) {
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzaIo = familyName;
            this.zzaJo = formatted;
            this.zzaIr = givenName;
            this.zzaJp = honorificPrefix;
            this.zzaJq = honorificSuffix;
            this.zzaJr = middleName;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof NameEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: NameEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((NameEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((NameEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((NameEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public String getFamilyName() {
            return this.zzaIo;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public String getFormatted() {
            return this.zzaJo;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public String getGivenName() {
            return this.zzaIr;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public String getHonorificPrefix() {
            return this.zzaJp;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public String getHonorificSuffix() {
            return this.zzaJq;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public String getMiddleName() {
            return this.zzaJr;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public boolean hasFamilyName() {
            return this.zzaHQ.contains(2);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public boolean hasFormatted() {
            return this.zzaHQ.contains(3);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public boolean hasGivenName() {
            return this.zzaHQ.contains(4);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public boolean hasHonorificPrefix() {
            return this.zzaHQ.contains(5);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public boolean hasHonorificSuffix() {
            return this.zzaHQ.contains(6);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Name
        public boolean hasMiddleName() {
            return this.zzaHQ.contains(7);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: NameEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzg.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            switch(fastJsonResponse$Field0.zzot()) {
                case 2: {
                    return this.zzaIo;
                }
                case 3: {
                    return this.zzaJo;
                }
                case 4: {
                    return this.zzaIr;
                }
                case 5: {
                    return this.zzaJp;
                }
                case 6: {
                    return this.zzaJq;
                }
                case 7: {
                    return this.zzaJr;
                }
                default: {
                    throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                }
            }
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return NameEntity.zzaHP;
        }

        public NameEntity zzxP() [...] // Inlined contents
    }

    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse implements Organizations {
        public static final zzh CREATOR;
        String mName;
        final int zzCY;
        int zzSq;
        private static final HashMap zzaHP;
        final Set zzaHQ;
        String zzaID;
        String zzaIn;
        String zzaJs;
        String zzaJt;
        boolean zzaJu;
        String zzadv;
        String zzakM;

        static {
            OrganizationsEntity.CREATOR = new zzh();
            OrganizationsEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zzl("department", 2);
            OrganizationsEntity.zzaHP.put("department", fastJsonResponse$Field0);
            Field fastJsonResponse$Field1 = Field.zzl("description", 3);
            OrganizationsEntity.zzaHP.put("description", fastJsonResponse$Field1);
            Field fastJsonResponse$Field2 = Field.zzl("endDate", 4);
            OrganizationsEntity.zzaHP.put("endDate", fastJsonResponse$Field2);
            Field fastJsonResponse$Field3 = Field.zzl("location", 5);
            OrganizationsEntity.zzaHP.put("location", fastJsonResponse$Field3);
            Field fastJsonResponse$Field4 = Field.zzl("name", 6);
            OrganizationsEntity.zzaHP.put("name", fastJsonResponse$Field4);
            Field fastJsonResponse$Field5 = Field.zzk("primary", 7);
            OrganizationsEntity.zzaHP.put("primary", fastJsonResponse$Field5);
            Field fastJsonResponse$Field6 = Field.zzl("startDate", 8);
            OrganizationsEntity.zzaHP.put("startDate", fastJsonResponse$Field6);
            Field fastJsonResponse$Field7 = Field.zzl("title", 9);
            OrganizationsEntity.zzaHP.put("title", fastJsonResponse$Field7);
            Field fastJsonResponse$Field8 = Field.zza("type", 10, new StringToIntConverter().zzh("work", 0).zzh("school", 1), false);
            OrganizationsEntity.zzaHP.put("type", fastJsonResponse$Field8);
        }

        public OrganizationsEntity() {
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        OrganizationsEntity(Set set0, int versionCode, String department, String description, String endDate, String location, String name, boolean primary, String startDate, String title, int type) {
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzaJs = department;
            this.zzakM = description;
            this.zzaIn = endDate;
            this.zzaJt = location;
            this.mName = name;
            this.zzaJu = primary;
            this.zzaID = startDate;
            this.zzadv = title;
            this.zzSq = type;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: OrganizationsEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((OrganizationsEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((OrganizationsEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((OrganizationsEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getDepartment() {
            return this.zzaJs;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getDescription() {
            return this.zzakM;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getEndDate() {
            return this.zzaIn;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getLocation() {
            return this.zzaJt;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getName() {
            return this.mName;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getStartDate() {
            return this.zzaID;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public String getTitle() {
            return this.zzadv;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public int getType() {
            return this.zzSq;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasDepartment() {
            return this.zzaHQ.contains(2);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasDescription() {
            return this.zzaHQ.contains(3);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasEndDate() {
            return this.zzaHQ.contains(4);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasLocation() {
            return this.zzaHQ.contains(5);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasName() {
            return this.zzaHQ.contains(6);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasPrimary() {
            return this.zzaHQ.contains(7);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasStartDate() {
            return this.zzaHQ.contains(8);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasTitle() {
            return this.zzaHQ.contains(9);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean hasType() {
            return this.zzaHQ.contains(10);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: OrganizationsEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Organizations
        public boolean isPrimary() {
            return this.zzaJu;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzh.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            switch(fastJsonResponse$Field0.zzot()) {
                case 2: {
                    return this.zzaJs;
                }
                case 3: {
                    return this.zzakM;
                }
                case 4: {
                    return this.zzaIn;
                }
                case 5: {
                    return this.zzaJt;
                }
                case 6: {
                    return this.mName;
                }
                case 7: {
                    return Boolean.valueOf(this.zzaJu);
                }
                case 8: {
                    return this.zzaID;
                }
                case 9: {
                    return this.zzadv;
                }
                case 10: {
                    return this.zzSq;
                }
                default: {
                    throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                }
            }
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return OrganizationsEntity.zzaHP;
        }

        public OrganizationsEntity zzxQ() [...] // Inlined contents
    }

    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse implements PlacesLived {
        public static final zzi CREATOR;
        String mValue;
        final int zzCY;
        private static final HashMap zzaHP;
        final Set zzaHQ;
        boolean zzaJu;

        static {
            PlacesLivedEntity.CREATOR = new zzi();
            PlacesLivedEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zzk("primary", 2);
            PlacesLivedEntity.zzaHP.put("primary", fastJsonResponse$Field0);
            Field fastJsonResponse$Field1 = Field.zzl("value", 3);
            PlacesLivedEntity.zzaHP.put("value", fastJsonResponse$Field1);
        }

        public PlacesLivedEntity() {
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        PlacesLivedEntity(Set set0, int versionCode, boolean primary, String value) {
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzaJu = primary;
            this.mValue = value;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: PlacesLivedEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((PlacesLivedEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((PlacesLivedEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((PlacesLivedEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$PlacesLived
        public String getValue() {
            return this.mValue;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$PlacesLived
        public boolean hasPrimary() {
            return this.zzaHQ.contains(2);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$PlacesLived
        public boolean hasValue() {
            return this.zzaHQ.contains(3);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: PlacesLivedEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$PlacesLived
        public boolean isPrimary() {
            return this.zzaJu;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzi.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            switch(fastJsonResponse$Field0.zzot()) {
                case 2: {
                    return Boolean.valueOf(this.zzaJu);
                }
                case 3: {
                    return this.mValue;
                }
                default: {
                    throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                }
            }
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return PlacesLivedEntity.zzaHP;
        }

        public PlacesLivedEntity zzxR() [...] // Inlined contents
    }

    public static final class UrlsEntity extends FastSafeParcelableJsonResponse implements Urls {
        public static final zzj CREATOR;
        String mValue;
        final int zzCY;
        int zzSq;
        String zzaEH;
        private static final HashMap zzaHP;
        final Set zzaHQ;
        private final int zzaJv;

        static {
            UrlsEntity.CREATOR = new zzj();
            UrlsEntity.zzaHP = new HashMap();
            Field fastJsonResponse$Field0 = Field.zzl("label", 5);
            UrlsEntity.zzaHP.put("label", fastJsonResponse$Field0);
            Field fastJsonResponse$Field1 = Field.zza("type", 6, new StringToIntConverter().zzh("home", 0).zzh("work", 1).zzh("blog", 2).zzh("profile", 3).zzh("other", 4).zzh("otherProfile", 5).zzh("contributor", 6).zzh("website", 7), false);
            UrlsEntity.zzaHP.put("type", fastJsonResponse$Field1);
            Field fastJsonResponse$Field2 = Field.zzl("value", 4);
            UrlsEntity.zzaHP.put("value", fastJsonResponse$Field2);
        }

        public UrlsEntity() {
            this.zzaJv = 4;
            this.zzCY = 1;
            this.zzaHQ = new HashSet();
        }

        UrlsEntity(Set set0, int versionCode, String label, int type, String value, int type_DEPRECATED_FENACHO) {
            this.zzaJv = 4;
            this.zzaHQ = set0;
            this.zzCY = versionCode;
            this.zzaEH = label;
            this.zzSq = type;
            this.mValue = value;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof UrlsEntity)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            for(Object object1: UrlsEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object1;
                if(this.zza(fastJsonResponse$Field0)) {
                    if(((UrlsEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((UrlsEntity)obj).zzb(fastJsonResponse$Field0))) {
                        continue;
                    }
                    return false;
                }
                if(((UrlsEntity)obj).zza(fastJsonResponse$Field0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Urls
        public String getLabel() {
            return this.zzaEH;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Urls
        public int getType() {
            return this.zzSq;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Urls
        public String getValue() {
            return this.mValue;
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Urls
        public boolean hasLabel() {
            return this.zzaHQ.contains(5);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Urls
        public boolean hasType() {
            return this.zzaHQ.contains(6);
        }

        @Override  // com.google.android.gms.plus.model.people.Person$Urls
        public boolean hasValue() {
            return this.zzaHQ.contains(4);
        }

        @Override
        public int hashCode() {
            int v = 0;
            for(Object object0: UrlsEntity.zzaHP.values()) {
                Field fastJsonResponse$Field0 = (Field)object0;
                v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
            }
            return v;
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return true;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzj.zza(this, out, flags);
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected boolean zza(Field fastJsonResponse$Field0) {
            return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        protected Object zzb(Field fastJsonResponse$Field0) {
            switch(fastJsonResponse$Field0.zzot()) {
                case 4: {
                    return this.mValue;
                }
                case 5: {
                    return this.zzaEH;
                }
                case 6: {
                    return this.zzSq;
                }
                default: {
                    throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
                }
            }
        }

        @Override  // com.google.android.gms.common.server.response.FastJsonResponse
        public Map zzom() {
            return this.zzxF();
        }

        public HashMap zzxF() {
            return UrlsEntity.zzaHP;
        }

        @Deprecated
        public int zzxS() [...] // Inlined contents

        public UrlsEntity zzxT() [...] // Inlined contents
    }

    public static class zza {
        public static int zzdY(String s) {
            if(s.equals("person")) {
                return 0;
            }
            if(!s.equals("page")) {
                throw new IllegalArgumentException("Unknown objectType string: " + s);
            }
            return 1;
        }
    }

    public static final com.google.android.gms.plus.internal.model.people.zza CREATOR;
    final int zzCY;
    String zzF;
    String zzKI;
    String zzRA;
    private static final HashMap zzaHP;
    final Set zzaHQ;
    String zzaIO;
    AgeRangeEntity zzaIP;
    String zzaIQ;
    String zzaIR;
    int zzaIS;
    CoverEntity zzaIT;
    String zzaIU;
    ImageEntity zzaIV;
    boolean zzaIW;
    NameEntity zzaIX;
    String zzaIY;
    int zzaIZ;
    List zzaJa;
    List zzaJb;
    int zzaJc;
    int zzaJd;
    String zzaJe;
    List zzaJf;
    boolean zzaJg;
    String zzadI;
    int zzsC;

    static {
        PersonEntity.CREATOR = new com.google.android.gms.plus.internal.model.people.zza();
        PersonEntity.zzaHP = new HashMap();
        Field fastJsonResponse$Field0 = Field.zzl("aboutMe", 2);
        PersonEntity.zzaHP.put("aboutMe", fastJsonResponse$Field0);
        Field fastJsonResponse$Field1 = Field.zza("ageRange", 3, AgeRangeEntity.class);
        PersonEntity.zzaHP.put("ageRange", fastJsonResponse$Field1);
        Field fastJsonResponse$Field2 = Field.zzl("birthday", 4);
        PersonEntity.zzaHP.put("birthday", fastJsonResponse$Field2);
        Field fastJsonResponse$Field3 = Field.zzl("braggingRights", 5);
        PersonEntity.zzaHP.put("braggingRights", fastJsonResponse$Field3);
        Field fastJsonResponse$Field4 = Field.zzi("circledByCount", 6);
        PersonEntity.zzaHP.put("circledByCount", fastJsonResponse$Field4);
        Field fastJsonResponse$Field5 = Field.zza("cover", 7, CoverEntity.class);
        PersonEntity.zzaHP.put("cover", fastJsonResponse$Field5);
        Field fastJsonResponse$Field6 = Field.zzl("currentLocation", 8);
        PersonEntity.zzaHP.put("currentLocation", fastJsonResponse$Field6);
        Field fastJsonResponse$Field7 = Field.zzl("displayName", 9);
        PersonEntity.zzaHP.put("displayName", fastJsonResponse$Field7);
        Field fastJsonResponse$Field8 = Field.zza("gender", 12, new StringToIntConverter().zzh("male", 0).zzh("female", 1).zzh("other", 2), false);
        PersonEntity.zzaHP.put("gender", fastJsonResponse$Field8);
        Field fastJsonResponse$Field9 = Field.zzl("id", 14);
        PersonEntity.zzaHP.put("id", fastJsonResponse$Field9);
        Field fastJsonResponse$Field10 = Field.zza("image", 15, ImageEntity.class);
        PersonEntity.zzaHP.put("image", fastJsonResponse$Field10);
        Field fastJsonResponse$Field11 = Field.zzk("isPlusUser", 16);
        PersonEntity.zzaHP.put("isPlusUser", fastJsonResponse$Field11);
        Field fastJsonResponse$Field12 = Field.zzl("language", 18);
        PersonEntity.zzaHP.put("language", fastJsonResponse$Field12);
        Field fastJsonResponse$Field13 = Field.zza("name", 19, NameEntity.class);
        PersonEntity.zzaHP.put("name", fastJsonResponse$Field13);
        Field fastJsonResponse$Field14 = Field.zzl("nickname", 20);
        PersonEntity.zzaHP.put("nickname", fastJsonResponse$Field14);
        Field fastJsonResponse$Field15 = Field.zza("objectType", 21, new StringToIntConverter().zzh("person", 0).zzh("page", 1), false);
        PersonEntity.zzaHP.put("objectType", fastJsonResponse$Field15);
        Field fastJsonResponse$Field16 = Field.zzb("organizations", 22, OrganizationsEntity.class);
        PersonEntity.zzaHP.put("organizations", fastJsonResponse$Field16);
        Field fastJsonResponse$Field17 = Field.zzb("placesLived", 23, PlacesLivedEntity.class);
        PersonEntity.zzaHP.put("placesLived", fastJsonResponse$Field17);
        Field fastJsonResponse$Field18 = Field.zzi("plusOneCount", 24);
        PersonEntity.zzaHP.put("plusOneCount", fastJsonResponse$Field18);
        Field fastJsonResponse$Field19 = Field.zza("relationshipStatus", 25, new StringToIntConverter().zzh("single", 0).zzh("in_a_relationship", 1).zzh("engaged", 2).zzh("married", 3).zzh("its_complicated", 4).zzh("open_relationship", 5).zzh("widowed", 6).zzh("in_domestic_partnership", 7).zzh("in_civil_union", 8), false);
        PersonEntity.zzaHP.put("relationshipStatus", fastJsonResponse$Field19);
        Field fastJsonResponse$Field20 = Field.zzl("tagline", 26);
        PersonEntity.zzaHP.put("tagline", fastJsonResponse$Field20);
        Field fastJsonResponse$Field21 = Field.zzl("url", 27);
        PersonEntity.zzaHP.put("url", fastJsonResponse$Field21);
        Field fastJsonResponse$Field22 = Field.zzb("urls", 28, UrlsEntity.class);
        PersonEntity.zzaHP.put("urls", fastJsonResponse$Field22);
        Field fastJsonResponse$Field23 = Field.zzk("verified", 29);
        PersonEntity.zzaHP.put("verified", fastJsonResponse$Field23);
    }

    public PersonEntity() {
        this.zzCY = 1;
        this.zzaHQ = new HashSet();
    }

    public PersonEntity(String displayName, String id, ImageEntity image, int objectType, String url) {
        this.zzCY = 1;
        this.zzaHQ = new HashSet();
        this.zzadI = displayName;
        this.zzaHQ.add(9);
        this.zzKI = id;
        this.zzaHQ.add(14);
        this.zzaIV = image;
        this.zzaHQ.add(15);
        this.zzaIZ = objectType;
        this.zzaHQ.add(21);
        this.zzF = url;
        this.zzaHQ.add(27);
    }

    PersonEntity(Set set0, int versionCode, String aboutMe, AgeRangeEntity ageRange, String birthday, String braggingRights, int circledByCount, CoverEntity cover, String currentLocation, String displayName, int gender, String id, ImageEntity image, boolean isPlusUser, String language, NameEntity name, String nickname, int objectType, List list0, List list1, int plusOneCount, int relationshipStatus, String tagline, String url, List list2, boolean verified) {
        this.zzaHQ = set0;
        this.zzCY = versionCode;
        this.zzaIO = aboutMe;
        this.zzaIP = ageRange;
        this.zzaIQ = birthday;
        this.zzaIR = braggingRights;
        this.zzaIS = circledByCount;
        this.zzaIT = cover;
        this.zzaIU = currentLocation;
        this.zzadI = displayName;
        this.zzsC = gender;
        this.zzKI = id;
        this.zzaIV = image;
        this.zzaIW = isPlusUser;
        this.zzRA = language;
        this.zzaIX = name;
        this.zzaIY = nickname;
        this.zzaIZ = objectType;
        this.zzaJa = list0;
        this.zzaJb = list1;
        this.zzaJc = plusOneCount;
        this.zzaJd = relationshipStatus;
        this.zzaJe = tagline;
        this.zzF = url;
        this.zzaJf = list2;
        this.zzaJg = verified;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PersonEntity)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        for(Object object1: PersonEntity.zzaHP.values()) {
            Field fastJsonResponse$Field0 = (Field)object1;
            if(this.zza(fastJsonResponse$Field0)) {
                if(((PersonEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((PersonEntity)obj).zzb(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((PersonEntity)obj).zza(fastJsonResponse$Field0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getAboutMe() {
        return this.zzaIO;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public AgeRange getAgeRange() {
        return this.zzaIP;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getBirthday() {
        return this.zzaIQ;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getBraggingRights() {
        return this.zzaIR;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getCircledByCount() {
        return this.zzaIS;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public Cover getCover() {
        return this.zzaIT;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getCurrentLocation() {
        return this.zzaIU;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getDisplayName() {
        return this.zzadI;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getGender() {
        return this.zzsC;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public Image getImage() {
        return this.zzaIV;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getLanguage() {
        return this.zzRA;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public Name getName() {
        return this.zzaIX;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getNickname() {
        return this.zzaIY;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getObjectType() {
        return this.zzaIZ;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public List getOrganizations() {
        return (ArrayList)this.zzaJa;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public List getPlacesLived() {
        return (ArrayList)this.zzaJb;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getPlusOneCount() {
        return this.zzaJc;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getRelationshipStatus() {
        return this.zzaJd;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getTagline() {
        return this.zzaJe;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getUrl() {
        return this.zzF;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public List getUrls() {
        return (ArrayList)this.zzaJf;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasAboutMe() {
        return this.zzaHQ.contains(2);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasAgeRange() {
        return this.zzaHQ.contains(3);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasBirthday() {
        return this.zzaHQ.contains(4);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasBraggingRights() {
        return this.zzaHQ.contains(5);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasCircledByCount() {
        return this.zzaHQ.contains(6);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasCover() {
        return this.zzaHQ.contains(7);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasCurrentLocation() {
        return this.zzaHQ.contains(8);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasDisplayName() {
        return this.zzaHQ.contains(9);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasGender() {
        return this.zzaHQ.contains(12);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasId() {
        return this.zzaHQ.contains(14);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasImage() {
        return this.zzaHQ.contains(15);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasIsPlusUser() {
        return this.zzaHQ.contains(16);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasLanguage() {
        return this.zzaHQ.contains(18);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasName() {
        return this.zzaHQ.contains(19);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasNickname() {
        return this.zzaHQ.contains(20);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasObjectType() {
        return this.zzaHQ.contains(21);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasOrganizations() {
        return this.zzaHQ.contains(22);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasPlacesLived() {
        return this.zzaHQ.contains(23);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasPlusOneCount() {
        return this.zzaHQ.contains(24);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasRelationshipStatus() {
        return this.zzaHQ.contains(25);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasTagline() {
        return this.zzaHQ.contains(26);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasUrl() {
        return this.zzaHQ.contains(27);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasUrls() {
        return this.zzaHQ.contains(28);
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasVerified() {
        return this.zzaHQ.contains(29);
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: PersonEntity.zzaHP.values()) {
            Field fastJsonResponse$Field0 = (Field)object0;
            v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
        }
        return v;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean isPlusUser() {
        return this.zzaIW;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean isVerified() {
        return this.zzaJg;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        com.google.android.gms.plus.internal.model.people.zza.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean zza(Field fastJsonResponse$Field0) {
        return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object zzb(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.zzot()) {
            case 2: {
                return this.zzaIO;
            }
            case 3: {
                return this.zzaIP;
            }
            case 4: {
                return this.zzaIQ;
            }
            case 5: {
                return this.zzaIR;
            }
            case 6: {
                return this.zzaIS;
            }
            case 7: {
                return this.zzaIT;
            }
            case 8: {
                return this.zzaIU;
            }
            case 9: {
                return this.zzadI;
            }
            case 12: {
                return this.zzsC;
            }
            case 14: {
                return this.zzKI;
            }
            case 15: {
                return this.zzaIV;
            }
            case 16: {
                return Boolean.valueOf(this.zzaIW);
            }
            case 18: {
                return this.zzRA;
            }
            case 19: {
                return this.zzaIX;
            }
            case 20: {
                return this.zzaIY;
            }
            case 21: {
                return this.zzaIZ;
            }
            case 22: {
                return this.zzaJa;
            }
            case 23: {
                return this.zzaJb;
            }
            case 24: {
                return this.zzaJc;
            }
            case 25: {
                return this.zzaJd;
            }
            case 26: {
                return this.zzaJe;
            }
            case 27: {
                return this.zzF;
            }
            case 28: {
                return this.zzaJf;
            }
            case 29: {
                return Boolean.valueOf(this.zzaJg);
            }
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map zzom() {
        return this.zzxF();
    }

    public static PersonEntity zzp(byte[] arr_b) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        PersonEntity personEntity0 = PersonEntity.CREATOR.zzfM(parcel0);
        parcel0.recycle();
        return personEntity0;
    }

    public HashMap zzxF() {
        return PersonEntity.zzaHP;
    }

    public PersonEntity zzxJ() [...] // Inlined contents
}

