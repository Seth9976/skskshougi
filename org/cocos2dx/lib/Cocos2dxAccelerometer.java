package org.cocos2dx.lib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.view.WindowManager;

public class Cocos2dxAccelerometer implements SensorEventListener {
    private static final String TAG;
    private final Sensor mAccelerometer;
    private final Context mContext;
    private final int mNaturalOrientation;
    private final SensorManager mSensorManager;

    static {
        Cocos2dxAccelerometer.TAG = "Cocos2dxAccelerometer";
    }

    public Cocos2dxAccelerometer(Context context) {
        this.mContext = context;
        this.mSensorManager = (SensorManager)this.mContext.getSystemService("sensor");
        this.mAccelerometer = this.mSensorManager.getDefaultSensor(1);
        this.mNaturalOrientation = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    public void disable() {
        this.mSensorManager.unregisterListener(this);
    }

    public void enable() {
        this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
    }

    @Override  // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    public static native void onSensorChanged(float arg0, float arg1, float arg2, long arg3) {
    }

    @Override  // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType() != 1) {
            return;
        }
        float x = sensorEvent.values[0];
        float y = sensorEvent.values[1];
        float z = sensorEvent.values[2];
        int orientation = this.mContext.getResources().getConfiguration().orientation;
        if(orientation == 2 && this.mNaturalOrientation != 0) {
            float tmp = x;
            x = -y;
            y = tmp;
        }
        else if(orientation == 1 && this.mNaturalOrientation != 0) {
            float tmp = x;
            x = y;
            y = -tmp;
        }
        Cocos2dxGLSurfaceView.queueAccelerometer(x, y, z, sensorEvent.timestamp);
    }

    public void setInterval(float interval) {
        if(Build.VERSION.SDK_INT < 11) {
            this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
            return;
        }
        this.mSensorManager.registerListener(this, this.mAccelerometer, ((int)(100000.0f * interval)));
    }
}

