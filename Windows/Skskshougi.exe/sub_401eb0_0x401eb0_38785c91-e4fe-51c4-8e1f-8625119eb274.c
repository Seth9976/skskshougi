// ============================================================
// 函数名称: sub_401eb0
// 虚拟地址: 0x401eb0
// WARP GUID: 38785c91-e4fe-51c4-8e1f-8625119eb274
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_401d60
// ============================================================

void* __stdcallsub_401eb0(uint32_t arg1)
{
    // 第一条实际指令: void* result = nullptr
    void* result = nullptr
    
    if (arg1 != 0)
        if (arg1 u> 0xffffffff)
            return std::_Xbad_alloc()
        
        result = operator new(arg1)
        
        if (result == 0)
            return std::_Xbad_alloc()
    
    return result
}
