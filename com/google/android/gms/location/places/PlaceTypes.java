package com.google.android.gms.location.places;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PlaceTypes {
    public static final Set ALL;
    public static final Set zzazO;
    public static final Set zzazP;

    static {
        PlaceTypes.zzazO = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1001, 1002, 1003, 1005, 1006, 1009, 0x3F6, 0x3F7, 0x3F8, 0x3F9, 0x3FA, 0x3FB, 1020, 0x3FD, 0x3FE, 0x3FF, 0x400, 0x401, 0x402, 0x403, 0x404})));
        PlaceTypes.zzazP = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1001, 1002, 1003, 1005, 1009, 0x3F7, 0x3F8, 0x3F9})));
        PlaceTypes.ALL = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 0x3F, 0x40, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 0x5F, 0x60, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 0x3F0, 1009, 1010, 0x3F3, 0x3F4, 0x3F5, 0x3F6, 0x3F7, 0x3F8, 0x3F9, 0x3FA, 0x3FB, 1020, 0x3FD, 0x3FE, 0x3FF, 0x400, 0x401, 0x402, 0x403, 0x404, 1030})));
    }
}

