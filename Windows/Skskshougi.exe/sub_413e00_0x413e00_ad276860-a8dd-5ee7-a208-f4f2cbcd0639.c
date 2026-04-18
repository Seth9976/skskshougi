// ============================================================
// 函数名称: sub_413e00
// 虚拟地址: 0x413e00
// WARP GUID: ad276860-a8dd-5ee7-a208-f4f2cbcd0639
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_403ed0, sub_413fd0, sub_4114c0, sub_414130, sub_4199b8
// [被调用的父级函数]: sub_414200
// ============================================================

int32_t __fastcallsub_413e00(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41baa8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* eax_3 = cocos2d::UserDefault::getInstance()
    int32_t i = 0
    int32_t i_1 = 0
    
    do
        int32_t ebx_1 = 0
        
        for (char const (** const j)[0xa] = &data_41d800; j s< &data_41d828; j = &j[1])
            void* var_5c
            int32_t* eax_6 = sub_401f70(&var_5c, i + data_42e4d8 * 0xa)
            int32_t var_8_1 = 0
            int32_t* var_44
            sub_403ed0(eax_6.b, *j, &var_44, eax_6)
            var_8_1.b = 2
            int32_t var_48
            
            if (var_48 u>= 0x10)
                operator delete(var_5c)
            
            int32_t* ecx_2 = &var_44
            int32_t var_30
            
            if (var_30 u>= 0x10)
                ecx_2 = var_44
            
            var_48 = 0xf
            int32_t var_4c_1 = 0
            var_5c.b = 0
            ebx_1 += (*(*eax_3 + 4))(ecx_2, 0)
            int32_t var_8_2 = 0xffffffff
            
            if (var_30 u>= 0x10)
                operator delete(var_44)
            
            i = i_1
        
        *(data_42e4e0 + (i << 2)) = ebx_1
        i += 1
        i_1 = i
    while (i s< 9)
    
    char var_2c
    sub_4114c0(&var_2c)
    int32_t var_8_3 = 3
    (*(*(*(arg1 + 0x2b8) + 0x310) + 4))(&var_2c)
    class cocos2d::Size* eax_12
    cocos2d::Size* ecx_8
    eax_12, ecx_8 = (*(**(arg1 + 0x2b8) + 0xa8))(eax_2)
    cocos2d::Size::Size(ecx_8, eax_12)
    float var_6c
    (*(**(arg1 + 0x2b8) + 0x48))(_mm_cvtpd_ps(_mm_cvtps_pd(var_6c * 0.5f) + 340.0 + 8.0), 0x431b8e39)
    int32_t var_8_4 = 0xffffffff
    int32_t var_18
    
    if (var_18 u>= 0x10)
        operator delete(var_2c.d)
    
    int32_t var_18_1 = 0xf
    int32_t var_1c = 0
    var_2c = 0
    sub_414130(arg1)
    int32_t result = sub_413fd0(arg1)
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
