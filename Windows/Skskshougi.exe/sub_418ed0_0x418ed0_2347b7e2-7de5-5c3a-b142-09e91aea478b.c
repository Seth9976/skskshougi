// ============================================================
// 函数名称: sub_418ed0
// 虚拟地址: 0x418ed0
// WARP GUID: 2347b7e2-7de5-5c3a-b142-09e91aea478b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40c770, sub_40e550, sub_411640, sub_408340
// ============================================================

class cocos2d::Sprite* __convention("regparm")sub_418ed0(int32_t arg1, int32_t arg2, int32_t* arg3, float arg4 @ xmm3, int32_t arg5, float arg6, int32_t arg7)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41c2a9
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_38 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::Sprite* result_1
    cocos2d::Rect* ecx
    result_1, ecx = cocos2d::Sprite::create()
    float xmm1 = arg6
    xmm1 f- 0
    class cocos2d::Sprite* result = result_1
    result_1:1.b =
        (xmm1 == 0f ? 1 : 0) << 6 | (is_unordered.d(xmm1, 0f) ? 1 : 0) << 2 | (xmm1 < 0f ? 1 : 0)
    bool p_1 = unimplemented  {test ah, 0x44}
    
    if (not(p_1))
        xmm1 = arg4
    
    int32_t var_8_1 = 0
    (*(*result + 0x290))(cocos2d::Rect::Rect(ecx, 0f, 0f, arg4, xmm1))
    int32_t var_8_2 = 0xffffffff
    (*(*result + 0x24c))(arg2)
    (*(*result + 0x4c))(arg5)
    (*(*arg3 + 0xfc))(result, arg7)
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
