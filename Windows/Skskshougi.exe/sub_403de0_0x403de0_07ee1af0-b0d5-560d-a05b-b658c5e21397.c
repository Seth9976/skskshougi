// ============================================================
// 函数名称: sub_403de0
// 虚拟地址: 0x403de0
// WARP GUID: 07ee1af0-b0d5-560d-a05b-b658c5e21397
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403e50
// [被调用的父级函数]: sub_404000, sub_4028d0, sub_40cfa0, sub_406f90, sub_402d10, sub_406500, sub_406250, sub_403a50
// ============================================================

int32_t __thiscallsub_403de0(void** arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t edx = arg1[2]
    int32_t edx = arg1[2]
    int32_t esi = arg1[1]
    int32_t result = (edx - esi) s>> 1
    
    if (result u>= arg2)
        return result
    
    int32_t esi_2 = (esi - *arg1) s>> 1
    
    if (0x7fffffff - esi_2 u< arg2)
        edx, arg1 = std::_Xlength_error("vector<T> too long")
    
    int32_t esi_3 = esi_2 + arg2
    int32_t edx_2 = (edx - *arg1) s>> 1
    uint32_t eax_4 = edx_2 u>> 1
    
    if (0x7fffffff - eax_4 u>= edx_2)
        int32_t edx_5 = edx_2 + eax_4
        
        if (edx_5 u< esi_3)
            edx_5 = esi_3
        
        return sub_403e50(arg1, edx_5) __tailcall
    
    int32_t edx_3 = 0
    
    if (0 u< esi_3)
        edx_3 = esi_3
    
    return sub_403e50(arg1, edx_3) __tailcall
}
