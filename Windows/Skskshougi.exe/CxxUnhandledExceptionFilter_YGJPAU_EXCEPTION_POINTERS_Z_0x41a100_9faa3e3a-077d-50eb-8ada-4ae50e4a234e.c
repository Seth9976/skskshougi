// ============================================================
// 函数名称: ?__CxxUnhandledExceptionFilter@@YGJPAU_EXCEPTION_POINTERS@@@Z
// 虚拟地址: 0x41a100
// WARP GUID: 9faa3e3a-077d-50eb-8ada-4ae50e4a234e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: ?terminate@@YAXXZ
// [内部子函数调用]: 无
// [被调用的父级函数]: ___CxxSetUnhandledExceptionFilter
// ============================================================

int32_t __stdcall?__CxxUnhandledExceptionFilter@@YGJPAU_EXCEPTION_POINTERS@@@Z(int32_t* arg1)
{
    // 第一条实际指令: int32_t* eax_1 = *arg1
    int32_t* eax_1 = *arg1
    
    if (*eax_1 == 0xe06d7363 && eax_1[4] == 3)
        int32_t eax_2 = eax_1[5]
        
        if (eax_2 == 0x19930520 || eax_2 == 0x19930521 || eax_2 == 0x19930522 || eax_2 == 0x1994000)
            terminate()
            breakpoint
    
    return 0
}
