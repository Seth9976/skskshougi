// ============================================================
// 函数名称: sub_40d010
// 虚拟地址: 0x40d010
// WARP GUID: 03ce8300-d138-50da-a4e5-0c59b0ae2f83
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d7b0, sub_40d200
// [被调用的父级函数]: sub_40c770, sub_406500, sub_406250
// ============================================================

int32_t __thiscallsub_40d010(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t* var_8 = arg1
    int32_t* var_8 = arg1
    int32_t edi = arg1[1]
    int32_t eax
    int32_t edx_2
    edx_2:eax = muls.dp.d(0x3e0f83e1, edi - *arg1)
    int32_t edx_3 = edx_2 s>> 3
    int32_t ecx_2 = (edx_3 u>> 0x1f) + edx_3
    
    if (ecx_2 u> arg2)
        int32_t eax_4 = (arg2 - ecx_2) * 0x21 + edi
        arg1[1] = eax_4
        return eax_4
    
    if (ecx_2 u< arg2)
        sub_40d200(arg1, arg2 - ecx_2)
        char* edi_1 = arg1[1]
        int32_t var_18_2 = arg2
        int32_t eax_7
        int32_t edx_4
        edx_4:eax_7 = muls.dp.d(0x3e0f83e1, edi_1 - *arg1)
        int32_t edx_5 = edx_4 s>> 3
        sub_40d7b0(edi_1, arg2 - ((edx_5 u>> 0x1f) + edx_5))
        int32_t eax_8
        int32_t edx_8
        edx_8:eax_8 = muls.dp.d(0x3e0f83e1, arg1[1] - *arg1)
        int32_t edx_9 = edx_8 s>> 3
        eax = (arg2 - ((edx_9 u>> 0x1f) + edx_9)) * 0x21 + arg1[1]
        arg1[1] = eax
    
    return eax
}
