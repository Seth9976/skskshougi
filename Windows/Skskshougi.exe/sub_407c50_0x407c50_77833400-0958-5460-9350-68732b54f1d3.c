// ============================================================
// 函数名称: sub_407c50
// 虚拟地址: 0x407c50
// WARP GUID: 77833400-0958-5460-9350-68732b54f1d3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_418fa0
// [被调用的父级函数]: sub_404680
// ============================================================

class cocos2d::Label* __fastcallsub_407c50(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41aa17
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_44 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::DrawNode* eax_3
    int32_t ecx
    eax_3, ecx = cocos2d::DrawNode::create()
    int32_t var_24
    int32_t var_1c
    
    for (int32_t i = 0; i s<= 3; i += 1)
        int32_t var_18_1 = 0x44778000
        int32_t xmm0_5 = _mm_cvtpd_ps(_mm_cvtepi32_pd(zx.q(i)) * 200.0 + 100.0)
        var_1c = xmm0_5
        int32_t var_8_1 = 0
        var_24 = xmm0_5
        int32_t var_20_1 = 0x433e0000
        var_8_1.b = 1
        int32_t var_4c_1 = ecx
        ecx = cocos2d::DrawNode::drawSegment(eax_3, &var_24, &var_1c, 2f, cocos2d::Color4F::GRAY)
    
    for (int32_t i_1 = 0; i_1 s<= 4; )
        double xmm0_7 = _mm_cvtepi32_pd(zx.q(i_1))
        var_24 = 0x442f0000
        int32_t xmm0_10 = _mm_cvtpd_ps(xmm0_7 * 200.0 + 190.0)
        int32_t var_20_2 = xmm0_10
        int32_t var_8_2 = 2
        var_1c = 0x42c80000
        int32_t var_18_2 = xmm0_10
        var_8_2.b = 3
        int32_t var_4c_3 = ecx
        ecx = cocos2d::DrawNode::drawSegment(eax_3, &var_1c, &var_24, 2f, cocos2d::Color4F::GRAY)
        i_1 += 1
        int32_t var_8_3 = 0xffffffff
    
    cocos2d::Color3B::Color3B((*(*arg1 + 0xfc))(eax_3, 5), -0x24, -0x19, 0x75)
    void var_14
    
    for (int32_t i_2 = 1; i_2 s<= 3; i_2 += 1)
        int32_t var_20_3 = 0x44778000
        var_24 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(i_2)) - 0.5) * 200.0 + 100.0)
        int32_t var_8_4 = 4
        class cocos2d::Sprite* eax_5
        cocos2d::Rect* ecx_5
        eax_5, ecx_5 = cocos2d::Sprite::create()
        var_8_4.b = 5
        (*(*eax_5 + 0x290))(cocos2d::Rect::Rect(ecx_5, 0f, 0f, 30f, 30f))
        var_8_4.b = 4
        (*(*eax_5 + 0x24c))(&var_14)
        (*(*eax_5 + 0x4c))(&var_24)
        (*(*arg1 + 0xfc))(eax_5, 5)
    
    for (int32_t i_3 = 1; i_3 s<= 4; )
        double xmm0_18 = _mm_cvtepi32_pd(zx.q(i_3))
        var_24 = 0x42c80000
        int32_t var_20_4 = _mm_cvtpd_ps((4.5 - xmm0_18) * 200.0 + 190.0)
        int32_t var_8_5 = 6
        class cocos2d::Sprite* eax_10
        cocos2d::Rect* ecx_10
        eax_10, ecx_10 = cocos2d::Sprite::create()
        var_8_5.b = 7
        (*(*eax_10 + 0x290))(cocos2d::Rect::Rect(ecx_10, 0f, 0f, 30f, 30f))
        var_8_5.b = 6
        (*(*eax_10 + 0x24c))(&var_14)
        (*(*eax_10 + 0x4c))(&var_24)
        (*(*arg1 + 0xfc))(eax_10, 5)
        i_3 += 1
        int32_t var_8_6 = 0xffffffff
    
    int32_t var_48_15 = 0xf
    int32_t var_4c_11 = 0
    char var_5c = 0
    int32_t ecx_16 = sub_401ae0(&var_5c, U"abc1234", 1)
    var_24 = 0x43480000
    int32_t var_20_5 = 0x44788000
    int32_t var_8_7 = 8
    int32_t var_64 = ecx_16
    var_64.w = *cocos2d::Color3B::GRAY
    uint32_t eax_16 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64:2.b = eax_16.b
    sub_418fa0(eax_16, &var_24, arg1, 26f, var_64, 5)
    int32_t var_8_8 = 0xffffffff
    int32_t var_48_16 = 0xf
    int32_t var_4c_12 = 0
    var_5c = 0
    int32_t ecx_19 = sub_401ae0(&var_5c, &(*U"abc1234")[1], 1)
    var_24 = 0x43c80000
    int32_t var_20_6 = 0x44788000
    int32_t var_8_9 = 9
    int32_t var_64_1 = ecx_19
    var_64_1.w = *cocos2d::Color3B::GRAY
    uint32_t eax_18 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64_1:2.b = eax_18.b
    sub_418fa0(eax_18, &var_24, arg1, 26f, var_64_1, 5)
    int32_t var_8_10 = 0xffffffff
    int32_t var_48_17 = 0xf
    int32_t var_4c_13 = 0
    var_5c = 0
    int32_t ecx_22 = sub_401ae0(&var_5c, &(*U"abc1234")[2], 1)
    var_24 = 0x44160000
    int32_t var_20_7 = 0x44788000
    int32_t var_8_11 = 0xa
    int32_t var_64_2 = ecx_22
    var_64_2.w = *cocos2d::Color3B::GRAY
    uint32_t eax_20 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64_2:2.b = eax_20.b
    sub_418fa0(eax_20, &var_24, arg1, 26f, var_64_2, 5)
    int32_t var_8_12 = 0xffffffff
    int32_t var_48_18 = 0xf
    int32_t var_4c_14 = 0
    var_5c = 0
    int32_t ecx_25 = sub_401ae0(&var_5c, &(*U"abc1234")[3], 1)
    var_24 = 0x42c80000
    int32_t var_20_8 = 0x445e8000
    int32_t var_8_13 = 0xb
    int32_t var_64_3 = ecx_25
    var_64_3.w = *cocos2d::Color3B::GRAY
    uint32_t eax_22 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64_3:2.b = eax_22.b
    sub_418fa0(eax_22, &var_24, arg1, 26f, var_64_3, 5)
    int32_t var_8_14 = 0xffffffff
    int32_t var_48_19 = 0xf
    int32_t var_4c_15 = 0
    var_5c = 0
    int32_t ecx_28 = sub_401ae0(&var_5c, &(*U"abc1234")[4], 1)
    var_24 = 0x42c80000
    int32_t var_20_9 = 0x442c8000
    int32_t var_8_15 = 0xc
    int32_t var_64_4 = ecx_28
    var_64_4.w = *cocos2d::Color3B::GRAY
    uint32_t eax_24 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64_4:2.b = eax_24.b
    sub_418fa0(eax_24, &var_24, arg1, 26f, var_64_4, 5)
    int32_t var_8_16 = 0xffffffff
    int32_t var_48_20 = 0xf
    int32_t var_4c_16 = 0
    var_5c = 0
    int32_t ecx_31 = sub_401ae0(&var_5c, &(*U"abc1234")[5], 1)
    var_24 = 0x42c80000
    int32_t var_20_10 = 0x43f50000
    int32_t var_8_17 = 0xd
    int32_t var_64_5 = ecx_31
    var_64_5.w = *cocos2d::Color3B::GRAY
    uint32_t eax_26 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64_5:2.b = eax_26.b
    sub_418fa0(eax_26, &var_24, arg1, 26f, var_64_5, 5)
    int32_t var_8_18 = 0xffffffff
    int32_t var_48_21 = 0xf
    int32_t var_4c_17 = 0
    var_5c = 0
    int32_t ecx_34 = sub_401ae0(&var_5c, &(*U"abc1234")[6], 1)
    int32_t var_2c = 0x42c80000
    int32_t var_28 = 0x43910000
    int32_t var_8_19 = 0xe
    int32_t var_64_6 = ecx_34
    var_64_6.w = *cocos2d::Color3B::GRAY
    uint32_t eax_28 = zx.d(*(cocos2d::Color3B::GRAY + 2))
    var_64_6:2.b = eax_28.b
    class cocos2d::Label* result = sub_418fa0(eax_28, &var_2c, arg1, 26f, var_64_6, 5)
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
