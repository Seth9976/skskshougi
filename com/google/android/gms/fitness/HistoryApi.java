package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.concurrent.TimeUnit;

public interface HistoryApi {
    public static class ViewIntentBuilder {
        private final Context mContext;
        private long zzKT;
        private final DataType zzajF;
        private DataSource zzajG;
        private long zzajH;
        private String zzajI;

        public ViewIntentBuilder(Context context, DataType dataType) {
            this.mContext = context;
            this.zzajF = dataType;
        }

        public Intent build() {
            boolean z = true;
            zzu.zza(this.zzKT > 0L, "Start time must be set");
            if(this.zzajH <= this.zzKT) {
                z = false;
            }
            zzu.zza(z, "End time must be set and after start time");
            Intent intent0 = new Intent("vnd.google.fitness.VIEW");
            intent0.setType(DataType.getMimeType(this.zzajG.getDataType()));
            intent0.putExtra("vnd.google.fitness.start_time", this.zzKT);
            intent0.putExtra("vnd.google.fitness.end_time", this.zzajH);
            zzc.zza(this.zzajG, intent0, "vnd.google.fitness.data_source");
            return this.zzj(intent0);
        }

        public ViewIntentBuilder setDataSource(DataSource dataSource) {
            zzu.zzb(dataSource.getDataType().equals(this.zzajF), "Data source %s is not for the data type %s", new Object[]{dataSource, this.zzajF});
            this.zzajG = dataSource;
            return this;
        }

        public ViewIntentBuilder setPreferredApplication(String packageName) {
            this.zzajI = packageName;
            return this;
        }

        public ViewIntentBuilder setTimeInterval(long start, long end, TimeUnit timeUnit) {
            this.zzKT = timeUnit.toMillis(start);
            this.zzajH = timeUnit.toMillis(end);
            return this;
        }

        private Intent zzj(Intent intent0) {
            if(this.zzajI != null) {
                Intent intent1 = new Intent(intent0).setPackage(this.zzajI);
                ResolveInfo resolveInfo0 = this.mContext.getPackageManager().resolveActivity(intent1, 0);
                if(resolveInfo0 != null) {
                    intent1.setComponent(new ComponentName(this.zzajI, resolveInfo0.activityInfo.name));
                    return intent1;
                }
            }
            return intent0;
        }
    }

    PendingResult deleteData(GoogleApiClient arg1, DataDeleteRequest arg2);

    PendingResult insertData(GoogleApiClient arg1, DataSet arg2);

    PendingResult readDailyTotal(GoogleApiClient arg1, DataType arg2);

    PendingResult readData(GoogleApiClient arg1, DataReadRequest arg2);
}

