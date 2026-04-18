// ============================================================
// 函数名称: sub_401be0
// 虚拟地址: 0x401be0
// WARP GUID: b1ec8575-a8f1-5c9a-add4-bd13434f3533
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_401990
// ============================================================

int32_t* __thiscallsub_401be0(int32_t* arg1, int32_t arg2, int32_t arg3)
{
    // 第一条实际指令: int32_t ecx = arg2
    int32_t ecx = arg2
    int32_t edi = arg1[4]
    
    if (edi u< ecx)
        ecx = std::_Xout_of_range("invalid string position")
    
    if (edi - ecx u<= arg3)
        bool cond:0 = arg1[5] u< 0x10
        arg1[4] = ecx
        
        if (cond:0)
            *(arg1 + ecx) = 0
            return arg1
        
        (*arg1)[ecx] = 0
        return arg1
    
    if (arg3 != 0)
        int32_t* eax_5
        
        if (arg1[5] u< 0x10)
            eax_5 = arg1
        else
            eax_5 = *arg1
        
        int32_t edi_1 = edi - arg3
        void* ebx_1 = eax_5 + ecx
        
        if (edi_1 != ecx)
            memmove(ebx_1, ebx_1 + arg3, edi_1 - ecx)
        
        bool cond:1_1 = arg1[5] u< 0x10
        arg1[4] = edi_1
        
        if (not(cond:1_1))
            (*arg1)[edi_1] = 0
            return arg1
        
        *(arg1 + edi_1) = 0
    
    return arg1
}
