// ============================================================
// 函数名称: sub_418440
// 虚拟地址: 0x418440
// WARP GUID: 35668664-90d0-5fef-b113-1446082b8627
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_403ed0, sub_40d460, sub_4199b8
// [被调用的父级函数]: ?_Do_call@?$_Func_impl@V<lambda_0b644b0099f9cbc573e00435de85ed83>@@V?$allocator@H@std@@XPAV?$message@I@Concurrency@@@std@@EAEX$$QAPAV?$message@I@Concurrency@@@Z
// ============================================================

int32_t __thiscallsub_418440(void* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c278
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t i_1
    int32_t var_1c = __security_cookie ^ &i_1
    int32_t ebx
    int32_t var_70 = ebx
    int32_t esi
    int32_t var_74 = esi
    int32_t edi
    int32_t var_78 = edi
    int32_t eax_4 = __security_cookie ^ &var_78
    fsbase->NtTib.ExceptionList = &ExceptionList
    *(arg1 + 0x2a0) = 0
    int32_t result = (*(**(arg1 + 0x2a4) + 0x12c))(1, eax_4)
    
    if (arg2 == 1)
        class cocos2d::UserDefault* eax_6 = cocos2d::UserDefault::getInstance()
        int32_t i = 0
        var_70 = (*(*eax_6 + 4))("rate", 0x64)
        i_1 = 0
        
        do
            void* var_38
            sub_401f70(&var_38, i + data_42e4d8 * 0xa)
            int32_t var_10_1 = 0
            void* var_68
            int32_t* ecx_4 = sub_40d460(&var_38, "nGame-", &var_68, &var_38)
            var_10_1.b = 1
            
            if (ecx_4[5] u>= 0x10)
                ecx_4 = *ecx_4
            
            (*(*eax_6 + 0x1c))(ecx_4, 0)
            var_10_1.b = 0
            int32_t var_54
            
            if (var_54 u>= 0x10)
                operator delete(var_68)
            
            int32_t* ecx_7 = sub_40d460(&var_38, "nWin-", &var_68, &var_38)
            var_10_1.b = 2
            
            if (ecx_7[5] u>= 0x10)
                ecx_7 = *ecx_7
            
            (*(*eax_6 + 0x1c))(ecx_7, 0)
            var_10_1.b = 0
            
            if (var_54 u>= 0x10)
                operator delete(var_68)
            
            int32_t* ecx_10 = sub_40d460(&var_38, "nStreak-", &var_68, &var_38)
            var_10_1.b = 3
            
            if (ecx_10[5] u>= 0x10)
                ecx_10 = *ecx_10
            
            (*(*eax_6 + 0x1c))(ecx_10, 0)
            var_10_1.b = 0
            
            if (var_54 u>= 0x10)
                operator delete(var_68)
            
            for (char** j = &data_41d800; j s< &data_41d828; j = &j[1])
                sub_40d460(&var_38, *j, &var_68, &var_38)
                var_10_1.b = 4
                void** ecx_15 = &var_68
                
                if (var_54 u>= 0x10)
                    ecx_15 = var_68
                
                if ((*(*eax_6 + 4))(ecx_15, 0) != 0)
                    void* ecx_17 = &var_68
                    
                    if (var_54 u>= 0x10)
                        ecx_17 = var_68
                    
                    (*(*eax_6 + 0x1c))(ecx_17, 0)
                
                var_10_1.b = 0
                
                if (var_54 u>= 0x10)
                    operator delete(var_68)
            
            int32_t i_2 = i_1
            int32_t ecx_19 = data_42e4d8
            int32_t edi_2 = (i_2 + 4 + ecx_19) * 0x64
            char* eax_27 = sub_401f70(&var_68, i_2 + ecx_19 * 0xa)
            var_10_1.b = 5
            int32_t* var_50
            sub_403ed0(eax_27.b, "rate", &var_50, eax_27)
            var_10_1.b = 7
            
            if (var_54 u>= 0x10)
                operator delete(var_68)
            
            int32_t* ecx_22 = &var_50
            int32_t var_3c
            
            if (var_3c u>= 0x10)
                ecx_22 = var_50
            
            var_54 = 0xf
            int32_t var_58_1 = 0
            var_68.b = 0
            int32_t eax_29 = (*(*eax_6 + 4))(ecx_22, edi_2)
            
            if (eax_29 != edi_2)
                int32_t* ecx_24 = &var_50
                var_70 += eax_29 - edi_2
                
                if (var_3c u>= 0x10)
                    ecx_24 = var_50
                
                (*(*eax_6 + 0x1c))(ecx_24, edi_2)
            
            if (var_3c u>= 0x10)
                operator delete(var_50)
            
            int32_t var_10_2 = 0xffffffff
            var_3c = 0xf
            int32_t var_40_1 = 0
            var_50.b = 0
            int32_t var_24
            
            if (var_24 u>= 0x10)
                operator delete(var_38)
            
            i = i_1 + 1
            i_1 = i
        while (i s< 9)
        
        result = (*(*eax_6 + 0x1c))("rate", var_70)
    
    int32_t var_18
    fsbase->NtTib.ExceptionList = var_18
    int32_t var_20
    sub_4199b8(var_20 ^ &var_70)
    return result
}
