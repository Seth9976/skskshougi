// ============================================================
// 函数名称: sub_40cfa0
// 虚拟地址: 0x40cfa0
// WARP GUID: b7859b09-bda9-5c5d-bd1f-8de5cd60739e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d790, sub_403de0
// [被调用的父级函数]: sub_40c770, sub_406500, sub_406250
// ============================================================

int32_t __thiscallsub_40cfa0(void** arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t* edi = arg1
    int32_t* edi = arg1
    int32_t eax = edi[1]
    int32_t edx_2 = (eax - *edi) s>> 1
    
    if (edx_2 u> arg2)
        int32_t eax_1 = eax + ((arg2 - edx_2) << 1)
        edi[1] = eax_1
        return eax_1
    
    if (edx_2 u< arg2)
        sub_403de0(arg1, arg2 - edx_2)
        int16_t* ecx = edi[1]
        int32_t var_10_2 = arg2
        sub_40d790(ecx, arg2 - ((ecx - *edi) s>> 1))
        int32_t ecx_1 = edi[1]
        eax = ecx_1 + ((arg2 - ((ecx_1 - *edi) s>> 1)) << 1)
        edi[1] = eax
    
    return eax
}
