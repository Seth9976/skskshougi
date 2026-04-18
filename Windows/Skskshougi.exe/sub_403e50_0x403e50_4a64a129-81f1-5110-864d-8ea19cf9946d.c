// ============================================================
// 函数名称: sub_403e50
// 虚拟地址: 0x403e50
// WARP GUID: 4a64a129-81f1-5110-864d-8ea19cf9946d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_404250
// [被调用的父级函数]: sub_403de0
// ============================================================

void* __thiscallsub_403e50(void** arg1, int32_t arg2)
{
    // 第一条实际指令: void* esi = nullptr
    void* esi = nullptr
    void* eax
    
    if (arg2 != 0)
        if (arg2 u<= 0x7fffffff)
            eax = operator new(arg2 * 2)
            esi = eax
        
        if (arg2 u> 0x7fffffff || esi == 0)
            eax = std::_Xbad_alloc()
    
    int32_t var_14_2 = arg2
    sub_404250(eax, arg1[1], *arg1, esi)
    void* ecx_1 = *arg1
    int32_t eax_4 = (arg1[1] - ecx_1) s>> 1
    
    if (ecx_1 != 0)
        operator delete(ecx_1)
    
    *arg1 = esi
    arg1[2] = esi + (arg2 << 1)
    void* result = esi + (eax_4 << 1)
    arg1[1] = result
    return result
}
