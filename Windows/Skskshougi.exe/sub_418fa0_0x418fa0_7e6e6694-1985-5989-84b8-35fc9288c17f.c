// ============================================================
// 函数名称: sub_418fa0
// 虚拟地址: 0x418fa0
// WARP GUID: 7e6e6694-1985-5989-84b8-35fc9288c17f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_407c50, sub_414200, sub_404680, sub_411640, sub_409c90, sub_40e550
// ============================================================

class cocos2d::Label* __convention("regparm")sub_418fa0(int32_t arg1, int32_t arg2, int32_t* arg3, float arg4 @ xmm3, int32_t arg5, int32_t arg6)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41c2e0
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_44 = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_8_1 = 0
    int32_t var_18 = 0xf
    int32_t var_1c = 0
    char var_2c = 0
    var_8_1.b = 1
    int32_t var_54 = sub_401ae0(&var_2c, "Arial", 5)
    void* arg_c
    class cocos2d::Label* result =
        cocos2d::Label::createWithSystemFont(&arg_c, &var_2c, arg4, cocos2d::Size::ZERO, 0, 0)
    var_8_1.b = 0
    
    if (var_18 u>= 0x10)
        operator delete(var_2c.d)
    
    int32_t var_18_1 = 0xf
    int32_t var_1c_1 = 0
    var_2c = 0
    (*(*result + 0x4c))(arg2)
    void arg_4
    (*(*result + 0x24c))(&arg_4)
    (*(*arg3 + 0xfc))(result, arg5)
    
    if (arg6 u>= 0x10)
        operator delete(arg_c)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
