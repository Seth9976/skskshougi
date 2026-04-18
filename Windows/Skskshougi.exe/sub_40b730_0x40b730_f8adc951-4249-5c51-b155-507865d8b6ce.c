// ============================================================
// 函数名称: sub_40b730
// 虚拟地址: 0x40b730
// WARP GUID: f8adc951-4249-5c51-b155-507865d8b6ce
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_408ce0, sub_403ed0, sub_40d550, sub_403f60, ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z, sub_409540, sub_40be50, sub_4199b8, sub_4067d0
// [被调用的父级函数]: sub_405f80, sub_40e250
// ============================================================

int32_t __fastcallsub_40b730(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41aec6
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_b8
    int32_t eax_2 = __security_cookie ^ &var_b8
    int32_t __saved_edi
    int32_t eax_4 = __security_cookie ^ &__saved_edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t eax_5
    int32_t edx_2
    edx_2:eax_5 = muls.dp.d(0x3e0f83e1, arg1[0x11a] - arg1[0x119])
    int32_t edx_3 = edx_2 s>> 3
    int32_t result = (edx_3 u>> 0x1f) - 1 + edx_3
    
    if (arg1[0xb3] != result)
        int32_t* ecx = arg1[0x10e]
        
        if (ecx != 0)
            (*(*ecx + 0x12c))(1)
            arg1[0x10e] = 0
        
        int32_t* ecx_1 = arg1[0x10f]
        
        if (ecx_1 != 0)
            (*(*ecx_1 + 0x12c))(1)
            arg1[0x10f] = 0
        
        arg1[0xb3] += 1
        int32_t edx_4 = arg1[0xb3]
        int32_t ecx_2
        int32_t ecx_23
        long double x87_r0
        
        if (data_42e4d4 == 0)
            if ((edx_4.b & 1) != 0)
                ecx_2 = arg1[0x11c]
                sub_409540(arg1, x87_r0, zx.d(*(ecx_2 + (edx_4 << 1))), 
                    zx.d(*(ecx_2 + (edx_4 << 1) + 1)))
            else
                ecx_23 = arg1[0x11c]
                sub_408ce0(arg1, x87_r0, zx.d(*(ecx_23 + (edx_4 << 1))), 
                    zx.d(*(ecx_23 + (edx_4 << 1) + 1)))
        else if ((edx_4.b & 1) != 0)
            ecx_23 = arg1[0x11c]
            sub_408ce0(arg1, x87_r0, zx.d(*(ecx_23 + (edx_4 << 1))), zx.d(*(ecx_23 + (edx_4 << 1) + 1)))
        else
            ecx_2 = arg1[0x11c]
            sub_409540(arg1, x87_r0, zx.d(*(ecx_2 + (edx_4 << 1))), zx.d(*(ecx_2 + (edx_4 << 1) + 1)))
        GSI1::QueryMiniPDBForTiDefnUDT2(arg1, zx.d(*(arg1[0x11c] + (arg1[0xb3] << 1) + 1)))
        sub_4067d0(arg1)
        sub_40be50(arg1)
        char var_34
        char* eax_16 = sub_401f70(&var_34, *(arg1[0x122] + (arg1[0xb3] << 2) - 4))
        int32_t var_c_1 = 0
        char var_64
        char* eax_17 = sub_401f70(&var_64, *(arg1[0x11f] + (arg1[0xb3] << 2) - 4))
        var_c_1.b = 1
        char var_94
        char* eax_18 = sub_403ed0(eax_17.b, 0x41e90c, &var_94, eax_17)
        var_c_1.b = 2
        char var_ac
        char* eax_19 = sub_403f60(eax_18.b, eax_18, &var_ac, " (")
        var_c_1.b = 3
        char var_7c
        char* eax_20 = sub_40d550(eax_19, eax_19, &var_7c, eax_16)
        var_c_1.b = 4
        var_c_1.b = 5
        char var_4c
        (*(*(arg1[0xc0] + 0x310) + 4))(sub_403f60(eax_20.b, eax_20, &var_4c, U")("))
        int32_t var_38
        
        if (var_38 u>= 0x10)
            operator delete(var_4c.d)
        
        int32_t var_38_1 = 0xf
        int32_t var_3c_1 = 0
        var_4c = 0
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
            operator delete(var_34.d)
        
        int32_t* ecx_17 = arg1[0xc0]
        int32_t var_20_1 = 0xf
        int32_t var_24_1 = 0
        var_34 = 0
        class cocos2d::Size* eax_23
        cocos2d::Size* ecx_18
        eax_23, ecx_18 = (*(*ecx_17 + 0xa8))(eax_4)
        cocos2d::Size::Size(ecx_18, eax_23)
        float var_b4
        result = (*(*arg1[0xc0] + 0x48))(_mm_cvtpd_ps(780.0 - _mm_cvtps_pd(var_b4 * 0.5f)), 0x449d8000)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_b8)
    return result
}
