// ============================================================
// 函数名称: sub_40d2b0
// 虚拟地址: 0x40d2b0
// WARP GUID: ebb06eae-3313-5417-af61-73683d2fe09f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_414200, sub_40d150, sub_4084f0
// ============================================================

void* __thiscallsub_40d2b0(void** arg1, int32_t arg2)
{
    // 第一条实际指令: void* esi = nullptr
    void* esi = nullptr
    
    if (arg2 != 0)
        if (arg2 u<= 0x3fffffff)
            esi = operator new(arg2 << 2)
        
        if (arg2 u> 0x3fffffff || esi == 0)
            std::_Xbad_alloc()
    
    void* ecx = *arg1
    memmove(esi, ecx, (arg1[1] - ecx) & 0xfffffffc)
    void* ecx_1 = *arg1
    int32_t eax_8 = (arg1[1] - ecx_1) s>> 2
    
    if (ecx_1 != 0)
        operator delete(ecx_1)
    
    *arg1 = esi
    arg1[2] = esi + (arg2 << 2)
    void* result = esi + (eax_8 << 2)
    arg1[1] = result
    return result
}
