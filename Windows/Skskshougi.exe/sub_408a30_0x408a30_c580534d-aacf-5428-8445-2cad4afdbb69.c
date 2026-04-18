// ============================================================
// 函数名称: sub_408a30
// 虚拟地址: 0x408a30
// WARP GUID: c580534d-aacf-5428-8445-2cad4afdbb69
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_414200, sub_4199b8, sub_40d460, sub_403ac0
// [被调用的父级函数]: ?_Do_call@?$_Func_impl@U?$_Callable_obj@V<lambda_c720f3ee21fb503e7262d269cd4e4d6c>@@$0A@@std@@V?$allocator@V?$_Func_class@XPAV?$message@I@Concurrency@@U_Nil@std@@U34@U34@U34@U34@U34@@std@@@2@XPAV?$message@I@Concurrency@@U_Nil@2@U62@U62@U62@U62@U62@@std@@UAEX$$QAPAV?$message@I@Concurrency@@@Z
// ============================================================

int32_t __thiscallsub_408a30(void* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41ab10
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t var_7c
    int32_t eax_2 = __security_cookie ^ &var_7c
    int32_t __saved_edi
    int32_t var_8c = __security_cookie ^ &__saved_edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t result
    
    if (arg2 != 1)
        result = (*(**(arg1 + 0x494) + 0x12c))(1)
        *(arg1 + 0x2a4) = 0
    else
        class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
        var_7c = (*(*eax_5 + 4))("rate", 0x190)
        int32_t* var_4c
        sub_40d460(arg1 + 0x2e0, "rate", &var_4c, arg1 + 0x2e0)
        int32_t var_c_1 = 0
        int32_t* ecx_4 = &var_4c
        int32_t var_38
        
        if (var_38 u>= 0x10)
            ecx_4 = var_4c
        
        int32_t eax_11 = (*(*eax_5 + 4))(ecx_4, (data_42e4dc + data_42e4d8 + 4) * 0x64)
        int32_t ecx_7 = var_7c - eax_11
        int32_t var_70 = 0x20
        int32_t var_68 = 0
        int32_t edx_3 = 0x10 - int.d(_mm_cvtepi32_pd(zx.q(ecx_7)) * -0.040000000000000001)
        int32_t var_6c
        int32_t* ecx_9 = &var_6c
        var_6c = edx_3
        
        if (edx_3 s>= 0x20)
            ecx_9 = &var_70
        
        int32_t* eax_12 = &var_68
        
        if (*ecx_9 s> 0)
            eax_12 = ecx_9
        
        int32_t esi_1 = *eax_12
        int32_t ecx_11 = var_7c - esi_1
        int32_t eax_13 = *eax_5
        var_7c = ecx_11
        (*(eax_13 + 0x1c))("rate", ecx_11)
        int32_t* ecx_13 = &var_4c
        
        if (var_38 u>= 0x10)
            ecx_13 = var_4c
        
        (*(*eax_5 + 0x1c))(ecx_13, eax_11 + esi_1)
        void* eax_15 = arg1
        int32_t ecx_15 = var_7c
        
        if (ecx_15 s> *(eax_15 + 0x2b0))
            *(eax_15 + 0x2b0) = ecx_15
            eax_15 = (*(*eax_5 + 0x1c))("maxRate", ecx_15)
        
        int32_t* var_64
        sub_40d460(eax_15, "nGame-", &var_64, arg1 + 0x2e0)
        var_c_1.b = 1
        int32_t* ecx_18 = &var_64
        int32_t var_50
        
        if (var_50 u>= 0x10)
            ecx_18 = var_64
        
        int32_t eax_18 = (*(*eax_5 + 4))(ecx_18, 0)
        int32_t** ecx_20 = &var_64
        
        if (var_50 u>= 0x10)
            ecx_20 = var_64
        
        void* var_34
        int32_t* eax_21 =
            sub_40d460((*(*eax_5 + 0x1c))(ecx_20, eax_18 + 1), "nStreak-", &var_34, arg1 + 0x2e0)
        
        if (&var_64 != eax_21)
            if (var_50 u>= 0x10)
                operator delete(var_64)
            
            var_50 = 0xf
            int32_t var_54_1 = 0
            var_64.b = 0
            sub_403ac0(&var_64, eax_21)
        
        int32_t var_20
        
        if (var_20 u>= 0x10)
            operator delete(var_34)
        
        int32_t* ecx_24 = &var_64
        
        if (var_50 u>= 0x10)
            ecx_24 = var_64
        
        (*(*eax_5 + 0x1c))(ecx_24, 0)
        void* ecx_26 = data_42e4d0
        
        if (ecx_26 != 0)
            sub_414200(ecx_26)
        
        result = cocos2d::Director::popScene(cocos2d::Director::getInstance())
        
        if (var_50 u>= 0x10)
            result = operator delete(var_64)
        
        int32_t var_50_1 = 0xf
        int32_t var_54_2 = 0
        var_64.b = 0
        
        if (var_38 u>= 0x10)
            result = operator delete(var_4c)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_7c)
    return result
}
