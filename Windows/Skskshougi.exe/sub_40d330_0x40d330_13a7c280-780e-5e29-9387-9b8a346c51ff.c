// ============================================================
// 函数名称: sub_40d330
// 虚拟地址: 0x40d330
// WARP GUID: 13a7c280-780e-5e29-9387-9b8a346c51ff
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d7d0
// [被调用的父级函数]: sub_40d200
// ============================================================

void* __thiscallsub_40d330(void** arg1, int32_t arg2)
{
    // 第一条实际指令: void* edi = nullptr
    void* edi = nullptr
    void* eax
    
    if (arg2 != 0)
        if (arg2 u<= 0x7c1f07c)
            eax = operator new(arg2 * 0x21)
            edi = eax
        
        if (arg2 u> 0x7c1f07c || edi == 0)
            eax = std::_Xbad_alloc()
    
    int32_t var_14_2 = arg2
    sub_40d7d0(eax, arg1[1], *arg1, edi)
    int32_t eax_4
    int32_t edx_1
    edx_1:eax_4 = muls.dp.d(0x3e0f83e1, arg1[1] - *arg1)
    void* eax_5 = *arg1
    int32_t edx_2 = edx_1 s>> 3
    
    if (eax_5 != 0)
        operator delete(eax_5)
    
    *arg1 = edi
    arg1[2] = arg2 * 0x21 + edi
    void* result = ((edx_2 u>> 0x1f) + edx_2) * 0x21 + edi
    arg1[1] = result
    return result
}
