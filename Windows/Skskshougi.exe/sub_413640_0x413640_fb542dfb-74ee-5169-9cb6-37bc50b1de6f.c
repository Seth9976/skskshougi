// ============================================================
// 函数名称: sub_413640
// 虚拟地址: 0x413640
// WARP GUID: fb542dfb-74ee-5169-9cb6-37bc50b1de6f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401960, ??1_Init_atexit@@QAE@XZ, sub_401900, sub_40ce50, sub_414ac0, sub_404660, ??4?$basic_string@DU?$char_traits@D@std@@V?$allocator@D@2@@std@@QAEAAV01@$$QAV01@@Z, sub_40f550, sub_4148c0, sub_414980, sub_4199b8
// [被调用的父级函数]: sub_416340
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __thiscallsub_413640(int32_t* arg1, cocos2d::Touch* arg2)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41b9c6
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_64
    int32_t var_1c = __security_cookie ^ &var_64
    int32_t ebx
    int32_t var_68 = ebx
    int32_t esi
    int32_t var_6c = esi
    int32_t edi
    int32_t var_70 = edi
    int32_t eax_4 = __security_cookie ^ &var_70
    fsbase->NtTib.ExceptionList = &ExceptionList
    char var_54
    char* var_78 = &var_54
    int32_t var_58 = 0
    class cocos2d::Vec2* eax_5 = cocos2d::Touch::getLocation(arg2)
    int32_t var_c_1 = 0
    void* ecx_1 = *arg1
    void var_4c
    var_78 = &var_4c
    int32_t var_58_1 = 1
    cocos2d::Rect* eax_6 = (*(**(ecx_1 + 0x2b4) + 0x1a8))(var_78, eax_4)
    int32_t var_10_1 = 1
    class cocos2d::Vec2* var_7c = eax_5
    int32_t* esp = &var_7c
    int32_t var_5c = 3
    void* eax_7
    
    if (cocos2d::Rect::containsPoint(eax_6, var_7c).b == 0 || *(*arg1 + 0x2a5) == 0)
        eax_7.b = 0
    else
        eax_7.b = 1
    
    ExceptionList = 0xffffffff
    struct _EXCEPTION_REGISTRATION_RECORD** result
    
    if (eax_7.b == 0)
        int32_t* var_80_1 = &var_5c
        class cocos2d::Vec2* eax_8 = cocos2d::Touch::getLocation(arg2)
        ExceptionList = 2
        int32_t eax_9 = sub_414980(*arg1, eax_8)
        ExceptionList = 0xffffffff
        class cocos2d::TransitionFlipX* eax_13
        cocos2d::Director* ecx_10
        
        if (eax_9 s< 0 || eax_9 != *(*arg1 + 0x2b0))
            int32_t* var_80_5 = &var_5c
            class cocos2d::Vec2* eax_14 = cocos2d::Touch::getLocation(arg2)
            ExceptionList = 3
            result = sub_4148c0(*arg1, eax_14)
            esp = &var_7c
            ExceptionList = 0xffffffff
            
            if (result s>= 0)
                void* esi_3 = *arg1
                
                if (result == *(esi_3 + 0x2ac))
                    if (data_42e4d8 == 3)
                        data_42e4dc = 0
                        data_42e4d5 = 1
                        class cocos2d::Scene* eax_26 = sub_404660()
                        class cocos2d::Director* eax_27
                        int32_t ecx_32
                        eax_27, ecx_32 = cocos2d::Director::getInstance()
                        int32_t var_84_7 = ecx_32
                        eax_13 = cocos2d::TransitionFlipX::create(1f, eax_26)
                        ecx_10 = eax_27
                        goto label_4139ea
                    
                    struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_405396aa31f890e82a27612ab8f4151b>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
                        * const var_94
                    void var_3c
                    
                    if ((*(*(esi_3 + 0x2f8) + (result u>> 5 << 2)) & 1 << (result.b & 0x1f)) != 0)
                        sub_401900(&var_3c, &data_41fa68)
                        ExceptionList = 7
                        
                        if (result - 1 u<= 7)
                            void* const var_80_12
                            
                            switch (result)
                                case 1
                                    var_80_12 = &data_41fa88
                                case 2
                                    var_80_12 = &data_41fac0
                                case 3
                                    var_80_12 = &data_41faf8
                                case 4
                                    var_80_12 = &data_41fb28
                                case 5
                                    var_80_12 = &data_41fb58
                                case 6
                                    var_80_12 = &data_41fb90
                                case 7
                                    var_80_12 = &data_41fbb8
                                case 8
                                    var_80_12 = &data_41fbe8
                            
                            sub_40ce50(var_80_12)
                        
                        char* eax_21 = sub_401900(&var_54, &data_41e26c)
                        ExceptionList.b = 8
                        *(*arg1 + 0x308) = sub_40f550(eax_21, &var_3c, &var_54, 1)
                        sub_401960(&var_54)
                        int32_t eax_23 = *arg1
                        var_94 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_eaaa45dc3676a5ba1cdf550a54c873b1>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
                        int32_t var_90_2 = eax_23
                        struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_405396aa31f890e82a27612ab8f4151b>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
                            * const* var_84_5 = &var_94
                        ExceptionList.b = 7
                        _Init_atexit::~_Init_atexit(*(*arg1 + 0x308), var_94)
                        int32_t* ecx_30 = *arg1
                        (*(*ecx_30 + 0xfc))(ecx_30[0xc2], 6)
                        esp = &var_7c
                        *(*arg1 + 0x2a4) = 1
                        result = sub_401960(&var_3c)
                    else
                        int32_t var_40_1 = 0xf
                        int32_t var_44_1 = 0
                        var_54 = 0
                        ExceptionList = 4
                        
                        if (result u<= 8)
                            void* const var_80_7
                            
                            switch (result)
                                case nullptr
                                    var_80_7 = &data_41f8bc
                                case 1
                                    var_80_7 = &data_41f8ec
                                case 2
                                    var_80_7 = &data_41f91c
                                case 3
                                    var_80_7 = &data_41f940
                                case 4
                                    var_80_7 = &data_41f974
                                case 5
                                    var_80_7 = &data_41f99c
                                case 6
                                    var_80_7 = &data_41f9cc
                                case 7
                                    var_80_7 = &data_41fa00
                                case 8
                                    var_80_7 = &data_41fa40
                            
                            sub_40ce50(var_80_7)
                        
                        void* const var_80_8 = &data_41e26c
                        data_42e4dc = result
                        char* eax_16 = sub_401900(&var_3c, var_80_8)
                        ExceptionList.b = 5
                        *(*arg1 + 0x308) = sub_40f550(eax_16, &var_54, &var_3c, 4)
                        sub_401960(&var_3c)
                        int32_t eax_18 = *arg1
                        var_94 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_405396aa31f890e82a27612ab8f4151b>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
                        int32_t var_90_1 = eax_18
                        struct std::_Func_base<void, int32_t>::std::_Func_impl<struct std::_Callable_obj<class <lambda_405396aa31f890e82a27612ab8f4151b>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::VTable
                            * const* var_84_3 = &var_94
                        ExceptionList.b = 4
                        _Init_atexit::~_Init_atexit(*(*arg1 + 0x308), var_94)
                        int32_t* ecx_21 = *arg1
                        (*(*ecx_21 + 0xfc))(ecx_21[0xc2], 6)
                        esp = &var_7c
                        *(*arg1 + 0x2a4) = 1
                        result = sub_401960(&var_54)
        else
            data_42e4dc = eax_9
            class cocos2d::Scene* eax_10 = cocos2d::Scene::create()
            (*(*eax_10 + 0x100))(std::basic_string<char,struct std::char_traits<char>,class std::allocator<char> >::operator=())
            class cocos2d::Director* eax_12
            int32_t ecx_9
            eax_12, ecx_9 = cocos2d::Director::getInstance()
            int32_t var_84_1 = ecx_9
            eax_13 = cocos2d::TransitionFlipX::create(1f, eax_10)
            ecx_10 = eax_12
        label_4139ea:
            var_78 = eax_13
            esp = &var_78
            result = cocos2d::Director::pushScene(ecx_10, var_78)
    else
        result = sub_414ac0(*arg1)
    
    fsbase->NtTib.ExceptionList = esp[0x18]
    esp[1]
    esp[2]
    esp[3]
    sub_4199b8(esp[0x16] ^ &esp[4])
    return result
}
