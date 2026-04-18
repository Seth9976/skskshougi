// ============================================================
// 函数名称: sub_401540
// 虚拟地址: 0x401540
// WARP GUID: 632a2973-43ae-5e9a-92da-72dc7fadc4bf
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4014b0, sub_401ae0
// [被调用的父级函数]: 无
// ============================================================

char* __stdcallsub_401540(char* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t ecx
    int32_t ecx
    int32_t var_8 = ecx
    int32_t var_8_1 = 0
    
    if (arg2 != 1)
        sub_4014b0(arg1, arg2)
        return arg1
    
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    sub_401ae0(arg1, "iostream stream error", 0x15)
    return arg1
}
