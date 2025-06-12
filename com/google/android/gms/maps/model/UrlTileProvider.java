package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {
    private final int zznM;
    private final int zznN;

    public UrlTileProvider(int width, int height) {
        this.zznM = width;
        this.zznN = height;
    }

    @Override  // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int x, int y, int zoom) {
        URL uRL0 = this.getTileUrl(x, y, zoom);
        if(uRL0 == null) {
            return UrlTileProvider.NO_TILE;
        }
        try {
            byte[] arr_b = UrlTileProvider.zzl(uRL0.openStream());
            return new Tile(this.zznM, this.zznN, arr_b);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public abstract URL getTileUrl(int arg1, int arg2, int arg3);

    private static long zzb(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x1000];
        long v = 0L;
        int v1;
        while((v1 = inputStream0.read(arr_b)) != -1) {
            outputStream0.write(arr_b, 0, v1);
            v += (long)v1;
        }
        return v;
    }

    private static byte[] zzl(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        UrlTileProvider.zzb(inputStream0, byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }
}

