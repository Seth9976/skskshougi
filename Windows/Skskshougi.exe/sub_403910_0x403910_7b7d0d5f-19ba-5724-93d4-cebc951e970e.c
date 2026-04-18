// ============================================================
// 函数名称: sub_403910
// 虚拟地址: 0x403910
// WARP GUID: 7b7d0d5f-19ba-5724-93d4-cebc951e970e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40d550
// ============================================================

char* __thiscallsub_403910(char* arg1, char* arg2)
{
    // 第一条实际指令: *(arg1 + 0x14) = 0xf
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    
    if (*(arg2 + 0x14) u>= 0x10)
        *arg1 = *arg2
        *arg2 = 0
    else
        int32_t eax = *(arg2 + 0x10)
        
        if (eax != 0xffffffff)
            memmove(arg1, arg2, eax + 1)
    
    *(arg1 + 0x10) = *(arg2 + 0x10)
    *(arg1 + 0x14) = *(arg2 + 0x14)
    *(arg2 + 0x14) = 0xf
    *(arg2 + 0x10) = 0
    *arg2 = 0
    return arg1
}
