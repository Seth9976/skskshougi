// ============================================================
// 函数名称: sub_403d90
// 虚拟地址: 0x403d90
// WARP GUID: 81515187-1295-5bad-9b3f-632e758180b4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4039c0
// ============================================================

void* __fastcallsub_403d90(void* arg1)
{
    // 第一条实际指令: void* result = arg1 + 8
    void* result = arg1 + 8
    int32_t i_1 = 0x270
    int32_t i
    
    do
        int32_t edx_1 = *(result - 4)
        result += 4
        int32_t edx_4 = ((edx_1 ^ *(result - 4)) & 0x7fffffff) ^ *(result - 8)
        uint32_t ecx_1 = zx.d(edx_4.b) & 1
        int32_t ecx_2 = neg.d(ecx_1)
        *(result + 0x9b8) =
            (sbb.d(ecx_2, ecx_2, ecx_1 != 0) & 0x9908b0df) ^ *(result + 0x62c) ^ edx_4 u>> 1
        i = i_1
        i_1 -= 1
    while (i != 1)
    return result
}
