// ============================================================
// 函数名称: sub_406f90
// 虚拟地址: 0x406f90
// WARP GUID: 77c4f837-a78c-5ea1-b30c-ef5726f691b2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_403ed0, sub_40d460, sub_403de0, sub_403f60, sub_403be0, sub_40d150, sub_401990, sub_40f3c0, sub_402090, sub_40d0c0, sub_4199b8, sub_4067d0
// [被调用的父级函数]: sub_40adb0, sub_40dcf0, sub_404680
// ============================================================

int32_t __fastcallsub_406f90(int32_t* arg1)
{
    // 第一条实际指令: int32_t __saved_ebp_2
    int32_t __saved_ebp_2
    int32_t __saved_ebp_1 = __saved_ebp_2
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a95d
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t ebx
    int32_t var_f0 = ebx
    int32_t esi
    int32_t var_f4 = esi
    int32_t edi
    int32_t var_f8 = edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* eax_3 = cocos2d::UserDefault::getInstance()
    int32_t* ecx = arg1[0x114]
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        arg1[0x114] = 0
    
    int32_t* ecx_1 = arg1[0x10c]
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x12c))(1)
        arg1[0x10c] = 0
    
    (*(*arg1[0x113] + 0xac))(1, eax_2)
    (*(*arg1[0x112] + 0xac))(1)
    (*(*arg1[0xcb] + 0xac))(1)
    sub_402090(arg1[0xa8])
    int32_t var_10c = 0
    void* const var_110 = &data_41d780
    int32_t var_18 = 0xf
    int32_t var_1c = 0
    char var_2c = 0
    sub_401ae0(&var_2c, var_110, var_10c)
    int32_t var_8_1 = 0
    (*(*(arg1[0xc0] + 0x310) + 4))(&var_2c)
    int32_t var_8_2 = 0xffffffff
    
    if (var_18 u>= 0x10)
        var_110 = var_2c.d
        operator delete(var_110)
    
    arg1[0x11d] = arg1[0x11c]
    arg1[0x11a] = arg1[0x119]
    arg1[0x120] = arg1[0x11f]
    arg1[0x123] = arg1[0x122]
    var_110 = arg1[0xa8]
    sub_40d0c0(&arg1[0x119], var_110)
    int32_t edx_2 = arg1[0x11d]
    void* ecx_10 = &arg1[0x11c]
    int16_t var_8f = 0
    int16_t* eax_13
    int16_t* edx_3
    
    if (&var_8f u>= edx_2 || *ecx_10 u> &var_8f)
        if (edx_2 == *(ecx_10 + 8))
            var_110 = 1
            sub_403de0(ecx_10, var_110)
            ecx_10 = &arg1[0x11c]
        
        edx_3 = *(ecx_10 + 4)
        
        if (edx_3 != 0)
            eax_13.w = var_8f
            *edx_3 = eax_13.w
    else
        eax_13 = (&var_8f - *ecx_10) s>> 1
        
        if (edx_2 == *(ecx_10 + 8))
            var_110 = 1
            sub_403de0(ecx_10, var_110)
            ecx_10 = &arg1[0x11c]
        
        edx_3 = *(ecx_10 + 4)
        
        if (edx_3 != 0)
            eax_13.w = *(*ecx_10 + (eax_13 << 1))
            *edx_3 = eax_13.w
    *(ecx_10 + 4) += 2
    int32_t ecx_11 = arg1[0x120]
    int32_t var_a0 = 0
    int32_t edx_4
    
    if (&var_a0 u< ecx_11)
        edx_4 = arg1[0x11f]
    
    if (&var_a0 u>= ecx_11 || edx_4 u> &var_a0)
        if (ecx_11 == arg1[0x121])
            var_110 = 1
            sub_40d150(&arg1[0x11f], var_110)
        
        int32_t* eax_18 = arg1[0x120]
        
        if (eax_18 != 0)
            *eax_18 = 0
    else
        if (ecx_11 == arg1[0x121])
            var_110 = 1
            sub_40d150(&arg1[0x11f], var_110)
        
        int32_t* ecx_13 = arg1[0x120]
        
        if (ecx_13 != 0)
            *ecx_13 = *(arg1[0x11f] + ((&var_a0 - edx_4) s>> 2 << 2))
    
    arg1[0x120] += 4
    int32_t ecx_15 = arg1[0x123]
    int32_t var_a8 = 0
    int32_t edx_6
    
    if (&var_a8 u< ecx_15)
        edx_6 = arg1[0x122]
    
    int32_t eax_20
    
    if (&var_a8 u>= ecx_15 || edx_6 u> &var_a8)
        if (ecx_15 == arg1[0x124])
            var_110 = 1
            sub_40d150(&arg1[0x122], var_110)
        
        eax_20 = arg1[0x123]
        
        if (eax_20 != 0)
            *eax_20 = 0
    else
        if (ecx_15 == arg1[0x124])
            var_110 = 1
            sub_40d150(&arg1[0x122], var_110)
        
        int32_t* ecx_17 = arg1[0x123]
        
        if (ecx_17 != 0)
            *ecx_17 = *(arg1[0x122] + ((&var_a8 - edx_6) s>> 2 << 2))
    
    arg1[0x123] += 4
    char* ecx_19 = &var_2c
    arg1[0xb4] = 0
    *(arg1 + 0x2a6) = 0
    arg1[0xaa].b = 0
    *(arg1 + 0x2aa) = 0
    *(arg1 + 0x2ae) = 0
    arg1[0x10c] = 0
    arg1[0xae] = 0xffffffff
    arg1[0xaf] = 0
    arg1[0xb1] = 0
    arg1[0xb0] = 0
    int32_t var_18_1 = 0xf
    eax_20.b = data_42e4d4 == 0
    int32_t var_1c_1 = 0
    data_42e4d4 = eax_20.b
    *(arg1 + 0x2a9) = eax_20.b
    bool cond:2 = data_42e4d4 == 0
    var_2c = 0
    var_110 = 6
    void* const var_114
    int32_t var_18_2
    
    if (cond:2)
        var_114 = &data_41e1e4
        sub_401ae0(ecx_19, var_114, var_110)
        int32_t var_8_6 = 3
        int32_t* ecx_24 = arg1[0xc1] + 0x310
        var_110 = &var_2c
        (*(*ecx_24 + 4))(var_110)
        int32_t var_8_7 = 0xffffffff
        
        if (var_18_1 u>= 0x10)
            var_114 = var_2c.d
            operator delete(var_114)
        
        var_114 = 6
        void* const var_118_1 = &data_41e1dc
        var_18_2 = 0xf
        int32_t var_1c_3 = 0
        var_2c = 0
        sub_401ae0(&var_2c, &data_41e1dc, var_114)
        int32_t var_8_8 = 4
    else
        var_114 = &data_41e1dc
        sub_401ae0(ecx_19, var_114, var_110)
        int32_t var_8_3 = 1
        int32_t* ecx_21 = arg1[0xc1] + 0x310
        var_110 = &var_2c
        (*(*ecx_21 + 4))(var_110)
        int32_t var_8_4 = 0xffffffff
        
        if (var_18_1 u>= 0x10)
            var_114 = var_2c.d
            operator delete(var_114)
        
        var_114 = 6
        void* const var_118 = &data_41e1e4
        var_18_2 = 0xf
        int32_t var_1c_2 = 0
        var_2c = 0
        sub_401ae0(&var_2c, &data_41e1e4, var_114)
        int32_t var_8_5 = 2
    
    int32_t* ecx_27 = arg1[0xc2] + 0x310
    var_114 = &var_2c
    (*(*ecx_27 + 4))(var_114)
    int32_t var_8_9 = 0xffffffff
    
    if (var_18_2 u>= 0x10)
        var_114 = var_2c.d
        operator delete(var_114)
    
    int32_t* ecx_28 = arg1[0x110]
    var_114 = zx.d(data_42e4d4)
    (*(*ecx_28 + 0xac))(var_114)
    int32_t edx_9 = *arg1[0x111]
    var_114 = zx.d(data_42e4d4 == 0)
    (*(edx_9 + 0xac))(var_114)
    void* eax_28
    cocos2d::Size* ecx_31
    eax_28, ecx_31 = (*(*arg1[0xc2] + 0xa8))()
    var_114 = eax_28
    cocos2d::Size::Size(ecx_31, var_114)
    int32_t* ecx_32 = arg1[0xc2]
    var_114 = 0x445e8000
    float var_e4
    (*(*ecx_32 + 0x48))(var_e4 * 0.5f + 20f, var_114)
    int32_t* ecx_33 = arg1[0xc1]
    var_114 = 0x43910000
    (*(*ecx_33 + 0x48))(var_e4 * 0.5f + 20f, var_114)
    var_114 = 0x190
    char const* const var_118_4 = "rate"
    void* var_5c
    char* eax_33 = sub_401f70(&var_5c, (*(*eax_3 + 4))("rate", var_114))
    var_114 = eax_33
    int32_t var_8_10 = 5
    char* eax_34 = sub_403ed0(eax_33.b, U"R", &var_2c, var_114)
    var_8_10.b = 6
    int32_t* ecx_38 = arg1[0xc3] + 0x310
    var_114 = eax_34
    (*(*ecx_38 + 4))(var_114)
    
    if (var_18_2 u>= 0x10)
        var_114 = var_2c.d
        operator delete(var_114)
    
    int32_t var_8_11 = 0xffffffff
    int32_t var_18_3 = 0xf
    int32_t var_1c_4 = 0
    var_2c = 0
    int32_t var_48
    
    if (var_48 u>= 0x10)
        var_114 = var_5c
        operator delete(var_114)
    
    char* eax_35 = sub_401f70(&var_5c, arg1[0xac])
    var_114 = eax_35
    int32_t var_8_12 = 7
    char var_44
    char* eax_36 = sub_403ed0(eax_35.b, U"(", &var_44, var_114)
    var_114 = &data_41e1f4
    var_8_12.b = 8
    char* eax_37 = sub_403f60(eax_36.b, eax_36, &var_2c, var_114)
    var_8_12.b = 9
    int32_t* ecx_43 = arg1[0xc4] + 0x310
    var_114 = eax_37
    (*(*ecx_43 + 4))(var_114)
    
    if (var_18_3 u>= 0x10)
        var_114 = var_2c.d
        operator delete(var_114)
    
    int32_t var_18_4 = 0xf
    int32_t var_1c_5 = 0
    var_2c = 0
    int32_t var_30
    
    if (var_30 u>= 0x10)
        var_114 = var_44.d
        operator delete(var_114)
    
    int32_t var_8_13 = 0xffffffff
    int32_t var_30_1 = 0xf
    int32_t var_34 = 0
    var_44 = 0
    
    if (var_48 u>= 0x10)
        var_114 = var_5c
        operator delete(var_114)
    
    char* ecx_44 = &var_2c
    
    if (data_42e4d5 != 0)
        var_114 = nullptr
        void* const var_118_6 = &data_41d780
        var_18_4 = 0xf
        int32_t var_1c_6 = 0
        var_2c = 0
        sub_401ae0(ecx_44, &data_41d780, var_114)
        int32_t var_8_15 = 0xd
        int32_t* ecx_54 = arg1[0xc5] + 0x310
        var_114 = &var_2c
        (*(*ecx_54 + 4))(var_114)
    else
        var_114 = &arg1[0xb8]
        sub_40d460(&arg1[0xb8], "rate", ecx_44, var_114)
        int32_t var_8_14 = 0xa
        char* ecx_47 = &var_2c
        int32_t eax_41 = *eax_3
        
        if (var_18_4 u>= 0x10)
            ecx_47 = var_2c.d
        
        var_114 = (data_42e4dc + data_42e4d8 + 4) * 0x64
        char* eax_43 = sub_401f70(&var_5c, (*(eax_41 + 4))(ecx_47, var_114))
        var_114 = eax_43
        var_8_14.b = 0xb
        char* eax_44 = sub_403ed0(eax_43.b, U"R", &var_44, var_114)
        var_8_14.b = 0xc
        int32_t* ecx_52 = arg1[0xc5] + 0x310
        var_114 = eax_44
        (*(*ecx_52 + 4))(var_114)
        
        if (var_30_1 u>= 0x10)
            var_114 = var_44.d
            operator delete(var_114)
        
        var_30_1 = 0xf
        int32_t var_34_1 = 0
        var_44 = 0
        
        if (var_48 u>= 0x10)
            var_114 = var_5c
            operator delete(var_114)
    
    int32_t var_8_16 = 0xffffffff
    
    if (var_18_4 u>= 0x10)
        var_114 = var_2c.d
        operator delete(var_114)
    
    void* i = &arg1[0xcc]
    void* eax_46 = i + 0x64
    void* var_94_4 = eax_46
    
    for (; i != eax_46; i += 4)
        int32_t* ecx_55 = *i
        
        if (ecx_55 != 0)
            int32_t eax_47 = *ecx_55
            var_114 = 1
            (*(eax_47 + 0x12c))(var_114)
            eax_46 = var_94_4
            *i = 0
    
    int32_t* ecx_56 = arg1[0x10d]
    
    if (ecx_56 != 0)
        int32_t eax_48 = *ecx_56
        var_114 = 1
        (*(eax_48 + 0x12c))(var_114)
        arg1[0x10d] = 0
    
    int32_t* ecx_57 = arg1[0x10e]
    
    if (ecx_57 != 0)
        int32_t eax_49 = *ecx_57
        var_114 = 1
        (*(eax_49 + 0x12c))(var_114)
        arg1[0x10e] = 0
    
    int32_t* ecx_58 = arg1[0x10f]
    
    if (ecx_58 != 0)
        int32_t eax_50 = *ecx_58
        var_114 = 1
        (*(eax_50 + 0x12c))(var_114)
        arg1[0x10f] = 0
    
    double xmm2 = 200.0
    class cocos2d::Sprite** ebx_4 = &arg1[0xd1]
    int32_t edx_18 = 1
    class cocos2d::Sprite** var_94_5 = ebx_4
    char* i_1 = 5
    int32_t var_b0 = 1
    char* i_6 = 5
    
    do
        int32_t j = 1
        char* i_7 = i_1
        int32_t j_1 = 1
        char* i_5 = i_1
        int32_t xmm0_8 = _mm_cvtpd_ps((4.5 - _mm_cvtepi32_pd(zx.q(edx_18))) * xmm2 + 190.0)
        
        do
            int32_t eax_51
            eax_51.b = i_7[arg1[0xa8]]
            char var_8d_1 = eax_51.b
            
            if (eax_51.b != 0)
                double xmm0_10 = _mm_cvtepi32_pd(zx.q(j))
                var_114 = 7
                char const* const var_118_7 = "images/"
                int32_t var_18_5 = 0xf
                int32_t var_1c_7 = 0
                var_2c = 0
                int32_t xmm0_14 = _mm_cvtpd_ps((xmm0_10 - 0.5) * xmm2 + 100.0)
                sub_401ae0(&var_2c, "images/", var_114)
                int32_t var_8_17 = 0xe
                void* eax_52 = data_42904c
                var_114 = *(eax_52 + ((zx.d(var_8d_1) & 7) << 2) - 4)
                int32_t* eax_53 = sub_403f60(eax_52.b, &var_2c, &var_44, var_114)
                var_114 = ".png"
                var_8_17.b = 0xf
                sub_403f60(eax_53.b, eax_53, &var_5c, var_114)
                
                if (var_30_1 u>= 0x10)
                    var_114 = var_44.d
                    operator delete(var_114)
                
                var_30_1 = 0xf
                int32_t var_34_2 = 0
                var_44 = 0
                
                if (var_18_5 u>= 0x10)
                    var_114 = var_2c.d
                    operator delete(var_114)
                
                int32_t var_d4 = xmm0_14
                int32_t var_18_6 = 0xf
                int32_t var_1c_8 = 0
                var_2c = 0
                int32_t var_d0_1 = xmm0_8
                var_8_17.b = 0x13
                var_114 = &var_5c
                class cocos2d::Sprite* eax_54
                void* ecx_64
                eax_54, ecx_64 = cocos2d::Sprite::create(var_114)
                
                if (eax_54 != 0)
                    void* eax_56
                    cocos2d::Size* ecx_66
                    eax_56, ecx_66 = (*(*eax_54 + 0xa8))()
                    var_114 = eax_56
                    cocos2d::Size::Size(ecx_66, var_114)
                    int32_t eax_57 = *eax_54
                    float var_d8
                    var_114 = 180f / var_d8
                    float var_dc
                    (*(eax_57 + 0x3c))(180f / var_dc, var_114)
                    int32_t eax_58 = *eax_54
                    var_114 = &var_d4
                    (*(eax_58 + 0x4c))(var_114)
                    int32_t eax_59 = *arg1
                    var_114 = 7
                    ecx_64 = (*(eax_59 + 0xfc))(eax_54, var_114)
                
                *ebx_4 = eax_54
                var_8_17.b = 0x12
                
                if ((var_8d_1 & 8) != 0)
                    int32_t eax_60 = *eax_54
                    var_114 = ecx_64
                    var_114 = 0x43340000
                    (*(eax_60 + 0xb4))(var_114)
                
                int32_t var_8_18 = 0xffffffff
                
                if (var_48 u>= 0x10)
                    var_114 = var_5c
                    operator delete(var_114)
                
                i_7 = i_5
                j = j_1
                xmm2 = 200.0
            else
                *ebx_4 = nullptr
            
            j += 1
            i_7 = &i_7[1]
            ebx_4 = &ebx_4[1]
            j_1 = j
            i_5 = i_7
        while (j s<= 3)
        
        i_1 = &i_6[4]
        edx_18 = var_b0 + 1
        ebx_4 = &var_94_5[4]
        var_b0 = edx_18
        i_6 = i_1
        var_94_5 = ebx_4
    while (i_1 s<= 0x11)
    
    void* i_2 = &arg1[0xfe]
    void* eax_62 = i_2 + 0x10
    void* var_98_2 = eax_62
    
    for (; i_2 != eax_62; i_2 += 4)
        int32_t* ecx_71 = *i_2
        
        if (ecx_71 != 0)
            int32_t eax_63 = *ecx_71
            var_114 = 1
            (*(eax_63 + 0x12c))(var_114)
            eax_62 = var_98_2
            *i_2 = 0
    
    void* eax_64 = &arg1[0x105]
    void* var_98_3 = eax_64
    
    if (&arg1[0x102] != eax_64)
        void* ebx_7 = &arg1[0x102]
        
        do
            int32_t* ecx_72 = *ebx_7
            
            if (ecx_72 != 0)
                int32_t eax_65 = *ecx_72
                var_114 = 1
                (*(eax_65 + 0x12c))(var_114)
                eax_64 = var_98_3
                *ebx_7 = 0
            
            ebx_7 += 4
        while (ebx_7 != eax_64)
    
    void* i_3 = &arg1[0x105]
    void* eax_66 = i_3 + 0x10
    void* var_98_4 = eax_66
    
    for (; i_3 != eax_66; i_3 += 4)
        int32_t* ecx_73 = *i_3
        
        if (ecx_73 != 0)
            int32_t eax_67 = *ecx_73
            var_114 = 1
            (*(eax_67 + 0x12c))(var_114)
            eax_66 = var_98_4
            *i_3 = 0
    
    void* i_4 = &arg1[0x109]
    void* eax_68 = i_4 + 0xc
    void* var_98_5 = eax_68
    
    for (; i_4 != eax_68; i_4 += 4)
        int32_t* ecx_74 = *i_4
        
        if (ecx_74 != 0)
            int32_t eax_69 = *ecx_74
            var_114 = 1
            (*(eax_69 + 0x12c))(var_114)
            eax_68 = var_98_5
            *i_4 = 0
    
    int32_t var_60 = 0xf
    int32_t var_64 = 0
    char var_74 = 0
    int32_t var_8_19 = 0x14
    int32_t var_118_10
    
    if (*(arg1 + 0x2a9) == 0)
        var_114 = 0x18
        var_118_10 = 0x41e228
    else
        var_114 = 0x1b
        var_118_10 = 0x41e20c
    
    sub_401ae0(&var_74, var_118_10, var_114)
    var_114 = 0x25
    int32_t var_118_11 = 0x41e244
    sub_403be0(&var_74, 0x41e244, var_114)
    var_114 = 0x12
    void* const var_118_12 = &data_41e26c
    int32_t var_78 = 0xf
    int32_t var_7c = 0
    char var_8c = 0
    sub_401ae0(&var_8c, &data_41e26c, var_114)
    var_114 = 0xffffffff
    int32_t var_118_13 = 0
    var_8_19.b = 0x15
    sub_401990(&data_429080, &var_8c, 0, var_114)
    var_114 = 0xffffffff
    int32_t var_118_14 = 0
    sub_401990(&data_4290a0, &var_74, 0, var_114)
    void* const* esp_1 = &var_110
    data_42f900 = 4
    data_42f8f0 = 0
    arg1[0x125] = sub_40f3c0()
    
    if (var_78 u>= 0x10)
        var_114 = var_8c.d
        operator delete(var_114)
        esp_1 = &var_110
    
    void* ebx_8 = arg1[0x125]
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_21036546f5a539dd8c3952c4fe6263a6>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const var_cc
    int32_t* ecx_78 = &var_cc
    var_cc = &std::_Func_impl<struct std::_Callable_obj<class <lambda_21036546f5a539dd8c3952c4fe6263a6>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
    int32_t* var_c8 = arg1
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_21036546f5a539dd8c3952c4fe6263a6>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const* var_bc = &var_cc
    var_8_19.b = 0x17
    
    if (ebx_8 + 0x2c8 != &var_cc)
        int32_t* eax_71 = *(ebx_8 + 0x2d8)
        
        if (eax_71 == 0)
        label_407bdc:
            var_114 = ebx_8 + 0x2c8
            esp_1 = &var_114
            *(ebx_8 + 0x2d8) = (**ecx_78)()
        else
            int32_t edx_22 = *eax_71
            *(ebx_8 + 0x2d8)
            eax_71.b = eax_71 != ebx_8 + 0x2c8
            var_114 = zx.d(eax_71.b)
            (*(edx_22 + 0x10))(var_114)
            esp_1 = &var_110
            *(ebx_8 + 0x2d8) = 0
            ecx_78 = var_bc
            
            if (ecx_78 != 0)
                if (ecx_78 == &var_cc)
                    goto label_407bdc
                
                var_114 = nullptr
                esp_1 = &var_114
                *(ebx_8 + 0x2d8) = (**ecx_78)()
            else
                *(ebx_8 + 0x2d8) = ecx_78
        
        ecx_78 = var_bc
    
    var_8_19.b = 0x14
    
    if (ecx_78 != 0)
        int32_t edx_23 = *ecx_78
        *(esp_1 - 4) = ecx_78 != &var_cc
        (*(edx_23 + 0x10))()
    
    int32_t eax_77 = *arg1
    *(esp_1 - 4) = 0xb
    *(esp_1 - 8) = arg1[0x125]
    void* esp_4 = esp_1 - 8
    (*(eax_77 + 0xfc))()
    int32_t result = sub_4067d0(arg1)
    arg1[0xa9].b = 1
    
    if (var_60 u>= 0x10)
        *(esp_4 - 4) = var_74.d
        result = operator delete()
    
    fsbase->NtTib.ExceptionList = ExceptionList
    *(esp_4 + 4)
    *(esp_4 + 8)
    *(esp_4 + 0xc)
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
