// ============================================================
// 函数名称: sub_403b20
// 虚拟地址: 0x403b20
// WARP GUID: 8ea9a8e6-b6b8-5f12-a8cf-d6d8b02456e4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401c80
// [被调用的父级函数]: sub_40d460, sub_404680, sub_415470, sub_414c30, sub_40d550, sub_403be0, sub_40d600, sub_418740, sub_409c90, sub_40e550
// ============================================================

int32_t* __thiscallsub_403b20(int32_t* arg1, void** arg2, void* arg3, void* arg4)
{
    // 第一条实际指令: void** edi = arg2
    void** edi = arg2
    void* ecx = arg3
    int32_t eax = edi[4]
    
    if (eax u< ecx)
        eax, ecx = std::_Xout_of_range("invalid string position")
    
    void* ebx = arg4
    void* eax_1 = eax - ecx
    void** ecx_1 = arg1[4]
    arg2 = ecx_1
    
    if (eax_1 u< ebx)
        ebx = eax_1
    
    if (0xffffffff - ecx_1 u<= ebx)
        ecx_1 = std::_Xlength_error("string too long")
    
    if (ebx != 0 && sub_401c80(arg1, ecx_1 + ebx, 0) != 0)
        if (edi[5] u>= 0x10)
            edi = *edi
        
        int32_t* ecx_3
        
        if (arg1[5] u< 0x10)
            ecx_3 = arg1
        else
            ecx_3 = *arg1
        
        if (ebx != 0)
            memcpy(arg1[4] + ecx_3, arg3 + edi, ebx)
        
        int32_t ecx_5 = arg2 + ebx
        bool cond:1_1 = arg1[5] u< 0x10
        arg1[4] = ecx_5
        
        if (not(cond:1_1))
            (*arg1)[ecx_5] = 0
            return arg1
        
        *(arg1 + ecx_5) = 0
    
    return arg1
}
