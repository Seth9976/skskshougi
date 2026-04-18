// ============================================================
// 函数名称: sub_419400
// 虚拟地址: 0x419400
// WARP GUID: 4f0139d0-9e1c-559e-9fe7-5855897dd5ac
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401d60
// [被调用的父级函数]: sub_419120
// ============================================================

int32_t* __thiscallsub_419400(int32_t* arg1, char arg2)
{
    // 第一条实际指令: int32_t ecx = arg1[4]
    int32_t ecx = arg1[4]
    
    if (0xffffffff - ecx u<= 1)
        ecx = std::_Xlength_error("string too long")
    
    int32_t edi = ecx + 1
    
    if (edi u> 0xfffffffe)
        ecx = std::_Xlength_error("string too long")
    
    void* eax_1 = arg1[5]
    
    if (eax_1 u>= edi)
        if (edi != 0)
            goto label_41944d
        
        arg1[4] = edi
        
        if (eax_1 u< 0x10)
            *arg1 = 0
            return arg1
        
        **arg1 = 0
        return arg1
    
    sub_401d60(arg1, edi, ecx)
    
    if (edi != 0)
    label_41944d:
        char* ecx_2
        
        if (arg1[5] u< 0x10)
            ecx_2 = arg1
        else
            ecx_2 = *arg1
        
        eax_1.b = arg2
        ecx_2[arg1[4]] = eax_1.b
        bool cond:1_1 = arg1[5] u< 0x10
        arg1[4] = edi
        
        if (not(cond:1_1))
            (*arg1)[edi] = 0
            return arg1
        
        *(arg1 + edi) = 0
    
    return arg1
}
