// ============================================================
// 函数名称: sub_403340
// 虚拟地址: 0x403340
// WARP GUID: 6d5492e1-4c16-5847-98bc-c091627c429c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_408ce0, sub_409540, sub_4035b0, sub_403740
// ============================================================

uint32_t __thiscallsub_403340(void* arg1, char* arg2)
{
    // 第一条实际指令: void* edx = arg1
    void* edx = arg1
    
    switch (zx.d(*(zx.d(arg2[1]) + edx)) - 9)
        case 0, 3
            *(edx + 0x19) += 1
        case 1
            *(edx + 0x1a) += 1
        case 2
            *(edx + 0x1b) += 1
        case 4
            *(edx + 0x1c) += 1
    
    int32_t eax_2
    eax_2.b = *arg2
    uint32_t eax_3 = zx.d(eax_2.b)
    
    if (eax_2.b u< 5)
        *(eax_3 + edx + 0x19) -= 1
        arg1.b = *arg2
        uint32_t eax_4 = zx.d(arg2[1])
        arg1.b += 1
        *(eax_4 + edx) = arg1.b
        return eax_4
    
    arg1.b = *(eax_3 + edx)
    
    if (arg1.b == 1)
        eax_3.b = arg2[1]
        
        if (eax_3.b u< 9)
            *(zx.d(eax_3.b) + edx) = 4
            uint32_t eax_6 = zx.d(*arg2)
            *(eax_6 + edx) = 0
            return eax_6
    
    *(zx.d(arg2[1]) + edx) = arg1.b
    char* eax_8 = zx.d(*arg2)
    *(eax_8 + edx) = 0
    return eax_8
}
