// ============================================================
// 函数名称: sub_401c80
// 虚拟地址: 0x401c80
// WARP GUID: ad819f88-6f0a-59af-9cf1-a1acddc4267c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401d60
// [被调用的父级函数]: sub_40d460, sub_403b20, sub_404040, sub_403be0, sub_418740, sub_404140
// ============================================================

int32_t __thiscallsub_401c80(void* arg1, char* arg2, char arg3)
{
    // 第一条实际指令: void* esi = arg1
    void* esi = arg1
    
    if (arg2 u> 0xfffffffe)
        arg1 = std::_Xlength_error("string too long")
    
    int32_t eax = *(esi + 0x14)
    
    if (eax u< arg2)
        sub_401d60(arg1, arg2, *(esi + 0x10))
        return neg.d(sbb.d(0, 0, 0 u< arg2))
    
    if (arg3 == 0 || arg2 u>= 0x10)
        if (arg2 == 0)
            *(esi + 0x10) = arg2
            
            if (eax u>= 0x10)
                esi = *esi
            
            *esi = 0
        
        return neg.d(sbb.d(0, 0, 0 u< arg2))
    
    char* ebx = *(esi + 0x10)
    
    if (arg2 u< ebx)
        ebx = arg2
    
    if (eax u>= 0x10)
        void* eax_3 = *esi
        arg3.d = eax_3
        
        if (ebx != 0)
            memcpy(esi, eax_3, ebx)
            eax_3 = arg3.d
        
        operator delete(eax_3)
    
    *(esi + 0x10) = ebx
    *(esi + 0x14) = 0xf
    *(ebx + esi) = 0
    return neg.d(sbb.d(0, 0, 0 u< arg2))
}
