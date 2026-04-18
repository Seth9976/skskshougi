// ============================================================
// 函数名称: sub_40f0e0
// 虚拟地址: 0x40f0e0
// WARP GUID: 11f82ffa-b946-58f1-9766-aa710ce3f0c6
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

void* __thiscallsub_40f0e0(void* arg1, void* arg2)
{
    // 第一条实际指令: void* result = arg2
    void* result = arg2
    
    if (result == 0)
        result = operator new(0xc)
        
        if (result == 0)
            result = std::_Xbad_alloc()
    
    *result = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6a27c34eb4d40f1dde77ca013cdc594a>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
    *(result + 4) = *(arg1 + 4)
    return result
}
