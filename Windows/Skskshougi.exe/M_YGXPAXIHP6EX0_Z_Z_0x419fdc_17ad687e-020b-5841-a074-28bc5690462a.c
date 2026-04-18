// ============================================================
// 函数名称: ??_M@YGXPAXIHP6EX0@Z@Z
// 虚拟地址: 0x419fdc
// WARP GUID: 17ad687e-020b-5841-a074-28bc5690462a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: $LN10
// [被调用的父级函数]: ??_Etype_info@@UAEPAXI@Z
// ============================================================

int32_t __stdcall??_M@YGXPAXIHP6EX0@Z@Z(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t __saved_ebp_1 = 0xc
    int32_t __saved_ebp_1 = 0xc
    int32_t var_8 = 0x4246e0
    int32_t (* var_10)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    uint32_t __security_cookie_1 = __security_cookie
    int32_t var_8_3 = 0x4246e0 ^ __security_cookie_1
    int32_t __saved_ebp
    int32_t var_30 = __security_cookie_1 ^ &__saved_ebp
    int32_t* var_1c = &var_30
    void* const var_34 = &data_419fe8
    int32_t var_8_4 = 0xfffffffe
    int32_t var_c = var_8_3
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_20 = 0
    int32_t edi = arg3
    int32_t esi_1 = arg1 + arg2 * edi
    arg1 = esi_1
    int32_t var_8_1 = 0
    
    while (true)
        int32_t temp1_1 = edi
        edi -= 1
        arg3 = edi
        
        if (temp1_1 - 1 s< 0)
            break
        
        esi_1 -= arg2
        arg1 = esi_1
        arg4()
    
    int32_t var_20_1 = 1
    int32_t var_8_2 = 0xfffffffe
    int32_t result = $LN10(1, &__saved_ebp, esi_1, edi)
    fsbase->NtTib.ExceptionList = ExceptionList
    void* const __saved_ebp_2 = &data_41a02c
    return result
}
