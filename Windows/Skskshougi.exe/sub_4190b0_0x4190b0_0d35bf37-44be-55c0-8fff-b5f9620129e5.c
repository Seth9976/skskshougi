// ============================================================
// 函数名称: sub_4190b0
// 虚拟地址: 0x4190b0
// WARP GUID: 0d35bf37-44be-55c0-8fff-b5f9620129e5
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_409c90
// ============================================================

class cocos2d::MenuItemImage* __convention("regparm")sub_4190b0(int32_t arg1, class std::string* arg2, class std::string* arg3, float arg4 @ xmm3, int32_t arg5, float arg6, class std::function<void __cdecl (class cocos2d::Ref*)>* arg7)
{
    // 第一条实际指令: class cocos2d::MenuItemImage* result = cocos2d::MenuItemImage::create(arg3, arg2, arg7)
    class cocos2d::MenuItemImage* result = cocos2d::MenuItemImage::create(arg3, arg2, arg7)
    class cocos2d::Size* eax
    cocos2d::Size* ecx_1
    eax, ecx_1 = (*(*result + 0xa8))()
    cocos2d::Size::Size(ecx_1, eax)
    float var_14
    float var_10
    (*(*result + 0x3c))(arg4 / var_14, arg6 / var_10)
    (*(*result + 0x4c))(arg5)
    return result
}
