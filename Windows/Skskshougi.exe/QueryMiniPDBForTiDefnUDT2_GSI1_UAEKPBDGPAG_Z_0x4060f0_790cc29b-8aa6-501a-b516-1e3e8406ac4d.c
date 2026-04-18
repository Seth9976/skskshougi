// ============================================================
// 函数名称: ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z
// 虚拟地址: 0x4060f0
// WARP GUID: 790cc29b-8aa6-501a-b516-1e3e8406ac4d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40baa0, sub_40b490, sub_40c770, sub_406500, sub_406250, sub_40b730, sub_40b620
// ============================================================

int32_t __thiscall?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a782
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_40 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* ecx = arg1[0x10d]
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        arg1[0x10d] = 0
    
    cocos2d::Color3B* ecx_2 = arg2 & 0x80000003
    
    if (ecx_2 s< 0)
        ecx_2 = ((ecx_2 - 1) | 0xfffffffc) + 1
    
    int32_t eax_5
    int32_t edx
    edx:eax_5 = sx.q(arg2)
    int32_t xmm3 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(ecx_2)) - 0.5) * 200.0 + 100.0)
    double xmm0_6 = _mm_cvtepi32_pd(zx.q((eax_5 + (edx & 3)) s>> 2))
    int32_t var_1c = xmm3
    int32_t var_18 = _mm_cvtpd_ps((4.5 - xmm0_6) * 200.0 + 190.0)
    int32_t var_8_1 = 0
    int32_t eax_8 = cocos2d::Color3B::Color3B(ecx_2, 0xc0, 0xe0, 0xc0)
    class cocos2d::Sprite* eax_9
    cocos2d::Rect* ecx_5
    eax_9, ecx_5 = cocos2d::Sprite::create()
    var_8_1.b = 1
    (*(*eax_9 + 0x290))(cocos2d::Rect::Rect(ecx_5, 0f, 0f, 200f, 200f))
    var_8_1.b = 0
    (*(*eax_9 + 0x24c))(eax_8)
    (*(*eax_9 + 0x4c))(&var_1c)
    int32_t result = (*(*arg1 + 0xfc))(eax_9, 4)
    arg1[0x10d] = eax_9
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
