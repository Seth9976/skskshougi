// ============================================================
// 函数名称: sub_404040
// 虚拟地址: 0x404040
// WARP GUID: c224bc0e-2fb6-5c5e-a3d6-2aca51063c11
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401c80, sub_401ab0, sub_404140
// [被调用的父级函数]: sub_403ed0
// ============================================================

int32_t* __thiscallsub_404040(int32_t* arg1, int32_t arg2, char* arg3)
{
    // 第一条实际指令: if (arg2 != 0)
    if (arg2 != 0)
        char* ecx = arg1[5]
        int32_t* eax_1
        
        if (ecx u< 0x10)
            eax_1 = arg1
        else
            eax_1 = *arg1
        
        if (arg2 u>= eax_1)
            int32_t* edx_1
            
            if (ecx u< 0x10)
                edx_1 = arg1
            else
                edx_1 = *arg1
            
            if (arg1[4] + edx_1 u> arg2)
                if (ecx u< 0x10)
                    char* __saved_ebx_1 = arg3
                    return sub_404140(arg1, ecx, arg1, arg2 - arg1)
                
                char* __saved_ebx = arg3
                return sub_404140(arg1, ecx, arg1, arg2 - *arg1)
    
    void* ecx_3 = arg1[4]
    
    if (0xffffffff - ecx_3 u<= arg3)
        ecx_3 = std::_Xlength_error("string too long")
    
    if (arg3 != 0)
        char* eax_9 = ecx_3 + arg3
        
        if (sub_401c80(arg1, eax_9, 0) != 0)
            int32_t eax_11 = arg1[5]
            int32_t* edx_2
            
            if (eax_11 u< 0x10)
                edx_2 = arg1
            else
                edx_2 = *arg1
            
            int32_t* eax_12
            
            if (eax_11 u< 0x10)
                eax_12 = arg1
            else
                eax_12 = *arg1
            
            int32_t ecx_5 = arg1[4]
            
            if (ecx_5 != 0)
                memmove(eax_12 + arg3, edx_2, ecx_5)
            
            int32_t* eax_14
            
            if (arg1[5] u< 0x10)
                eax_14 = arg1
            else
                eax_14 = *arg1
            
            if (arg3 != 0)
                memcpy(eax_14, arg2, arg3)
            
            sub_401ab0(arg1, eax_9)
    
    return arg1
}
