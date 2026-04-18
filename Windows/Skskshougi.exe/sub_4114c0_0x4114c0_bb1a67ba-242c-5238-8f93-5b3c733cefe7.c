// ============================================================
// 函数名称: sub_4114c0
// 虚拟地址: 0x4114c0
// WARP GUID: bb1a67ba-242c-5238-8f93-5b3c733cefe7
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_411390, sub_403f60, sub_4199b8, sub_403ac0
// [被调用的父级函数]: sub_409c90, sub_413e00
// ============================================================

char* __fastcallsub_4114c0(char* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b541
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_5c = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_8_1 = 0
    char* var_4c = arg1
    int32_t var_48 = 0
    int32_t eax_3 = sub_411390()
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    int32_t var_8_2 = 0
    int32_t var_48_1 = 1
    
    if (eax_3 s< 0x87)
        void* var_44
        char* eax_14 = sub_401f70(&var_44, 9 - eax_3 s/ 0xf)
        int32_t var_8_3 = 1
        char var_2c
        char* eax_15 = sub_403f60(eax_14.b, eax_14, &var_2c, 0x41f7c0)
        
        if (arg1 != eax_15)
            if (*(arg1 + 0x14) u>= 0x10)
                operator delete(*arg1)
            
            *(arg1 + 0x14) = 0xf
            *(arg1 + 0x10) = 0
            *arg1 = 0
            sub_403ac0(arg1, eax_15)
        
        int32_t var_18
        
        if (var_18 u>= 0x10)
            operator delete(var_2c.d)
        
        int32_t var_18_1 = 0xf
        int32_t var_1c_1 = 0
        var_2c = 0
        int32_t var_30
        
        if (var_30 u>= 0x10)
            operator delete(var_44)
    else
        char* edx_3 = (&data_41d828)[(eax_3 - 0x87) s/ 0xf]
        
        if (*edx_3 != 0)
            char* eax_8 = edx_3
            int32_t ecx_1
            
            do
                ecx_1.b = *eax_8
                eax_8 = &eax_8[1]
            while (ecx_1.b != 0)
            sub_401ae0(arg1, edx_3, eax_8 - &eax_8[1])
        else
            sub_401ae0(arg1, edx_3, 0)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return arg1
}
