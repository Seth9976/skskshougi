// ============================================================
// 函数名称: sub_401e31
// 虚拟地址: 0x401e31
// WARP GUID: f1a993df-8107-5d03-b2db-a34b9f90a7a4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: _CxxThrowException
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

voidsub_401e31(void* arg1 @ ebp) __noreturn
{
    // 第一条实际指令: int32_t* esi = *(arg1 - 0x18)
    int32_t* esi = *(arg1 - 0x18)
    
    if (esi[5] u>= 0x10)
        operator delete(*esi)
    
    esi[5] = 0xf
    esi[4] = 0
    *esi = 0
    _CxxThrowException(nullptr, nullptr)
    noreturn
}
