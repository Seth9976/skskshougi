// ============================================================
// 函数名称: sub_40eea0
// 虚拟地址: 0x40eea0
// WARP GUID: bc5b4c36-acf0-5974-9828-bf182d6b6515
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, ??1_Init_atexit@@QAE@XZ, sub_401990, sub_40f3c0, sub_4199b8
// [被调用的父级函数]: sub_40f170
// ============================================================

int32_t __fastcallsub_40eea0(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$?_Init@?$_Mpunct@G@std@@IAEXABV_Locinfo@2@_N@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_5c = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t eax_3 = arg1[0xa9]
    int32_t var_30 = 0xf
    int32_t var_34 = 0
    char var_44 = 0
    char* edx = (&data_41d7d8)[eax_3]
    void* ecx
    
    if (*edx != 0)
        char* ecx_1 = edx
        
        do
            eax_3.b = *ecx_1
            ecx_1 = &ecx_1[1]
        while (eax_3.b != 0)
        
        ecx = ecx_1 - &ecx_1[1]
    else
        ecx = nullptr
    
    sub_401ae0(&var_44, edx, ecx)
    int32_t var_8_1 = 0
    int32_t var_60_1 = 0x12
    void* const var_64_1 = &data_41e26c
    int32_t var_18 = 0xf
    int32_t var_1c = 0
    char var_2c = 0
    sub_401ae0(&var_2c, var_64_1, var_60_1)
    var_8_1.b = 1
    sub_401990(&data_429080, &var_2c, 0, 0xffffffff)
    sub_401990(&data_4290a0, &var_44, 0, 0xffffffff)
    data_42f900 = 1
    data_42f8f0 = 0
    arg1[0xad] = sub_40f3c0()
    
    if (var_18 u>= 0x10)
        operator delete(var_2c.d)
    
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_37c8b2d65e455feddfd3f174e1e5fb98>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const var_74 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_37c8b2d65e455feddfd3f174e1e5fb98>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
    int32_t* var_70 = arg1
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_37c8b2d65e455feddfd3f174e1e5fb98>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const* var_64_4 = &var_74
    var_8_1.b = 0
    _Init_atexit::~_Init_atexit(arg1[0xad], var_74)
    int32_t result = (*(*arg1 + 0xfc))(arg1[0xad], 0xa)
    arg1[0xa8].b = 1
    
    if (var_30 u>= 0x10)
        result = operator delete(var_44.d)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
