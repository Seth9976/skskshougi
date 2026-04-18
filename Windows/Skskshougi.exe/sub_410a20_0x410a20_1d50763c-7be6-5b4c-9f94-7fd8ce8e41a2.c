// ============================================================
// 函数名称: sub_410a20
// 虚拟地址: 0x410a20
// WARP GUID: 1d50763c-7be6-5b4c-9f94-7fd8ce8e41a2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_40f5f0
// ============================================================

int32_t __thiscallsub_410a20(int32_t* arg1, int32_t* arg2, class std::string* arg3)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b448
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_50 = arg1[0xae]
    int32_t xmm2
    int32_t var_54 = xmm2
    (*(*arg2 + 0x48))()
    class cocos2d::Size* eax_5
    cocos2d::Size* ecx_2
    eax_5, ecx_2 = (*(*arg2 + 0xa8))(eax_2)
    cocos2d::Size::Size(ecx_2, eax_5)
    int32_t var_34
    double xmm0_2 = _mm_cvtps_pd(var_34)
    int32_t eax_6 = *arg2
    int32_t xmm0_3 = _mm_cvtpd_ps(60.0 / xmm0_2)
    int32_t var_38
    (*(eax_6 + 0x3c))(_mm_cvtpd_ps(160.0 / _mm_cvtps_pd(var_38)), xmm0_3)
    int32_t var_18 = 0xf
    int32_t var_1c = 0
    char var_2c = 0
    int32_t var_8_1 = 0
    int32_t var_5c = sub_401ae0(&var_2c, "Arial", 5)
    class cocos2d::Label* eax_7 =
        cocos2d::Label::createWithSystemFont(arg3, &var_2c, 24f, cocos2d::Size::ZERO, 0, 0)
    int32_t var_8_2 = 0xffffffff
    
    if (var_18 u>= 0x10)
        operator delete(var_2c.d)
    
    int32_t var_18_1 = 0xf
    int32_t var_1c_1 = 0
    var_2c = 0
    (*(*eax_7 + 0x24c))(cocos2d::Color3B::BLACK)
    int32_t var_50_5 = arg1[0xae]
    int32_t var_54_2 = xmm2
    (*(*eax_7 + 0x48))()
    int32_t result = (*(*arg1 + 0xfc))(eax_7, 0xd4)
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
