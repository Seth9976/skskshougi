// ============================================================
// 函数名称: sub_40d200
// 虚拟地址: 0x40d200
// WARP GUID: 10e72efa-c01d-5438-a15a-fd4c5125e7a0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d330
// [被调用的父级函数]: sub_40d0c0, sub_40d010
// ============================================================

int32_t __thiscallsub_40d200(void** arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t ebx = arg1[2]
    int32_t ebx = arg1[2]
    int32_t esi = arg1[1]
    int32_t result = (ebx - esi) s/ 0x21
    
    if (result u>= arg2)
        return result
    
    int32_t eax_3
    int32_t edx_4
    edx_4:eax_3 = muls.dp.d(0x3e0f83e1, esi - *arg1)
    int32_t edx_5 = edx_4 s>> 3
    int32_t esi_4 = (edx_5 u>> 0x1f) + edx_5
    
    if (0x7c1f07c - esi_4 u< arg2)
        arg1 = std::_Xlength_error("vector<T> too long")
    
    int32_t eax_5
    int32_t edx_6
    edx_6:eax_5 = muls.dp.d(0x3e0f83e1, ebx - *arg1)
    int32_t esi_5 = esi_4 + arg2
    int32_t edx_7 = edx_6 s>> 3
    int32_t eax_8 = (edx_7 u>> 0x1f) + edx_7
    uint32_t edx_9 = eax_8 u>> 1
    
    if (0x7c1f07c - edx_9 u>= eax_8)
        int32_t eax_11 = eax_8 + edx_9
        
        if (eax_11 u< esi_5)
            eax_11 = esi_5
        
        return sub_40d330(arg1, eax_11) __tailcall
    
    int32_t eax_9 = 0
    
    if (0 u< esi_5)
        eax_9 = esi_5
    
    return sub_40d330(arg1, eax_9) __tailcall
}
