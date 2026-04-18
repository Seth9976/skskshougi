// ============================================================
// 函数名称: sub_40f490
// 虚拟地址: 0x40f490
// WARP GUID: 09fa9bcb-1f3d-5b82-bff5-a580a5817835
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40f4c0
// [被调用的父级函数]: 无
// ============================================================

cocos2d::Layer* __thiscallsub_40f490(cocos2d::Layer* arg1, char arg2)
{
    // 第一条实际指令: sub_40f4c0(arg1)
    sub_40f4c0(arg1)
    
    if ((arg2 & 1) != 0)
        operator delete(arg1)
    
    return arg1
}
