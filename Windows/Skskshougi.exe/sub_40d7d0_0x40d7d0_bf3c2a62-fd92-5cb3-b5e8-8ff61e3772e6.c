// ============================================================
// 函数名称: sub_40d7d0
// 虚拟地址: 0x40d7d0
// WARP GUID: bf3c2a62-fd92-5cb3-b5e8-8ff61e3772e6
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40d330
// ============================================================

void* __convention("regparm")sub_40d7d0(int32_t arg1, int32_t arg2, void* arg3, void* arg4)
{
    // 第一条实际指令: void* var_8 = arg3
    void* var_8 = arg3
    int32_t i = arg2
    int32_t i_1 = i
    
    if (arg3 == i)
        return arg4
    
    void* esi = arg4
    char* edi = arg3 + 0x1d
    
    do
        if (esi != 0)
            void* eax = esi
            int32_t j_1 = 0x19
            int32_t j
            
            do
                arg3.b = *(edi - esi + eax - 0x1d)
                eax += 1
                *(eax - 1) = arg3.b
                j = j_1
                j_1 -= 1
            while (j != 1)
            *(esi + 0x19) = edi[0xfffffffc]
            *(esi + 0x1d) = *edi
            *(esi + 0x1a) = edi[0xfffffffd]
            *(esi + 0x1e) = edi[1]
            *(esi + 0x1b) = edi[0xfffffffe]
            *(esi + 0x1f) = edi[2]
            *(esi + 0x1c) = edi[0xffffffff]
            *(esi + 0x20) = edi[3]
            i = i_1
        
        edi = &edi[0x21]
        esi += 0x21
    while (&edi[0xffffffe3] != i)
    
    return esi
}
