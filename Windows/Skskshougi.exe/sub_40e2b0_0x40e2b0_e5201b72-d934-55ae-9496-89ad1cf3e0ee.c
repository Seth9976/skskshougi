// ============================================================
// 函数名称: sub_40e2b0
// 虚拟地址: 0x40e2b0
// WARP GUID: e5201b72-d934-55ae-9496-89ad1cf3e0ee
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40baa0
// [被调用的父级函数]: 无
// ============================================================

int32_t __fastcallsub_40e2b0(void* arg1)
{
    // 第一条实际指令: int32_t* esi = *(arg1 + 4)
    int32_t* esi = *(arg1 + 4)
    int32_t result
    int32_t edx
    edx:result = muls.dp.d(0x3e0f83e1, esi[0x11a] - esi[0x119])
    int32_t edx_1 = edx s>> 3
    
    if (esi[0xb3] == (edx_1 u>> 0x1f) - 1 + edx_1)
        return result
    
    int32_t eax
    int32_t edx_4
    edx_4:eax = muls.dp.d(0x3e0f83e1, esi[0x11a] - esi[0x119])
    int32_t edx_5 = edx_4 s>> 3
    esi[0xb3] = (edx_5 u>> 0x1f) - 1 + edx_5
    return sub_40baa0(esi)
}
