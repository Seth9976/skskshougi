// ============================================================
// 函数名称: sub_40ce90
// 虚拟地址: 0x40ce90
// WARP GUID: 649435a0-0fc1-53c5-805e-3da5d1579a6f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d150
// [被调用的父级函数]: sub_40c770, sub_406500, sub_406250
// ============================================================

int32_t __thiscallsub_40ce90(void** arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t* ebx = arg1
    int32_t* ebx = arg1
    int32_t eax = ebx[1]
    int32_t edx_2 = (eax - *ebx) s>> 2
    
    if (edx_2 u> arg2)
        int32_t eax_1 = eax + ((arg2 - edx_2) << 2)
        ebx[1] = eax_1
        return eax_1
    
    if (edx_2 u< arg2)
        sub_40d150(arg1, arg2 - edx_2)
        int32_t edi_1 = ebx[1]
        int32_t eax_6 = (edi_1 - *ebx) s>> 2
        
        if (arg2 != eax_6)
            __builtin_memset(edi_1, 0, (arg2 - eax_6) << 2)
        
        int32_t ecx_2 = ebx[1]
        eax = ecx_2 + ((arg2 - ((ecx_2 - *ebx) s>> 2)) << 2)
        ebx[1] = eax
    
    return eax
}
