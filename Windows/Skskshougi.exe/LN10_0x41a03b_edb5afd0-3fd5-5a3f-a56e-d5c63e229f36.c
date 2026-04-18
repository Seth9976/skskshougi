// ============================================================
// 函数名称: $LN10
// 虚拟地址: 0x41a03b
// WARP GUID: edb5afd0-3fd5-5a3f-a56e-d5c63e229f36
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: ?__ArrayUnwind@@YGXPAXIHP6EX0@Z@Z
// [被调用的父级函数]: sub_41a02f, ??_M@YGXPAXIHP6EX0@Z@Z
// ============================================================

void __convention("regparm")$LN10(struct _EXCEPTION_REGISTRATION_RECORD** arg1, void* arg2 @ ebp, int32_t arg3 @ esi, int32_t arg4 @ edi)
{
    // 第一条实际指令: int32_t entry_ebx
    int32_t entry_ebx
    
    if (arg1 == 0)
        __ArrayUnwind(arg3, entry_ebx, arg4, *(arg2 + 0x14))
}
