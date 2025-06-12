package com.google.android.gms.plus.internal.model.people;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.List;

public final class zzk extends zzc implements Person {
    public zzk(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzxX();
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getAboutMe() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public AgeRange getAgeRange() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getBirthday() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getBraggingRights() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getCircledByCount() {
        return 0;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public Cover getCover() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getCurrentLocation() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getDisplayName() {
        return this.getString("displayName");
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getGender() {
        return 0;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getId() {
        return this.getString("personId");
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public Image getImage() {
        return new ImageEntity(this.getString("image"));
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getLanguage() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public Name getName() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getNickname() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getObjectType() {
        return zza.zzdY(this.getString("objectType"));
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public List getOrganizations() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public List getPlacesLived() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getPlusOneCount() {
        return 0;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public int getRelationshipStatus() {
        return 0;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getTagline() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public String getUrl() {
        return this.getString("url");
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public List getUrls() {
        return null;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasAboutMe() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasAgeRange() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasBirthday() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasBraggingRights() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasCircledByCount() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasCover() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasCurrentLocation() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasDisplayName() {
        return true;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasGender() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasId() {
        return true;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasImage() {
        return true;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasIsPlusUser() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasLanguage() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasName() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasNickname() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasObjectType() {
        return true;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasOrganizations() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasPlacesLived() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasPlusOneCount() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasRelationshipStatus() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasTagline() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasUrl() {
        return true;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasUrls() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean hasVerified() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean isPlusUser() {
        return false;
    }

    @Override  // com.google.android.gms.plus.model.people.Person
    public boolean isVerified() {
        return false;
    }

    public ArrayList zzxU() [...] // Inlined contents

    public ArrayList zzxV() [...] // Inlined contents

    public ArrayList zzxW() [...] // Inlined contents

    public Person zzxX() {
        return new PersonEntity(this.getDisplayName(), this.getId(), ((ImageEntity)this.getImage()), this.getObjectType(), this.getUrl());
    }
}

