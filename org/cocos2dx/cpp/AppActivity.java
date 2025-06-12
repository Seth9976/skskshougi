package org.cocos2dx.cpp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import org.cocos2dx.lib.Cocos2dxActivity;

public class AppActivity extends Cocos2dxActivity {
    private static AdView adView;
    private final int lp;
    private static InterstitialAd m_interstitial;
    private static AppActivity m_thisptr;

    static {
        AppActivity.m_thisptr = null;
    }

    public AppActivity() {
        this.lp = -2;
    }

    private boolean appInstalledOrNot(String uri) {
        PackageManager packageManager0 = this.getPackageManager();
        try {
            packageManager0.getPackageInfo(uri, 1);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static void launchInterstitial() {
        AppActivity.m_thisptr.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(AppActivity.m_interstitial.isLoaded()) {
                    AppActivity.m_interstitial.show();
                }
            }
        });
    }

    @Override  // org.cocos2dx.lib.Cocos2dxActivity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppActivity.m_thisptr = this;
        AppActivity.adView = new AdView(this);
        AppActivity.adView.setAdSize(AdSize.BANNER);
        AppActivity.adView.setAdUnitId("ca-app-pub-0951055350914265/4738437365");
        FrameLayout.LayoutParams adParams = new FrameLayout.LayoutParams(-2, -2);
        adParams.gravity = 81;
        this.addContentView(AppActivity.adView, adParams);
        AdRequest adRequest0 = new Builder().build();
        AppActivity.adView.loadAd(adRequest0);
        AppActivity.m_interstitial = new InterstitialAd(this);
        AppActivity.m_interstitial.setAdUnitId("ca-app-pub-0951055350914265/8944178166");
        AppActivity.m_interstitial.setAdListener(new AdListener() {
            @Override  // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                AppActivity.m_interstitial.loadAd(new Builder().build());
            }
        });
        AdRequest adRequest1 = new Builder().build();
        AppActivity.m_interstitial.loadAd(adRequest1);
    }

    public static void tweet(String msg) {
        if(AppActivity.m_thisptr.appInstalledOrNot("com.twitter.android")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(("twitter://post?message=" + Uri.encode(msg))));
            AppActivity.m_thisptr.startActivity(intent);
        }
    }
}

