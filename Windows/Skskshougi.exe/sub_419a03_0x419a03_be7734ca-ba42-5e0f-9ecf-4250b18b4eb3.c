// ============================================================
// 函数名称: sub_419a03
// 虚拟地址: 0x419a03
// WARP GUID: be7734ca-ba42-5e0f-9ecf-4250b18b4eb3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: _lock, __dllonexit
// [内部子函数调用]: sub_419aa3
// [被调用的父级函数]: _atexit
// ============================================================

int32_tsub_419a03(int32_t arg1)
{
    // 第一条实际指令: int32_t __saved_ebp_2 = 0x14
    int32_t __saved_ebp_2 = 0x14
    int32_t var_8 = 0x424648
    int32_t (* var_10)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    uint32_t __security_cookie_1 = __security_cookie
    int32_t var_8_3 = 0x424648 ^ __security_cookie_1
    int32_t __saved_ebp
    int32_t var_38 = __security_cookie_1 ^ &__saved_ebp
    int32_t* var_1c = &var_38
    void* const var_3c_7 = &data_419a0f
    int32_t var_8_4 = 0xfffffffe
    int32_t var_c = var_8_3
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_28 = 0
    int32_t eax = DecodePointer(data_42f958)
    int32_t var_20 = eax
    int32_t result
    
    if (eax != 0xffffffff)
        _lock(8)
        int32_t var_8_1 = 0
        var_20 = DecodePointer(data_42f958)
        int32_t var_24 = DecodePointer(data_42f954)
        int32_t result_1 = __dllonexit(EncodePointer(arg1), &var_20, &var_24)
        int32_t result_2 = result_1
        data_42f958 = EncodePointer(var_20)
        data_42f954 = EncodePointer(var_24)
        int32_t var_8_2 = 0xfffffffe
        sub_419aa3()
        result = result_1
    else
        result = _onexit(arg1)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    void* const __saved_ebp_1 = &data_419a9f
    return result
}
