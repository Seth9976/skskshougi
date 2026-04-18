// ============================================================
// 函数名称: __EH_prolog3_catch
// 虚拟地址: 0x41a0c4
// WARP GUID: f1a92801-ee7f-5eb9-ae86-e09c629fa6d1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: ??2@YAPAXIABUnothrow_t@std@@@Z
// ============================================================

void__EH_prolog3_catch(int32_t arg1 @ esi, int32_t arg2 @ edi)
{
    // 第一条实际指令: int32_t eax
    int32_t eax
    int32_t var_4 = eax
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t arg_4
    void* esp = &ExceptionList - arg_4
    int32_t entry_ebx
    *(esp - 4) = entry_ebx
    *(esp - 8) = arg1
    *(esp - 0xc) = arg2
    int32_t ebp
    arg_4 = ebp
    *(esp - 0x10) = __security_cookie ^ &arg_4
    void* var_c = esp - 0x10
    *(esp - 0x14) = __return_addr
    __return_addr = 0xffffffff
    fsbase->NtTib.ExceptionList = &ExceptionList
}
