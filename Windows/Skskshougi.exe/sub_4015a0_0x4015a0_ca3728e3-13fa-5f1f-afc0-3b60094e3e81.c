// ============================================================
// 函数名称: sub_4015a0
// 虚拟地址: 0x4015a0
// WARP GUID: ca3728e3-13fa-5f1f-afc0-3b60094e3e81
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0
// [被调用的父级函数]: 无
// ============================================================

char* __stdcallsub_4015a0(char* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t ecx
    int32_t ecx
    int32_t var_8 = ecx
    int32_t var_8_1 = 0
    char* eax = std::_Winerror_map(arg2)
    char const* const edx = "unknown error"
    
    if (eax != 0)
        edx = eax
    
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    
    if (*edx == 0)
        sub_401ae0(arg1, edx, 0)
        return arg1
    
    char* ecx_2 = edx
    
    do
        eax.b = *ecx_2
        ecx_2 = &ecx_2[1]
    while (eax.b != 0)
    
    sub_401ae0(arg1, edx, ecx_2 - &ecx_2[1])
    return arg1
}
