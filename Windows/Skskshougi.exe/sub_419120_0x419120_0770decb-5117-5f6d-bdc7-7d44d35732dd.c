// ============================================================
// 函数名称: sub_419120
// 虚拟地址: 0x419120
// WARP GUID: 0770decb-5117-5f6d-bdc7-7d44d35732dd
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_419400
// [被调用的父级函数]: sub_414c30
// ============================================================

char* __fastcallsub_419120(char* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn =
        __ehhandler$?_FullAliasWait@_TaskCollection@details@Concurrency@@AAEXPAV123@@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t entry_ebx
    int32_t var_28 = entry_ebx
    int32_t __saved_ebp
    int32_t var_34 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    char* var_24 = arg1
    int32_t var_18 = 0
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    int32_t var_8_1 = 0
    int32_t eax_3 = arg2[5]
    int32_t var_18_1 = 1
    char* esi
    
    if (eax_3 u< 0x10)
        esi = arg2
    else
        esi = *arg2
    
    int32_t* ecx
    
    if (eax_3 u< 0x10)
        ecx = arg2
    else
        ecx = *arg2
    
    void* eax_5 = arg2[4] + ecx
    void* var_14 = nullptr
    void* ecx_2 = eax_5 - esi
    
    if (esi u> eax_5)
        ecx_2 = nullptr
    
    void* var_20 = ecx_2
    
    if (ecx_2 != 0)
        do
            char ebx = *esi
            int32_t var_38_1
            
            if (ebx s< 0x41)
                if (ebx - 0x61 u> 0x19)
                    goto label_4191cb
                
                var_38_1 = ebx.d
            else if (ebx s<= 0x5a || ebx - 0x61 u<= 0x19)
                var_38_1 = ebx.d
            else
            label_4191cb:
                int32_t var_38_2 = 0x25
                char ecx_4 = sub_419400(arg1, ecx_2.b)
                uint32_t var_38_3 = zx.d((*"0123456789abcdef")[zx.d(ebx) u>> 4])
                ecx_2 = sub_419400(arg1, ecx_4)
                uint32_t var_38_4 = zx.d((*"0123456789abcdef")[sx.d(ebx) & 0xf])
            sub_419400(arg1, ecx_2.b)
            esi = &esi[1]
            ecx_2 = var_14 + 1
            var_14 = ecx_2
        while (ecx_2 != var_20)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return arg1
}
