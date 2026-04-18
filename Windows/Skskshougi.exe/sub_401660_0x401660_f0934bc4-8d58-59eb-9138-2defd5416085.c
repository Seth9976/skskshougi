// ============================================================
// 函数名称: sub_401660
// 虚拟地址: 0x401660
// WARP GUID: f0934bc4-8d58-59eb-9138-2defd5416085
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

struct cocos2d::Application::AppDelegate::VTable** __thiscallsub_401660(cocos2d::Application* arg1, char arg2)
{
    // 第一条实际指令: struct cocos2d::Application::AppDelegate::VTable** result = arg1
    struct cocos2d::Application::AppDelegate::VTable** result = arg1
    *result = &AppDelegate::`vftable'{for `cocos2d::Application'}
    cocos2d::Application::~Application(arg1)
    
    if ((arg2 & 1) != 0)
        operator delete(result)
    
    return result
}
