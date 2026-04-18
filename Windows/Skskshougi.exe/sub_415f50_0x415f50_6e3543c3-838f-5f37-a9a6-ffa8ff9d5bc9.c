// ============================================================
// 函数名称: sub_415f50
// 虚拟地址: 0x415f50
// WARP GUID: 6e3543c3-838f-5f37-a9a6-ffa8ff9d5bc9
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_415e10
// ============================================================

void* __thiscallsub_415f50(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t eax = arg2
    int32_t eax = arg2
    *arg1 = 0
    arg1[1] = 0
    arg1[2] = 0
    
    if (eax == 0)
        eax.b = 0
        return eax
    
    if (eax u> 0x3fffffff)
        eax = std::_Xlength_error("vector<T> too long")
    
    int32_t edi = eax << 2
    void* eax_1 = operator new(edi)
    
    if (eax_1 == 0)
        std::_Xbad_alloc()
        breakpoint
    
    *arg1 = eax_1
    arg1[1] = eax_1
    arg1[2] = eax_1 + edi
    void* eax_2
    eax_2.b = 1
    return eax_2
}
