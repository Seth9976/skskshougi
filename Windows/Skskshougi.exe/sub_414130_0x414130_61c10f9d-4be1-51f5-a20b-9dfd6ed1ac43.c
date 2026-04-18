// ============================================================
// 函数名称: sub_414130
// 虚拟地址: 0x414130
// WARP GUID: 61c10f9d-4be1-51f5-a20b-9dfd6ed1ac43
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_403ed0, sub_4199b8
// [被调用的父级函数]: sub_413e00
// ============================================================

int32_t __fastcallsub_414130(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41bb30
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_4c = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    void* var_44
    char* eax_5 = sub_401f70(&var_44, (*(*cocos2d::UserDefault::getInstance() + 4))("rate", 0x190))
    int32_t var_8_1 = 0
    var_8_1.b = 1
    char var_2c
    int32_t result = (*(*(*(arg1 + 0x2bc) + 0x310) + 4))(sub_403ed0(eax_5.b, U"R", &var_2c, eax_5))
    int32_t var_18
    
    if (var_18 u>= 0x10)
        result = operator delete(var_2c.d)
    
    int32_t var_18_1 = 0xf
    int32_t var_1c = 0
    var_2c = 0
    int32_t var_30
    
    if (var_30 u>= 0x10)
        result = operator delete(var_44)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
