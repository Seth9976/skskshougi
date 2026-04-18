// ============================================================
// 函数名称: sub_402170
// 虚拟地址: 0x402170
// WARP GUID: 1d5df88b-0f97-50d8-81a2-bd483484f850
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_408ce0
// ============================================================

int32_t __fastcallsub_402170(void* arg1)
{
    // 第一条实际指令: int32_t result = 0
    int32_t result = 0
    void* ecx = arg1 + 6
    int32_t i_1 = 3
    int32_t i
    
    do
        if (*(ecx - 1) == 4)
            result += 1
        
        if (*ecx == 4)
            result += 1
        
        if (*(ecx + 1) == 4)
            result += 1
        
        if (*(ecx + 2) == 4)
            result += 1
        
        if (*(ecx + 3) == 4)
            result += 1
        
        ecx += 5
        i = i_1
        i_1 -= 1
    while (i != 1)
    return result
}
