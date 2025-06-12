package com.google.android.gms.ads.formats;

public final class NativeAdOptions {
    public static final class Builder {
        private boolean zznS;
        private int zznT;
        private boolean zznU;

        public Builder() {
            this.zznS = false;
            this.zznT = 0;
            this.zznU = false;
        }

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder setImageOrientation(int orientation) {
            this.zznT = orientation;
            return this;
        }

        public Builder setRequestMultipleImages(boolean shouldRequestMultipleImages) {
            this.zznU = shouldRequestMultipleImages;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean shouldReturnUrls) {
            this.zznS = shouldReturnUrls;
            return this;
        }
    }

    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zznS;
    private final int zznT;
    private final boolean zznU;

    private NativeAdOptions(Builder builder) {
        this.zznS = builder.zznS;
        this.zznT = builder.zznT;
        this.zznU = builder.zznU;
    }

    NativeAdOptions(Builder x0, com.google.android.gms.ads.formats.NativeAdOptions.1 x1) {
        this(x0);
    }

    public int getImageOrientation() {
        return this.zznT;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zznU;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zznS;
    }

    class com.google.android.gms.ads.formats.NativeAdOptions.1 {
    }

}

