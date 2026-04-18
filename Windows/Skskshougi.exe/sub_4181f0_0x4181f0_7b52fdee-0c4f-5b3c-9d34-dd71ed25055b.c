// ============================================================
// 函数名称: sub_4181f0
// 虚拟地址: 0x4181f0
// WARP GUID: 7b52fdee-0c4f-5b3c-9d34-dd71ed25055b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_403ed0, ??1_Init_atexit@@QAE@XZ, sub_403f60, sub_403be0, sub_401990, sub_40f3c0, sub_4199b8
// [被调用的父级函数]: sub_418c20
// ============================================================

int32_t __fastcallsub_4181f0(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c218
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    char var_84
    int32_t var_1c = __security_cookie ^ &var_84
    int32_t ebx
    int32_t var_88 = ebx
    int32_t esi
    int32_t var_8c = esi
    int32_t edi
    int32_t var_90 = edi
    int32_t var_94 = __security_cookie ^ &var_90
    fsbase->NtTib.ExceptionList = &ExceptionList
    arg1[0xa8].b = 1
    int32_t var_98 = 1
    char const* const var_9c = "langJpn"
    int32_t edx = *cocos2d::UserDefault::getInstance()
    bool cond:0 = (*(edx + 4))(var_9c, var_98, var_94) != 0
    int32_t var_70 = 0xf
    int32_t eax_7 = data_42e4d8
    ebx.b = cond:0
    int32_t var_74 = 0
    var_84 = 0
    char* edx_1 = (&data_41d8a4)[eax_7]
    void* ecx_1
    
    if (*edx_1 != 0)
        char* ecx_2 = edx_1
        
        do
            eax_7.b = *ecx_2
            ecx_2 = &ecx_2[1]
        while (eax_7.b != 0)
        
        ecx_1 = ecx_2 - &ecx_2[1]
    else
        ecx_1 = nullptr
    
    sub_401ae0(&var_84, edx_1, ecx_1)
    ExceptionList = nullptr
    char var_54
    char* eax_9 = sub_403ed0(&var_84, 0x420b0c, &var_54, &var_84)
    ExceptionList.b = 1
    void var_3c
    sub_403f60(eax_9.b, eax_9, &var_3c, &data_420b04)
    int32_t var_40
    
    if (var_40 u>= 0x10)
        operator delete(var_54.d)
    
    int32_t var_40_1 = 0xf
    void* var_44 = nullptr
    var_54 = 0
    ExceptionList.b = 4
    
    if (var_70 u>= 0x10)
        operator delete(var_84.d)
    
    int32_t var_70_1 = 0xf
    void* const edx_3 = &data_420b18
    int32_t var_74_1 = 0
    var_84 = 0
    
    if (ebx.b == 0)
        edx_3 = "Are you sure to clear Record ?"
    
    void* ecx_6
    
    if (*edx_3 != 0)
        void* const ecx_7 = edx_3
        void* ebx_1 = ecx_7 + 1
        char i
        
        do
            i = *ecx_7
            ecx_7 += 1
        while (i != 0)
        ecx_6 = ecx_7 - ebx_1
    else
        ecx_6 = nullptr
    
    sub_403be0(&var_3c, edx_3, ecx_6)
    int32_t var_a0_5 = 0x12
    void* const var_a4_3 = &data_41e26c
    int32_t var_58 = 0xf
    int32_t var_5c = 0
    char var_6c = 0
    sub_401ae0(&var_6c, var_a4_3, var_a0_5)
    ExceptionList.b = 5
    sub_401990(&data_429080, &var_6c, 0, 0xffffffff)
    sub_401990(&data_4290a0, &var_3c, 0, 0xffffffff)
    data_42f900 = 4
    data_42f8f0 = 0
    arg1[0xa9] = sub_40f3c0()
    
    if (var_58 u>= 0x10)
        operator delete(var_6c.d)
    
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_59622caa55c977ff00ac1113fdaac96a>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const var_b4 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_59622caa55c977ff00ac1113fdaac96a>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
    int32_t* var_b0 = arg1
    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_59622caa55c977ff00ac1113fdaac96a>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
        * const* var_a4_6 = &var_b4
    ExceptionList.b = 4
    _Init_atexit::~_Init_atexit(arg1[0xa9], var_b4)
    int32_t result = (*(*arg1 + 0xfc))(arg1[0xa9], 0x64)
    int32_t var_30
    
    if (var_30 u>= 0x10)
        result = operator delete(var_44)
    
    int32_t var_24
    fsbase->NtTib.ExceptionList = var_24
    int32_t var_2c
    sub_4199b8(var_2c ^ &var_94)
    return result
}
