package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.LinkedList;

public abstract class zza {
    interface com.google.android.gms.dynamic.zza.zza {
        int getState();

        void zzb(LifecycleDelegate arg1);
    }

    private LifecycleDelegate zzajh;
    private Bundle zzaji;
    private LinkedList zzajj;
    private final zzf zzajk;

    public zza() {
        this.zzajk = new zzf() {
            @Override  // com.google.android.gms.dynamic.zzf
            public void zza(LifecycleDelegate lifecycleDelegate0) {
                zza.this.zzajh = lifecycleDelegate0;
                for(Object object0: zza.this.zzajj) {
                    ((com.google.android.gms.dynamic.zza.zza)object0).zzb(zza.this.zzajh);
                }
                zza.this.zzajj.clear();
                zza.this.zzaji = null;
            }
        };
    }

    public void onCreate(Bundle savedInstanceState) {
        this.zza(savedInstanceState, new com.google.android.gms.dynamic.zza.zza() {
            @Override  // com.google.android.gms.dynamic.zza$zza
            public int getState() {
                return 1;
            }

            @Override  // com.google.android.gms.dynamic.zza$zza
            public void zzb(LifecycleDelegate lifecycleDelegate0) {
                zza.this.zzajh.onCreate(savedInstanceState);
            }
        });
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view0 = new FrameLayout(inflater.getContext());
        this.zza(savedInstanceState, new com.google.android.gms.dynamic.zza.zza() {
            @Override  // com.google.android.gms.dynamic.zza$zza
            public int getState() {
                return 2;
            }

            @Override  // com.google.android.gms.dynamic.zza$zza
            public void zzb(LifecycleDelegate lifecycleDelegate0) {
                ((FrameLayout)view0).removeAllViews();
                View view0 = zza.this.zzajh.onCreateView(inflater, container, savedInstanceState);
                ((FrameLayout)view0).addView(view0);
            }
        });
        if(this.zzajh == null) {
            this.zza(((FrameLayout)view0));
        }
        return view0;
    }

    public void onDestroy() {
        if(this.zzajh != null) {
            this.zzajh.onDestroy();
            return;
        }
        this.zzdY(1);
    }

    public void onDestroyView() {
        if(this.zzajh != null) {
            this.zzajh.onDestroyView();
            return;
        }
        this.zzdY(2);
    }

    public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
        this.zza(savedInstanceState, new com.google.android.gms.dynamic.zza.zza() {
            @Override  // com.google.android.gms.dynamic.zza$zza
            public int getState() {
                return 0;
            }

            @Override  // com.google.android.gms.dynamic.zza$zza
            public void zzb(LifecycleDelegate lifecycleDelegate0) {
                zza.this.zzajh.onInflate(activity, attrs, savedInstanceState);
            }
        });
    }

    public void onLowMemory() {
        if(this.zzajh != null) {
            this.zzajh.onLowMemory();
        }
    }

    public void onPause() {
        if(this.zzajh != null) {
            this.zzajh.onPause();
            return;
        }
        this.zzdY(5);
    }

    public void onResume() {
        this.zza(null, new com.google.android.gms.dynamic.zza.zza() {
            @Override  // com.google.android.gms.dynamic.zza$zza
            public int getState() {
                return 5;
            }

            @Override  // com.google.android.gms.dynamic.zza$zza
            public void zzb(LifecycleDelegate lifecycleDelegate0) {
                zza.this.zzajh.onResume();
            }
        });
    }

    public void onSaveInstanceState(Bundle outState) {
        if(this.zzajh != null) {
            this.zzajh.onSaveInstanceState(outState);
            return;
        }
        if(this.zzaji != null) {
            outState.putAll(this.zzaji);
        }
    }

    public void onStart() {
        this.zza(null, new com.google.android.gms.dynamic.zza.zza() {
            @Override  // com.google.android.gms.dynamic.zza$zza
            public int getState() {
                return 4;
            }

            @Override  // com.google.android.gms.dynamic.zza$zza
            public void zzb(LifecycleDelegate lifecycleDelegate0) {
                zza.this.zzajh.onStart();
            }
        });
    }

    public void onStop() {
        if(this.zzajh != null) {
            this.zzajh.onStop();
            return;
        }
        this.zzdY(4);
    }

    private void zza(Bundle bundle0, com.google.android.gms.dynamic.zza.zza zza$zza0) {
        if(this.zzajh != null) {
            zza$zza0.zzb(this.zzajh);
            return;
        }
        if(this.zzajj == null) {
            this.zzajj = new LinkedList();
        }
        this.zzajj.add(zza$zza0);
        if(bundle0 != null) {
            if(this.zzaji == null) {
                this.zzaji = (Bundle)bundle0.clone();
            }
            else {
                this.zzaji.putAll(bundle0);
            }
        }
        this.zza(this.zzajk);
    }

    protected void zza(FrameLayout frameLayout0) {
        zza.zzb(frameLayout0);
    }

    protected abstract void zza(zzf arg1);

    public static void zzb(FrameLayout frameLayout0) {
        Context context0 = frameLayout0.getContext();
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context0);
        String s = com.google.android.gms.common.internal.zzf.zzb(context0, v, GooglePlayServicesUtil.zzad(context0));
        String s1 = com.google.android.gms.common.internal.zzf.zzh(context0, v);
        LinearLayout linearLayout0 = new LinearLayout(frameLayout0.getContext());
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout0.addView(linearLayout0);
        TextView textView0 = new TextView(frameLayout0.getContext());
        textView0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView0.setText(s);
        linearLayout0.addView(textView0);
        if(s1 != null) {
            Button button0 = new Button(context0);
            button0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button0.setText(s1);
            linearLayout0.addView(button0);
            button0.setOnClickListener(new View.OnClickListener() {
                @Override  // android.view.View$OnClickListener
                public void onClick(View v) {
                    Intent intent0 = GooglePlayServicesUtil.zzaT(v);
                    context0.startActivity(intent0);
                }
            });
        }
    }

    private void zzdY(int v) {
        while(!this.zzajj.isEmpty() && ((com.google.android.gms.dynamic.zza.zza)this.zzajj.getLast()).getState() >= v) {
            this.zzajj.removeLast();
        }
    }

    public LifecycleDelegate zzqj() {
        return this.zzajh;
    }
}

