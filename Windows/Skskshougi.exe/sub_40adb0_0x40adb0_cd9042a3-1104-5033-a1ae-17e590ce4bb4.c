// ============================================================
// 函数名称: sub_40adb0
// 虚拟地址: 0x40adb0
// WARP GUID: cd9042a3-1104-5033-a1ae-17e590ce4bb4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40baa0, sub_40b490, sub_401900, sub_4199b8, sub_406f90, sub_4087d0, sub_40cf60
// [被调用的父级函数]: ?_Do_call@?$_Func_impl@U?$_Callable_obj@V<lambda_22c800ac295261976027df48869e3267>@@$0A@@std@@V?$allocator@V?$_Func_class@XPAV?$message@I@Concurrency@@U_Nil@std@@U34@U34@U34@U34@U34@@std@@@2@XPAV?$message@I@Concurrency@@U_Nil@2@U62@U62@U62@U62@U62@@std@@UAEX$$QAPAV?$message@I@Concurrency@@@Z
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __thiscallsub_40adb0(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41ae28
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    class cocos2d::MenuItemImage* var_18c
    int32_t eax_2 = __security_cookie ^ &var_18c
    int32_t __saved_edi
    int32_t eax_4 = __security_cookie ^ &__saved_edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* ecx = arg1[0x125]
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        arg1[0x125] = 0
    
    int32_t* ecx_1 = arg1[0xca]
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x12c))(1)
        arg1[0xca] = 0
    
    int32_t* ecx_2 = arg1[0x115]
    
    if (ecx_2 != 0)
        (*(*ecx_2 + 0x12c))(1)
        arg1[0x115] = 0
    
    arg1[0xa9].b = 0
    struct _EXCEPTION_REGISTRATION_RECORD** result
    
    if (arg2 == 1)
        result = sub_406f90(arg1)
    else if (arg2 == 0)
        result = sub_4087d0(arg1)
    else if (data_42e4d5 == 0)
        int32_t* ecx_6 = arg1[0x113]
        *(arg1 + 0x2a6) = 1
        (*(*ecx_6 + 0xac))(0)
        (*(*arg1[0x112] + 0xac))(0)
        (*(*arg1[0xcb] + 0xac))(0)
        arg1[0xb3] = 0
        sub_40baa0(arg1)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_c39fd22b58d199ba707c40944d3e0def>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_80 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_c39fd22b58d199ba707c40944d3e0def>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        int32_t* var_7c_1 = arg1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_c39fd22b58d199ba707c40944d3e0def>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_70_1 = &var_80
        int32_t var_c_1 = 1
        char var_110
        sub_401900(&var_110, "images/begin-pushed.png")
        var_c_1.b = 2
        char var_140
        sub_401900(&var_140, "images/begin.png")
        int32_t var_170 = 0x443b8000
        int32_t var_16c_1 = 0x444bc000
        var_c_1.b = 4
        class cocos2d::MenuItemImage* eax_12 =
            cocos2d::MenuItemImage::create(&var_140, &var_110, &var_80)
        class cocos2d::Size* eax_13
        cocos2d::Size* ecx_13
        eax_13, ecx_13 = (*(*eax_12 + 0xa8))(eax_4)
        cocos2d::Size::Size(ecx_13, eax_13)
        float var_150
        float var_14c
        (*(*eax_12 + 0x3c))(75f / var_150, 75f / var_14c)
        (*(*eax_12 + 0x4c))(&var_170)
        int32_t var_12c
        
        if (var_12c u>= 0x10)
            operator delete(var_140.d)
        
        int32_t var_12c_1 = 0xf
        int32_t var_130_1 = 0
        var_140 = 0
        int32_t var_fc
        
        if (var_fc u>= 0x10)
            operator delete(var_110.d)
        
        int32_t var_fc_1 = 0xf
        int32_t var_100_1 = 0
        var_110 = 0
        sub_40cf60(&var_80)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_8cdea85c474f287809f8fc4e0e3725e9>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_50 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_8cdea85c474f287809f8fc4e0e3725e9>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        int32_t* var_4c_1 = arg1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_8cdea85c474f287809f8fc4e0e3725e9>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_40_1 = &var_50
        int32_t var_c_2 = 6
        char var_e0
        sub_401900(&var_e0, "images/revplay-pushed.png")
        var_c_2.b = 7
        char var_c8
        sub_401900(&var_c8, "images/revplay.png")
        int32_t var_160 = 0x443b8000
        int32_t var_15c_1 = 0x44264000
        var_c_2.b = 9
        class cocos2d::MenuItemImage* eax_15 = cocos2d::MenuItemImage::create(&var_c8, &var_e0, &var_50)
        var_18c = eax_15
        class cocos2d::Size* eax_16
        cocos2d::Size* ecx_20
        eax_16, ecx_20 = (*(*eax_15 + 0xa8))()
        cocos2d::Size::Size(ecx_20, eax_16)
        float var_180
        float var_17c
        (*(*eax_15 + 0x3c))(75f / var_180, 75f / var_17c)
        (*(*eax_15 + 0x4c))(&var_160)
        int32_t var_b4
        
        if (var_b4 u>= 0x10)
            operator delete(var_c8.d)
        
        int32_t var_b4_1 = 0xf
        int32_t var_b8_1 = 0
        var_c8 = 0
        int32_t var_cc
        
        if (var_cc u>= 0x10)
            operator delete(var_e0.d)
        
        int32_t var_cc_1 = 0xf
        int32_t var_d0_1 = 0
        var_e0 = 0
        sub_40cf60(&var_50)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_a1aa5bd95e1eb0e3e4561b99000ad01d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_68 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_a1aa5bd95e1eb0e3e4561b99000ad01d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        int32_t* var_64_1 = arg1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_a1aa5bd95e1eb0e3e4561b99000ad01d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_58_1 = &var_68
        int32_t var_c_3 = 0xb
        char var_b0
        sub_401900(&var_b0, "images/play-pushed.png")
        var_c_3.b = 0xc
        char var_98
        sub_401900(&var_98, "images/play.png")
        int32_t var_168 = 0x443b8000
        int32_t var_164_1 = 0x4400c000
        var_c_3.b = 0xe
        class cocos2d::MenuItemImage* eax_18 = cocos2d::MenuItemImage::create(&var_98, &var_b0, &var_68)
        class cocos2d::Size* eax_19
        cocos2d::Size* ecx_27
        eax_19, ecx_27 = (*(*eax_18 + 0xa8))()
        cocos2d::Size::Size(ecx_27, eax_19)
        float var_178
        float var_174
        (*(*eax_18 + 0x3c))(75f / var_178, 75f / var_174)
        (*(*eax_18 + 0x4c))(&var_168)
        int32_t var_84
        
        if (var_84 u>= 0x10)
            operator delete(var_98.d)
        
        int32_t var_84_1 = 0xf
        int32_t var_88_1 = 0
        var_98 = 0
        int32_t var_9c
        
        if (var_9c u>= 0x10)
            operator delete(var_b0.d)
        
        int32_t var_9c_1 = 0xf
        int32_t var_a0_1 = 0
        var_b0 = 0
        sub_40cf60(&var_68)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_c03f7dfddab90771d6d676dd3437a0ca>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_38 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_c03f7dfddab90771d6d676dd3437a0ca>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        int32_t* var_34_1 = arg1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_c03f7dfddab90771d6d676dd3437a0ca>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_28_1 = &var_38
        int32_t var_c_4 = 0x10
        char var_f8
        sub_401900(&var_f8, "images/end-pushed.png")
        var_c_4.b = 0x11
        char var_128
        sub_401900(&var_128, "images/end.png")
        int32_t var_148 = 0x443b8000
        int32_t var_144_1 = 0x43b68000
        var_c_4.b = 0x13
        class cocos2d::MenuItemImage* eax_21 =
            cocos2d::MenuItemImage::create(&var_128, &var_f8, &var_38)
        class cocos2d::Size* eax_22
        cocos2d::Size* ecx_34
        eax_22, ecx_34 = (*(*eax_21 + 0xa8))()
        cocos2d::Size::Size(ecx_34, eax_22)
        float var_158
        float var_154
        (*(*eax_21 + 0x3c))(75f / var_158, 75f / var_154)
        (*(*eax_21 + 0x4c))(&var_148)
        int32_t var_114
        
        if (var_114 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_1 = 0xf
        int32_t var_118_1 = 0
        var_128 = 0
        int32_t var_e4
        
        if (var_e4 u>= 0x10)
            operator delete(var_f8.d)
        
        int32_t var_e4_1 = 0xf
        int32_t var_e8_1 = 0
        var_f8 = 0
        int32_t var_c_5 = 0xffffffff
        sub_40cf60(&var_38)
        int32_t var_1a0_25 = 0
        class cocos2d::MenuItemImage* var_1a4_9 = eax_21
        class cocos2d::MenuItemImage* var_1a8_5 = eax_18
        class cocos2d::MenuItemImage* var_1ac_1 = var_18c
        class cocos2d::Menu* eax_24 = cocos2d::Menu::create(eax_12)
        arg1[0x114] = eax_24
        (*(*eax_24 + 0x4c))(cocos2d::Vec2::ZERO)
        result = (*(*arg1 + 0xfc))(arg1[0x114], 3)
    else
        *(arg1 + 0x2a7) = 0
        result = sub_40b490(arg1)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_18c)
    return result
}
