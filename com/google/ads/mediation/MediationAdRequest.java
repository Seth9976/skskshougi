package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest {
    private final Date zzaQ;
    private final Gender zzaR;
    private final Set zzaS;
    private final boolean zzaT;
    private final Location zzaU;

    public MediationAdRequest(Date birthday, Gender gender, Set set0, boolean isTesting, Location location) {
        this.zzaQ = birthday;
        this.zzaR = gender;
        this.zzaS = set0;
        this.zzaT = isTesting;
        this.zzaU = location;
    }

    public Integer getAgeInYears() {
        if(this.zzaQ != null) {
            Calendar calendar0 = Calendar.getInstance();
            Calendar calendar1 = Calendar.getInstance();
            calendar0.setTime(this.zzaQ);
            Integer integer0 = (int)(calendar1.get(1) - calendar0.get(1));
            return calendar1.get(2) >= calendar0.get(2) && (calendar1.get(2) != calendar0.get(2) || calendar1.get(5) >= calendar0.get(5)) ? integer0 : ((int)(((int)integer0) - 1));
        }
        return null;
    }

    public Date getBirthday() {
        return this.zzaQ;
    }

    public Gender getGender() {
        return this.zzaR;
    }

    public Set getKeywords() {
        return this.zzaS;
    }

    public Location getLocation() {
        return this.zzaU;
    }

    public boolean isTesting() {
        return this.zzaT;
    }
}

