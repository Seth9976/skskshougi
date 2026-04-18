// ============================================================
// 函数名称: sub_411360
// 虚拟地址: 0x411360
// WARP GUID: 27f0eb49-f5ba-5d8b-80ba-8d520772a195
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

cocos2d::network::HttpRequest* __thiscallsub_411360(cocos2d::network::HttpRequest* arg1, char arg2)
{
    // 第一条实际指令: cocos2d::network::HttpRequest::~HttpRequest(arg1)
    cocos2d::network::HttpRequest::~HttpRequest(arg1)
    
    if ((arg2 & 1) != 0)
        operator delete(arg1)
    
    return arg1
}
