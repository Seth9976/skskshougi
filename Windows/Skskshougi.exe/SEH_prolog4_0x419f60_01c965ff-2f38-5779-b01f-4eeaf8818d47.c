// ============================================================
// 函数名称: __SEH_prolog4
// 虚拟地址: 0x419f60
// WARP GUID: 01c965ff-2f38-5779-b01f-4eeaf8818d47
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: ?__ArrayUnwind@@YGXPAXIHP6EX0@Z@Z, sub_419a03, ??_M@YGXPAXIHP6EX0@Z@Z, sub_419c5e
// ============================================================

void__SEH_prolog4(int32_t arg1 @ esi, int32_t arg2 @ edi, void* arg3)
{
    // 第一条实际指令: int32_t (* var_4)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    int32_t (* var_4)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t arg_8
    int32_t eax = arg_8
    int32_t ebp
    arg_8 = ebp
    void* esp = &ExceptionList - eax
    int32_t entry_ebx
    *(esp - 4) = entry_ebx
    *(esp - 8) = arg1
    *(esp - 0xc) = arg2
    uint32_t __security_cookie_1 = __security_cookie
    *(esp - 0x10) = __security_cookie_1 ^ &arg_8
    void* var_10 = esp - 0x10
    *(esp - 0x14) = __return_addr
    void* __return_addr_1 = arg3 ^ __security_cookie_1
    arg3 = 0xfffffffe
    __return_addr = __return_addr_1
    fsbase->NtTib.ExceptionList = &ExceptionList
}
