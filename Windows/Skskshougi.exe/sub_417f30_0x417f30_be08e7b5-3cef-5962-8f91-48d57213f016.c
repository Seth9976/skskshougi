// ============================================================
// 函数名称: sub_417f30
// 虚拟地址: 0x417f30
// WARP GUID: be08e7b5-3cef-5962-8f91-48d57213f016
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, ??1_Init_atexit@@QAE@XZ, sub_401990, sub_40f3c0, sub_4199b8
// [被调用的父级函数]: sub_418b60
// ============================================================

int32_t __fastcallsub_417f30(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c1c8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_54
    int32_t eax_2 = __security_cookie ^ &var_54
    int32_t esi
    int32_t var_58 = esi
    int32_t var_5c = __security_cookie ^ &var_58
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_60 = 0xac
    int32_t var_64 = 0x4208f0
    int32_t var_20 = 0xf
    int32_t var_24 = 0
    char var_34 = 0
    sub_401ae0(&var_34, var_64, var_60)
    int32_t var_c_1 = 0
    int32_t var_60_1 = 0x12
    void* const var_64_1 = &data_41e26c
    int32_t var_38 = 0xf
    void* var_3c = nullptr
    char var_4c = 0
    sub_401ae0(&var_4c, var_64_1, var_60_1)
    var_c_1.b = 1
    sub_401990(&data_429080, &var_4c, 0, 0xffffffff)
    sub_401990(&data_4290a0, &var_34, 0, 0xffffffff)
    data_42f900 = 1
    data_42f8f0 = 0
    arg1[0xa9] = sub_40f3c0()
    
    if (var_38 u>= 0x10)
        operator delete(var_4c.d)
    
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_9348600e48040c4d6fdc78cb19b1fd52>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const var_74 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_9348600e48040c4d6fdc78cb19b1fd52>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
    int32_t* var_70 = arg1
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_9348600e48040c4d6fdc78cb19b1fd52>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const* var_64_4 = &var_74
    var_c_1.b = 0
    _Init_atexit::~_Init_atexit(arg1[0xa9], var_74)
    int32_t result = (*(*arg1 + 0xfc))(arg1[0xa9], 0x64)
    arg1[0xa8].b = 1
    int32_t var_28
    
    if (var_28 u>= 0x10)
        result = operator delete(var_3c)
    
    fsbase->NtTib.ExceptionList = eax_2
    sub_4199b8(var_24 ^ &var_5c)
    return result
}
