// ============================================================
// 函数名称: sub_40cef0
// 虚拟地址: 0x40cef0
// WARP GUID: 4881232a-9cb6-5112-9872-242f784207f6
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d150
// [被调用的父级函数]: sub_40c770
// ============================================================

int32_t __thiscallsub_40cef0(int32_t* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t eax = arg1[1]
    int32_t eax = arg1[1]
    int32_t ecx
    
    if (arg2 u< eax)
        ecx = *arg1
    
    if (arg2 u>= eax || ecx u> arg2)
        if (eax == arg1[2])
            eax = sub_40d150(arg1, 1)
        
        int32_t* ecx_4 = arg1[1]
        
        if (ecx_4 != 0)
            eax = *arg2
            *ecx_4 = eax
    else
        if (eax == arg1[2])
            eax = sub_40d150(arg1, 1)
        
        int32_t* ecx_2 = arg1[1]
        
        if (ecx_2 != 0)
            int32_t eax_2 = *(*arg1 + ((arg2 - ecx) s>> 2 << 2))
            *ecx_2 = eax_2
            arg1[1] += 4
            return eax_2
    
    arg1[1] += 4
    return eax
}
