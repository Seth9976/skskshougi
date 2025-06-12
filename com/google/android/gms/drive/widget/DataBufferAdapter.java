package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.zzx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBufferAdapter extends BaseAdapter {
    private final Context mContext;
    private final LayoutInflater mInflater;
    private final int zzajc;
    private int zzajd;
    private final int zzaje;
    private final List zzajf;
    private boolean zzajg;

    public DataBufferAdapter(Context context, int resource) {
        this(context, resource, 0, new ArrayList());
    }

    public DataBufferAdapter(Context context, int resource, int textViewResourceId) {
        this(context, resource, textViewResourceId, new ArrayList());
    }

    public DataBufferAdapter(Context context, int resource, int textViewResourceId, List list0) {
        this.zzajg = true;
        this.mContext = context;
        this.zzajd = resource;
        this.zzajc = resource;
        this.zzaje = textViewResourceId;
        this.zzajf = list0;
        this.mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public DataBufferAdapter(Context context, int resource, int textViewResourceId, DataBuffer[] arr_dataBuffer) {
        this(context, resource, textViewResourceId, Arrays.asList(arr_dataBuffer));
    }

    public DataBufferAdapter(Context context, int resource, List list0) {
        this(context, resource, 0, list0);
    }

    public DataBufferAdapter(Context context, int resource, DataBuffer[] arr_dataBuffer) {
        this(context, resource, 0, Arrays.asList(arr_dataBuffer));
    }

    public void append(DataBuffer dataBuffer0) {
        this.zzajf.add(dataBuffer0);
        if(this.zzajg) {
            this.notifyDataSetChanged();
        }
    }

    public void clear() {
        for(Object object0: this.zzajf) {
            ((DataBuffer)object0).release();
        }
        this.zzajf.clear();
        if(this.zzajg) {
            this.notifyDataSetChanged();
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        int v = 0;
        for(Object object0: this.zzajf) {
            v = ((DataBuffer)object0).getCount() + v;
        }
        return v;
    }

    @Override  // android.widget.BaseAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return this.zza(position, convertView, parent, this.zzajd);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int position) throws CursorIndexOutOfBoundsException {
        int v1 = position;
        for(Object object0: this.zzajf) {
            DataBuffer dataBuffer0 = (DataBuffer)object0;
            int v2 = dataBuffer0.getCount();
            if(v2 <= v1) {
                v1 -= v2;
            }
            else {
                try {
                    return dataBuffer0.get(v1);
                }
                catch(CursorIndexOutOfBoundsException unused_ex) {
                    throw new CursorIndexOutOfBoundsException(position, this.getCount());
                }
            }
        }
        throw new CursorIndexOutOfBoundsException(position, this.getCount());
    }

    @Override  // android.widget.Adapter
    public long getItemId(int position) {
        return (long)position;
    }

    @Override  // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        return this.zza(position, convertView, parent, this.zzajc);
    }

    @Override  // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.zzajg = true;
    }

    public void setDropDownViewResource(int resource) {
        this.zzajd = resource;
    }

    public void setNotifyOnChange(boolean notifyOnChange) {
        this.zzajg = notifyOnChange;
    }

    private View zza(int v, View view0, ViewGroup viewGroup0, int v1) {
        TextView textView0;
        View view1 = view0 == null ? this.mInflater.inflate(v1, viewGroup0, false) : view0;
        try {
            textView0 = this.zzaje == 0 ? ((TextView)view1) : ((TextView)view1.findViewById(this.zzaje));
        }
        catch(ClassCastException classCastException0) {
            zzx.zza("DataBufferAdapter", classCastException0, "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", classCastException0);
        }
        Object object0 = this.getItem(v);
        if(object0 instanceof CharSequence) {
            textView0.setText(((CharSequence)object0));
            return view1;
        }
        textView0.setText(object0.toString());
        return view1;
    }
}

