// ============================================================
// 函数名称: sub_402020
// 虚拟地址: 0x402020
// WARP GUID: 033ed8f6-5ae0-5a99-bca2-3dfb44321066
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4031b0, sub_4032a0, sub_4035b0, sub_4038a0, sub_403230, sub_40d0c0
// ============================================================

void* __thiscallsub_402020(void* arg1, void* arg2)
{
    // 第一条实际指令: int32_t i_1 = 0x19
    int32_t i_1 = 0x19
    void* result = arg1
    void* result_1 = result
    int32_t i
    
    do
        arg1.b = *(arg2 - result + result_1)
        result_1 += 1
        *(result_1 - 1) = arg1.b
        i = i_1
        i_1 -= 1
    while (i != 1)
    *(result + 0x19) = *(arg2 + 0x19)
    *(result + 0x1d) = *(arg2 + 0x1d)
    *(result + 0x1a) = *(arg2 + 0x1a)
    *(result + 0x1e) = *(arg2 + 0x1e)
    *(result + 0x1b) = *(arg2 + 0x1b)
    *(result + 0x1f) = *(arg2 + 0x1f)
    *(result + 0x1c) = *(arg2 + 0x1c)
    *(result + 0x20) = *(arg2 + 0x20)
    return result
}
