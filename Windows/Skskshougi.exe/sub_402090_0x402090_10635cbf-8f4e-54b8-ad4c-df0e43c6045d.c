// ============================================================
// 函数名称: sub_402090
// 虚拟地址: 0x402090
// WARP GUID: 10635cbf-8f4e-54b8-ad4c-df0e43c6045d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40d7b0, sub_406f90, sub_404680
// ============================================================

char* __fastcallsub_402090(char* arg1)
{
    // 第一条实际指令: char* var_8 = arg1
    char* var_8 = arg1
    int32_t esi = 0
    char* edx = &arg1[0x19]
    void* edi_1 = 4
    
    if (&arg1[0x19] u> &arg1[0x1d])
        edi_1 = nullptr
    
    if (edi_1 != 0)
        do
            esi += 1
            *edx = 0
            edx = &edx[1]
        while (esi != edi_1)
    
    char* edx_1 = &arg1[0x1d]
    int32_t esi_1 = 0
    void* edi_4 = 4
    
    if (edx_1 u> &edx_1[4])
        edi_4 = nullptr
    
    if (edi_4 != 0)
        do
            esi_1 += 1
            *edx_1 = 0
            edx_1 = &edx_1[1]
        while (esi_1 != edi_4)
    
    void* esi_3 = 0x19
    int32_t edx_2 = 0
    char* result = arg1
    
    if (arg1 u> &arg1[0x19])
        esi_3 = nullptr
    
    if (esi_3 != 0)
        do
            edx_2 += 1
            *result = 0xff
            result = &result[1]
        while (edx_2 != esi_3)
    
    *(arg1 + 5) = 0xd0b
    arg1[7] = 0xa
    *(arg1 + 9) = 0x900
    arg1[0xb] = 0
    *(arg1 + 0xd) = 0x100
    arg1[0xf] = 0
    *(arg1 + 0x11) = 0x502
    arg1[0x13] = 3
    return result
}
