package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle {
    public static final int COLOR_UNSPECIFIED = 0;
    public static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNSPECIFIED = -1;
    public static final int FONT_FAMILY_CASUAL = 4;
    public static final int FONT_FAMILY_CURSIVE = 5;
    public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
    public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
    public static final int FONT_FAMILY_SANS_SERIF = 0;
    public static final int FONT_FAMILY_SERIF = 2;
    public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
    public static final int FONT_FAMILY_UNSPECIFIED = -1;
    public static final int FONT_STYLE_BOLD = 1;
    public static final int FONT_STYLE_BOLD_ITALIC = 3;
    public static final int FONT_STYLE_ITALIC = 2;
    public static final int FONT_STYLE_NORMAL = 0;
    public static final int FONT_STYLE_UNSPECIFIED = -1;
    public static final int WINDOW_TYPE_NONE = 0;
    public static final int WINDOW_TYPE_NORMAL = 1;
    public static final int WINDOW_TYPE_ROUNDED = 2;
    public static final int WINDOW_TYPE_UNSPECIFIED = -1;
    private JSONObject zzRJ;
    private float zzTc;
    private int zzTd;
    private int zzTe;
    private int zzTf;
    private int zzTg;
    private int zzTh;
    private int zzTi;
    private String zzTj;
    private int zzTk;
    private int zzTl;
    private int zzvc;

    public TextTrackStyle() {
        this.clear();
    }

    private void clear() {
        this.zzTc = 1.0f;
        this.zzTd = 0;
        this.zzvc = 0;
        this.zzTe = -1;
        this.zzTf = 0;
        this.zzTg = -1;
        this.zzTh = 0;
        this.zzTi = 0;
        this.zzTj = null;
        this.zzTk = -1;
        this.zzTl = -1;
        this.zzRJ = null;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(other instanceof TextTrackStyle) {
            if(this.zzRJ == null) {
                return ((TextTrackStyle)other).zzRJ == null ? (this.zzRJ == null || ((TextTrackStyle)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((TextTrackStyle)other).zzRJ)) && (this.zzTc == ((TextTrackStyle)other).zzTc && this.zzTd == ((TextTrackStyle)other).zzTd && this.zzvc == ((TextTrackStyle)other).zzvc && this.zzTe == ((TextTrackStyle)other).zzTe && this.zzTf == ((TextTrackStyle)other).zzTf && this.zzTg == ((TextTrackStyle)other).zzTg && this.zzTi == ((TextTrackStyle)other).zzTi && zzf.zza(this.zzTj, ((TextTrackStyle)other).zzTj) && this.zzTk == ((TextTrackStyle)other).zzTk && this.zzTl == ((TextTrackStyle)other).zzTl) : false;
            }
            return ((TextTrackStyle)other).zzRJ == null ? false : (this.zzRJ == null || ((TextTrackStyle)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((TextTrackStyle)other).zzRJ)) && (this.zzTc == ((TextTrackStyle)other).zzTc && this.zzTd == ((TextTrackStyle)other).zzTd && this.zzvc == ((TextTrackStyle)other).zzvc && this.zzTe == ((TextTrackStyle)other).zzTe && this.zzTf == ((TextTrackStyle)other).zzTf && this.zzTg == ((TextTrackStyle)other).zzTg && this.zzTi == ((TextTrackStyle)other).zzTi && zzf.zza(this.zzTj, ((TextTrackStyle)other).zzTj) && this.zzTk == ((TextTrackStyle)other).zzTk && this.zzTl == ((TextTrackStyle)other).zzTl);
        }
        return false;
    }

    public static TextTrackStyle fromSystemSettings(Context context) {
        TextTrackStyle textTrackStyle0 = new TextTrackStyle();
        CaptioningManager captioningManager0 = (CaptioningManager)context.getSystemService("captioning");
        textTrackStyle0.setFontScale(captioningManager0.getFontScale());
        CaptioningManager.CaptionStyle captioningManager$CaptionStyle0 = captioningManager0.getUserStyle();
        textTrackStyle0.setBackgroundColor(captioningManager$CaptionStyle0.backgroundColor);
        textTrackStyle0.setForegroundColor(captioningManager$CaptionStyle0.foregroundColor);
        switch(captioningManager$CaptionStyle0.edgeType) {
            case 1: {
                textTrackStyle0.setEdgeType(1);
                break;
            }
            case 2: {
                textTrackStyle0.setEdgeType(2);
                break;
            }
            default: {
                textTrackStyle0.setEdgeType(0);
            }
        }
        textTrackStyle0.setEdgeColor(captioningManager$CaptionStyle0.edgeColor);
        Typeface typeface0 = captioningManager$CaptionStyle0.getTypeface();
        if(typeface0 != null) {
            if(Typeface.MONOSPACE.equals(typeface0)) {
                textTrackStyle0.setFontGenericFamily(1);
            }
            else if(Typeface.SANS_SERIF.equals(typeface0)) {
                textTrackStyle0.setFontGenericFamily(0);
            }
            else if(Typeface.SERIF.equals(typeface0)) {
                textTrackStyle0.setFontGenericFamily(2);
            }
            else {
                textTrackStyle0.setFontGenericFamily(0);
            }
            boolean z = typeface0.isBold();
            boolean z1 = typeface0.isItalic();
            if(z && z1) {
                textTrackStyle0.setFontStyle(3);
                return textTrackStyle0;
            }
            if(z) {
                textTrackStyle0.setFontStyle(1);
                return textTrackStyle0;
            }
            if(z1) {
                textTrackStyle0.setFontStyle(2);
                return textTrackStyle0;
            }
            textTrackStyle0.setFontStyle(0);
            return textTrackStyle0;
        }
        return textTrackStyle0;
    }

    public int getBackgroundColor() {
        return this.zzvc;
    }

    public JSONObject getCustomData() {
        return this.zzRJ;
    }

    public int getEdgeColor() {
        return this.zzTf;
    }

    public int getEdgeType() {
        return this.zzTe;
    }

    public String getFontFamily() {
        return this.zzTj;
    }

    public int getFontGenericFamily() {
        return this.zzTk;
    }

    public float getFontScale() {
        return this.zzTc;
    }

    public int getFontStyle() {
        return this.zzTl;
    }

    public int getForegroundColor() {
        return this.zzTd;
    }

    public int getWindowColor() {
        return this.zzTh;
    }

    public int getWindowCornerRadius() {
        return this.zzTi;
    }

    public int getWindowType() {
        return this.zzTg;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzTc, this.zzTd, this.zzvc, this.zzTe, this.zzTf, this.zzTg, this.zzTh, this.zzTi, this.zzTj, this.zzTk, this.zzTl, this.zzRJ});
    }

    public void setBackgroundColor(int backgroundColor) {
        this.zzvc = backgroundColor;
    }

    public void setCustomData(JSONObject customData) {
        this.zzRJ = customData;
    }

    public void setEdgeColor(int edgeColor) {
        this.zzTf = edgeColor;
    }

    public void setEdgeType(int edgeType) {
        if(edgeType < 0 || edgeType > 4) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.zzTe = edgeType;
    }

    public void setFontFamily(String fontFamily) {
        this.zzTj = fontFamily;
    }

    public void setFontGenericFamily(int fontGenericFamily) {
        if(fontGenericFamily < 0 || fontGenericFamily > 6) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.zzTk = fontGenericFamily;
    }

    public void setFontScale(float fontScale) {
        this.zzTc = fontScale;
    }

    public void setFontStyle(int fontStyle) {
        if(fontStyle < 0 || fontStyle > 3) {
            throw new IllegalArgumentException("invalid fontStyle");
        }
        this.zzTl = fontStyle;
    }

    public void setForegroundColor(int foregroundColor) {
        this.zzTd = foregroundColor;
    }

    public void setWindowColor(int windowColor) {
        this.zzTh = windowColor;
    }

    public void setWindowCornerRadius(int windowCornerRadius) {
        if(windowCornerRadius < 0) {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        }
        this.zzTi = windowCornerRadius;
    }

    public void setWindowType(int windowType) {
        if(windowType < 0 || windowType > 2) {
            throw new IllegalArgumentException("invalid windowType");
        }
        this.zzTg = windowType;
    }

    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("fontScale", ((double)this.zzTc));
            if(this.zzTd != 0) {
                jSONObject0.put("foregroundColor", this.zzG(this.zzTd));
            }
            if(this.zzvc != 0) {
                jSONObject0.put("backgroundColor", this.zzG(this.zzvc));
            }
            switch(this.zzTe) {
                case 0: {
                    jSONObject0.put("edgeType", "NONE");
                    break;
                }
                case 1: {
                    jSONObject0.put("edgeType", "OUTLINE");
                    break;
                }
                case 2: {
                    jSONObject0.put("edgeType", "DROP_SHADOW");
                    break;
                }
                case 3: {
                    jSONObject0.put("edgeType", "RAISED");
                    break;
                }
                case 4: {
                    jSONObject0.put("edgeType", "DEPRESSED");
                }
            }
            if(this.zzTf != 0) {
                jSONObject0.put("edgeColor", this.zzG(this.zzTf));
            }
            switch(this.zzTg) {
                case 0: {
                    jSONObject0.put("windowType", "NONE");
                    break;
                }
                case 1: {
                    jSONObject0.put("windowType", "NORMAL");
                    break;
                }
                case 2: {
                    jSONObject0.put("windowType", "ROUNDED_CORNERS");
                }
            }
            if(this.zzTh != 0) {
                jSONObject0.put("windowColor", this.zzG(this.zzTh));
            }
            if(this.zzTg == 2) {
                jSONObject0.put("windowRoundedCornerRadius", this.zzTi);
            }
            if(this.zzTj != null) {
                jSONObject0.put("fontFamily", this.zzTj);
            }
            switch(this.zzTk) {
                case 0: {
                    jSONObject0.put("fontGenericFamily", "SANS_SERIF");
                    break;
                }
                case 1: {
                    jSONObject0.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                }
                case 2: {
                    jSONObject0.put("fontGenericFamily", "SERIF");
                    break;
                }
                case 3: {
                    jSONObject0.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                }
                case 4: {
                    jSONObject0.put("fontGenericFamily", "CASUAL");
                    break;
                }
                case 5: {
                    jSONObject0.put("fontGenericFamily", "CURSIVE");
                    break;
                }
                case 6: {
                    jSONObject0.put("fontGenericFamily", "SMALL_CAPITALS");
                }
            }
            switch(this.zzTl) {
                case 0: {
                    jSONObject0.put("fontStyle", "NORMAL");
                    break;
                }
                case 1: {
                    jSONObject0.put("fontStyle", "BOLD");
                    break;
                }
                case 2: {
                    jSONObject0.put("fontStyle", "ITALIC");
                    break;
                }
                case 3: {
                    jSONObject0.put("fontStyle", "BOLD_ITALIC");
                }
            }
            if(this.zzRJ != null) {
                jSONObject0.put("customData", this.zzRJ);
            }
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    private String zzG(int v) {
        return String.format("#%02X%02X%02X%02X", Color.red(v), Color.green(v), Color.blue(v), Color.alpha(v));
    }

    private int zzbz(String s) {
        if(s != null && s.length() == 9 && s.charAt(0) == 35) {
            try {
                int v = Integer.parseInt(s.substring(1, 3), 16);
                int v1 = Integer.parseInt(s.substring(3, 5), 16);
                int v2 = Integer.parseInt(s.substring(5, 7), 16);
                return Color.argb(Integer.parseInt(s.substring(7, 9), 16), v, v1, v2);
            }
            catch(NumberFormatException unused_ex) {
                return 0;
            }
        }
        return 0;
    }

    public void zzf(JSONObject jSONObject0) throws JSONException {
        this.clear();
        this.zzTc = (float)jSONObject0.optDouble("fontScale", 1.0);
        this.zzTd = this.zzbz(jSONObject0.optString("foregroundColor"));
        this.zzvc = this.zzbz(jSONObject0.optString("backgroundColor"));
        if(jSONObject0.has("edgeType")) {
            String s = jSONObject0.getString("edgeType");
            if("NONE".equals(s)) {
                this.zzTe = 0;
            }
            else if("OUTLINE".equals(s)) {
                this.zzTe = 1;
            }
            else if("DROP_SHADOW".equals(s)) {
                this.zzTe = 2;
            }
            else if("RAISED".equals(s)) {
                this.zzTe = 3;
            }
            else if("DEPRESSED".equals(s)) {
                this.zzTe = 4;
            }
        }
        this.zzTf = this.zzbz(jSONObject0.optString("edgeColor"));
        if(jSONObject0.has("windowType")) {
            String s1 = jSONObject0.getString("windowType");
            if("NONE".equals(s1)) {
                this.zzTg = 0;
            }
            else if("NORMAL".equals(s1)) {
                this.zzTg = 1;
            }
            else if("ROUNDED_CORNERS".equals(s1)) {
                this.zzTg = 2;
            }
        }
        this.zzTh = this.zzbz(jSONObject0.optString("windowColor"));
        if(this.zzTg == 2) {
            this.zzTi = jSONObject0.optInt("windowRoundedCornerRadius", 0);
        }
        this.zzTj = jSONObject0.optString("fontFamily", null);
        if(jSONObject0.has("fontGenericFamily")) {
            String s2 = jSONObject0.getString("fontGenericFamily");
            if("SANS_SERIF".equals(s2)) {
                this.zzTk = 0;
            }
            else if("MONOSPACED_SANS_SERIF".equals(s2)) {
                this.zzTk = 1;
            }
            else if("SERIF".equals(s2)) {
                this.zzTk = 2;
            }
            else if("MONOSPACED_SERIF".equals(s2)) {
                this.zzTk = 3;
            }
            else if("CASUAL".equals(s2)) {
                this.zzTk = 4;
            }
            else if("CURSIVE".equals(s2)) {
                this.zzTk = 5;
            }
            else if("SMALL_CAPITALS".equals(s2)) {
                this.zzTk = 6;
            }
        }
        if(jSONObject0.has("fontStyle")) {
            String s3 = jSONObject0.getString("fontStyle");
            if("NORMAL".equals(s3)) {
                this.zzTl = 0;
            }
            else if("BOLD".equals(s3)) {
                this.zzTl = 1;
            }
            else if("ITALIC".equals(s3)) {
                this.zzTl = 2;
            }
            else if("BOLD_ITALIC".equals(s3)) {
                this.zzTl = 3;
            }
        }
        this.zzRJ = jSONObject0.optJSONObject("customData");
    }
}

