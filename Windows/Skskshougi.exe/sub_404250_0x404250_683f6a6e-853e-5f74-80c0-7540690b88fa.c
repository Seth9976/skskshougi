// ============================================================
// 函数名称: sub_404250
// 虚拟地址: 0x404250
// WARP GUID: 683f6a6e-853e-5f74-80c0-7540690b88fa
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_403e50
// ============================================================

int16_t* __convention("regparm")sub_404250(int32_t arg1, int32_t arg2, int32_t arg3, int16_t* arg4)
{
    // 第一条实际指令: int32_t esi = 0
    int32_t esi = 0
    uint32_t edi_3 = (arg2 - arg3 + 1) u>> 1
    
    if (arg3 u> arg2)
        edi_3 = 0
    
    int16_t* result = arg4
    
    if (edi_3 != 0)
        int16_t* ebx_1 = arg3 - result
        
        do
            if (result != 0)
                arg3.w = *(ebx_1 + result)
                *result = arg3.w
            
            esi += 1
            result = &result[1]
        while (esi != edi_3)
    
    return result
}
