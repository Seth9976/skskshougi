// ============================================================
// 函数名称: ??2@YAPAXIABUnothrow_t@std@@@Z
// 虚拟地址: 0x419b2c
// WARP GUID: 58589024-c4b4-5300-96bc-fb847f044eb0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: ??2@YAPAXI@Z
// [内部子函数调用]: sub_419b54
// [被调用的父级函数]: sub_404290, sub_40f3c0, ??4?$basic_string@DU?$char_traits@D@std@@V?$allocator@D@2@@std@@QAEAAV01@$$QAV01@@Z, sub_4165d0, sub_410fb0
// ============================================================

int32_t??2@YAPAXIABUnothrow_t@std@@@Z(int32_t arg1 @ esi, int32_t arg2 @ edi, uint32_t arg3)
{
    // 第一条实际指令: int32_t var_4 = 8
    int32_t var_4 = 8
    void (* var_c)(void* arg1) __noreturn = sub_41c3ae
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t ebp
    var_4 = ebp
    int32_t var_28 = __security_cookie ^ &var_4
    int32_t* var_14 = &var_28
    void* const var_2c_1 = &data_419b38
    int32_t var_8_1 = 0xffffffff
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_8 = 0
    operator new(arg3)
    int32_t entry_ebx
    return sub_419b54(&var_4, arg2, arg1, entry_ebx) __tailcall
}
