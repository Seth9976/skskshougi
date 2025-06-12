package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ItemScopeEntity extends FastSafeParcelableJsonResponse implements ItemScope {
    public static final zza CREATOR;
    String mName;
    final int zzCY;
    String zzEl;
    String zzF;
    String zzKI;
    private static final HashMap zzaHP;
    final Set zzaHQ;
    ItemScopeEntity zzaHR;
    List zzaHS;
    ItemScopeEntity zzaHT;
    String zzaHU;
    String zzaHV;
    String zzaHW;
    List zzaHX;
    int zzaHY;
    List zzaHZ;
    String zzaIA;
    String zzaIB;
    ItemScopeEntity zzaIC;
    String zzaID;
    String zzaIE;
    String zzaIF;
    ItemScopeEntity zzaIG;
    String zzaIH;
    String zzaII;
    String zzaIJ;
    String zzaIK;
    ItemScopeEntity zzaIa;
    List zzaIb;
    String zzaIc;
    String zzaId;
    ItemScopeEntity zzaIe;
    String zzaIf;
    String zzaIg;
    List zzaIh;
    String zzaIi;
    String zzaIj;
    String zzaIk;
    String zzaIl;
    String zzaIm;
    String zzaIn;
    String zzaIo;
    String zzaIp;
    ItemScopeEntity zzaIq;
    String zzaIr;
    String zzaIs;
    String zzaIt;
    ItemScopeEntity zzaIu;
    ItemScopeEntity zzaIv;
    ItemScopeEntity zzaIw;
    List zzaIx;
    String zzaIy;
    String zzaIz;
    String zzakM;
    double zzaxB;
    double zzaxC;
    String zzsB;

    static {
        ItemScopeEntity.CREATOR = new zza();
        ItemScopeEntity.zzaHP = new HashMap();
        Field fastJsonResponse$Field0 = Field.zza("about", 2, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("about", fastJsonResponse$Field0);
        Field fastJsonResponse$Field1 = Field.zzm("additionalName", 3);
        ItemScopeEntity.zzaHP.put("additionalName", fastJsonResponse$Field1);
        Field fastJsonResponse$Field2 = Field.zza("address", 4, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("address", fastJsonResponse$Field2);
        Field fastJsonResponse$Field3 = Field.zzl("addressCountry", 5);
        ItemScopeEntity.zzaHP.put("addressCountry", fastJsonResponse$Field3);
        Field fastJsonResponse$Field4 = Field.zzl("addressLocality", 6);
        ItemScopeEntity.zzaHP.put("addressLocality", fastJsonResponse$Field4);
        Field fastJsonResponse$Field5 = Field.zzl("addressRegion", 7);
        ItemScopeEntity.zzaHP.put("addressRegion", fastJsonResponse$Field5);
        Field fastJsonResponse$Field6 = Field.zzb("associated_media", 8, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("associated_media", fastJsonResponse$Field6);
        Field fastJsonResponse$Field7 = Field.zzi("attendeeCount", 9);
        ItemScopeEntity.zzaHP.put("attendeeCount", fastJsonResponse$Field7);
        Field fastJsonResponse$Field8 = Field.zzb("attendees", 10, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("attendees", fastJsonResponse$Field8);
        Field fastJsonResponse$Field9 = Field.zza("audio", 11, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("audio", fastJsonResponse$Field9);
        Field fastJsonResponse$Field10 = Field.zzb("author", 12, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("author", fastJsonResponse$Field10);
        Field fastJsonResponse$Field11 = Field.zzl("bestRating", 13);
        ItemScopeEntity.zzaHP.put("bestRating", fastJsonResponse$Field11);
        Field fastJsonResponse$Field12 = Field.zzl("birthDate", 14);
        ItemScopeEntity.zzaHP.put("birthDate", fastJsonResponse$Field12);
        Field fastJsonResponse$Field13 = Field.zza("byArtist", 15, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("byArtist", fastJsonResponse$Field13);
        Field fastJsonResponse$Field14 = Field.zzl("caption", 16);
        ItemScopeEntity.zzaHP.put("caption", fastJsonResponse$Field14);
        Field fastJsonResponse$Field15 = Field.zzl("contentSize", 17);
        ItemScopeEntity.zzaHP.put("contentSize", fastJsonResponse$Field15);
        Field fastJsonResponse$Field16 = Field.zzl("contentUrl", 18);
        ItemScopeEntity.zzaHP.put("contentUrl", fastJsonResponse$Field16);
        Field fastJsonResponse$Field17 = Field.zzb("contributor", 19, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("contributor", fastJsonResponse$Field17);
        Field fastJsonResponse$Field18 = Field.zzl("dateCreated", 20);
        ItemScopeEntity.zzaHP.put("dateCreated", fastJsonResponse$Field18);
        Field fastJsonResponse$Field19 = Field.zzl("dateModified", 21);
        ItemScopeEntity.zzaHP.put("dateModified", fastJsonResponse$Field19);
        Field fastJsonResponse$Field20 = Field.zzl("datePublished", 22);
        ItemScopeEntity.zzaHP.put("datePublished", fastJsonResponse$Field20);
        Field fastJsonResponse$Field21 = Field.zzl("description", 23);
        ItemScopeEntity.zzaHP.put("description", fastJsonResponse$Field21);
        Field fastJsonResponse$Field22 = Field.zzl("duration", 24);
        ItemScopeEntity.zzaHP.put("duration", fastJsonResponse$Field22);
        Field fastJsonResponse$Field23 = Field.zzl("embedUrl", 25);
        ItemScopeEntity.zzaHP.put("embedUrl", fastJsonResponse$Field23);
        Field fastJsonResponse$Field24 = Field.zzl("endDate", 26);
        ItemScopeEntity.zzaHP.put("endDate", fastJsonResponse$Field24);
        Field fastJsonResponse$Field25 = Field.zzl("familyName", 27);
        ItemScopeEntity.zzaHP.put("familyName", fastJsonResponse$Field25);
        Field fastJsonResponse$Field26 = Field.zzl("gender", 28);
        ItemScopeEntity.zzaHP.put("gender", fastJsonResponse$Field26);
        Field fastJsonResponse$Field27 = Field.zza("geo", 29, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("geo", fastJsonResponse$Field27);
        Field fastJsonResponse$Field28 = Field.zzl("givenName", 30);
        ItemScopeEntity.zzaHP.put("givenName", fastJsonResponse$Field28);
        Field fastJsonResponse$Field29 = Field.zzl("height", 0x1F);
        ItemScopeEntity.zzaHP.put("height", fastJsonResponse$Field29);
        Field fastJsonResponse$Field30 = Field.zzl("id", 0x20);
        ItemScopeEntity.zzaHP.put("id", fastJsonResponse$Field30);
        Field fastJsonResponse$Field31 = Field.zzl("image", 33);
        ItemScopeEntity.zzaHP.put("image", fastJsonResponse$Field31);
        Field fastJsonResponse$Field32 = Field.zza("inAlbum", 34, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("inAlbum", fastJsonResponse$Field32);
        Field fastJsonResponse$Field33 = Field.zzj("latitude", 36);
        ItemScopeEntity.zzaHP.put("latitude", fastJsonResponse$Field33);
        Field fastJsonResponse$Field34 = Field.zza("location", 37, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("location", fastJsonResponse$Field34);
        Field fastJsonResponse$Field35 = Field.zzj("longitude", 38);
        ItemScopeEntity.zzaHP.put("longitude", fastJsonResponse$Field35);
        Field fastJsonResponse$Field36 = Field.zzl("name", 39);
        ItemScopeEntity.zzaHP.put("name", fastJsonResponse$Field36);
        Field fastJsonResponse$Field37 = Field.zza("partOfTVSeries", 40, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("partOfTVSeries", fastJsonResponse$Field37);
        Field fastJsonResponse$Field38 = Field.zzb("performers", 41, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("performers", fastJsonResponse$Field38);
        Field fastJsonResponse$Field39 = Field.zzl("playerType", 42);
        ItemScopeEntity.zzaHP.put("playerType", fastJsonResponse$Field39);
        Field fastJsonResponse$Field40 = Field.zzl("postOfficeBoxNumber", 43);
        ItemScopeEntity.zzaHP.put("postOfficeBoxNumber", fastJsonResponse$Field40);
        Field fastJsonResponse$Field41 = Field.zzl("postalCode", 44);
        ItemScopeEntity.zzaHP.put("postalCode", fastJsonResponse$Field41);
        Field fastJsonResponse$Field42 = Field.zzl("ratingValue", 45);
        ItemScopeEntity.zzaHP.put("ratingValue", fastJsonResponse$Field42);
        Field fastJsonResponse$Field43 = Field.zza("reviewRating", 46, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("reviewRating", fastJsonResponse$Field43);
        Field fastJsonResponse$Field44 = Field.zzl("startDate", 0x2F);
        ItemScopeEntity.zzaHP.put("startDate", fastJsonResponse$Field44);
        Field fastJsonResponse$Field45 = Field.zzl("streetAddress", 0x30);
        ItemScopeEntity.zzaHP.put("streetAddress", fastJsonResponse$Field45);
        Field fastJsonResponse$Field46 = Field.zzl("text", 49);
        ItemScopeEntity.zzaHP.put("text", fastJsonResponse$Field46);
        Field fastJsonResponse$Field47 = Field.zza("thumbnail", 50, ItemScopeEntity.class);
        ItemScopeEntity.zzaHP.put("thumbnail", fastJsonResponse$Field47);
        Field fastJsonResponse$Field48 = Field.zzl("thumbnailUrl", 51);
        ItemScopeEntity.zzaHP.put("thumbnailUrl", fastJsonResponse$Field48);
        Field fastJsonResponse$Field49 = Field.zzl("tickerSymbol", 52);
        ItemScopeEntity.zzaHP.put("tickerSymbol", fastJsonResponse$Field49);
        Field fastJsonResponse$Field50 = Field.zzl("type", 53);
        ItemScopeEntity.zzaHP.put("type", fastJsonResponse$Field50);
        Field fastJsonResponse$Field51 = Field.zzl("url", 54);
        ItemScopeEntity.zzaHP.put("url", fastJsonResponse$Field51);
        Field fastJsonResponse$Field52 = Field.zzl("width", 55);
        ItemScopeEntity.zzaHP.put("width", fastJsonResponse$Field52);
        Field fastJsonResponse$Field53 = Field.zzl("worstRating", 56);
        ItemScopeEntity.zzaHP.put("worstRating", fastJsonResponse$Field53);
    }

    public ItemScopeEntity() {
        this.zzCY = 1;
        this.zzaHQ = new HashSet();
    }

    ItemScopeEntity(Set set0, int versionCode, ItemScopeEntity about, List list0, ItemScopeEntity address, String addressCountry, String addressLocality, String addressRegion, List list1, int attendeeCount, List list2, ItemScopeEntity audio, List list3, String bestRating, String birthDate, ItemScopeEntity byArtist, String caption, String contentSize, String contentUrl, List list4, String dateCreated, String dateModified, String datePublished, String description, String duration, String embedUrl, String endDate, String familyName, String gender, ItemScopeEntity geo, String givenName, String height, String id, String image, ItemScopeEntity inAlbum, double latitude, ItemScopeEntity location, double longitude, String name, ItemScopeEntity partOfTVSeries, List list5, String playerType, String postOfficeBoxNumber, String postalCode, String ratingValue, ItemScopeEntity reviewRating, String startDate, String streetAddress, String text, ItemScopeEntity thumbnail, String thumbnailUrl, String tickerSymbol, String type, String url, String width, String worstRating) {
        this.zzaHQ = set0;
        this.zzCY = versionCode;
        this.zzaHR = about;
        this.zzaHS = list0;
        this.zzaHT = address;
        this.zzaHU = addressCountry;
        this.zzaHV = addressLocality;
        this.zzaHW = addressRegion;
        this.zzaHX = list1;
        this.zzaHY = attendeeCount;
        this.zzaHZ = list2;
        this.zzaIa = audio;
        this.zzaIb = list3;
        this.zzaIc = bestRating;
        this.zzaId = birthDate;
        this.zzaIe = byArtist;
        this.zzaIf = caption;
        this.zzaIg = contentSize;
        this.zzsB = contentUrl;
        this.zzaIh = list4;
        this.zzaIi = dateCreated;
        this.zzaIj = dateModified;
        this.zzaIk = datePublished;
        this.zzakM = description;
        this.zzaIl = duration;
        this.zzaIm = embedUrl;
        this.zzaIn = endDate;
        this.zzaIo = familyName;
        this.zzaIp = gender;
        this.zzaIq = geo;
        this.zzaIr = givenName;
        this.zzaIs = height;
        this.zzKI = id;
        this.zzaIt = image;
        this.zzaIu = inAlbum;
        this.zzaxB = latitude;
        this.zzaIv = location;
        this.zzaxC = longitude;
        this.mName = name;
        this.zzaIw = partOfTVSeries;
        this.zzaIx = list5;
        this.zzaIy = playerType;
        this.zzaIz = postOfficeBoxNumber;
        this.zzaIA = postalCode;
        this.zzaIB = ratingValue;
        this.zzaIC = reviewRating;
        this.zzaID = startDate;
        this.zzaIE = streetAddress;
        this.zzaIF = text;
        this.zzaIG = thumbnail;
        this.zzaIH = thumbnailUrl;
        this.zzaII = tickerSymbol;
        this.zzEl = type;
        this.zzF = url;
        this.zzaIJ = width;
        this.zzaIK = worstRating;
    }

    public ItemScopeEntity(Set set0, ItemScopeEntity about, List list0, ItemScopeEntity address, String addressCountry, String addressLocality, String addressRegion, List list1, int attendeeCount, List list2, ItemScopeEntity audio, List list3, String bestRating, String birthDate, ItemScopeEntity byArtist, String caption, String contentSize, String contentUrl, List list4, String dateCreated, String dateModified, String datePublished, String description, String duration, String embedUrl, String endDate, String familyName, String gender, ItemScopeEntity geo, String givenName, String height, String id, String image, ItemScopeEntity inAlbum, double latitude, ItemScopeEntity location, double longitude, String name, ItemScopeEntity partOfTVSeries, List list5, String playerType, String postOfficeBoxNumber, String postalCode, String ratingValue, ItemScopeEntity reviewRating, String startDate, String streetAddress, String text, ItemScopeEntity thumbnail, String thumbnailUrl, String tickerSymbol, String type, String url, String width, String worstRating) {
        this.zzaHQ = set0;
        this.zzCY = 1;
        this.zzaHR = about;
        this.zzaHS = list0;
        this.zzaHT = address;
        this.zzaHU = addressCountry;
        this.zzaHV = addressLocality;
        this.zzaHW = addressRegion;
        this.zzaHX = list1;
        this.zzaHY = attendeeCount;
        this.zzaHZ = list2;
        this.zzaIa = audio;
        this.zzaIb = list3;
        this.zzaIc = bestRating;
        this.zzaId = birthDate;
        this.zzaIe = byArtist;
        this.zzaIf = caption;
        this.zzaIg = contentSize;
        this.zzsB = contentUrl;
        this.zzaIh = list4;
        this.zzaIi = dateCreated;
        this.zzaIj = dateModified;
        this.zzaIk = datePublished;
        this.zzakM = description;
        this.zzaIl = duration;
        this.zzaIm = embedUrl;
        this.zzaIn = endDate;
        this.zzaIo = familyName;
        this.zzaIp = gender;
        this.zzaIq = geo;
        this.zzaIr = givenName;
        this.zzaIs = height;
        this.zzKI = id;
        this.zzaIt = image;
        this.zzaIu = inAlbum;
        this.zzaxB = latitude;
        this.zzaIv = location;
        this.zzaxC = longitude;
        this.mName = name;
        this.zzaIw = partOfTVSeries;
        this.zzaIx = list5;
        this.zzaIy = playerType;
        this.zzaIz = postOfficeBoxNumber;
        this.zzaIA = postalCode;
        this.zzaIB = ratingValue;
        this.zzaIC = reviewRating;
        this.zzaID = startDate;
        this.zzaIE = streetAddress;
        this.zzaIF = text;
        this.zzaIG = thumbnail;
        this.zzaIH = thumbnailUrl;
        this.zzaII = tickerSymbol;
        this.zzEl = type;
        this.zzF = url;
        this.zzaIJ = width;
        this.zzaIK = worstRating;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ItemScopeEntity)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        for(Object object1: ItemScopeEntity.zzaHP.values()) {
            Field fastJsonResponse$Field0 = (Field)object1;
            if(this.zza(fastJsonResponse$Field0)) {
                if(((ItemScopeEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((ItemScopeEntity)obj).zzb(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((ItemScopeEntity)obj).zza(fastJsonResponse$Field0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getAbout() {
        return this.zzaHR;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public List getAdditionalName() {
        return this.zzaHS;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getAddress() {
        return this.zzaHT;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getAddressCountry() {
        return this.zzaHU;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getAddressLocality() {
        return this.zzaHV;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getAddressRegion() {
        return this.zzaHW;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public List getAssociated_media() {
        return (ArrayList)this.zzaHX;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public int getAttendeeCount() {
        return this.zzaHY;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public List getAttendees() {
        return (ArrayList)this.zzaHZ;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getAudio() {
        return this.zzaIa;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public List getAuthor() {
        return (ArrayList)this.zzaIb;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getBestRating() {
        return this.zzaIc;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getBirthDate() {
        return this.zzaId;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getByArtist() {
        return this.zzaIe;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getCaption() {
        return this.zzaIf;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getContentSize() {
        return this.zzaIg;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getContentUrl() {
        return this.zzsB;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public List getContributor() {
        return (ArrayList)this.zzaIh;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getDateCreated() {
        return this.zzaIi;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getDateModified() {
        return this.zzaIj;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getDatePublished() {
        return this.zzaIk;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getDuration() {
        return this.zzaIl;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getEmbedUrl() {
        return this.zzaIm;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getEndDate() {
        return this.zzaIn;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getFamilyName() {
        return this.zzaIo;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getGender() {
        return this.zzaIp;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getGeo() {
        return this.zzaIq;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getGivenName() {
        return this.zzaIr;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getHeight() {
        return this.zzaIs;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getImage() {
        return this.zzaIt;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getInAlbum() {
        return this.zzaIu;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public double getLatitude() {
        return this.zzaxB;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getLocation() {
        return this.zzaIv;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public double getLongitude() {
        return this.zzaxC;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getName() {
        return this.mName;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getPartOfTVSeries() {
        return this.zzaIw;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public List getPerformers() {
        return (ArrayList)this.zzaIx;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getPlayerType() {
        return this.zzaIy;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getPostOfficeBoxNumber() {
        return this.zzaIz;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getPostalCode() {
        return this.zzaIA;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getRatingValue() {
        return this.zzaIB;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getReviewRating() {
        return this.zzaIC;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getStartDate() {
        return this.zzaID;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getStreetAddress() {
        return this.zzaIE;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getText() {
        return this.zzaIF;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public ItemScope getThumbnail() {
        return this.zzaIG;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getThumbnailUrl() {
        return this.zzaIH;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getTickerSymbol() {
        return this.zzaII;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getType() {
        return this.zzEl;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getUrl() {
        return this.zzF;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getWidth() {
        return this.zzaIJ;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public String getWorstRating() {
        return this.zzaIK;
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAbout() {
        return this.zzaHQ.contains(2);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAdditionalName() {
        return this.zzaHQ.contains(3);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAddress() {
        return this.zzaHQ.contains(4);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAddressCountry() {
        return this.zzaHQ.contains(5);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAddressLocality() {
        return this.zzaHQ.contains(6);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAddressRegion() {
        return this.zzaHQ.contains(7);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAssociated_media() {
        return this.zzaHQ.contains(8);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAttendeeCount() {
        return this.zzaHQ.contains(9);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAttendees() {
        return this.zzaHQ.contains(10);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAudio() {
        return this.zzaHQ.contains(11);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasAuthor() {
        return this.zzaHQ.contains(12);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasBestRating() {
        return this.zzaHQ.contains(13);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasBirthDate() {
        return this.zzaHQ.contains(14);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasByArtist() {
        return this.zzaHQ.contains(15);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasCaption() {
        return this.zzaHQ.contains(16);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasContentSize() {
        return this.zzaHQ.contains(17);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasContentUrl() {
        return this.zzaHQ.contains(18);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasContributor() {
        return this.zzaHQ.contains(19);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasDateCreated() {
        return this.zzaHQ.contains(20);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasDateModified() {
        return this.zzaHQ.contains(21);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasDatePublished() {
        return this.zzaHQ.contains(22);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasDescription() {
        return this.zzaHQ.contains(23);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasDuration() {
        return this.zzaHQ.contains(24);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasEmbedUrl() {
        return this.zzaHQ.contains(25);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasEndDate() {
        return this.zzaHQ.contains(26);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasFamilyName() {
        return this.zzaHQ.contains(27);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasGender() {
        return this.zzaHQ.contains(28);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasGeo() {
        return this.zzaHQ.contains(29);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasGivenName() {
        return this.zzaHQ.contains(30);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasHeight() {
        return this.zzaHQ.contains(0x1F);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasId() {
        return this.zzaHQ.contains(0x20);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasImage() {
        return this.zzaHQ.contains(33);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasInAlbum() {
        return this.zzaHQ.contains(34);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasLatitude() {
        return this.zzaHQ.contains(36);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasLocation() {
        return this.zzaHQ.contains(37);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasLongitude() {
        return this.zzaHQ.contains(38);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasName() {
        return this.zzaHQ.contains(39);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasPartOfTVSeries() {
        return this.zzaHQ.contains(40);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasPerformers() {
        return this.zzaHQ.contains(41);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasPlayerType() {
        return this.zzaHQ.contains(42);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasPostOfficeBoxNumber() {
        return this.zzaHQ.contains(43);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasPostalCode() {
        return this.zzaHQ.contains(44);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasRatingValue() {
        return this.zzaHQ.contains(45);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasReviewRating() {
        return this.zzaHQ.contains(46);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasStartDate() {
        return this.zzaHQ.contains(0x2F);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasStreetAddress() {
        return this.zzaHQ.contains(0x30);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasText() {
        return this.zzaHQ.contains(49);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasThumbnail() {
        return this.zzaHQ.contains(50);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasThumbnailUrl() {
        return this.zzaHQ.contains(51);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasTickerSymbol() {
        return this.zzaHQ.contains(52);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasType() {
        return this.zzaHQ.contains(53);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasUrl() {
        return this.zzaHQ.contains(54);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasWidth() {
        return this.zzaHQ.contains(55);
    }

    @Override  // com.google.android.gms.plus.model.moments.ItemScope
    public boolean hasWorstRating() {
        return this.zzaHQ.contains(56);
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: ItemScopeEntity.zzaHP.values()) {
            Field fastJsonResponse$Field0 = (Field)object0;
            v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
        }
        return v;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean zza(Field fastJsonResponse$Field0) {
        return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object zzb(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.zzot()) {
            case 2: {
                return this.zzaHR;
            }
            case 3: {
                return this.zzaHS;
            }
            case 4: {
                return this.zzaHT;
            }
            case 5: {
                return this.zzaHU;
            }
            case 6: {
                return this.zzaHV;
            }
            case 7: {
                return this.zzaHW;
            }
            case 8: {
                return this.zzaHX;
            }
            case 9: {
                return this.zzaHY;
            }
            case 10: {
                return this.zzaHZ;
            }
            case 11: {
                return this.zzaIa;
            }
            case 12: {
                return this.zzaIb;
            }
            case 13: {
                return this.zzaIc;
            }
            case 14: {
                return this.zzaId;
            }
            case 15: {
                return this.zzaIe;
            }
            case 16: {
                return this.zzaIf;
            }
            case 17: {
                return this.zzaIg;
            }
            case 18: {
                return this.zzsB;
            }
            case 19: {
                return this.zzaIh;
            }
            case 20: {
                return this.zzaIi;
            }
            case 21: {
                return this.zzaIj;
            }
            case 22: {
                return this.zzaIk;
            }
            case 23: {
                return this.zzakM;
            }
            case 24: {
                return this.zzaIl;
            }
            case 25: {
                return this.zzaIm;
            }
            case 26: {
                return this.zzaIn;
            }
            case 27: {
                return this.zzaIo;
            }
            case 28: {
                return this.zzaIp;
            }
            case 29: {
                return this.zzaIq;
            }
            case 30: {
                return this.zzaIr;
            }
            case 0x1F: {
                return this.zzaIs;
            }
            case 0x20: {
                return this.zzKI;
            }
            case 33: {
                return this.zzaIt;
            }
            case 34: {
                return this.zzaIu;
            }
            case 36: {
                return this.zzaxB;
            }
            case 37: {
                return this.zzaIv;
            }
            case 38: {
                return this.zzaxC;
            }
            case 39: {
                return this.mName;
            }
            case 40: {
                return this.zzaIw;
            }
            case 41: {
                return this.zzaIx;
            }
            case 42: {
                return this.zzaIy;
            }
            case 43: {
                return this.zzaIz;
            }
            case 44: {
                return this.zzaIA;
            }
            case 45: {
                return this.zzaIB;
            }
            case 46: {
                return this.zzaIC;
            }
            case 0x2F: {
                return this.zzaID;
            }
            case 0x30: {
                return this.zzaIE;
            }
            case 49: {
                return this.zzaIF;
            }
            case 50: {
                return this.zzaIG;
            }
            case 51: {
                return this.zzaIH;
            }
            case 52: {
                return this.zzaII;
            }
            case 53: {
                return this.zzEl;
            }
            case 54: {
                return this.zzF;
            }
            case 55: {
                return this.zzaIJ;
            }
            case 56: {
                return this.zzaIK;
            }
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map zzom() {
        return this.zzxF();
    }

    public HashMap zzxF() {
        return ItemScopeEntity.zzaHP;
    }

    public ItemScopeEntity zzxG() [...] // Inlined contents
}

