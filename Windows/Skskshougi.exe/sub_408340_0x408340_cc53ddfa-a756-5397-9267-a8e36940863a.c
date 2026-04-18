// ============================================================
// 函数名称: sub_408340
// 虚拟地址: 0x408340
// WARP GUID: cc53ddfa-a756-5397-9267-a8e36940863a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_418ed0
// [被调用的父级函数]: sub_405d60
// ============================================================

class cocos2d::Sprite* __thiscallsub_408340(int32_t* arg1, int32_t arg2, int32_t arg3)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$??2@YAPAXIW4align_val_t@std@@ABUnothrow_t@1@@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_24 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* ecx = arg1[0x10c]
    
    if (ecx != 0)
        ecx = (*(*ecx + 0x12c))(1)
        arg1[0x10c] = 0
    
    int32_t eax_4 = arg1[0xad]
    float var_2c_1
    int32_t var_18
    float xmm3
    
    if (eax_4 s>= 5)
        int32_t xmm3_1 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(arg2)) - 0.5) * 200.0 + 100.0)
        double xmm0_7 = _mm_cvtepi32_pd(zx.q(arg3))
        var_18 = xmm3_1
        int32_t var_14_1 = _mm_cvtpd_ps((4.5 - xmm0_7) * 200.0 + 190.0)
        int32_t var_28_1 = 4
        int32_t var_8_2 = 1
        xmm3 = 200f
        int32_t* var_2c_2 = ecx
        var_2c_1 = 200f
    else
        int32_t var_14 = 0x42f6aaab
        var_18 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(eax_4)) * 1.5 + 0.5) * 100.0 + 100.0)
        int32_t var_28 = 4
        int32_t var_8_1 = 0
        xmm3 = 100f
        int32_t* var_2c = ecx
        var_2c_1 = 100f
    
    class cocos2d::Sprite* result =
        sub_418ed0(&var_18, cocos2d::Color3B::YELLOW, arg1, xmm3, &var_18, var_2c_1, 4)
    arg1[0x10c] = result
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
