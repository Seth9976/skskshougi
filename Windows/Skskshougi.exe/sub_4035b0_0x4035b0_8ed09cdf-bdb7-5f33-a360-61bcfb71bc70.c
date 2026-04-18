// ============================================================
// 函数名称: sub_4035b0
// 虚拟地址: 0x4035b0
// WARP GUID: 8ed09cdf-bdb7-5f33-a360-61bcfb71bc70
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402320, sub_4028d0, sub_4035b0, sub_402020, sub_4033e0, sub_4021b0, sub_4026c0, sub_403340, sub_4199b8
// [被调用的父级函数]: sub_403740, sub_4035b0
// ============================================================

int32_t __thiscallsub_4035b0(void* arg1, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a488
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_64 = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    data_42d120 += 1
    int32_t result
    
    if (*(arg1 + 0x20) == 0)
        char eax_4
        
        if (*(arg1 + 0x11) == 0xd)
            eax_4 = sub_402320(arg1, 0x11)
        
        if (*(arg1 + 0x11) == 0xd && eax_4 == 0)
            result = arg4 - 0x270f
        else
            char eax_5
            
            if (*(arg1 + 0x12) == 0xd)
                eax_5 = sub_402320(arg1, 0x12)
            
            if (*(arg1 + 0x12) == 0xd && eax_5 == 0)
                result = arg4 - 0x270f
            else
                char eax_6
                
                if (*(arg1 + 0x13) == 0xd)
                    eax_6 = sub_402320(arg1, 0x13)
                
                if (*(arg1 + 0x13) == 0xd && eax_6 == 0)
                    result = arg4 - 0x270f
                else if (sub_4026c0(arg1) != 0)
                    result = 0x270e - arg4
                else if (arg3 != 0)
                    void* var_44 = nullptr
                    int32_t var_40_1 = 0
                    int32_t var_3c_1 = 0
                    int32_t var_68_1 = 1
                    int32_t var_8_1 = 0
                    sub_4028d0(arg1, &var_44)
                    void* esi_1 = var_44
                    int32_t result_1
                    
                    if (esi_1 != var_40_1)
                        int32_t result_2
                        result_1 = result_2
                        
                        do
                            void var_38
                            sub_402020(&var_38, arg1)
                            sub_403340(&var_38, esi_1)
                            sub_4021b0(&var_38)
                            int32_t var_68_4 = arg4 + 1
                            int32_t eax_16 =
                                neg.d(sub_4035b0(&var_38, neg.d(arg2), neg.d(result_1), arg3 - 1))
                            int32_t var_50
                            int32_t* ecx_8 = &var_50
                            var_50 = eax_16
                            
                            if (result_1 s>= eax_16)
                                ecx_8 = &result_2
                            
                            result_1 = *ecx_8
                            result_2 = result_1
                            
                            if (result_1 s>= arg2)
                                break
                            
                            esi_1 += 2
                        while (esi_1 != var_40_1)
                    else
                        result_1 = arg4 - 0x270f
                    
                    void* eax_17 = var_44
                    
                    if (eax_17 != 0)
                        operator delete(eax_17)
                    
                    result = result_1
                else
                    result = sub_4033e0(arg1)
    else
        result = arg4 - 0x270f
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
