// ============================================================
// 函数名称: sub_403a50
// 虚拟地址: 0x403a50
// WARP GUID: 94475d6a-9079-516c-ab14-174e2d8e1341
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403de0
// [被调用的父级函数]: sub_40c770, sub_4028d0
// ============================================================

int32_t __thiscallsub_403a50(int32_t* arg1, int16_t* arg2)
{
    // 第一条实际指令: int32_t eax = arg1[1]
    int32_t eax = arg1[1]
    int32_t ecx
    
    if (arg2 u< eax)
        ecx = *arg1
    
    if (arg2 u>= eax || ecx u> arg2)
        if (eax == arg1[2])
            eax = sub_403de0(arg1, 1)
        
        int16_t* ecx_4 = arg1[1]
        
        if (ecx_4 != 0)
            eax.w = *arg2
            *ecx_4 = eax.w
    else
        if (eax == arg1[2])
            eax = sub_403de0(arg1, 1)
        
        int16_t* ecx_2 = arg1[1]
        
        if (ecx_2 != 0)
            int32_t eax_1
            eax_1.w = *(*arg1 + ((arg2 - ecx) s>> 1 << 1))
            *ecx_2 = eax_1.w
            arg1[1] += 2
            return eax_1
    
    arg1[1] += 2
    return eax
}
