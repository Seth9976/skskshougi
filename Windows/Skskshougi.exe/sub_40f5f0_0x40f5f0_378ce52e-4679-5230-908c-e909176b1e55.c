// ============================================================
// 函数名称: sub_40f5f0
// 虚拟地址: 0x40f5f0
// WARP GUID: 378ce52e-4679-5230-908c-e909176b1e55
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_401960, sub_401900, sub_4199b8, sub_410a20, sub_40cf60
// [被调用的父级函数]: 无
// ============================================================

bool __fastcallsub_40f5f0(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t ebp
    int32_t ebp
    int32_t var_4 = ebp
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41b411
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_17c
    int32_t eax_2 = __security_cookie ^ &var_17c
    int32_t* edi
    int32_t* var_188 = edi
    int32_t eax_4 = __security_cookie ^ &var_188
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* ebx = arg1
    bool result = cocos2d::Layer::init(arg1)
    
    if (result != 0)
        bool var_179_1 = (*(*cocos2d::UserDefault::getInstance() + 4))("langJpn", 0) != 0
        cocos2d::Director::getInstance()
        float var_174
        int32_t* var_190_1 = &var_174
        cocos2d::Director::getVisibleSize(cocos2d::Director::getInstance())
        float var_150
        int32_t* var_190_2 = &var_150
        cocos2d::Director::getVisibleOrigin(cocos2d::Director::getInstance())
        int32_t var_c_1 = 0
        int32_t var_114_1 = 0xf
        int32_t var_118_1 = 0
        char var_128 = 0
        var_c_1.b = 1
        int32_t var_19c_1 = sub_401ae0(&var_128, "Meiryo", 6)
        var_c_1.b = 0
        ebx[0xb0] =
            cocos2d::Label::createWithSystemFont(&data_4290a0, &var_128, 34f, cocos2d::Size::ZERO, 0, 0)
        
        if (var_114_1 u>= 0x10)
            operator delete(var_128.d)
        
        (*(*ebx[0xb0] + 0x24c))(cocos2d::Color3B::BLACK)
        (*(*ebx + 0xfc))(ebx[0xb0], 0xd2)
        class cocos2d::Size* eax_13
        cocos2d::Size* ecx_8
        eax_13, ecx_8 = (*(*ebx[0xb0] + 0xa8))(eax_4)
        cocos2d::Size* ecx_9 = cocos2d::Size::Size(ecx_8, eax_13)
        float var_154
        double xmm0_2 = _mm_cvtps_pd(var_154)
        int32_t var_158
        double xmm1_4[0x2] = _mm_cvtps_pd(var_158) + 80.0 + 80.0
        float xmm0_7 = _mm_cvtpd_ps(xmm0_2 + 100.0 + 60.0 + 60.0 + 30.0)
        cocos2d::Size::Size(ecx_9, _mm_cvtpd_ps(xmm1_4), xmm0_7)
        int32_t eax_14 = *ebx[0xb0]
        float var_164
        int32_t xmm0_13 = _mm_cvtpd_ps(_mm_cvtps_pd(var_164 / 10f) + 620.0)
        cocos2d* ecx_11 = (*(eax_14 + 0x48))(var_174 * 0.5f, xmm0_13)
        float var_170
        float var_14c
        float xmm0_20 = var_14c + (var_170 - var_164) * 0.5f
        float var_168
        float var_160 = var_150 + (var_174 - var_168) * 0.5f
        var_c_1.b = 2
        int32_t var_140
        int32_t* var_190_8 = &var_140
        var_c_1.b = 3
        int32_t* var_190_9 = &var_140
        void var_138
        cocos2d::Vec2::operator+(cocos2d::Size(ecx_11), &var_138)
        var_c_1.b = 5
        float xmm1_7[0x2] = xmm0_20
        int32_t* ecx_13 = ebx[0xb0]
        ebx[0xae] = _mm_cvtpd_ps(_mm_cvtps_pd(xmm1_7) + 30.0 + 30.0)
        int32_t eax_15 = *ecx_13
        int32_t xmm0_28 =
            _mm_cvtpd_ps(_mm_cvtps_pd(xmm1_7) + 90.0 + 60.0 + _mm_cvtps_pd(var_154 * 0.5f))
        cocos2d::Color4B* ecx_14 = (*(eax_15 + 0x48))(var_174 * 0.5f, xmm0_28)
        float var_190_11 = var_170
        float var_194_6 = var_174
        class cocos2d::LayerColor* eax_17 =
            cocos2d::LayerColor::create(cocos2d::Color4B::Color4B(ecx_14, 0, 0, 0, 0xa0))
        var_188 = nullptr
        (*(*eax_17 + 0x48))(0, var_188)
        (*(*ebx + 0xfc))(eax_17, 0xc8)
        class cocos2d::LayerColor* eax_19 =
            cocos2d::LayerColor::create(cocos2d::Color4B::WHITE, var_168, var_164)
        (*(*eax_19 + 0x4c))(&var_160)
        int32_t var_190_15 = 0x42200000
        float var_194_10 = var_168
        class cocos2d::LayerColor* eax_22
        cocos2d::Vec2* ecx_20
        eax_22, ecx_20 = cocos2d::LayerColor::create(cocos2d::Color4B::Color4B(
            (*(*ebx + 0xfc))(eax_19, 0xcd), 0x38, 0x8e, 0x3c, 0xff))
        double xmm0_37 = _mm_cvtps_pd(xmm0_20)
        var_140 = 0
        int32_t var_13c_1 = _mm_cvtpd_ps(xmm0_37 - 40.0)
        var_4.b = 6
        var_188 = &var_140
        int32_t* eax_23 = cocos2d::Vec2::operator+(ecx_20, &var_128)
        var_4.b = 7
        int32_t edx_5 = *eax_22
        var_188 = eax_23
        (*(edx_5 + 0x4c))(var_188)
        var_4.b = 5
        var_188 = 0xcd
        (*(*var_170 + 0xfc))(eax_22, var_188)
        var_188 = 5
        int32_t var_f4_1 = 0xf
        int32_t var_f8_1 = 0
        char var_108 = 0
        int32_t ecx_24 = sub_401ae0(&var_108, "Arial", var_188)
        var_188 = nullptr
        var_4.b = 8
        int32_t var_194_11 = ecx_24
        class cocos2d::Label* eax_25 = cocos2d::Label::createWithSystemFont(&data_429080, &var_108, 
            28f, cocos2d::Size::ZERO, 0, var_188)
        var_4.b = 5
        
        if (var_f4_1 u>= 0x10)
            var_188 = var_108.d
            operator delete(var_188)
        
        int32_t var_f4_2 = 0xf
        int32_t var_f8_2 = 0
        var_108 = 0
        int32_t eax_26 = *eax_25
        var_188 = _mm_cvtpd_ps(_mm_cvtps_pd(var_154 + xmm0_20) - 20.0)
        float var_16c
        (*(eax_26 + 0x48))(var_16c * 0.5f, var_188)
        int32_t eax_27 = *var_170
        var_188 = 0xd2
        (*(eax_27 + 0xfc))(eax_25, var_188)
        var_188 = 0x26
        cocos2d::MenuItemFont::setFontSize(var_188)
        int32_t eax_28 = data_42f900
        int32_t* var_120
        int32_t var_10c
        char var_f0
        char var_d8
        char var_c0
        int32_t* var_a8
        int32_t* var_90
        int32_t* var_78
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_8e5e88aacaf0f60f00771178a0fa340d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_60
        char var_44
        class cocos2d::Menu* eax_41
        
        if (eax_28 == 5)
            var_60 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_8e5e88aacaf0f60f00771178a0fa340d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            float var_5c_1 = var_170
            struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_8e5e88aacaf0f60f00771178a0fa340d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
                * const* var_50_1 = &var_60
            var_4.b = 0xa
            var_188 = 0x17
            int32_t var_30_1 = 0xf
            int32_t var_34_1 = 0
            var_44 = 0
            sub_401ae0(&var_44, "images/button-white.png", var_188)
            var_4.b = 0xb
            var_188 = 0x17
            int32_t var_f4_3 = 0xf
            int32_t var_f8_3 = 0
            var_108 = 0
            sub_401ae0(&var_108, "images/button-white.png", var_188)
            var_4.b = 0xc
            var_188 = &var_60
            class cocos2d::MenuItemImage* eax_29 =
                cocos2d::MenuItemImage::create(&var_108, &var_44, var_188)
            
            if (var_f4_3 u>= 0x10)
                var_188 = var_108.d
                operator delete(var_188)
            
            int32_t var_f4_4 = 0xf
            int32_t var_f8_4 = 0
            var_108 = 0
            
            if (var_30_1 u>= 0x10)
                var_188 = var_44.d
                operator delete(var_188)
            
            var_4.b = 5
            int32_t var_30_2 = 0xf
            int32_t var_34_2 = 0
            var_44 = 0
            
            if (var_50_1 != 0)
                struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_8e5e88aacaf0f60f00771178a0fa340d>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
                    * const edx_6 = *var_50_1
                var_188 = var_50_1 != &var_60
                edx_6->__offset(0x10).d(var_188)
                int32_t var_50_2 = 0
            
            void* const eax_32 = &data_41f720
            
            if (var_174:3.b == 0)
                eax_32 = &data_41f728
            
            var_188 = eax_32
            sub_401900(&var_120, var_188)
            var_4.b = 0xd
            double xmm0_48 = _mm_cvtps_pd(var_16c)
            var_188 = &var_120
            _mm_cvtpd_ps(xmm0_48 * 0.25)
            sub_410a20(var_170, eax_29, var_188)
            
            if (var_10c u>= 0x10)
                var_188 = var_120
                operator delete(var_188)
            
            var_f0.d = &std::_Func_impl<struct std::_Callable_obj<class <lambda_80467c65cf176988a859825af2e599e9>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            float var_ec_1 = var_170
            char* var_e0_1 = &var_f0
            var_4.b = 0xf
            var_188 = 0x17
            int32_t var_7c_1 = 0xf
            int32_t var_80_1 = 0
            var_90.b = 0
            sub_401ae0(&var_90, "images/button-white.png", var_188)
            var_4.b = 0x10
            var_188 = 0x17
            int32_t var_ac_1 = 0xf
            int32_t var_b0_1 = 0
            var_c0 = 0
            sub_401ae0(&var_c0, "images/button-white.png", var_188)
            var_4.b = 0x11
            var_188 = &var_f0
            class cocos2d::MenuItemImage* eax_33 =
                cocos2d::MenuItemImage::create(&var_c0, &var_90, var_188)
            
            if (var_ac_1 u>= 0x10)
                var_188 = var_c0.d
                operator delete(var_188)
            
            int32_t var_ac_2 = 0xf
            int32_t var_b0_2 = 0
            var_c0 = 0
            
            if (var_7c_1 u>= 0x10)
                var_188 = var_90
                operator delete(var_188)
            
            var_4.b = 5
            int32_t var_7c_2 = 0xf
            int32_t var_80_2 = 0
            var_90.b = 0
            
            if (var_e0_1 != 0)
                int32_t edx_7 = *var_e0_1
                var_188 = var_e0_1 != &var_f0
                (*(edx_7 + 0x10))(var_188)
                int32_t var_e0_2 = 0
            
            void* const eax_36 = &data_41f72c
            
            if (var_174:3.b == 0)
                eax_36 = &data_41f738
            
            var_188 = eax_36
            sub_401900(&var_120, var_188)
            var_4.b = 0x12
            double xmm0_51 = _mm_cvtps_pd(var_16c)
            var_188 = &var_120
            _mm_cvtpd_ps(xmm0_51 * 0.5)
            sub_410a20(var_170, eax_33, var_188)
            
            if (var_10c u>= 0x10)
                var_188 = var_120
                operator delete(var_188)
            
            var_120 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_fad457e384e2bca9bca80f83464d773c>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            float var_11c_1 = var_170
            int32_t** var_110_1 = &var_120
            var_4.b = 0x14
            var_188 = 0x17
            int32_t var_c4_1 = 0xf
            int32_t var_c8_1 = 0
            var_d8 = 0
            sub_401ae0(&var_d8, "images/button-white.png", var_188)
            var_4.b = 0x15
            var_188 = 0x17
            int32_t var_94_1 = 0xf
            int32_t var_98_1 = 0
            var_a8.b = 0
            sub_401ae0(&var_a8, "images/button-white.png", var_188)
            var_4.b = 0x16
            var_188 = &var_120
            int32_t* eax_37 = cocos2d::MenuItemImage::create(&var_a8, &var_d8, var_188)
            
            if (var_94_1 u>= 0x10)
                var_188 = var_a8
                operator delete(var_188)
            
            int32_t var_94_2 = 0xf
            int32_t var_98_2 = 0
            var_a8.b = 0
            
            if (var_c4_1 u>= 0x10)
                var_188 = var_d8.d
                operator delete(var_188)
            
            var_4.b = 5
            int32_t var_c4_2 = 0xf
            int32_t var_c8_2 = 0
            var_d8 = 0
            
            if (var_110_1 != 0)
                int32_t* edx_8 = *var_110_1
                var_188 = var_110_1 != &var_120
                edx_8[4](var_188)
                int32_t var_110_2 = 0
            
            void* const eax_40 = &data_41f73c
            
            if (var_174:3.b == 0)
                eax_40 = "After"
            
            var_188 = eax_40
            sub_401900(&var_78, var_188)
            var_4.b = 0x17
            double xmm0_54 = _mm_cvtps_pd(var_16c)
            var_188 = &var_78
            _mm_cvtpd_ps(xmm0_54 * 0.75)
            sub_410a20(var_170, eax_37, var_188)
            var_4.b = 5
            int32_t var_64
            
            if (var_64 u>= 0x10)
                var_188 = var_78
                operator delete(var_188)
            
            var_188 = nullptr
            int32_t* var_18c_11 = eax_37
            class cocos2d::MenuItemImage* var_190_21 = eax_33
            eax_41 = cocos2d::Menu::create(eax_29)
            goto label_4105ec
        
        class std::string var_2c
        
        if (eax_28 != 4)
            var_120 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_d15c17e9e62c79a17a423f51d7ffa437>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            float var_11c_2 = var_170
            int32_t** var_110_4 = &var_120
            var_188 = "images/button-white.png"
            var_4.b = 0x2a
            sub_401900(&var_78, var_188)
            var_188 = "images/button-white.png"
            var_4.b = 0x2b
            sub_401900(&var_2c, var_188)
            var_4.b = 0x2c
            var_188 = &var_120
            class cocos2d::MenuItem* eax_51 = cocos2d::MenuItemImage::create(&var_2c, &var_78, var_188)
            sub_401960(&var_2c)
            sub_401960(&var_78)
            var_4.b = 5
            sub_40cf60(&var_120)
            var_188 = &data_41f74c
            sub_401900(&var_f0, var_188)
            var_4.b = 0x2d
            var_188 = &var_f0
            sub_410a20(var_170, eax_51, var_188)
            var_4.b = 5
            sub_401960(&var_f0)
            var_188 = nullptr
            eax_41 = cocos2d::Menu::create(eax_51)
        label_4105ec:
            var_188 = cocos2d::Vec2::ZERO
            (*(*eax_41 + 0x4c))(var_188)
            int32_t edx_10 = *var_170
            var_188 = 0xd2
            (*(edx_10 + 0xfc))(eax_41, var_188)
        else
            var_a8 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_9c875e72fd4e8241b174aaf42edd4a53>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            float var_a4_1 = var_170
            int32_t** var_98_3 = &var_a8
            var_188 = "images/button-white.png"
            var_4.b = 0x19
            sub_401900(&var_f0, var_188)
            var_188 = "images/button-white.png"
            var_4.b = 0x1a
            sub_401900(&var_120, var_188)
            var_4.b = 0x1b
            var_188 = &var_a8
            class cocos2d::MenuItemImage* eax_42 =
                cocos2d::MenuItemImage::create(&var_120, &var_f0, var_188)
            
            if (var_10c u>= 0x10)
                var_188 = var_120
                operator delete(var_188)
            
            int32_t var_10c_1 = 0xf
            int32_t var_110_3 = 0
            var_120.b = 0
            int32_t var_dc
            
            if (var_dc u>= 0x10)
                var_188 = var_f0.d
                operator delete(var_188)
            
            int32_t var_dc_1 = 0xf
            int32_t var_e0_3 = 0
            var_f0 = 0
            sub_40cf60(&var_a8)
            var_90 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_e7feb3a54fce0768d7ac26f64b51988b>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            float var_8c_1 = var_170
            int32_t** var_80_3 = &var_90
            var_188 = "images/button-white.png"
            var_4.b = 0x1d
            sub_401900(&var_d8, var_188)
            var_188 = "images/button-white.png"
            var_4.b = 0x1e
            sub_401900(&var_60, var_188)
            var_4.b = 0x1f
            var_188 = &var_90
            class cocos2d::MenuItemImage* eax_43 =
                cocos2d::MenuItemImage::create(&var_60, &var_d8, var_188)
            int32_t var_4c
            
            if (var_4c u>= 0x10)
                var_188 = var_60
                operator delete(var_188)
            
            int32_t var_4c_1 = 0xf
            int32_t var_50_3 = 0
            var_60.b = 0
            int32_t var_c4
            
            if (var_c4 u>= 0x10)
                var_188 = var_d8.d
                operator delete(var_188)
            
            int32_t var_c4_3 = 0xf
            int32_t var_c8_3 = 0
            var_d8 = 0
            var_4.b = 5
            sub_40cf60(&var_90)
            class cocos2d::Menu* eax_46
            
            if (data_42f8f0 != 0)
                var_c0.d = &std::_Func_impl<struct std::_Callable_obj<class <lambda_ef3c2f9179a6482883deac601930259f>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
                float var_bc_1 = var_170
                char* var_b0_3 = &var_c0
                var_188 = "images/button-white.png"
                var_4.b = 0x23
                sub_401900(&var_44, var_188)
                var_188 = "images/button-white.png"
                var_4.b = 0x24
                sub_401900(&var_78, var_188)
                var_4.b = 0x25
                var_188 = &var_c0
                class cocos2d::MenuItemImage* eax_47 =
                    cocos2d::MenuItemImage::create(&var_78, &var_44, var_188)
                sub_401960(&var_78)
                sub_401960(&var_44)
                var_4.b = 5
                sub_40cf60(&var_c0)
                int32_t* ecx_59 = &data_41f720
                
                if (var_174:3.b == 0)
                    ecx_59 = &data_41f728
                
                var_188 = ecx_59
                sub_401900(&var_108, var_188)
                var_4.b = 0x26
                double xmm0_63 = _mm_cvtps_pd(var_16c)
                var_188 = &var_108
                _mm_cvtpd_ps(xmm0_63 * 0.25)
                sub_410a20(var_170, eax_42, var_188)
                var_4.b = 5
                sub_401960(&var_108)
                int32_t* eax_48 = &data_41f72c
                
                if (var_174:3.b == 0)
                    eax_48 = &data_41f738
                
                var_188 = eax_48
                sub_401900(&var_108, var_188)
                var_4.b = 0x27
                double xmm0_66 = _mm_cvtps_pd(var_16c)
                var_188 = &var_108
                _mm_cvtpd_ps(xmm0_66 * 0.5)
                sub_410a20(var_170, eax_43, var_188)
                var_4.b = 5
                sub_401960(&var_108)
                var_188 = data_42f8f0
                sub_401900(&var_2c, var_188)
                var_4.b = 0x28
                double xmm0_69 = _mm_cvtps_pd(var_16c)
                var_188 = &var_2c
                _mm_cvtpd_ps(xmm0_69 * 0.75)
                sub_410a20(var_170, eax_47, var_188)
                var_4.b = 5
                sub_401960(&var_2c)
                var_188 = nullptr
                class cocos2d::MenuItemImage* var_18c_21 = eax_47
                class cocos2d::MenuItemImage* var_190_26 = eax_43
                eax_46 = cocos2d::Menu::create(eax_42)
            else
                void* const eax_44 = &data_41f720
                
                if (var_174:3.b == 0)
                    eax_44 = &data_41f728
                
                var_188 = eax_44
                sub_401900(&var_78, var_188)
                class cocos2d::MenuItem* esi_4 = eax_42
                var_4.b = 0x20
                double xmm0_57 = _mm_cvtps_pd(var_16c)
                var_188 = &var_78
                _mm_cvtpd_ps(xmm0_57 * 0.33000000000000002)
                sub_410a20(var_170, esi_4, var_188)
                var_4.b = 5
                sub_401960(&var_78)
                void* const eax_45 = &data_41f72c
                
                if (var_174:3.b == 0)
                    eax_45 = &data_41f738
                
                var_188 = eax_45
                sub_401900(&var_78, var_188)
                var_4.b = 0x21
                double xmm0_60 = _mm_cvtps_pd(var_16c)
                var_188 = &var_78
                _mm_cvtpd_ps(xmm0_60 * 0.67000000000000004)
                sub_410a20(var_170, eax_43, var_188)
                var_4.b = 5
                sub_401960(&var_78)
                var_188 = nullptr
                class cocos2d::MenuItemImage* var_18c_16 = eax_43
                eax_46 = cocos2d::Menu::create(esi_4)
            
            var_188 = cocos2d::Vec2::ZERO
            (*(*eax_46 + 0x4c))(var_188)
            int32_t eax_50 = *var_170
            var_188 = 0xd2
            (*(eax_50 + 0xfc))(eax_46, var_188)
        class cocos2d::EventListenerKeyboard* edi_4 = cocos2d::EventListenerKeyboard::create()
        int32_t* ecx_81 = *(edi_4 + 0x88)
        
        if (ecx_81 != 0)
            int32_t edx_11 = *ecx_81
            class cocos2d::EventListenerKeyboard* eax_52
            eax_52.b = ecx_81 != edi_4 + 0x78
            var_188 = zx.d(eax_52.b)
            (*(edx_11 + 0x10))(var_188)
            *(edi_4 + 0x88) = 0
        
        *(edi_4 + 0x78) = &std::_Func_impl<struct std::_Callable_obj<class <lambda_49609834a604bdfe8ce75cd410187d31>,0>,class std::allocator<class std::_Func_class<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*> >,void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>'}
        *(edi_4 + 0x7c) = var_170
        var_188 = var_170
        *(edi_4 + 0x88) = edi_4 + 0x78
        var_c_1.b = 2
        var_c_1.b = 0
        int32_t var_c_2 = 0xffffffff
        cocos2d::Vec2::~Vec2(cocos2d::Vec2::~Vec2(cocos2d::Vec2::~Vec2(
            cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority(*(var_170 i+ 0x1dc), 
            edi_4, var_188))))
        result = true
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_17c)
    return result
}
