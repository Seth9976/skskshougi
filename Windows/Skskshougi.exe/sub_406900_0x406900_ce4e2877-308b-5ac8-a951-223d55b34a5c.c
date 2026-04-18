// ============================================================
// 函数名称: sub_406900
// 虚拟地址: 0x406900
// WARP GUID: ce4e2877-308b-5ac8-a951-223d55b34a5c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_403ed0, sub_40d460, sub_40d550, sub_403f60, sub_4199b8, sub_403ac0
// [被调用的父级函数]: sub_409c90, sub_404680
// ============================================================

int32_t __fastcallsub_406900(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a834
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* eax_3 = cocos2d::UserDefault::getInstance()
    int32_t* var_2c
    sub_40d460(eax_3, "nGame-", &var_2c, arg1 + 0x2e0)
    int32_t var_8_1 = 0
    int32_t* ecx_1 = &var_2c
    int32_t var_18
    
    if (var_18 u>= 0x10)
        ecx_1 = var_2c
    
    int32_t eax_5 = (*(*eax_3 + 4))(ecx_1, 0)
    void* var_5c
    int32_t* eax_6 = sub_40d460(eax_5, "nWin-", &var_5c, arg1 + 0x2e0)
    
    if (&var_2c != eax_6)
        if (var_18 u>= 0x10)
            operator delete(var_2c)
        
        var_18 = 0xf
        int32_t var_1c_1 = 0
        var_2c.b = 0
        sub_403ac0(&var_2c, eax_6)
    
    int32_t var_48
    
    if (var_48 u>= 0x10)
        operator delete(var_5c)
    
    int32_t** ecx_5 = &var_2c
    
    if (var_18 u>= 0x10)
        ecx_5 = var_2c
    
    int32_t eax_8 = (*(*eax_3 + 4))(ecx_5, 0)
    char var_bc
    char* eax_9 = sub_401f70(&var_bc, eax_5 - eax_8)
    var_8_1.b = 1
    char var_a4
    char* eax_10 = sub_401f70(&var_a4, eax_8)
    var_8_1.b = 2
    char var_ec
    char* eax_11 = sub_403f60(eax_10.b, eax_10, &var_ec, 0x41e1b4)
    var_8_1.b = 3
    char var_8c
    char* eax_12 = sub_40d550(eax_11, eax_11, &var_8c, eax_9)
    var_8_1.b = 4
    char var_44
    sub_403f60(eax_12.b, eax_12, &var_44, 0x41e1b0)
    int32_t var_78
    
    if (var_78 u>= 0x10)
        operator delete(var_8c.d)
    
    int32_t var_78_1 = 0xf
    int32_t var_7c = 0
    var_8c = 0
    int32_t var_d8
    
    if (var_d8 u>= 0x10)
        operator delete(var_ec.d)
    
    int32_t var_d8_1 = 0xf
    int32_t var_dc = 0
    var_ec = 0
    int32_t var_90
    
    if (var_90 u>= 0x10)
        operator delete(var_a4.d)
    
    int32_t var_90_1 = 0xf
    int32_t var_94 = 0
    var_a4 = 0
    var_8_1.b = 9
    int32_t var_a8
    
    if (var_a8 u>= 0x10)
        operator delete(var_bc.d)
    
    int32_t* ecx_13 = *(arg1 + 0x318) + 0x310
    int32_t var_a8_1 = 0xf
    int32_t var_ac = 0
    var_bc = 0
    (*(*ecx_13 + 4))(&var_44)
    class cocos2d::Size* eax_15
    cocos2d::Size* ecx_15
    eax_15, ecx_15 = (*(**(arg1 + 0x318) + 0xa8))(eax_2)
    cocos2d::Size::Size(ecx_15, eax_15)
    float var_f8
    (*(**(arg1 + 0x318) + 0x48))(var_f8 * 0.5f + 10f, 0x43280000)
    void* var_74
    int32_t var_60
    int32_t var_30
    
    if (eax_5 == 0)
        sub_401ae0(&var_44, &data_41d780, 0)
    else
        double xmm0_4 = _mm_cvtepi32_pd(zx.q(eax_5))
        char* eax_18 = sub_401f70(&var_74, int.d((_mm_cvtepi32_pd(zx.q(eax_8 * 0x64)) + 0.5) / xmm0_4))
        var_8_1.b = 0xa
        char* eax_19 = sub_403ed0(eax_18.b, " (", &var_5c, eax_18)
        var_8_1.b = 0xb
        char var_d4
        char* eax_20 = sub_403f60(eax_19.b, eax_19, &var_d4, "%)")
        
        if (&var_44 != eax_20)
            if (var_30 u>= 0x10)
                operator delete(var_44.d)
            
            var_30 = 0xf
            int32_t var_34_1 = 0
            var_44 = 0
            sub_403ac0(&var_44, eax_20)
        
        int32_t var_c0
        
        if (var_c0 u>= 0x10)
            operator delete(var_d4.d)
        
        int32_t var_c0_1 = 0xf
        int32_t var_c4_1 = 0
        var_d4 = 0
        
        if (var_48 u>= 0x10)
            operator delete(var_5c)
        
        var_8_1.b = 9
        var_48 = 0xf
        int32_t var_4c_1 = 0
        var_5c.b = 0
        
        if (var_60 u>= 0x10)
            operator delete(var_74)
    
    (*(*(*(arg1 + 0x31c) + 0x310) + 4))(&var_44)
    class cocos2d::Size* eax_23
    cocos2d::Size* ecx_26
    eax_23, ecx_26 = (*(**(arg1 + 0x31c) + 0xa8))()
    cocos2d::Size::operator=(ecx_26, eax_23)
    (*(**(arg1 + 0x31c) + 0x48))(var_f8 * 0.5f + 10f, 0x43060000)
    int32_t* eax_26 = sub_40d460(arg1 + 0x2e0, "nStreak-", &var_74, arg1 + 0x2e0)
    
    if (&var_2c != eax_26)
        if (var_18 u>= 0x10)
            operator delete(var_2c)
        
        var_18 = 0xf
        int32_t var_1c_2 = 0
        var_2c.b = 0
        sub_403ac0(&var_2c, eax_26)
    
    if (var_60 u>= 0x10)
        operator delete(var_74)
    
    int32_t* ecx_30 = &var_2c
    
    if (var_18 u>= 0x10)
        ecx_30 = var_2c
    
    char* eax_29 = sub_401f70(&var_74, (*(*eax_3 + 4))(ecx_30, 0))
    var_8_1.b = 0xc
    char* eax_30 = sub_403f60(eax_29.b, eax_29, &var_5c, 0x41e1cc)
    
    if (&var_44 != eax_30)
        if (var_30 u>= 0x10)
            operator delete(var_44.d)
        
        var_30 = 0xf
        int32_t var_34_2 = 0
        var_44 = 0
        sub_403ac0(&var_44, eax_30)
    
    if (var_48 u>= 0x10)
        operator delete(var_5c)
    
    var_8_1.b = 9
    int32_t var_48_1 = 0xf
    int32_t var_4c_2 = 0
    var_5c.b = 0
    
    if (var_60 u>= 0x10)
        operator delete(var_74)
    
    (*(*(*(arg1 + 0x320) + 0x310) + 4))(&var_44)
    class cocos2d::Size* eax_33
    cocos2d::Size* ecx_38
    eax_33, ecx_38 = (*(**(arg1 + 0x320) + 0xa8))()
    cocos2d::Size::operator=(ecx_38, eax_33)
    int32_t result = (*(**(arg1 + 0x320) + 0x48))(var_f8 * 0.5f + 10f, 0x42c80000)
    
    if (var_30 u>= 0x10)
        result = operator delete(var_44.d)
    
    int32_t var_30_1 = 0xf
    int32_t var_34_3 = 0
    var_44 = 0
    
    if (var_18 u>= 0x10)
        result = operator delete(var_2c)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
