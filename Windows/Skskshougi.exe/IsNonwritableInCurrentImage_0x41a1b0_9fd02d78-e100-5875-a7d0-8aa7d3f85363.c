// ============================================================
// 函数名称: __IsNonwritableInCurrentImage
// 虚拟地址: 0x41a1b0
// WARP GUID: 9fd02d78-e100-5875-a7d0-8aa7d3f85363
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: __ValidateImageBase, __FindPESection
// [被调用的父级函数]: sub_419c5e
// ============================================================

int32_t__IsNonwritableInCurrentImage(int32_t arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xfffffffe
    int32_t var_8 = 0xfffffffe
    int32_t var_c = 0x424720
    int32_t (* var_10)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    uint32_t __security_cookie_1 = __security_cookie
    int32_t var_c_1 = var_c ^ __security_cookie_1
    int32_t __saved_ebp
    int32_t var_2c = __security_cookie_1 ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* var_1c = &var_2c
    int32_t var_8_1 = 0
    
    if (__ValidateImageBase(&__dos_header) != 0)
        void* eax_5 = __FindPESection(&__dos_header, arg1 - &__dos_header)
        
        if (eax_5 != 0)
            int32_t var_8_2 = 0xfffffffe
            fsbase->NtTib.ExceptionList = ExceptionList
            return not.d(*(eax_5 + 0x24) u>> 0x1f) & 1
    
    int32_t var_8_3 = 0xfffffffe
    fsbase->NtTib.ExceptionList = ExceptionList
    return 0
}
