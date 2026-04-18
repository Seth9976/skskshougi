// ============================================================
// 函数名称: sub_40d430
// 虚拟地址: 0x40d430
// WARP GUID: a10f96de-6c17-5bb4-ba8d-3fd6da1ba6b1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

struct std::_Func_base<void, int32_t>::VTable** __thiscallsub_40d430(struct std::_Func_base<void, int32_t>::VTable** arg1, char arg2)
{
    // 第一条实际指令: *arg1 = &std::_Func_base<void, int32_t>::`vftable'
    *arg1 = &std::_Func_base<void, int32_t>::`vftable'
    
    if ((arg2 & 1) != 0)
        operator delete(arg1)
    
    return arg1
}
