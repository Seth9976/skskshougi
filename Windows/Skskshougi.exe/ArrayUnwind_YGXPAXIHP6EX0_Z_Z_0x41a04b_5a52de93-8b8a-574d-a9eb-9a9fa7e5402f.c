// ============================================================
// 函数名称: ?__ArrayUnwind@@YGXPAXIHP6EX0@Z@Z
// 虚拟地址: 0x41a04b
// WARP GUID: 5a52de93-8b8a-574d-a9eb-9a9fa7e5402f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: $LN10
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __stdcall?__ArrayUnwind@@YGXPAXIHP6EX0@Z@Z(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t __saved_ebp_1 = 0x14
    int32_t __saved_ebp_1 = 0x14
    int32_t var_8 = 0x424700
    int32_t (* var_10)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    uint32_t __security_cookie_1 = __security_cookie
    int32_t var_8_3 = 0x424700 ^ __security_cookie_1
    int32_t __saved_ebp
    int32_t var_38 = __security_cookie_1 ^ &__saved_ebp
    int32_t* var_1c = &var_38
    void* const var_3c = &data_41a057
    int32_t var_8_4 = 0xfffffffe
    int32_t var_c = var_8_3
    struct _EXCEPTION_REGISTRATION_RECORD** result = &ExceptionList
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_8_1 = 0
    
    while (true)
        int32_t temp1_1 = arg3
        arg3 -= 1
        
        if (temp1_1 - 1 s< 0)
            break
        
        arg1 -= arg2
        result = arg4()
    
    int32_t var_8_2 = 0xfffffffe
    fsbase->NtTib.ExceptionList = ExceptionList
    void* const __saved_ebp_2 = &data_41a0a6
    return result
}
