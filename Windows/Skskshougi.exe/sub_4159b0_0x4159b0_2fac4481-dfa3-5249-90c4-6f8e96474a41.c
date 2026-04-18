// ============================================================
// 函数名称: sub_4159b0
// 虚拟地址: 0x4159b0
// WARP GUID: 2fac4481-dfa3-5249-90c4-6f8e96474a41
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_416010, sub_415d70
// [被调用的父级函数]: sub_415890, sub_4146d0
// ============================================================

int32_t* __thiscallsub_4159b0(int32_t* arg1, int32_t* arg2, int32_t arg3, int32_t arg4, int32_t arg5, int32_t arg6)
{
    // 第一条实际指令: int32_t edx = 0
    int32_t edx = 0
    int32_t ecx = *arg1
    int32_t esi = ecx
    int32_t var_14 = ecx
    int32_t var_10 = esi
    
    if (arg1[3] u> 0)
        int32_t edx_4 = (arg3 - ecx) s>> 2 << 5
        int32_t edx_5 = edx_4 + arg4
        
        if (edx_4 + arg4 s>= 0 || neg.d(edx_5) == 0)
            esi += edx_5 u>> 5 << 2
        else
            ecx = var_14
            esi += 0xfffffffc - ((0xffffffff - edx_5) u>> 5 << 2)
        
        edx = edx_5 & 0x1f
        var_10 = esi
    
    int32_t edi_1 = 0
    int32_t var_c = ecx
    
    if (arg1[3] u> 0)
        int32_t edi_5 = (arg5 - ecx) s>> 2 << 5
        int32_t edi_6 = edi_5 + arg6
        
        if (edi_5 + arg6 s>= 0 || neg.d(edi_6) == 0)
            var_c += edi_6 u>> 5 << 2
            esi = var_10
        else
            ecx = var_14
            var_c += 0xfffffffc - ((0xffffffff - edi_6) u>> 5 << 2)
        
        edi_1 = edi_6 & 0x1f
    
    int32_t esi_6 = ((esi - ecx) s>> 2 << 5) + edx
    
    if (var_10 != var_c || edx != edi_1)
        int32_t* ebx_1 = nullptr
        uint32_t eax_13 = arg1[3]
        int32_t ecx_8 = var_14
        
        if (eax_13 != 0)
            uint32_t ebx_2 = eax_13
            
            if (ebx_2 s>= 0 || neg.d(eax_13) == 0)
                eax_13 = ebx_2 u>> 5
                ecx_8 += eax_13 << 2
            else
                eax_13 = 0xfffffffc - ((0xffffffff - ebx_2) u>> 5 << 2)
                ecx_8 = var_14 + eax_13
            
            ebx_1 = ebx_2 & 0x1f
        
        int32_t var_2c_1 = edx
        int32_t* var_18
        sub_416010(eax_13, edx, &var_18, arg2, var_c, edi_1, ecx_8, ebx_1, var_10)
        sub_415d70(arg1, ((var_18 - *arg1) s>> 2 << 5) + var_14)
    
    arg4 = 0
    int32_t ecx_15 = *arg1
    
    if (esi_6 s< 0 && neg.d(esi_6) != 0)
        *arg2 = ecx_15 + 0xfffffffc - ((0xffffffff - esi_6) u>> 5 << 2)
        arg2[1] = esi_6 & 0x1f
        return arg2
    
    arg2[1] = esi_6 & 0x1f
    *arg2 = ecx_15 + (esi_6 u>> 5 << 2)
    return arg2
}
