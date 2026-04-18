// ============================================================
// 函数名称: sub_416090
// 虚拟地址: 0x416090
// WARP GUID: 4e3ba171-2157-5809-bd2f-0b475cd256a4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_415ca0
// ============================================================

int32_t** __convention("regparm")sub_416090(int32_t arg1, int32_t arg2, int32_t** arg3, int32_t arg4, int32_t arg5, int32_t arg6, int32_t arg7, int32_t* arg8, int32_t arg9)
{
    // 第一条实际指令: while (true)
    while (true)
        int32_t edi_1 = arg6
        
        if (arg4 == edi_1 && arg5 == arg7)
            *arg3 = arg8
            arg3[1] = arg9
            return arg3
        
        int32_t ecx_1
        
        if (arg7 == 0)
            edi_1 -= 4
            ecx_1 = 0x1f
            arg6 = edi_1
        else
            ecx_1 = arg7 - 1
        
        int32_t* esi_1 = arg8
        arg7 = ecx_1
        int32_t edx_1
        
        if (arg9 == 0)
            esi_1 -= 4
            edx_1 = 0x1f
            arg8 = esi_1
        else
            edx_1 = arg9 - 1
        
        arg9 = edx_1
        char ecx_2 = edx_1.b
        
        if ((*edi_1 & 1 << ecx_1.b) == 0)
            *esi_1 &= not.d(1 << ecx_2)
        else
            *esi_1 |= 1 << ecx_2
}
