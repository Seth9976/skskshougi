// ============================================================
// 函数名称: sub_40d6b0
// 虚拟地址: 0x40d6b0
// WARP GUID: a10f96de-6c17-5bb4-ba8d-3fd6da1ba6b1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

struct std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>::VTable** __thiscallsub_40d6b0(struct std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>::VTable** arg1, char arg2)
{
    // 第一条实际指令: *arg1 = &std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>::`vftable'
    *arg1 = &std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>::`vftable'
    
    if ((arg2 & 1) != 0)
        operator delete(arg1)
    
    return arg1
}
