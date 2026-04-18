// ============================================================
// 函数名称: sub_4022e0
// 虚拟地址: 0x4022e0
// WARP GUID: 354b3b74-8b5a-55c8-a9f7-3a004c977ddd
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402320
// [被调用的父级函数]: sub_40c770
// ============================================================

int32_t __fastcallsub_4022e0(void* arg1)
{
    // 第一条实际指令: char eax
    char eax
    
    if (*(arg1 + 0x11) == 0xd)
        eax = sub_402320(arg1, 0x11)
    
    if (*(arg1 + 0x11) != 0xd || eax != 0)
        if (*(arg1 + 0x12) == 0xd)
            eax = sub_402320(arg1, 0x12)
        
        if (*(arg1 + 0x12) != 0xd || eax != 0)
            if (*(arg1 + 0x13) == 0xd)
                eax = sub_402320(arg1, 0x13)
            
            if (*(arg1 + 0x13) != 0xd || eax != 0)
                return 0
    
    return 1
}
