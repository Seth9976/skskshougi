package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class zzu {
    private List zzas;
    private List zzat;
    private int zzau;
    private final int zzav;
    protected static final Comparator zzaw;

    static {
        zzu.zzaw = new Comparator() {
            public int zza(byte[] arr_b, byte[] arr_b1) {
                return arr_b.length - arr_b1.length;
            }
        };
    }

    public zzu(int v) {
        this.zzas = new LinkedList();
        this.zzat = new ArrayList(0x40);
        this.zzau = 0;
        this.zzav = v;
    }

    public void zza(byte[] arr_b) {
        synchronized(this) {
            if(arr_b != null && arr_b.length <= this.zzav) {
                this.zzas.add(arr_b);
                int v1 = Collections.binarySearch(this.zzat, arr_b, zzu.zzaw);
                if(v1 < 0) {
                    v1 = -1 - v1;
                }
                this.zzat.add(v1, arr_b);
                this.zzau += arr_b.length;
                this.zzy();
            }
        }
    }

    public byte[] zzb(int v) {
        byte[] arr_b;
        synchronized(this) {
            for(int v2 = 0; true; ++v2) {
                if(v2 >= this.zzat.size()) {
                    arr_b = new byte[v];
                    break;
                }
                arr_b = (byte[])this.zzat.get(v2);
                if(arr_b.length >= v) {
                    this.zzau -= arr_b.length;
                    this.zzat.remove(v2);
                    this.zzas.remove(arr_b);
                    break;
                }
            }
            return arr_b;
        }
    }

    private void zzy() {
        synchronized(this) {
            while(this.zzau > this.zzav) {
                byte[] arr_b = (byte[])this.zzas.remove(0);
                this.zzat.remove(arr_b);
                this.zzau -= arr_b.length;
            }
        }
    }
}

