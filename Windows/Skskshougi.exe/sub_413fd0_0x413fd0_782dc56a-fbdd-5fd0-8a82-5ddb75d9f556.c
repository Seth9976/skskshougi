// ============================================================
// 函数名称: sub_413fd0
// 虚拟地址: 0x413fd0
// WARP GUID: 782dc56a-fbdd-5fd0-8a82-5ddb75d9f556
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_403ed0, sub_4199b8
// [被调用的父级函数]: sub_413e00
// ============================================================

int32_t __fastcallsub_413fd0(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41baf0
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_8c = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* eax_3 = cocos2d::UserDefault::getInstance()
    int32_t result
    
    for (int32_t i = 0; i s< 9; i += 1)
        int32_t ecx = data_42e4d8
        void* var_2c
        char* eax_7 = sub_401f70(&var_2c, i + ecx * 0xa)
        int32_t var_8_1 = 0
        int32_t* var_5c
        sub_403ed0(eax_7.b, "rate", &var_5c, eax_7)
        var_8_1.b = 2
        int32_t var_18
        
        if (var_18 u>= 0x10)
            operator delete(var_2c)
        
        int32_t* ecx_3 = &var_5c
        int32_t var_48
        
        if (var_48 u>= 0x10)
            ecx_3 = var_5c
        
        var_18 = 0xf
        int32_t var_1c_1 = 0
        var_2c.b = 0
        int32_t eax_9 = (*(*eax_3 + 4))(ecx_3, (ecx + 4 + i) * 0x64)
        void* edi_2 = *(*(arg1 + 0x2ec) + (i << 2))
        void* var_74
        char* eax_10 = sub_401f70(&var_74, eax_9)
        var_8_1.b = 3
        var_8_1.b = 4
        char var_44
        result = (*(*(edi_2 + 0x310) + 4))(sub_403ed0(eax_10.b, U"R", &var_44, eax_10))
        int32_t var_30
        
        if (var_30 u>= 0x10)
            result = operator delete(var_44.d)
        
        var_30 = 0xf
        int32_t var_34_1 = 0
        var_44 = 0
        int32_t var_60
        
        if (var_60 u>= 0x10)
            result = operator delete(var_74)
        
        int32_t var_8_2 = 0xffffffff
        
        if (var_48 u>= 0x10)
            result = operator delete(var_5c)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
