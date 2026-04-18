// ============================================================
// 函数名称: sub_4087d0
// 虚拟地址: 0x4087d0
// WARP GUID: 8b57c8fc-88a0-5edf-b4c2-c5d18ba99fb3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_401960, ??1_Init_atexit@@QAE@XZ, sub_414200, sub_401900, sub_401990, sub_40f3c0, sub_40f550, sub_4199b8
// [被调用的父级函数]: sub_40dc50, sub_40d8a0, sub_40adb0, sub_40dbe0
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __fastcallsub_4087d0(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41aad0
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_8c
    int32_t eax_2 = __security_cookie ^ &var_8c
    int32_t __saved_esi
    int32_t var_94 = __security_cookie ^ &__saved_esi
    struct _EXCEPTION_REGISTRATION_RECORD** result = &ExceptionList
    fsbase->NtTib.ExceptionList = &ExceptionList
    
    if (arg1[0xa9].b == 0)
        struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_5c2404f993f87e290d60b038ae69f93f>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
            * const var_ac
        
        if (*(arg1 + 0x2a6) != 0)
            void* const eax_5 = &data_41e29c
            
            if (data_42e4d5 != 0)
                eax_5 = &data_41e2d0
            
            void* var_64
            sub_401900(&var_64, eax_5)
            int32_t var_c_1 = 0
            int32_t var_98_2 = 0x12
            void* const var_9c_1 = &data_41e26c
            int32_t var_68_1 = 0xf
            int32_t var_6c_1 = 0
            char var_7c = 0
            sub_401ae0(&var_7c, var_9c_1, var_98_2)
            var_c_1.b = 1
            sub_401990(&data_429080, &var_7c, 0, 0xffffffff)
            sub_401990(&data_4290a0, &var_64, 0, 0xffffffff)
            data_42f900 = 4
            data_42f8f0 = 0
            arg1[0x125] = sub_40f3c0()
            
            if (var_68_1 u>= 0x10)
                operator delete(var_7c.d)
            
            var_ac = &std::_Func_impl<struct std::_Callable_obj<class <lambda_5c2404f993f87e290d60b038ae69f93f>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
            int32_t* var_a8_1 = arg1
            struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_5c2404f993f87e290d60b038ae69f93f>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
                * const* var_9c_4 = &var_ac
            var_c_1.b = 0
            _Init_atexit::~_Init_atexit(arg1[0x125], var_ac)
            result = (*(*arg1 + 0xfc))(arg1[0x125], 0xb)
            arg1[0xa9].b = 1
            int32_t var_50
            
            if (var_50 u>= 0x10)
                result = operator delete(var_64)
        else if (*(arg1 + 0x2af) == 0 || *(arg1 + 0x2a7) != 0 || data_42e4d5 != 0)
            void* ecx_11 = data_42e4d0
            
            if (ecx_11 != 0)
                sub_414200(ecx_11)
            
            result = cocos2d::Director::popScene(cocos2d::Director::getInstance())
        else
            void var_34
            sub_401900(&var_34, &data_41e2f4)
            int32_t var_c_2 = 3
            var_c_2.b = 4
            void var_4c
            arg1[0x125] = sub_40f550(sub_401900(&var_4c, &data_41e26c), &var_34, &var_4c, 4)
            sub_401960(&var_4c)
            var_ac = &std::_Func_impl<struct std::_Callable_obj<class <lambda_a29eb739081cf12a90c6fae5cd17d5cc>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
            int32_t* var_a8_2 = arg1
            struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_5c2404f993f87e290d60b038ae69f93f>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
                * const* var_9c_6 = &var_ac
            var_c_2.b = 3
            _Init_atexit::~_Init_atexit(arg1[0x125], var_ac)
            (*(*arg1 + 0xfc))(arg1[0x125], 0xb)
            arg1[0xa9].b = 1
            result = sub_401960(&var_34)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_8c)
    return result
}
