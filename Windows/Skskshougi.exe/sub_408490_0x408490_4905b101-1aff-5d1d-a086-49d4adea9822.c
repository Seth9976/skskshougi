// ============================================================
// 函数名称: sub_408490
// 虚拟地址: 0x408490
// WARP GUID: 4905b101-1aff-5d1d-a086-49d4adea9822
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_405f80, sub_405d60
// ============================================================

int32_t __fastcallsub_408490(void* arg1)
{
    // 第一条实际指令: void* var_8 = arg1
    void* var_8 = arg1
    int32_t eax = *(arg1 + 0x45c)
    int32_t* esi = *(arg1 + 0x458)
    uint32_t ebx_3 = (eax - esi + 3) u>> 2
    int32_t edi = 0
    
    if (esi u> eax)
        ebx_3 = 0
    
    if (ebx_3 != 0)
        do
            (*(**esi + 0x12c))(1)
            edi += 1
            esi = &esi[1]
        while (edi != ebx_3)
    
    int32_t result = *(arg1 + 0x458)
    *(arg1 + 0x45c) = result
    return result
}
