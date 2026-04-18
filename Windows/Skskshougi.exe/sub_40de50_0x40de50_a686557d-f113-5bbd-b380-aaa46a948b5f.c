// ============================================================
// 函数名称: sub_40de50
// 虚拟地址: 0x40de50
// WARP GUID: a686557d-f113-5bbd-b380-aaa46a948b5f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

void* __thiscallsub_40de50(void* arg1, void* arg2)
{
    // 第一条实际指令: void* result = arg2
    void* result = arg2
    
    if (result == 0)
        result = operator new(0x14)
        
        if (result == 0)
            result = std::_Xbad_alloc()
    
    *result = &std::_Func_impl<struct std::_Callable_obj<class <lambda_2cf07c9087bb2e686ca5c0c0960ff228>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
    *(result + 4) = *(arg1 + 4)
    *(result + 0xc) = *(arg1 + 0xc)
    return result
}
