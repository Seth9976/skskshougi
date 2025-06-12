package com.sdkbox.reflect;

public class AdUnitEvent {
    private final int action_type;
    private final String ad_unit_id;
    private final Object extras;
    private final String zone_name;

    public AdUnitEvent(String unit, String zone, int act, Object ex) {
        this.ad_unit_id = unit;
        this.action_type = act;
        this.zone_name = zone;
        this.extras = ex;
    }

    public int getActionType() {
        return this.action_type;
    }

    public Object getExtras() {
        return this.extras;
    }

    public String getUnitId() {
        return this.ad_unit_id;
    }

    public String getZoneName() {
        return this.zone_name;
    }
}

