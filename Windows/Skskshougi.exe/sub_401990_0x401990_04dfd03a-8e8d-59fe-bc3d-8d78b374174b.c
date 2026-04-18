// ============================================================
// 函数名称: sub_401990
// 虚拟地址: 0x401990
// WARP GUID: 04dfd03a-8e8d-59fe-bc3d-8d78b374174b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401be0, sub_401d60
// [被调用的父级函数]: sub_401ae0, sub_4181f0, sub_40f5a0, sub_404680, sub_406f90, sub_40eea0, sub_40f550, sub_417f30, sub_418090, sub_40e550, sub_4087d0
// ============================================================

int32_t* __thiscallsub_401990(int32_t* arg1, void** arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: void** ebx = arg2
    void** ebx = arg2
    int32_t ecx = arg3
    int32_t edi = ebx[4]
    
    if (edi u< ecx)
        ecx = std::_Xout_of_range("invalid string position")
    
    int32_t edi_1 = edi - ecx
    
    if (arg4 u< edi_1)
        edi_1 = arg4
    
    if (arg1 == ebx)
        int32_t eax = edi_1 + ecx
        
        if (arg1[4] u< eax)
            eax, ecx = std::_Xout_of_range("invalid string position")
        
        bool cond:0 = arg1[5] u< 0x10
        arg1[4] = eax
        
        if (cond:0)
            *(arg1 + eax) = 0
            sub_401be0(arg1, 0, ecx)
            return arg1
        
        (*arg1)[eax] = 0
        sub_401be0(arg1, 0, ecx)
        return arg1
    
    if (edi_1 u> 0xfffffffe)
        ecx = std::_Xlength_error("string too long")
    
    int32_t eax_3 = arg1[5]
    
    if (eax_3 u>= edi_1)
        if (edi_1 != 0)
            goto label_401a38
        
        arg1[4] = edi_1
        
        if (eax_3 u< 0x10)
            *arg1 = 0
            return arg1
        
        **arg1 = 0
        return arg1
    
    sub_401d60(arg1, edi_1, arg1[4])
    ecx = arg3
    
    if (edi_1 != 0)
    label_401a38:
        
        if (ebx[5] u>= 0x10)
            ebx = *ebx
        
        int32_t* edx_3
        
        if (arg1[5] u< 0x10)
            edx_3 = arg1
        else
            edx_3 = *arg1
        
        if (edi_1 != 0)
            memcpy(edx_3, ebx + ecx, edi_1)
        
        bool cond:1_1 = arg1[5] u< 0x10
        arg1[4] = edi_1
        
        if (not(cond:1_1))
            (*arg1)[edi_1] = 0
            return arg1
        
        *(arg1 + edi_1) = 0
    
    return arg1
}
