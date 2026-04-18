// ============================================================
// 函数名称: sub_4169c0
// 虚拟地址: 0x4169c0
// WARP GUID: abc0b00f-5ede-5178-90e3-77613f858971
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_416730, sub_40d460, sub_401900, sub_417a30, sub_417760, sub_418740, sub_417ba0, sub_417d10, sub_4199b8, sub_40cf60
// [被调用的父级函数]: 无
// ============================================================

bool __fastcallsub_4169c0(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c069
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_19c
    int32_t eax_2 = __security_cookie ^ &var_19c
    float edi
    float var_1a8 = edi
    float eax_4 = __security_cookie ^ &var_1a8
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::Node* edi_1 = arg1
    int32_t var_188 = 0
    bool result = cocos2d::Layer::init(arg1)
    
    if (result != 0)
        bool cond:0_1 = (*(*cocos2d::UserDefault::getInstance() + 4))("langJpn", 1) != 0
        *(edi_1 + 0x2a0) = 0
        int32_t ebx
        ebx.b = cond:0_1
        data_42e4d6 = 0
        float var_178
        int32_t* var_1b0_1 = &var_178
        char var_199_1 = ebx.b
        cocos2d::Director::getVisibleSize(cocos2d::Director::getInstance())
        void var_180
        void* var_1b0_2 = &var_180
        int32_t var_c_1 = 0
        int32_t var_1b0_3 = 0x44a00000
        int32_t var_1b4_1 = 0x44480000
        class cocos2d::LayerColor* eax_10 = cocos2d::LayerColor::create(
            cocos2d::Color4B::Color4B(
                cocos2d::Director::getVisibleOrigin(cocos2d::Director::getInstance()), 0xdc, 0xe7, 
                0x75, 0xff), 
            eax_4, var_1a8)
        var_1a8 = 0f
        (*(*eax_10 + 0x48))(0, var_1a8)
        (*(*edi_1 + 0xfc))(eax_10, 0xfffffffe)
        int32_t var_144_1 = 0xf
        int32_t var_148_1 = 0
        char var_158 = 0
        sub_401ae0(&var_158, "Arial", 5)
        var_c_1.b = 1
        void* const edx_3 = &data_4206f0
        int32_t var_15c_1 = 0xf
        int32_t var_160_1 = 0
        
        if (ebx.b == 0)
            edx_3 = "Settings"
        
        char var_170 = 0
        void* ecx_7
        
        if (*edx_3 != 0)
            void* const ecx_9 = edx_3
            char i
            
            do
                i = *ecx_9
                ecx_9 += 1
            while (i != 0)
            ecx_7 = ecx_9 - (edx_3 + 1)
        else
            ecx_7 = nullptr
        
        var_c_1.b = 2
        int32_t var_1bc_1 = sub_401ae0(&var_170, edx_3, ecx_7)
        class cocos2d::Label* eax_12 =
            cocos2d::Label::createWithSystemFont(&var_170, &var_158, 64f, cocos2d::Size::ZERO, 0, 0)
        
        if (var_15c_1 u>= 0x10)
            operator delete(var_170.d)
        
        var_c_1.b = 0
        int32_t var_15c_2 = 0xf
        int32_t var_160_2 = 0
        var_170 = 0
        
        if (var_144_1 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_2 = 0xf
        int32_t var_148_2 = 0
        var_158 = 0
        (*(*eax_12 + 0x24c))(cocos2d::Color3B::BLACK)
        float xmm0_1[0x2] = *((*(*eax_12 + 0xa8))() + 4)
        int32_t eax_16 = *eax_12
        class cocos2d::MenuItemImage* var_198_1 = xmm0_1
        int32_t xmm0_3 = _mm_cvtpd_ps(1280.0 - _mm_cvtps_pd(xmm0_1))
        (*(eax_16 + 0x48))(var_178 * 0.5f, xmm0_3)
        (*(*edi_1 + 0xfc))(eax_12, 1)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_140 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_13c_1 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_130_1 = &var_140
        var_c_1.b = 4
        int32_t var_15c_3 = 0xf
        int32_t var_160_3 = 0
        var_170 = 0
        sub_401ae0(&var_170, "images/up-pushed.png", 0x14)
        var_c_1.b = 5
        int32_t var_144_3 = 0xf
        int32_t var_148_3 = 0
        var_158 = 0
        sub_401ae0(&var_158, "images/up.png", 0xd)
        var_c_1.b = 6
        class cocos2d::MenuItemImage* eax_18 =
            cocos2d::MenuItemImage::create(&var_158, &var_170, &var_140)
        
        if (var_144_3 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_4 = 0xf
        int32_t var_148_4 = 0
        var_158 = 0
        
        if (var_15c_3 u>= 0x10)
            operator delete(var_170.d)
        
        var_c_1.b = 0
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* ecx_18 = var_130_1
        int32_t var_15c_4 = 0xf
        int32_t var_160_4 = 0
        var_170 = 0
        
        if (ecx_18 != 0)
            ecx_18 = (*ecx_18)->__offset(0x10).d(ecx_18 != &var_140)
            int32_t var_130_2 = 0
        
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_1b0_14 = ecx_18
        (*(*eax_18 + 0x40))(0x3f000000)
        class cocos2d::MenuItemImage* var_194 = var_198_1
        int32_t var_190_1 = xmm0_3
        var_c_1.b = 7
        (*(*eax_18 + 0x4c))(&var_194)
        int32_t var_1b0_16 = 0
        var_c_1.b = 0
        class cocos2d::Menu* eax_23 = cocos2d::Menu::create(eax_18)
        (*(*eax_23 + 0x4c))(cocos2d::Vec2::ZERO)
        (*(*edi_1 + 0x100))(eax_23)
        var_140 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_369fa875968da9ba7a4c94dad7b0624f>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_13c_2 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_130_3 = &var_140
        var_c_1.b = 9
        int32_t var_15c_5 = 0xf
        int32_t var_160_5 = 0
        var_170 = 0
        sub_401ae0(&var_170, "images/power.png", 0x10)
        var_c_1.b = 0xa
        int32_t var_144_5 = 0xf
        int32_t var_148_5 = 0
        var_158 = 0
        sub_401ae0(&var_158, &data_41d780, 0)
        var_c_1.b = 0xb
        *(edi_1 + 0x2d0) = sub_416730(&var_158, edi_1 + 0x2ac, &var_170, &var_140, nullptr)
        
        if (var_144_5 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_6 = 0xf
        int32_t var_148_6 = 0
        var_158 = 0
        
        if (var_15c_5 u>= 0x10)
            operator delete(var_170.d)
        
        var_c_1.b = 0
        int32_t var_15c_6 = 0xf
        int32_t var_160_6 = 0
        var_170 = 0
        
        if (var_130_3 != 0)
            (*var_130_3)->__offset(0x10).d(var_130_3 != &var_140)
        
        var_140 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_188955b878dc3ea173554f664e29eb42>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_13c_3 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_130_4 = &var_140
        var_c_1.b = 0xd
        int32_t var_15c_7 = 0xf
        int32_t var_160_7 = 0
        var_170 = 0
        sub_401ae0(&var_170, "images/melon-3.png", 0x12)
        var_c_1.b = 0xe
        int32_t var_144_7 = 0xf
        int32_t var_148_7 = 0
        var_158 = 0
        sub_401ae0(&var_158, &data_41d780, 0)
        var_c_1.b = 0xf
        *(edi_1 + 0x2d4) = sub_416730(&var_158, edi_1 + 0x2b0, &var_170, &var_140, edi_1 + 0x2a8)
        
        if (var_144_7 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_8 = 0xf
        int32_t var_148_8 = 0
        var_158 = 0
        
        if (var_15c_7 u>= 0x10)
            operator delete(var_170.d)
        
        var_c_1.b = 0
        int32_t var_15c_8 = 0xf
        int32_t var_160_8 = 0
        var_170 = 0
        
        if (var_130_4 != 0)
            (*var_130_4)->__offset(0x10).d(var_130_4 != &var_140)
        
        var_140 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_0760ef01cba287648b6244ebbb3e6868>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_13c_4 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_130_5 = &var_140
        var_c_1.b = 0x11
        int32_t var_15c_9 = 0xf
        int32_t var_160_9 = 0
        var_170 = 0
        sub_401ae0(&var_170, "images/sound.png", 0x10)
        var_c_1.b = 0x12
        int32_t var_144_9 = 0xf
        int32_t var_148_9 = 0
        var_158 = 0
        sub_401ae0(&var_158, &data_41d780, 0)
        var_c_1.b = 0x13
        *(edi_1 + 0x2dc) = sub_416730(&var_158, edi_1 + 0x2b8, &var_170, &var_140, nullptr)
        
        if (var_144_9 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_10 = 0xf
        int32_t var_148_10 = 0
        var_158 = 0
        
        if (var_15c_9 u>= 0x10)
            operator delete(var_170.d)
        
        var_c_1.b = 0
        int32_t var_15c_10 = 0xf
        int32_t var_160_10 = 0
        var_170 = 0
        
        if (var_130_5 != 0)
            (*var_130_5)->__offset(0x10).d(var_130_5 != &var_140)
        
        var_140 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_0aa8c75d7f124c4e3054f12afef51b5e>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_13c_5 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_446a22383372b08df77121dbbd797166>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_130_6 = &var_140
        var_c_1.b = 0x15
        int32_t var_15c_11 = 0xf
        int32_t var_160_11 = 0
        var_170 = 0
        sub_401ae0(&var_170, "images/BGM.png", 0xe)
        var_c_1.b = 0x16
        int32_t var_144_11 = 0xf
        int32_t var_148_11 = 0
        var_158 = 0
        sub_401ae0(&var_158, &data_41d780, 0)
        var_c_1.b = 0x17
        *(edi_1 + 0x2d8) = sub_416730(&var_158, edi_1 + 0x2b4, &var_170, &var_140, nullptr)
        
        if (var_144_11 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_12 = 0xf
        int32_t var_148_12 = 0
        var_158 = 0
        
        if (var_15c_11 u>= 0x10)
            operator delete(var_170.d)
        
        var_c_1.b = 0
        int32_t var_15c_12 = 0xf
        int32_t var_160_12 = 0
        var_170 = 0
        
        if (var_130_6 != 0)
            (*var_130_6)->__offset(0x10).d(var_130_6 != &var_140)
        
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_02e7459813edfb1d50524a82c099f1bd>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_b0 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_02e7459813edfb1d50524a82c099f1bd>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_ac_1 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_02e7459813edfb1d50524a82c099f1bd>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_a0_1 = &var_b0
        var_c_1.b = 0x19
        sub_401900(&var_158, "images/android.png")
        var_c_1.b = 0x1a
        sub_401900(&var_140, "Google Play")
        var_c_1.b = 0x1b
        var_194 = sub_416730(&var_140, edi_1 + 0x2c8, &var_158, &var_b0, nullptr)
        int32_t var_12c
        
        if (var_12c u>= 0x10)
            operator delete(var_140)
        
        int32_t var_12c_1 = 0xf
        int32_t var_130_7 = 0
        var_140.b = 0
        
        if (var_144_12 u>= 0x10)
            operator delete(var_158.d)
        
        int32_t var_144_13 = 0xf
        int32_t var_148_13 = 0
        var_158 = 0
        sub_40cf60(&var_b0)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_2e95ad300efb61f73861942657a451b0>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_80 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_2e95ad300efb61f73861942657a451b0>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_7c_1 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_2e95ad300efb61f73861942657a451b0>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_70_1 = &var_80
        var_c_1.b = 0x1d
        char var_e0
        sub_401900(&var_e0, "images/question.png")
        void* const eax_43 = &data_420770
        var_c_1.b = 0x1e
        
        if (var_199_1 == 0)
            eax_43 = "Medal System"
        
        sub_401900(&var_170, eax_43)
        var_c_1.b = 0x1f
        class cocos2d::MenuItemImage* eax_44 =
            sub_416730(&var_170, edi_1 + 0x2c4, &var_e0, &var_80, nullptr)
        
        if (var_15c_12 u>= 0x10)
            operator delete(var_170.d)
        
        int32_t var_15c_13 = 0xf
        int32_t var_160_13 = 0
        var_170 = 0
        int32_t var_cc
        
        if (var_cc u>= 0x10)
            operator delete(var_e0.d)
        
        int32_t var_cc_1 = 0xf
        int32_t var_d0_1 = 0
        var_e0 = 0
        sub_40cf60(&var_80)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_5a4254c210fb1da56871b36ba1f42852>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_50 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_5a4254c210fb1da56871b36ba1f42852>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_4c_1 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_5a4254c210fb1da56871b36ba1f42852>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_40_1 = &var_50
        var_c_1.b = 0x21
        char var_f8
        sub_401900(&var_f8, "images/question.png")
        void* const eax_45 = &data_420798
        var_c_1.b = 0x22
        
        if (var_199_1 == 0)
            eax_45 = "SakuSaku Shogi"
        
        char var_110
        sub_401900(&var_110, eax_45)
        var_c_1.b = 0x23
        class cocos2d::MenuItemImage* eax_46 =
            sub_416730(&var_110, edi_1 + 0x2c4, &var_f8, &var_50, nullptr)
        int32_t var_fc
        
        if (var_fc u>= 0x10)
            operator delete(var_110.d)
        
        int32_t var_fc_1 = 0xf
        int32_t var_100_1 = 0
        var_110 = 0
        int32_t var_e4
        
        if (var_e4 u>= 0x10)
            operator delete(var_f8.d)
        
        int32_t var_e4_1 = 0xf
        int32_t var_e8_1 = 0
        var_f8 = 0
        var_c_1.b = 0
        sub_40cf60(&var_50)
        char var_128
        sub_401900(&var_128, (&data_41d8a4)[data_42e4d8])
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_184ccfff62f90e98d1845692b45ea4af>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_38 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_184ccfff62f90e98d1845692b45ea4af>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_34_1 = edi_1
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_184ccfff62f90e98d1845692b45ea4af>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_28_1 = &var_38
        var_c_1.b = 0x26
        char var_c8
        int32_t ecx_46 = sub_401900(&var_c8, "images/erase.png")
        var_c_1.b = 0x27
        char var_98
        char var_68
        int32_t ecx_48
        int32_t* edx_12
        
        if (var_199_1 == 0)
            edx_12 = sub_40d460(&var_128, "Clear Record of ", &var_98, &var_128)
            int32_t var_c_2 = 0x29
            ecx_48 = 2
        else
            int32_t var_1b0_41 = ecx_46
            edx_12 = sub_418740(&var_68, &var_128)
            var_c_1.b = 0x28
            ecx_48 = 1
        
        int32_t var_188_1 = ecx_48
        class cocos2d::MenuItemImage* eax_52 =
            sub_416730(edx_12, edi_1 + 0x2bc, &var_c8, &var_38, nullptr)
        int32_t eax_53 = ecx_48
        
        if ((eax_53.b & 2) != 0)
            eax_53 &= 0xfffffffd
            int32_t var_84
            
            if (var_84 u>= 0x10)
                operator delete(var_98.d)
            
            int32_t var_84_1 = 0xf
            int32_t var_88_1 = 0
            var_98 = 0
        
        int32_t var_c_3 = 0x27
        
        if ((eax_53.b & 1) != 0)
            int32_t var_54
            
            if (var_54 u>= 0x10)
                operator delete(var_68.d)
            
            int32_t var_54_1 = 0xf
            int32_t var_58_1 = 0
            var_68 = 0
        
        int32_t var_b4
        
        if (var_b4 u>= 0x10)
            operator delete(var_c8.d)
        
        int32_t var_b4_1 = 0xf
        int32_t var_b8_1 = 0
        var_c8 = 0
        var_c_3.b = 0x24
        sub_40cf60(&var_38)
        int32_t var_1b0_46 = 0
        class cocos2d::MenuItemImage* var_1b4_16 = eax_52
        class cocos2d::MenuItemImage* var_1b8_11 = eax_44
        class cocos2d::MenuItemImage* var_1bc_10 = eax_46
        class cocos2d::MenuItemImage* var_1c0_10 = var_194
        int32_t var_1c4_2 = *(edi_1 + 0x2dc)
        int32_t var_1c8_1 = *(edi_1 + 0x2d8)
        int32_t var_1cc_1 = *(edi_1 + 0x2d4)
        class cocos2d::Menu* eax_54 = cocos2d::Menu::create(*(edi_1 + 0x2d0))
        cocos2d::Menu::alignItemsVertically(eax_54)
        (*(*edi_1 + 0x100))(eax_54)
        sub_417a30(edi_1)
        sub_417760(edi_1)
        sub_417d10(edi_1)
        sub_417ba0(edi_1)
        class cocos2d::MenuItemImage* eax_55 = cocos2d::EventListenerKeyboard::create()
        int32_t* ecx_57 = *(eax_55 + 0x88)
        var_194 = eax_55
        void* __offset(cocos2d::MenuItemImage, 0x78) esi_9 = eax_55 + 0x78
        
        if (ecx_57 != 0)
            eax_55.b = ecx_57 != esi_9
            (*(*ecx_57 + 0x10))(zx.d(eax_55.b))
            eax_55 = var_194
            *(esi_9 + 0x10) = 0
        
        *esi_9 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_b6752dbfbaf4d698b1384bbad0bef95a>,0>,class std::allocator<class std::_Func_class<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*> >,void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>'}
        *(esi_9 + 4) = edi_1
        *(esi_9 + 0x10) = esi_9
        cocos2d::Vec2* ecx_59 = cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority(
            *(edi_1 + 0x1dc), eax_55, edi_1)
        int32_t var_114
        
        if (var_114 u>= 0x10)
            ecx_59 = operator delete(var_128.d)
        
        int32_t var_114_1 = 0xf
        int32_t var_118_1 = 0
        var_128 = 0
        int32_t var_c_4 = 0xffffffff
        cocos2d::Vec2::~Vec2(ecx_59)
        result = true
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_19c)
    return result
}
