// ============================================================
// 函数名称: sub_40baa0
// 虚拟地址: 0x40baa0
// WARP GUID: 44507299-2dda-583c-b8e2-98c95312b9d0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_403ed0, sub_40bee0, sub_403f60, sub_40d550, ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z, sub_40be50, sub_4199b8, sub_4067d0
// [被调用的父级函数]: sub_40e1e0, sub_40adb0, sub_40e170, sub_40e2b0
// ============================================================

int32_t __fastcallsub_40baa0(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41af41
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_d0
    int32_t eax_2 = __security_cookie ^ &var_d0
    int32_t esi
    int32_t var_d4 = esi
    int32_t edi
    int32_t var_d8 = edi
    int32_t eax_4 = __security_cookie ^ &var_d8
    fsbase->NtTib.ExceptionList = &ExceptionList
    int128_t* ecx = arg1[0xa8]
    int32_t edx_2 = arg1[0xb3] * 0x21
    int128_t* eax_6 = arg1[0x119]
    *ecx = *(eax_6 + edx_2)
    ecx[1] = *(eax_6 + edx_2 + 0x10)
    eax_6.b = *(eax_6 + edx_2 + 0x20)
    ecx[2].b = eax_6.b
    sub_40bee0(arg1)
    sub_4067d0(arg1)
    sub_40be50(arg1)
    int32_t ecx_4 = arg1[0xb3]
    
    if (ecx_4 == 0)
        int32_t var_b0_1 = 0xf
        int32_t var_b4_1 = 0
        char var_c4 = 0
        sub_401ae0(&var_c4, 0x41e91c, 9)
        int32_t var_c_3 = 6
        (*(*(arg1[0xc0] + 0x310) + 4))(&var_c4)
        int32_t var_c_4 = 0xffffffff
        
        if (var_b0_1 u>= 0x10)
            operator delete(var_c4.d)
        
        int32_t var_b0_2 = 0xf
        int32_t var_b4_2 = 0
        var_c4 = 0
    else
        GSI1::QueryMiniPDBForTiDefnUDT2(arg1, zx.d(*(arg1[0x11c] + (ecx_4 << 1) + 1)))
        void* var_34
        char* eax_10 = sub_401f70(&var_34, *(arg1[0x122] + (arg1[0xb3] << 2) - 4))
        int32_t var_c_1 = 0
        char var_64
        char* eax_11 = sub_401f70(&var_64, *(arg1[0x11f] + (arg1[0xb3] << 2) - 4))
        var_c_1.b = 1
        char var_94
        char* eax_12 = sub_403ed0(eax_11.b, 0x41e90c, &var_94, eax_11)
        var_c_1.b = 2
        char var_4c
        char* eax_13 = sub_403f60(eax_12.b, eax_12, &var_4c, " (")
        var_c_1.b = 3
        char var_ac
        char* eax_14 = sub_40d550(eax_13, eax_13, &var_ac, eax_10)
        var_c_1.b = 4
        var_c_1.b = 5
        char var_7c
        (*(*(arg1[0xc0] + 0x310) + 4))(sub_403f60(eax_14.b, eax_14, &var_7c, U")("))
        int32_t var_68
        
        if (var_68 u>= 0x10)
            operator delete(var_7c.d)
        
        int32_t var_68_1 = 0xf
        int32_t var_6c_1 = 0
        var_7c = 0
        int32_t var_98
        
        if (var_98 u>= 0x10)
            operator delete(var_ac.d)
        
        int32_t var_98_1 = 0xf
        int32_t var_9c_1 = 0
        var_ac = 0
        int32_t var_38
        
        if (var_38 u>= 0x10)
            operator delete(var_4c.d)
        
        int32_t var_38_1 = 0xf
        int32_t var_3c_1 = 0
        var_4c = 0
        int32_t var_80
        
        if (var_80 u>= 0x10)
            operator delete(var_94.d)
        
        int32_t var_80_1 = 0xf
        int32_t var_84_1 = 0
        var_94 = 0
        int32_t var_50
        
        if (var_50 u>= 0x10)
            operator delete(var_64.d)
        
        int32_t var_c_2 = 0xffffffff
        int32_t var_50_1 = 0xf
        int32_t var_54_1 = 0
        var_64 = 0
        int32_t var_20
        
        if (var_20 u>= 0x10)
            operator delete(var_34)
    
    class cocos2d::Size* eax_18
    cocos2d::Size* ecx_19
    eax_18, ecx_19 = (*(*arg1[0xc0] + 0xa8))(eax_4)
    cocos2d::Size::Size(ecx_19, eax_18)
    float var_cc
    (*(*arg1[0xc0] + 0x48))(_mm_cvtpd_ps(780.0 - _mm_cvtps_pd(var_cc * 0.5f)), 0x449d8000)
    int32_t result = (*(*cocos2d::UserDefault::getInstance() + 4))("SoundEffect", 1)
    
    if (result != 0)
        result = (*(*CocosDenshion::SimpleAudioEngine::getInstance() + 0x30))("sounds/button45.mp3", 0, 
            0x3f800000, 0, 0x3f800000)
    
    fsbase->NtTib.ExceptionList = eax_2
    int32_t var_24
    sub_4199b8(var_24 ^ &var_d8)
    return result
}
