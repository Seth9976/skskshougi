// ============================================================
// 函数名称: sub_401280
// 虚拟地址: 0x401280
// WARP GUID: 5813e3d3-2e61-5e5c-b273-99d619152adc
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8, sub_401ae0, sub_401ee0, sub_401d30
// [被调用的父级函数]: 无
// ============================================================

uint32_tsub_401280()
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41a458
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_3c
    int32_t eax_2 = __security_cookie ^ &var_3c
    int32_t __saved_esi
    int32_t var_44 = __security_cookie ^ &__saved_esi
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_20 = 0xf
    int32_t var_24 = 0
    char var_34 = 0
    sub_401ae0(&var_34, &data_41d780, 0)
    int32_t var_c_1 = 0
    uint32_t result = std::_Random_device()
    
    if (var_20 u>= 0x10)
        void var_35
        void* var_48_1 = &var_35
        result = operator delete(var_34.d)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_3c)
    return result
}
