// ============================================================
// 函数名称: sub_4194b0
// 虚拟地址: 0x4194b0
// WARP GUID: d91329d8-14d8-54a2-bdbc-c110819e7bfd
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_419c5e
// ============================================================

int32_tsub_4194b0()
{
    // 第一条实际指令: void var_5c
    void var_5c
    int32_t eax_1 = __security_cookie ^ &var_5c
    cocos2d::Application* ecx
    cocos2d::Application::Application(ecx)
    struct cocos2d::Application::AppDelegate::VTable* const var_58 =
        &AppDelegate::`vftable'{for `cocos2d::Application'}
    int32_t result
    cocos2d::Application* ecx_2
    result, ecx_2 = cocos2d::Application::run(cocos2d::Application::getInstance())
    struct cocos2d::Application::AppDelegate::VTable* const var_58_1 =
        &AppDelegate::`vftable'{for `cocos2d::Application'}
    cocos2d::Application::~Application(ecx_2)
    sub_4199b8(eax_1 ^ &var_5c)
    return result
}
