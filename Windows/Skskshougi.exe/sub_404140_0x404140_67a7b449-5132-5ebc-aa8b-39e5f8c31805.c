// ============================================================
// 函数名称: sub_404140
// 虚拟地址: 0x404140
// WARP GUID: 67a7b449-5132-5ebc-aa8b-39e5f8c31805
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401c80, sub_4013d0, sub_401ab0, sub_4013b0
// [被调用的父级函数]: sub_404040, sub_40d550
// ============================================================

int32_t* __thiscallsub_404140(int32_t* arg1, char* arg2, void* arg3, void* arg4)
{
    // 第一条实际指令: void* ebx = arg3
    void* ebx = arg3
    char* edi = arg2
    int32_t eax = *(edi + 0x10)
    
    if (eax u< ebx)
        std::_Xout_of_range("invalid string position")
        breakpoint
    
    void* ecx = arg4
    void* eax_1 = eax - ebx
    void* edx = arg1[4]
    
    if (eax_1 u< ecx)
        ecx = eax_1
    
    arg4 = ecx
    
    if (0xffffffff - edx u<= ecx)
        edx, ecx = std::_Xlength_error("string too long")
    
    if (ecx != 0)
        char* eax_3 = edx + ecx
        
        if (sub_401c80(arg1, eax_3, 0) != 0)
            int32_t eax_5 = arg1[5]
            int32_t* edx_1
            
            if (eax_5 u< 0x10)
                edx_1 = arg1
            else
                edx_1 = *arg1
            
            int32_t* ecx_2
            
            if (eax_5 u< 0x10)
                ecx_2 = arg1
            else
                ecx_2 = *arg1
            
            int32_t eax_6 = arg1[4]
            
            if (eax_6 != 0)
                eax_6 = memmove(arg4 + ecx_2, edx_1, eax_6)
            
            if (arg1 != edi)
                if (*(edi + 0x14) u>= 0x10)
                    edi = *edi
                
                int32_t* ecx_6
                
                if (arg1[5] u< 0x10)
                    ecx_6 = arg1
                else
                    ecx_6 = *arg1
                
                sub_4013b0(eax_6, edi + ebx, ecx_6, arg4)
            else
                if (ebx != 0)
                    ebx += arg4
                
                int32_t ecx_3 = arg1[5]
                int32_t* edx_2
                
                if (ecx_3 u< 0x10)
                    edx_2 = arg1
                else
                    edx_2 = *arg1
                
                if (ecx_3 u< 0x10)
                    sub_4013d0(arg4, edx_2 + ebx, arg1, arg4)
                else
                    sub_4013d0(arg4, edx_2 + ebx, *arg1, arg4)
            
            sub_401ab0(arg1, eax_3)
    
    return arg1
}
