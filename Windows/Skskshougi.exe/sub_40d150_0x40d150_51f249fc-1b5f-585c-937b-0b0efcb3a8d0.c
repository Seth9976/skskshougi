// ============================================================
// 函数名称: sub_40d150
// 虚拟地址: 0x40d150
// WARP GUID: 51f249fc-1b5f-585c-937b-0b0efcb3a8d0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d2b0
// [被调用的父级函数]: sub_415e50, sub_40e3c0, sub_415820, sub_40cef0, sub_406f90, sub_406500, sub_406250, sub_40ce90
// ============================================================

int32_t __thiscallsub_40d150(void** arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t edx = arg1[2]
    int32_t edx = arg1[2]
    int32_t esi = arg1[1]
    int32_t result = (edx - esi) s>> 2
    
    if (result u>= arg2)
        return result
    
    int32_t esi_2 = (esi - *arg1) s>> 2
    
    if (0x3fffffff - esi_2 u< arg2)
        edx, arg1 = std::_Xlength_error("vector<T> too long")
    
    int32_t esi_3 = esi_2 + arg2
    int32_t edx_2 = (edx - *arg1) s>> 2
    uint32_t eax_4 = edx_2 u>> 1
    
    if (0x3fffffff - eax_4 u>= edx_2)
        int32_t edx_5 = edx_2 + eax_4
        
        if (edx_5 u< esi_3)
            edx_5 = esi_3
        
        return sub_40d2b0(arg1, edx_5) __tailcall
    
    int32_t edx_3 = 0
    
    if (0 u< esi_3)
        edx_3 = esi_3
    
    return sub_40d2b0(arg1, edx_3) __tailcall
}
