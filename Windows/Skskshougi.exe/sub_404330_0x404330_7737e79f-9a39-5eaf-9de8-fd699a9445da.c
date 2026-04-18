// ============================================================
// 函数名称: sub_404330
// 虚拟地址: 0x404330
// WARP GUID: 7737e79f-9a39-5eaf-9de8-fd699a9445da
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_404290
// ============================================================

struct cocos2d::Layer::GameLayer::VTable** __fastcallsub_404330(cocos2d::Layer* arg1)
{
    // 第一条实际指令: struct cocos2d::Layer::GameLayer::VTable** result = arg1
    struct cocos2d::Layer::GameLayer::VTable** result = arg1
    cocos2d::Layer::Layer(arg1)
    *result = &GameLayer::`vftable'{for `cocos2d::Layer'}
    result[0xb5] = 0
    result[0xb6] = 0
    result[0xb7] = 0
    result[0xbd] = 0xf
    result[0xbc] = 0
    result[0xb8].b = 0
    __builtin_memset(&result[0x116], 0, 0x3c)
    return result
}
