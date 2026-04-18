// ============================================================
// 函数名称: sub_40e320
// 虚拟地址: 0x40e320
// WARP GUID: c7ee7345-88d1-5ec7-a8ff-de5b9d00e457
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40e3c0
// [被调用的父级函数]: sub_401180
// ============================================================

int32_t __fastcallsub_40e320(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b0eb
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_1c = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* var_18 = &data_42e4c8
    data_42e4c8 = 0
    data_42e4cc = 0
    data_42e4d0 = 0
    data_42e4d4.w = 1
    data_42e4d6 = 0
    __builtin_memset(&data_42e4d8, 0, 0x14)
    int32_t var_8_1 = 0
    int32_t var_14
    int32_t* var_20 = &var_14
    var_14 = 0
    sub_40e3c0(&data_42e4e0, arg1)
    fsbase->NtTib.ExceptionList = ExceptionList
    return &data_42e4c8
}
