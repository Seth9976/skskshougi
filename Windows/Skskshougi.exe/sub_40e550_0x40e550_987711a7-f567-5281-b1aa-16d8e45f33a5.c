// ============================================================
// 函数名称: sub_40e550
// 虚拟地址: 0x40e550
// WARP GUID: 987711a7-f567-5281-b1aa-16d8e45f33a5
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_403ed0, sub_418fa0, sub_403b20, sub_401990, sub_4199b8, sub_418ed0
// [被调用的父级函数]: 无
// ============================================================

class cocos2d::Sprite* __fastcallsub_40e550(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41b1c4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    class cocos2d::EventListenerTouchOneByOne* var_cc
    int32_t eax_2 = __security_cookie ^ &var_cc
    int32_t ebx
    int32_t var_d0 = ebx
    float edi
    float var_d8 = edi
    float eax_4 = __security_cookie ^ &var_d8
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::Sprite* result = cocos2d::Layer::init(arg1)
    
    if (result.b != 0)
        class cocos2d::UserDefault* eax_5
        cocos2d::Color4B* ecx
        eax_5, ecx = cocos2d::UserDefault::getInstance()
        *(arg1 + 0x2a0) = 0
        int32_t var_e0_1 = 0x44a00000
        int32_t var_e4_1 = 0x44480000
        uint8_t var_e8_1 = -1
        uint8_t var_ec_1 = 0x75
        uint8_t var_f0_1 = -0x19
        int32_t var_f4 = 0xdc
        class cocos2d::LayerColor* eax_7 = cocos2d::LayerColor::create(
            cocos2d::Color4B::Color4B(ecx, var_f4.b, var_f0_1, var_ec_1, var_e8_1), eax_4, var_d8)
        var_d8 = 0f
        (*(*eax_7 + 0x48))(0, var_d8)
        (*(*arg1 + 0x100))(eax_7)
        int32_t eax_9 = data_42e4d8
        int32_t var_20_1 = 0xf
        int32_t var_24_1 = 0
        char var_34 = 0
        char* edx_2 = (&data_41d8a4)[eax_9]
        void* ecx_3
        
        if (*edx_2 != 0)
            char* ecx_4 = edx_2
            
            do
                eax_9.b = *ecx_4
                ecx_4 = &ecx_4[1]
            while (eax_9.b != 0)
            
            ecx_3 = ecx_4 - &ecx_4[1]
        else
            ecx_3 = nullptr
        
        sub_401ae0(&var_34, edx_2, ecx_3)
        int32_t var_c_1 = 0
        char var_64
        char* eax_10 = sub_401f70(&var_64, data_42e4dc + 1)
        var_c_1.b = 1
        var_c_1.b = 2
        char var_80
        sub_403b20(&var_34, sub_403ed0(eax_10.b, " Level-", &var_80, eax_10), nullptr, 0xffffffff)
        int32_t var_6c
        
        if (var_6c u>= 0x10)
            operator delete(var_80.d)
        
        var_c_1.b = 0
        int32_t var_6c_1 = 0xf
        int32_t var_70_1 = 0
        var_80 = 0
        int32_t var_50
        
        if (var_50 u>= 0x10)
            operator delete(var_64.d)
        
        int32_t var_e0_9 = 0xf
        int32_t var_e4_4 = 0
        var_f4.b = 0
        int32_t* eax_12
        int32_t ecx_10
        eax_12, ecx_10 = sub_401990(&var_f4, &var_34, 0, 0xffffffff)
        float var_c8 = 400f
        float var_c4_1 = 1260f
        var_c_1.b = 3
        int32_t var_fc_1 = ecx_10
        eax_12.w = *cocos2d::Color3B::BLACK
        var_fc_1.w = eax_12.w
        eax_12.b = *(cocos2d::Color3B::BLACK + 2)
        var_fc_1:2.b = eax_12.b
        sub_418fa0(eax_12, &var_c8, arg1, 24f, var_fc_1, 0)
        var_80.d = &std::_Func_impl<struct std::_Callable_obj<class <lambda_ff55a380d9d7a5c28dcd624ff6a5d89b>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        cocos2d::Layer* var_7c_1 = arg1
        char* var_70_2 = &var_80
        var_c_1.b = 5
        int32_t var_e0_10 = 0x14
        char const* const var_e4_5 = "images/up-pushed.png"
        int32_t var_50_1 = 0xf
        int32_t var_54_1 = 0
        var_64 = 0
        sub_401ae0(&var_64, var_e4_5, var_e0_10)
        var_c_1.b = 6
        int32_t var_e0_11 = 0xd
        char const* const var_e4_6 = "images/up.png"
        int32_t var_38_1 = 0xf
        int32_t var_3c_1 = 0
        char var_4c = 0
        sub_401ae0(&var_4c, var_e4_6, var_e0_11)
        void* var_c0 = 0x429e5555
        float var_bc_1 = 1200.83337f
        var_c_1.b = 8
        class cocos2d::MenuItemImage* eax_13 = cocos2d::MenuItemImage::create(&var_4c, &var_64, &var_80)
        class cocos2d::Size* eax_14
        cocos2d::Size* ecx_15
        eax_14, ecx_15 = (*(*eax_13 + 0xa8))()
        cocos2d::Size::Size(ecx_15, eax_14)
        (*(*eax_13 + 0x3c))(98.3333359f / var_c8, 98.3333359f / var_c4_1)
        (*(*eax_13 + 0x4c))(&var_c0)
        
        if (var_38_1 u>= 0x10)
            operator delete(var_4c.d)
        
        int32_t var_38_2 = 0xf
        int32_t var_3c_2 = 0
        var_4c = 0
        
        if (var_50_1 u>= 0x10)
            operator delete(var_64.d)
        
        var_c_1.b = 0
        int32_t var_50_2 = 0xf
        int32_t var_54_2 = 0
        var_64 = 0
        
        if (var_70_2 != 0)
            (*(*var_70_2 + 0x10))(var_70_2 != &var_80)
            int32_t var_70_3 = 0
        
        int32_t var_e0_19 = 0
        class cocos2d::Menu* eax_18 = cocos2d::Menu::create(eax_13)
        (*(*eax_18 + 0x4c))(cocos2d::Vec2::ZERO)
        (*(*arg1 + 0xfc))(eax_18, 1)
        class cocos2d::EventListenerTouchOneByOne* eax_19 =
            cocos2d::EventListenerTouchOneByOne::create()
        int32_t* ecx_21 = *(eax_19 + 0x70)
        var_cc = eax_19
        void* __offset(cocos2d::EventListenerTouchOneByOne, 0x60) esi_5 = eax_19 + 0x60
        
        if (ecx_21 != 0)
            eax_19.b = ecx_21 != esi_5
            (*(*ecx_21 + 0x10))(zx.d(eax_19.b))
            eax_19 = var_cc
            *(esi_5 + 0x10) = 0
        
        *esi_5 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_5bf1db8059f0de01732fa98d3ea39f9e>,0>,class std::allocator<class std::_Func_class<bool,class cocos2d::Touch*,class cocos2d::Event*> >,bool,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<bool, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(esi_5 + 4) = arg1
        *(esi_5 + 0x10) = esi_5
        void* __offset(cocos2d::EventListenerTouchOneByOne, 0x78) esi_6 = eax_19 + 0x78
        int32_t* ecx_22 = *(esi_6 + 0x10)
        
        if (ecx_22 != 0)
            eax_19.b = ecx_22 != esi_6
            (*(*ecx_22 + 0x10))(zx.d(eax_19.b))
            eax_19 = var_cc
            *(esi_6 + 0x10) = 0
        
        *esi_6 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6a27c34eb4d40f1dde77ca013cdc594a>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(esi_6 + 4) = arg1
        *(esi_6 + 0x10) = esi_6
        void* __offset(cocos2d::EventListenerTouchOneByOne, 0x90) esi_7 = eax_19 + 0x90
        int32_t* ecx_23 = *(esi_7 + 0x10)
        
        if (ecx_23 != 0)
            eax_19.b = ecx_23 != esi_7
            (*(*ecx_23 + 0x10))(zx.d(eax_19.b))
            eax_19 = var_cc
            *(esi_7 + 0x10) = 0
        
        *esi_7 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_02eacfcc07e6ae151b5104937c2811f5>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(esi_7 + 4) = arg1
        *(esi_7 + 0x10) = esi_7
        cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority((*(*arg1 + 0x1b4))(eax_19, 
            arg1))
        class cocos2d::EventListenerKeyboard* eax_25 = cocos2d::EventListenerKeyboard::create()
        int32_t* ecx_26 = *(eax_25 + 0x88)
        var_cc = eax_25
        void* __offset(cocos2d::EventListenerKeyboard, 0x78) esi_8 = eax_25 + 0x78
        
        if (ecx_26 != 0)
            eax_25.b = ecx_26 != esi_8
            (*(*ecx_26 + 0x10))(zx.d(eax_25.b))
            eax_25 = var_cc
            *(esi_8 + 0x10) = 0
        
        *esi_8 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_bc890b2a8328524ddf1cfa5d4c0a6919>,0>,class std::allocator<class std::_Func_class<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*> >,void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>'}
        *(esi_8 + 4) = arg1
        *(esi_8 + 0x10) = esi_8
        cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority(*(arg1 + 0x1dc), eax_25, arg1)
        int32_t eax_27 = data_42e4dc
        int32_t var_74_1 = 0xf
        int32_t var_78_1 = 0
        char var_88 = 0
        char* edx_15 = (&data_41d880)[eax_27]
        void* ecx_28
        
        if (*edx_15 != 0)
            char* ecx_29 = edx_15
            
            do
                eax_27.b = *ecx_29
                ecx_29 = &ecx_29[1]
            while (eax_27.b != 0)
            
            ecx_28 = ecx_29 - &ecx_29[1]
        else
            ecx_28 = nullptr
        
        sub_401ae0(&var_88, edx_15, ecx_28)
        var_d0 = 0x43c80000
        var_cc = 0x448d7555
        ExceptionList.b = 0xa
        class cocos2d::Sprite* eax_28
        cocos2d::Color3B* ecx_31
        eax_28, ecx_31 = cocos2d::Sprite::create(&var_88)
        
        if (eax_28 != 0)
            class cocos2d::Size* eax_30
            cocos2d::Size* ecx_33
            eax_30, ecx_33 = (*(*eax_28 + 0xa8))()
            int32_t var_e8_7 = cocos2d::Size::Size(ecx_33, eax_30)
            (*(*eax_28 + 0x40))(196.666672f / var_bc_1)
            (*(*eax_28 + 0x4c))(&var_d0)
            ecx_31 = (*(*arg1 + 0xfc))(eax_28, 0)
        
        ExceptionList.b = 0
        *(arg1 + 0x2a8) = eax_28
        
        if (var_74_1 u>= 0x10)
            ecx_31 = operator delete(var_88.d)
        
        int32_t ecx_38 = cocos2d::Color3B::Color3B(ecx_31, -0x24, -0x19, 0x75)
        int32_t var_98 = 0x43c80000
        int32_t var_94_1 = 0x44098000
        int32_t var_e4_13 = ecx_38
        var_c_1.b = 0xb
        var_c_1.b = 0
        int32_t i = 0
        void var_b8
        var_cc = sub_418ed0(&var_98, &var_b8, arg1, 740f, &var_98, 930f, 0)
        var_c8.q = 0x408b9c0000000000
        
        do
            int32_t var_e0_29 = 0x17
            char const* const var_e4_15 = "images/white-800x90.png"
            int32_t var_6c_2 = 0xf
            int32_t var_70_4 = 0
            var_80 = 0
            sub_401ae0(&var_80, var_e4_15, var_e0_29)
            int32_t xmm0_5 = _mm_cvtpd_ps(zx.o(var_c8.q))
            int32_t var_a8 = 0x43b90000
            int32_t var_a4_1 = xmm0_5
            var_c_1.b = 0xd
            class cocos2d::Sprite* eax_36 = cocos2d::Sprite::create(&var_80)
            
            if (eax_36 != 0)
                class cocos2d::Size* eax_37
                cocos2d::Size* ecx_42
                eax_37, ecx_42 = (*(*eax_36 + 0xa8))()
                cocos2d::Size::Size(ecx_42, eax_37)
                float var_90
                float var_8c
                (*(*eax_36 + 0x3c))(740f / var_90, 83.6999969f / var_8c)
                (*(*eax_36 + 0x4c))(&var_a8)
                (*(*var_cc + 0xfc))(eax_36, 0)
            
            var_c_1.b = 0
            
            if (var_6c_2 u>= 0x10)
                operator delete(var_80.d)
            
            char* esi_12 = *(i + &data_41d7b0)
            int32_t var_e0_36 = 0xf
            int32_t var_e4_18 = 0
            var_f4.b = 0
            void* ecx_46
            
            if (*esi_12 != 0)
                char* ecx_47 = esi_12
                var_c0 = &ecx_47[1]
                void* eax_41
                
                do
                    eax_41.b = *ecx_47
                    ecx_47 = &ecx_47[1]
                while (eax_41.b != 0)
                ecx_46 = ecx_47 - var_c0
            else
                ecx_46 = nullptr
            
            int32_t* eax_42
            int32_t ecx_49
            eax_42, ecx_49 = sub_401ae0(&var_f4, esi_12, ecx_46)
            int32_t xmm0_9 = _mm_cvtpd_ps(zx.o(var_c8.q))
            int32_t var_a0 = 0x43b90000
            int32_t var_9c_1 = xmm0_9
            var_c_1.b = 0xe
            int32_t var_fc_3 = ecx_49
            eax_42.w = *cocos2d::Color3B::BLACK
            var_fc_3.w = eax_42.w
            eax_42.b = *(cocos2d::Color3B::BLACK + 2)
            var_fc_3:2.b = eax_42.b
            sub_418fa0(eax_42, &var_a0, var_cc, 38f, var_fc_3, 0)
            var_c_1.b = 0
            char* eax_45 = sub_401f70(&var_64, data_42e4dc + data_42e4d8 * 0xa)
            var_c_1.b = 0xf
            sub_403ed0(eax_45.b, *(i + &data_41d800), &var_4c, eax_45)
            var_c_1.b = 0x11
            
            if (var_50_2 u>= 0x10)
                operator delete(var_64.d)
            
            char* ecx_54 = &var_4c
            int32_t var_e0_38 = 0
            
            if (var_38_2 u>= 0x10)
                ecx_54 = var_4c.d
            
            int32_t eax_46 = *eax_5
            var_50_2 = 0xf
            int32_t var_54_3 = 0
            var_64 = 0
            
            if ((*(eax_46 + 4))(ecx_54, var_e0_38) != 0)
                int32_t var_e0_39 = 0x17
                char const* const var_e4_20 = "images/medal-ribbon.png"
                int32_t var_6c_3 = 0xf
                int32_t var_70_5 = 0
                var_80 = 0
                sub_401ae0(&var_80, var_e4_20, var_e0_39)
                int32_t xmm0_11 = _mm_cvtpd_ps(zx.o(var_c8.q))
                int32_t var_b4 = 0x4294cccd
                int32_t var_b0_1 = xmm0_11
                var_c_1.b = 0x13
                result = cocos2d::Sprite::create(&var_80)
                
                if (result != 0)
                    class cocos2d::Size* eax_47
                    cocos2d::Size* ecx_58
                    eax_47, ecx_58 = (*(*result + 0xa8))()
                    int32_t var_e0_42 = cocos2d::Size::Size(ecx_58, eax_47)
                    (*(*result + 0x40))(74.4000015f f/ var_88.d)
                    (*(*result + 0x4c))(&var_b4)
                    (*(*var_cc + 0xfc))(result, 0)
                
                if (var_6c_3 u>= 0x10)
                    operator delete(var_80.d)
            
            var_c_1.b = 0
            
            if (var_38_2 u>= 0x10)
                operator delete(var_4c.d)
            
            i += 4
            var_c8.q = var_c8.q - 93.0
        while (i s< 0x28)
        
        if (var_20_1 u>= 0x10)
            operator delete(var_34.d)
        
        result.b = 1
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_cc)
    return result
}
