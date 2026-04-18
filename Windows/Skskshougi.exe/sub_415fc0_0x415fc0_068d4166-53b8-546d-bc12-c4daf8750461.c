// ============================================================
// 函数名称: sub_415fc0
// 虚拟地址: 0x415fc0
// WARP GUID: 068d4166-53b8-546d-bc12-c4daf8750461
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_415b40
// ============================================================

void __convention("regparm")sub_415fc0(int32_t arg1, int32_t arg2, char* arg3, int32_t* arg4, int32_t arg5, int32_t arg6, int32_t arg7)
{
    // 第一条实际指令: int32_t* edx = arg4
    int32_t* edx = arg4
    int32_t ecx = arg5
    
    while (edx != arg6 || ecx != arg7)
        arg1 = 1 << ecx.b
        
        if (*arg3 == 0)
            *edx &= not.d(arg1)
        else
            *edx |= arg1
        
        edx = arg4
        
        if (arg5 u>= 0x1f)
            ecx = 0
            edx = &edx[1]
            arg5 = 0
            arg4 = edx
        else
            ecx = arg5 + 1
            arg5 = ecx
}
