// ============================================================
// 函数名称: sub_403be0
// 虚拟地址: 0x403be0
// WARP GUID: 5bcc8f58-72a2-5975-9eb8-de6e9c457f7e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401c80, sub_403b20
// [被调用的父级函数]: sub_4181f0, sub_40d460, sub_403f60, sub_406f90, sub_418740, sub_409c90, sub_403980
// ============================================================

int32_t* __thiscallsub_403be0(int32_t* arg1, void* arg2, void* arg3)
{
    // 第一条实际指令: void* edi = arg2
    void* edi = arg2
    
    if (edi != 0)
        int32_t ecx = arg1[5]
        int32_t* eax_1
        
        if (ecx u< 0x10)
            eax_1 = arg1
        else
            eax_1 = *arg1
        
        if (edi u>= eax_1)
            int32_t* edx_1
            
            if (ecx u< 0x10)
                edx_1 = arg1
            else
                edx_1 = *arg1
            
            if (arg1[4] + edx_1 u> edi)
                if (ecx u< 0x10)
                    return sub_403b20(arg1, arg1, edi - arg1, arg3)
                
                return sub_403b20(arg1, arg1, edi - *arg1, arg3)
    
    void* ecx_3 = arg1[4]
    arg2 = ecx_3
    
    if (0xffffffff - ecx_3 u<= arg3)
        ecx_3 = std::_Xlength_error("string too long")
    
    if (arg3 != 0 && sub_401c80(arg1, ecx_3 + arg3, 0) != 0)
        int32_t* ecx_5
        
        if (arg1[5] u< 0x10)
            ecx_5 = arg1
        else
            ecx_5 = *arg1
        
        if (arg3 != 0)
            memcpy(arg1[4] + ecx_5, edi, arg3)
        
        void* ecx_7 = arg2 + arg3
        bool cond:0_1 = arg1[5] u< 0x10
        arg1[4] = ecx_7
        
        if (not(cond:0_1))
            *(*arg1 + ecx_7) = 0
            return arg1
        
        *(arg1 + ecx_7) = 0
    
    return arg1
}
