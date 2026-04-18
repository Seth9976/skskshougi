// ============================================================
// 函数名称: sub_40bee0
// 虚拟地址: 0x40bee0
// WARP GUID: 2a75f7ca-5421-594c-899a-177b3f5cc238
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8, sub_401ae0, sub_403f60
// [被调用的父级函数]: sub_40baa0, sub_40b490
// ============================================================

int32_t __fastcallsub_40bee0(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$?do_get@?$num_get@DV?$istreambuf_iterator@DU?$char_traits@D@std@@@std@@@std@@MBE?AV?$istreambuf_iterator@DU?$char_traits@D@std@@@2@V32@0AAVios_base@2@AAHAA_N@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* ebx = arg1
    int32_t* var_78 = ebx
    
    for (int32_t* i = &ebx[0xcc]; i != &i[0x19]; i = &i[1])
        int32_t* ecx = *i
        
        if (ecx != 0)
            (*(*ecx + 0x12c))(1)
            *i = 0
    
    int32_t* ecx_1 = ebx[0x10d]
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x12c))(1)
        ebx[0x10d] = 0
    
    int32_t* ecx_2 = ebx[0x10e]
    
    if (ecx_2 != 0)
        (*(*ecx_2 + 0x12c))(1)
        ebx[0x10e] = 0
    
    int32_t* ecx_3 = ebx[0x10f]
    
    if (ecx_3 != 0)
        (*(*ecx_3 + 0x12c))(1)
        ebx[0x10f] = 0
    
    double xmm2 = 200.0
    void* edi_1 = &ebx[0xd1]
    int32_t edx = 1
    char* i_1 = 5
    int32_t var_a0 = 1
    char* i_6 = 5
    void* var_98 = edi_1
    float var_b8
    float var_ac
    float var_a8
    float var_94
    char* i_7
    char var_44
    int32_t var_30
    char var_2c
    
    do
        int32_t j = 1
        char* i_8 = i_1
        int32_t j_1 = 1
        i_7 = i_1
        float xmm0_3 = _mm_cvtpd_ps((4.5 - _mm_cvtepi32_pd(zx.q(edx))) * xmm2 + 190.0)
        
        do
            ebx.b = i_8[ebx[0xa8]]
            
            if (ebx.b != 0)
                double xmm0_5 = _mm_cvtepi32_pd(zx.q(j))
                int32_t var_18_1 = 0xf
                int32_t var_1c_1 = 0
                var_2c = 0
                var_b8 = _mm_cvtpd_ps((xmm0_5 - 0.5) * xmm2 + 100.0)
                sub_401ae0(&var_2c, "images/", 7)
                int32_t var_8_1 = 0
                void* eax_8 = data_42904c
                char* eax_9 =
                    sub_403f60(eax_8.b, &var_2c, &var_44, *(eax_8 + ((zx.d(ebx.b) & 7) << 2) - 4))
                var_8_1.b = 1
                void* var_74
                sub_403f60(eax_9.b, eax_9, &var_74, ".png")
                
                if (var_30 u>= 0x10)
                    operator delete(var_44.d)
                
                var_30 = 0xf
                int32_t var_34_1 = 0
                var_44 = 0
                
                if (var_18_1 u>= 0x10)
                    operator delete(var_2c.d)
                
                var_ac = var_b8
                int32_t var_18_2 = 0xf
                int32_t var_1c_2 = 0
                var_2c = 0
                var_a8 = xmm0_3
                var_8_1.b = 5
                class cocos2d::Sprite* eax_10
                int32_t ecx_9
                eax_10, ecx_9 = cocos2d::Sprite::create(&var_74)
                
                if (eax_10 != 0)
                    class cocos2d::Size* eax_12
                    cocos2d::Size* ecx_11
                    eax_12, ecx_11 = (*(*eax_10 + 0xa8))(eax_2)
                    cocos2d::Size::Size(ecx_11, eax_12)
                    float var_90
                    (*(*eax_10 + 0x3c))(180f / var_94, 180f / var_90)
                    (*(*eax_10 + 0x4c))(&var_ac)
                    ecx_9 = (*(*var_78 + 0xfc))(eax_10, 7)
                
                *edi_1 = eax_10
                var_8_1.b = 4
                
                if ((ebx.b & 8) != 0)
                    int32_t var_d0_8 = ecx_9
                    (*(*eax_10 + 0xb4))(0x43340000)
                
                int32_t var_8_2 = 0xffffffff
                int32_t var_60
                
                if (var_60 u>= 0x10)
                    operator delete(var_74)
                
                i_8 = i_7
                j = j_1
                xmm2 = 200.0
            else
                *edi_1 = 0
            
            ebx = var_78
            j += 1
            i_8 = &i_8[1]
            j_1 = j
            edi_1 += 4
            i_7 = i_8
        while (j s<= 3)
        
        i_1 = &i_6[4]
        edx = var_a0 + 1
        edi_1 = var_98 + 0x10
        var_a0 = edx
        i_6 = i_1
        var_98 = edi_1
    while (i_1 s<= 0x11)
    
    void* i_2 = &ebx[0xfe]
    
    for (void* edi_3 = i_2 + 0x10; i_2 != edi_3; i_2 += 4)
        int32_t* ecx_16 = *i_2
        
        if (ecx_16 != 0)
            (*(*ecx_16 + 0x12c))(1)
            *i_2 = 0
    
    void* edi_4 = &ebx[0x102]
    void* eax_19 = edi_4 + 0xc
    void* var_78_1 = edi_4
    void* esi_1 = edi_4
    
    if (edi_4 != eax_19)
        do
            int32_t* ecx_17 = *esi_1
            
            if (ecx_17 != 0)
                (*(*ecx_17 + 0x12c))(1)
                *esi_1 = 0
                eax_19 = edi_4 + 0xc
            
            esi_1 += 4
        while (esi_1 != eax_19)
    
    void* i_3 = &ebx[0x105]
    void* eax_21 = i_3 + 0x10
    void* var_7c_2 = eax_21
    
    for (; i_3 != eax_21; i_3 += 4)
        int32_t* ecx_18 = *i_3
        
        if (ecx_18 != 0)
            (*(*ecx_18 + 0x12c))(1)
            eax_21 = var_7c_2
            *i_3 = 0
    
    void* i_4 = &ebx[0x109]
    void* eax_23 = i_4 + 0xc
    void* var_7c_3 = eax_23
    
    for (; i_4 != eax_23; i_4 += 4)
        int32_t* ecx_19 = *i_4
        
        if (ecx_19 != 0)
            (*(*ecx_19 + 0x12c))(1)
            eax_23 = var_7c_3
            *i_4 = 0
    
    int32_t result
    
    for (int32_t i_5 = 0; i_5 s< 3; )
        int32_t var_18_3 = 0xf
        int32_t var_1c_3 = 0
        var_2c = 0
        sub_401ae0(&var_2c, "images/", 7)
        int32_t var_8_3 = 6
        void* eax_26 = data_42904c
        char* eax_27 = sub_403f60(eax_26.b, &var_2c, &var_44, *(0xfffffbf8 - ebx + edi_4 + eax_26))
        var_8_3.b = 7
        void* var_5c
        sub_403f60(eax_27.b, eax_27, &var_5c, ".png")
        
        if (var_30 u>= 0x10)
            operator delete(var_44.d)
        
        var_30 = 0xf
        int32_t var_34_2 = 0
        var_44 = 0
        
        if (var_18_3 u>= 0x10)
            operator delete(var_2c.d)
        
        int32_t eax_28 = ebx[0xa8]
        int32_t var_18_4 = 0xf
        int32_t var_1c_4 = 0
        var_2c = 0
        eax_28.b = *(eax_28 + i_5 + 0x19)
        
        if (eax_28.b != 0)
            int32_t var_90_1 = 0x42f6aaab
            var_94 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(i_5)) * 1.5 + 0.5) * 100.0 + 100.0)
            var_8_3.b = 0xb
            class cocos2d::Sprite* eax_29 = cocos2d::Sprite::create(&var_5c)
            
            if (eax_29 != 0)
                class cocos2d::Size* eax_31
                cocos2d::Size* ecx_26
                eax_31, ecx_26 = (*(*eax_29 + 0xa8))(eax_2)
                cocos2d::Size::Size(ecx_26, eax_31)
                (*(*eax_29 + 0x3c))(90f / var_ac, 90f / var_a8)
                (*(*eax_29 + 0x4c))(&var_94)
                (*(*ebx + 0xfc))(eax_29, 7)
            
            *(var_78_1 - 0x10) = eax_29
        
        int32_t eax_36
        eax_36.b = *(ebx[0xa8] + i_5 + 0x19)
        
        if (eax_36.b == 2)
            int32_t var_98_1 = 0x42f6aaab
            int32_t var_9c = _mm_cvtpd_ps(
                _mm_cvtps_pd(_mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(i_5)) * 1.5 + 0.5) * 100.0 + 100.0))
                + 25.0)
            var_8_3.b = 0xc
            class cocos2d::Sprite* eax_37 = cocos2d::Sprite::create(&var_5c)
            
            if (eax_37 != 0)
                class cocos2d::Size* eax_39
                cocos2d::Size* ecx_31
                eax_39, ecx_31 = (*(*eax_37 + 0xa8))(eax_2)
                cocos2d::Size::Size(ecx_31, eax_39)
                float var_bc
                (*(*eax_37 + 0x3c))(90f / var_bc, 90f / var_b8)
                (*(*eax_37 + 0x4c))(&var_9c)
                (*(*ebx + 0xfc))(eax_37, 7)
            
            *var_78_1 = eax_37
        
        int32_t eax_44
        eax_44.b = *(ebx[0xa8] + i_5 + 0x1d)
        
        if (eax_44.b != 0)
            int32_t var_a0_1 = 0x44841555
            int32_t var_a4 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(i_5)) * 1.5 + 0.5) * 100.0 + 100.0)
            var_8_3.b = 0xd
            class cocos2d::Sprite* eax_45
            int32_t ecx_35
            eax_45, ecx_35 = cocos2d::Sprite::create(&var_5c)
            
            if (eax_45 != 0)
                class cocos2d::Size* eax_47
                cocos2d::Size* ecx_37
                eax_47, ecx_37 = (*(*eax_45 + 0xa8))(eax_2)
                cocos2d::Size::Size(ecx_37, eax_47)
                float var_b4
                (*(*eax_45 + 0x3c))(90f / var_b4, 90f f/ i_6)
                (*(*eax_45 + 0x4c))(&var_a4)
                ecx_35 = (*(*ebx + 0xfc))(eax_45, 7)
            
            var_8_3.b = 0xa
            int32_t var_d0_25 = ecx_35
            *(var_78_1 + 0xc) = eax_45
            (*(*eax_45 + 0xb4))(0x43340000)
        
        result.b = *(ebx[0xa8] + i_5 + 0x1d)
        
        if (result.b == 2)
            int32_t var_80_1 = 0x44841555
            int32_t var_84 = _mm_cvtpd_ps(
                _mm_cvtps_pd(_mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(i_5)) * 1.5 + 0.5) * 100.0 + 100.0))
                + 25.0)
            var_8_3.b = 0xe
            class cocos2d::Sprite* eax_53
            int32_t ecx_42
            eax_53, ecx_42 = cocos2d::Sprite::create(&var_5c)
            
            if (eax_53 != 0)
                class cocos2d::Size* eax_55
                cocos2d::Size* ecx_44
                eax_55, ecx_44 = (*(*eax_53 + 0xa8))(eax_2)
                cocos2d::Size::Size(ecx_44, eax_55)
                float var_8c
                (*(*eax_53 + 0x3c))(90f / var_8c, 90f f/ i_7)
                (*(*eax_53 + 0x4c))(&var_84)
                ecx_42 = (*(*ebx + 0xfc))(eax_53, 7)
            
            var_8_3.b = 0xa
            int32_t var_d0_30 = ecx_42
            *(var_78_1 + 0x1c) = eax_53
            result = (*(*eax_53 + 0xb4))(0x43340000)
        
        int32_t var_8_4 = 0xffffffff
        int32_t var_48
        
        if (var_48 u>= 0x10)
            result = operator delete(var_5c)
        
        i_5 += 1
        edi_4 = var_78_1 + 4
        var_78_1 = edi_4
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
