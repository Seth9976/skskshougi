// ============================================================
// 函数名称: sub_416010
// 虚拟地址: 0x416010
// WARP GUID: c5d0b1fa-c17a-5253-8439-159cfc6db604
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4159b0
// ============================================================

int32_t** __convention("regparm")sub_416010(int32_t arg1, int32_t arg2, int32_t** arg3, int32_t arg4, int32_t arg5, int32_t arg6, int32_t arg7, int32_t* arg8, int32_t arg9)
{
    // 第一条实际指令: int32_t edx = arg9
    int32_t edx = arg9
    int32_t* esi = arg8
    int32_t ecx = arg5
    int32_t edi = arg4
    
    while (edi != arg6 || ecx != arg7)
        char ecx_1 = edx.b
        
        if ((*edi & 1 << ecx.b) == 0)
            *esi &= not.d(1 << ecx_1)
        else
            *esi |= 1 << ecx_1
        
        esi = arg8
        
        if (arg9 u>= 0x1f)
            edx = 0
            esi = &esi[1]
            arg8 = esi
        else
            edx = arg9 + 1
        
        edi = arg4
        arg9 = edx
        
        if (arg5 u>= 0x1f)
            ecx = 0
            edi += 4
            arg5 = 0
            arg4 = edi
        else
            ecx = arg5 + 1
            arg5 = ecx
    
    *arg3 = esi
    arg3[1] = edx
    return arg3
}
