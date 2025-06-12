package com.sdkbox.reflect;

public class AdUnitEventReward {
    private final String ad_unit_id;
    private final float reward_amount;
    private final boolean reward_result;
    private final String zone_id;

    public AdUnitEventReward(String id, String zoneID, float amount, boolean result) {
        this.ad_unit_id = id;
        this.reward_amount = amount;
        this.reward_result = result;
        this.zone_id = zoneID;
    }

    public float getRewardAmount() {
        return this.reward_amount;
    }

    public boolean getRewardResult() {
        return this.reward_result;
    }

    public String getUnitId() {
        return this.ad_unit_id;
    }

    public String getZoneID() {
        return this.zone_id;
    }
}

