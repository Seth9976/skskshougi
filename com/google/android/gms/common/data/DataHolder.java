package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataHolder implements SafeParcelable {
    public static class zza {
        private final ArrayList zzYF;
        private final String zzYG;
        private final HashMap zzYH;
        private boolean zzYI;
        private String zzYJ;
        private final String[] zzYw;

        private zza(String[] arr_s, String s) {
            this.zzYw = (String[])zzu.zzu(arr_s);
            this.zzYF = new ArrayList();
            this.zzYG = s;
            this.zzYH = new HashMap();
            this.zzYI = false;
            this.zzYJ = null;
        }

        zza(String[] arr_s, String s, com.google.android.gms.common.data.DataHolder.1 dataHolder$10) {
            this(arr_s, s);
        }
    }

    public static class zzb extends RuntimeException {
        public zzb(String s) {
            super(s);
        }
    }

    public static final zze CREATOR;
    boolean mClosed;
    private final int zzCY;
    private final int zzTS;
    int[] zzYA;
    int zzYB;
    private Object zzYC;
    private boolean zzYD;
    private static final zza zzYE;
    private final String[] zzYw;
    Bundle zzYx;
    private final CursorWindow[] zzYy;
    private final Bundle zzYz;

    static {
        DataHolder.CREATOR = new zze();
        DataHolder.zzYE = new zza(new String[0], null) {
            {
                super(arr_s, s, null);
            }
        };
    }

    DataHolder(int versionCode, String[] columns, CursorWindow[] windows, int statusCode, Bundle metadata) {
        this.mClosed = false;
        this.zzYD = true;
        this.zzCY = versionCode;
        this.zzYw = columns;
        this.zzYy = windows;
        this.zzTS = statusCode;
        this.zzYz = metadata;
    }

    private DataHolder(zza builder, int statusCode, Bundle metadata) {
        this(builder.zzYw, DataHolder.zza(builder, -1), statusCode, metadata);
    }

    public DataHolder(String[] columns, CursorWindow[] windows, int statusCode, Bundle metadata) {
        this.mClosed = false;
        this.zzYD = true;
        this.zzCY = 1;
        this.zzYw = (String[])zzu.zzu(columns);
        this.zzYy = (CursorWindow[])zzu.zzu(windows);
        this.zzTS = statusCode;
        this.zzYz = metadata;
        this.zznf();
    }

    public void close() {
        synchronized(this) {
            if(!this.mClosed) {
                this.mClosed = true;
                for(int v1 = 0; v1 < this.zzYy.length; ++v1) {
                    this.zzYy[v1].close();
                }
            }
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if(this.zzYD && this.zzYy.length > 0 && !this.isClosed()) {
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + (this.zzYC == null ? "internal object: " + this.toString() : this.zzYC.toString()) + ")");
                this.close();
            }
        }
        finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.zzYB;
    }

    public int getStatusCode() {
        return this.zzTS;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public boolean isClosed() {
        synchronized(this) {
        }
        return this.mClosed;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags);
    }

    public static DataHolder zza(int v, Bundle bundle0) {
        return new DataHolder(DataHolder.zzYE, v, bundle0);
    }

    private static CursorWindow[] zza(zza dataHolder$zza0, int v) {
        int v7;
        CursorWindow cursorWindow2;
        int v6;
        if(dataHolder$zza0.zzYw.length == 0) {
            return new CursorWindow[0];
        }
        List list0 = v >= 0 && v < dataHolder$zza0.zzYF.size() ? dataHolder$zza0.zzYF.subList(0, v) : dataHolder$zza0.zzYF;
        int v2 = list0.size();
        CursorWindow cursorWindow0 = new CursorWindow(false);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(cursorWindow0);
        cursorWindow0.setNumColumns(dataHolder$zza0.zzYw.length);
        int v4 = 0;
        for(int v3 = 0; v3 < v2; v3 = v6 + 1) {
            try {
                if(!cursorWindow0.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + v3 + ")");
                    cursorWindow0 = new CursorWindow(false);
                    cursorWindow0.setStartPosition(v3);
                    cursorWindow0.setNumColumns(dataHolder$zza0.zzYw.length);
                    arrayList0.add(cursorWindow0);
                    if(!cursorWindow0.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList0.remove(cursorWindow0);
                        return (CursorWindow[])arrayList0.toArray(new CursorWindow[arrayList0.size()]);
                    }
                }
                Map map0 = (Map)list0.get(v3);
                boolean z = true;
                for(int v5 = 0; v5 < dataHolder$zza0.zzYw.length && z; ++v5) {
                    String s = dataHolder$zza0.zzYw[v5];
                    Object object0 = map0.get(s);
                    if(object0 == null) {
                        z = cursorWindow0.putNull(v3, v5);
                    }
                    else if(object0 instanceof String) {
                        z = cursorWindow0.putString(((String)object0), v3, v5);
                    }
                    else if(object0 instanceof Long) {
                        z = cursorWindow0.putLong(((long)(((Long)object0))), v3, v5);
                    }
                    else if(object0 instanceof Integer) {
                        z = cursorWindow0.putLong(((long)(((int)(((Integer)object0))))), v3, v5);
                    }
                    else if(object0 instanceof Boolean) {
                        z = cursorWindow0.putLong((((Boolean)object0).booleanValue() ? 1L : 0L), v3, v5);
                    }
                    else if(object0 instanceof byte[]) {
                        z = cursorWindow0.putBlob(((byte[])object0), v3, v5);
                    }
                    else if(object0 instanceof Double) {
                        z = cursorWindow0.putDouble(((double)(((Double)object0))), v3, v5);
                    }
                    else {
                        if(!(object0 instanceof Float)) {
                            throw new IllegalArgumentException("Unsupported object for column " + s + ": " + object0);
                        }
                        z = cursorWindow0.putDouble(((double)(((float)(((Float)object0))))), v3, v5);
                    }
                }
                if(z) {
                    v6 = v3;
                    v7 = 0;
                    cursorWindow2 = cursorWindow0;
                }
                else {
                    if(v4 != 0) {
                        throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    Log.d("DataHolder", "Couldn\'t populate window data for row " + v3 + " - allocating new window.");
                    cursorWindow0.freeLastRow();
                    CursorWindow cursorWindow1 = new CursorWindow(false);
                    cursorWindow1.setStartPosition(v3);
                    cursorWindow1.setNumColumns(dataHolder$zza0.zzYw.length);
                    arrayList0.add(cursorWindow1);
                    v6 = v3 - 1;
                    cursorWindow2 = cursorWindow1;
                    v7 = 1;
                }
            }
            catch(RuntimeException runtimeException0) {
                int v8 = arrayList0.size();
                for(int v1 = 0; v1 < v8; ++v1) {
                    ((CursorWindow)arrayList0.get(v1)).close();
                }
                throw runtimeException0;
            }
            v4 = v7;
            cursorWindow0 = cursorWindow2;
        }
        return (CursorWindow[])arrayList0.toArray(new CursorWindow[arrayList0.size()]);
    }

    public void zza(String s, int v, int v1, CharArrayBuffer charArrayBuffer0) {
        this.zzg(s, v);
        this.zzYy[v1].copyStringToBuffer(v, this.zzYx.getInt(s), charArrayBuffer0);
    }

    public long zzb(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].getLong(v, this.zzYx.getInt(s));
    }

    public boolean zzbV(String s) {
        return this.zzYx.containsKey(s);
    }

    public int zzbh(int v) {
        int v1 = 0;
        zzu.zzU(v >= 0 && v < this.zzYB);
        while(v1 < this.zzYA.length) {
            if(v < this.zzYA[v1]) {
                --v1;
                return v1 == this.zzYA.length ? v1 - 1 : v1;
            }
            ++v1;
        }
        return v1 == this.zzYA.length ? v1 - 1 : v1;
    }

    public static DataHolder zzbi(int v) {
        return DataHolder.zza(v, null);
    }

    public int zzc(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].getInt(v, this.zzYx.getInt(s));
    }

    public String zzd(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].getString(v, this.zzYx.getInt(s));
    }

    public boolean zze(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].getLong(v, this.zzYx.getInt(s)) == 1L;
    }

    public float zzf(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].getFloat(v, this.zzYx.getInt(s));
    }

    private void zzg(String s, int v) {
        if(this.zzYx == null || !this.zzYx.containsKey(s)) {
            throw new IllegalArgumentException("No such column: " + s);
        }
        if(this.isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if(v < 0 || v >= this.zzYB) {
            throw new CursorIndexOutOfBoundsException(v, this.zzYB);
        }
    }

    public byte[] zzg(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].getBlob(v, this.zzYx.getInt(s));
    }

    public Uri zzh(String s, int v, int v1) {
        String s1 = this.zzd(s, v, v1);
        return s1 == null ? null : Uri.parse(s1);
    }

    public boolean zzi(String s, int v, int v1) {
        this.zzg(s, v);
        return this.zzYy[v1].isNull(v, this.zzYx.getInt(s));
    }

    public Bundle zznb() {
        return this.zzYz;
    }

    public void zznf() {
        this.zzYx = new Bundle();
        for(int v1 = 0; v1 < this.zzYw.length; ++v1) {
            this.zzYx.putInt(this.zzYw[v1], v1);
        }
        this.zzYA = new int[this.zzYy.length];
        int v2 = 0;
        for(int v = 0; v < this.zzYy.length; ++v) {
            this.zzYA[v] = v2;
            int v3 = this.zzYy[v].getStartPosition();
            v2 += this.zzYy[v].getNumRows() - (v2 - v3);
        }
        this.zzYB = v2;
    }

    String[] zzng() {
        return this.zzYw;
    }

    CursorWindow[] zznh() {
        return this.zzYy;
    }

    public void zzp(Object object0) {
        this.zzYC = object0;
    }
}

