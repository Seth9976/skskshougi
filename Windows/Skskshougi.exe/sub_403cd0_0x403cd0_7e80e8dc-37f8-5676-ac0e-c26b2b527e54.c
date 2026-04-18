// ============================================================
// 函数名称: sub_403cd0
// 虚拟地址: 0x403cd0
// WARP GUID: 7e80e8dc-37f8-5676-ac0e-c26b2b527e54
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4039c0, sub_4033e0
// ============================================================

int32_t __fastcallsub_403cd0(int32_t* arg1)
{
    // 第一条实际指令: int32_t i_2 = 0xe3
    int32_t i_2 = 0xe3
    void* edi = &arg1[0x271]
    int32_t i
    
    do
        int32_t edx_1 = *(edi + 4)
        edi += 4
        int32_t edx_4 = ((edx_1 ^ *(edi - 4)) & 0x7fffffff) ^ *(edi - 4)
        uint32_t eax_2 = zx.d(edx_4.b) & 1
        int32_t eax_3 = neg.d(eax_2)
        *(edi - 0x9c4) = (sbb.d(eax_3, eax_3, eax_2 != 0) & 0x9908b0df) ^ *(edi + 0x630) ^ edx_4 u>> 1
        i = i_2
        i_2 -= 1
    while (i != 1)
    int32_t* esi = &arg1[0x354]
    int32_t i_3 = 0x18c
    int32_t i_1
    
    do
        int32_t ecx = *esi
        esi = &esi[1]
        int32_t ecx_3 = ((ecx ^ *esi) & 0x7fffffff) ^ esi[-1]
        uint32_t eax_9 = zx.d(ecx_3.b) & 1
        int32_t eax_10 = neg.d(eax_9)
        esi[-0x271] = (sbb.d(eax_10, eax_10, eax_9 != 0) & 0x9908b0df) ^ esi[-0x354] ^ ecx_3 u>> 1
        i_1 = i_3
        i_3 -= 1
    while (i_1 != 1)
    int32_t ecx_8 = ((arg1[0x4e0] ^ arg1[1]) & 0x7fffffff) ^ arg1[0x4e0]
    uint32_t eax_16 = zx.d(ecx_8.b) & 1
    int32_t eax_17 = neg.d(eax_16)
    int32_t result = (sbb.d(eax_17, eax_17, eax_16 != 0) & 0x9908b0df) ^ arg1[0x18d] ^ ecx_8 u>> 1
    arg1[0x270] = result
    *arg1 = i_3
    return result
}
