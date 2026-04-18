// ============================================================
// 函数名称: sub_404680
// 虚拟地址: 0x404680
// WARP GUID: 315be6b8-f960-5a69-8bbf-b02a9f073a40
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_407c50, sub_403ed0, sub_401ab0, sub_418fa0, sub_406900, sub_403b20, sub_401990, sub_406f90, sub_401d40, sub_402090, sub_4199b8, sub_4067d0, ?CreatePrimary@UMSFreeVirtualProcessorRoot@details@Concurrency@@AAEXXZ
// [被调用的父级函数]: 无
// ============================================================

bool __fastcallsub_404680(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41a736
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_11c
    int32_t eax_2 = __security_cookie ^ &var_11c
    float edi
    float var_128 = edi
    float eax_4 = __security_cookie ^ &var_128
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* ebx = arg1
    bool result = cocos2d::Layer::init(arg1)
    
    if (result != 0)
        class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
        uint32_t var_130_2 = 0x21
        ebx[0xac] = (*(*eax_5 + 4))("maxRate", 0x190)
        void* ecx_1 = operator new(var_130_2)
        
        if (ecx_1 == 0)
            ecx_1 = nullptr
        else
            sub_402090(ecx_1)
        
        ebx[0xa8] = ecx_1
        int32_t eax_8 = data_42e4d8
        
        if (eax_8 == 0)
            data_429020 = 0xa
        else if (eax_8 == 1)
            data_429020 = 0x12c
        else if (eax_8 == 2)
            data_429020 = 0x258
        
        void* ecx_2 = &ebx[0xe5]
        ebx[0xa9].w = 0
        int32_t esi_1 = 0
        uint32_t edx_5 = 0x67 u>> 2
        
        if (ecx_2 u> ecx_2 + 0x64)
            edx_5 = 0
        
        if (edx_5 != 0)
            do
                esi_1 += 1
                *ecx_2 = 0
                ecx_2 += 4
            while (esi_1 != edx_5)
        
        ebx[0x114] = 0
        ebx[0xca] = 0
        ebx[0x115] = 0
        ebx[0x10c] = 0
        ebx[0x10d] = 0
        ebx[0x10e] = 0
        ebx[0x10f] = 0
        void* var_e0
        char* eax_15 = sub_401f70(&var_e0, data_42e4dc + data_42e4d8 * 0xa)
        void* ecx_5 = &ebx[0xb8]
        
        if (ecx_5 != eax_15)
            if (*(ecx_5 + 0x14) u>= 0x10)
                operator delete(*ecx_5)
                ecx_5 = &ebx[0xb8]
            
            *(ecx_5 + 0x14) = 0xf
            *(ecx_5 + 0x10) = 0
            *ecx_5 = 0
            
            if (*(eax_15 + 0x14) u>= 0x10)
                *ecx_5 = *eax_15
                *eax_15 = 0
            else
                int32_t eax_16 = *(eax_15 + 0x10)
                
                if (eax_16 != 0xffffffff)
                    memmove(ecx_5, eax_15, eax_16 + 1, eax_4)
                    ecx_5 = &ebx[0xb8]
            
            *(ecx_5 + 0x10) = *(eax_15 + 0x10)
            *(ecx_5 + 0x14) = *(eax_15 + 0x14)
            *(eax_15 + 0x14) = 0xf
            *(eax_15 + 0x10) = 0
            *eax_15 = 0
        
        int32_t var_cc
        
        if (var_cc u>= 0x10)
            operator delete(var_e0)
        
        cocos2d::Color4B* eax_22 = (*(*eax_5 + 4))("komaPict", 0)
        
        if (eax_22 == 0)
            data_42904c = &data_429038
        else if (eax_22 != 1)
            char const (** eax_23)[0x7] = &data_429024
            
            if (eax_22 != 2)
                eax_23 = &data_429064
            
            data_42904c = eax_23
        else
            data_42904c = &data_429050
        
        int32_t var_130_7 = 0x44a00000
        int32_t var_134_4 = 0x44480000
        uint8_t var_138_2 = -1
        uint8_t var_13c_1 = 0x75
        uint8_t var_140_1 = -0x19
        int32_t var_144 = 0xdc
        class cocos2d::LayerColor* eax_25 = cocos2d::LayerColor::create(
            cocos2d::Color4B::Color4B(eax_22, var_144.b, var_140_1, var_13c_1, var_138_2), eax_4, 
            var_128)
        var_128 = 0f
        (*(*eax_25 + 0x48))(0, var_128)
        (*(*ebx + 0x100))(eax_25)
        sub_407c50(ebx)
        int32_t var_130_10 = 0xf
        int32_t var_134_5 = 0
        var_144.b = 0
        int32_t* eax_27
        int32_t ecx_12
        eax_27, ecx_12 = sub_401ae0(&var_144, 0x41e0b0, 7)
        class cocos2d::MenuItemImage* var_114 = nullptr
        int32_t var_110_1 = 0x449d8000
        int32_t var_c_1 = 0
        int32_t var_14c_1 = ecx_12
        eax_27.w = *cocos2d::Color3B::BLACK
        var_14c_1.w = eax_27.w
        eax_27.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_1:2.b = eax_27.b
        ebx[0xbe] = sub_418fa0(eax_27, &var_114, ebx, 24f, var_14c_1, 0)
        int32_t var_38_1 = 0xf
        int32_t var_3c_1 = 0
        char var_4c = 0
        int32_t var_c_2 = 1
        void* var_68
        
        if (data_42e4d5 != 0)
            sub_401ae0(&var_4c, "VS. Human", 9)
        else
            char* edx_9 = (&data_41d8a4)[data_42e4d8]
            void* ecx_14
            
            if (*edx_9 != 0)
                char* ecx_15 = edx_9
                int32_t eax_29
                
                do
                    eax_29.b = *ecx_15
                    ecx_15 = &ecx_15[1]
                while (eax_29.b != 0)
                ecx_14 = ecx_15 - &ecx_15[1]
            else
                ecx_14 = nullptr
            
            sub_401ae0(&var_4c, edx_9, ecx_14)
            char* eax_30 = sub_401f70(&var_68, data_42e4dc + 1)
            var_c_2.b = 2
            var_c_2.b = 3
            sub_403b20(&var_4c, sub_403ed0(eax_30.b, " Level-", &var_e0, eax_30), nullptr, 0xffffffff)
            
            if (var_cc u>= 0x10)
                operator delete(var_e0)
            
            var_c_2.b = 1
            int32_t var_cc_1 = 0xf
            int32_t var_d0_1 = 0
            var_e0.b = 0
            int32_t var_54
            
            if (var_54 u>= 0x10)
                operator delete(var_68)
        
        int32_t var_130_17 = 0xf
        int32_t var_134_9 = 0
        var_144.b = 0
        int32_t ecx_22 = sub_401990(&var_144, &var_4c, 0, 0xffffffff)
        var_114 = 0x43c80000
        int32_t var_110_2 = 0x449d8000
        var_c_2.b = 4
        int32_t var_14c_2 = ecx_22
        var_14c_2.w = *cocos2d::Color3B::BLACK
        uint32_t eax_32
        eax_32.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_2:2.b = eax_32.b
        ebx[0xbf] = sub_418fa0(eax_32, &var_114, ebx, 24f, var_14c_2, 0)
        var_c_2.b = 1
        int32_t var_130_18 = 0xf
        int32_t var_134_10 = 0
        var_144.b = 0
        int32_t ecx_25 = sub_401ae0(&var_144, &data_41d780, 0)
        var_114 = 0x44480000
        int32_t var_110_3 = 0x449d8000
        var_c_2.b = 5
        int32_t var_14c_3 = ecx_25
        var_14c_3.w = *cocos2d::Color3B::BLACK
        uint32_t eax_34
        eax_34.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_3:2.b = eax_34.b
        ebx[0xc0] = sub_418fa0(eax_34, &var_114, ebx, 24f, var_14c_3, 0)
        var_c_2.b = 1
        int32_t var_130_19 = 0xf
        int32_t var_134_11 = 0
        var_144.b = 0
        int32_t ecx_28 = sub_401ae0(&var_144, &data_41d780, 0)
        var_114 = 0x43c80000
        int32_t var_110_4 = 0x445e8000
        var_c_2.b = 6
        int32_t var_14c_4 = ecx_28
        var_14c_4.w = *cocos2d::Color3B::BLACK
        uint32_t eax_36
        eax_36.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_4:2.b = eax_36.b
        ebx[0xc2] = sub_418fa0(eax_36, &var_114, ebx, 24f, var_14c_4, 2)
        var_c_2.b = 1
        int32_t var_130_20 = 0xf
        int32_t var_134_12 = 0
        var_144.b = 0
        int32_t ecx_31 = sub_401ae0(&var_144, 0x41e0cc, 1)
        var_114 = 0x42480000
        int32_t var_110_5 = 0x446b0000
        var_c_2.b = 7
        int32_t var_14c_5 = ecx_31
        var_14c_5.w = *cocos2d::Color3B::BLACK
        uint32_t eax_38
        eax_38.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_5:2.b = eax_38.b
        class cocos2d::Label* eax_39
        cocos2d::Color3B* ecx_33
        eax_39, ecx_33 = sub_418fa0(eax_38, &var_114, ebx, 24f, var_14c_5, 2)
        ebx[0xc5] = eax_39
        float var_10c = 43f
        int32_t var_108_1 = 0x445e8000
        var_c_2.b = 8
        int32_t eax_40 = cocos2d::Color3B::Color3B(ecx_33, -1, -1, 0)
        class cocos2d::Sprite* eax_41
        cocos2d::Rect* ecx_34
        eax_41, ecx_34 = cocos2d::Sprite::create()
        var_c_2.b = 9
        (*(*eax_41 + 0x290))(cocos2d::Rect::Rect(ecx_34, 0f, 0f, 60f, 40f))
        var_c_2.b = 8
        (*(*eax_41 + 0x24c))(eax_40)
        (*(*eax_41 + 0x4c))(&var_10c)
        (*(*ebx + 0xfc))(eax_41, 1)
        ebx[0x111] = eax_41
        var_c_2.b = 1
        int32_t var_130_27 = 0xf
        int32_t var_134_16 = 0
        var_144.b = 0
        int32_t ecx_40 = sub_401ae0(&var_144, &data_41d780, 0)
        var_10c = 400f
        int32_t var_108_2 = 0x43910000
        var_c_2.b = 0xa
        int32_t var_14c_6 = ecx_40
        var_14c_6.w = *cocos2d::Color3B::BLACK
        uint32_t eax_46
        eax_46.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_6:2.b = eax_46.b
        ebx[0xc1] = sub_418fa0(eax_46, &var_10c, ebx, 24f, var_14c_6, 2)
        var_c_2.b = 1
        int32_t var_130_28 = 0xf
        int32_t var_134_17 = 0
        var_144.b = 0
        int32_t ecx_43 = sub_401ae0(&var_144, 0x41e0cc, 1)
        var_10c = 50f
        int32_t var_108_3 = 0x43700000
        var_c_2.b = 0xb
        int32_t var_14c_7 = ecx_43
        var_14c_7.w = *cocos2d::Color3B::BLACK
        uint32_t eax_48
        eax_48.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_7:2.b = eax_48.b
        ebx[0xc3] = sub_418fa0(eax_48, &var_10c, ebx, 24f, var_14c_7, 2)
        var_c_2.b = 1
        int32_t var_130_29 = 0xf
        int32_t var_134_18 = 0
        var_144.b = 0
        int32_t ecx_46 = sub_401ae0(&var_144, &data_41d780, 0)
        var_10c = 50f
        int32_t var_108_4 = 0x43520000
        var_c_2.b = 0xc
        int32_t var_14c_8 = ecx_46
        var_14c_8.w = *cocos2d::Color3B::BLACK
        uint32_t eax_50
        eax_50.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_8:2.b = eax_50.b
        class cocos2d::Label* eax_51
        cocos2d::Color3B* ecx_48
        eax_51, ecx_48 = sub_418fa0(eax_50, &var_10c, ebx, 24f, var_14c_8, 2)
        ebx[0xc4] = eax_51
        var_10c = 43f
        int32_t var_108_5 = 0x43910000
        var_c_2.b = 0xd
        int32_t eax_52 = cocos2d::Color3B::Color3B(ecx_48, -1, -1, 0)
        class cocos2d::Sprite* eax_53
        cocos2d::Rect* ecx_49
        eax_53, ecx_49 = cocos2d::Sprite::create()
        var_c_2.b = 0xe
        (*(*eax_53 + 0x290))(cocos2d::Rect::Rect(ecx_49, 0f, 0f, 60f, 40f))
        var_c_2.b = 0xd
        (*(*eax_53 + 0x24c))(eax_52)
        (*(*eax_53 + 0x4c))(&var_10c)
        (*(*ebx + 0xfc))(eax_53, 1)
        ebx[0x110] = eax_53
        var_c_2.b = 1
        int32_t var_130_36 = 0xf
        int32_t var_134_22 = 0
        var_144.b = 0
        int32_t ecx_55 = sub_401ae0(&var_144, &data_41d780, 0)
        var_10c = 400f
        int32_t var_108_6 = 0x43280000
        var_c_2.b = 0xf
        int32_t var_14c_9 = ecx_55
        var_14c_9.w = *cocos2d::Color3B::BLACK
        uint32_t eax_58
        eax_58.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_9:2.b = eax_58.b
        ebx[0xc6] = sub_418fa0(eax_58, &var_10c, ebx, 24f, var_14c_9, 0)
        var_c_2.b = 1
        int32_t var_130_37 = 0xf
        int32_t var_134_23 = 0
        var_144.b = 0
        int32_t ecx_58 = sub_401ae0(&var_144, &data_41d780, 0)
        var_10c = 400f
        int32_t var_108_7 = 0x43060000
        var_c_2.b = 0x10
        int32_t var_14c_10 = ecx_58
        var_14c_10.w = *cocos2d::Color3B::BLACK
        uint32_t eax_60
        eax_60.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_10:2.b = eax_60.b
        ebx[0xc7] = sub_418fa0(eax_60, &var_10c, ebx, 24f, var_14c_10, 0)
        var_c_2.b = 1
        int32_t var_130_38 = 0xf
        int32_t var_134_24 = 0
        var_144.b = 0
        int32_t ecx_61 = sub_401ae0(&var_144, &data_41d780, 0)
        var_10c = 400f
        int32_t var_108_8 = 0x42c80000
        var_c_2.b = 0x11
        int32_t var_14c_11 = ecx_61
        var_14c_11.w = *cocos2d::Color3B::BLACK
        uint32_t eax_62
        eax_62.b = *(cocos2d::Color3B::BLACK + 2)
        var_14c_11:2.b = eax_62.b
        ebx[0xc8] = sub_418fa0(eax_62, &var_10c, ebx, 24f, var_14c_11, 0)
        var_c_2.b = 1
        sub_406900(ebx)
        char* edx_24
        
        if (data_42e4d5 != 0)
            edx_24 = "images/human-shadow.png"
        else
            edx_24 = (&data_41d880)[data_42e4dc]
        
        int32_t var_20_1 = 0xf
        int32_t var_24_1 = 0
        char var_34 = 0
        void* ecx_64
        
        if (*edx_24 != 0)
            char* ecx_65 = edx_24
            int32_t eax_64
            
            do
                eax_64.b = *ecx_65
                ecx_65 = &ecx_65[1]
            while (eax_64.b != 0)
            ecx_64 = ecx_65 - &ecx_65[1]
        else
            ecx_64 = nullptr
        
        sub_401ae0(&var_34, edx_24, ecx_64)
        var_10c = 400f
        float var_108_9 = 1135f
        var_c_2.b = 0x13
        class cocos2d::Sprite* eax_65 = cocos2d::Sprite::create(&var_34)
        float var_100
        
        if (eax_65 != 0)
            class cocos2d::Size* eax_66
            cocos2d::Size* ecx_68
            eax_66, ecx_68 = (*(*eax_65 + 0xa8))()
            int32_t var_130_42 = cocos2d::Size::Size(ecx_68, eax_66)
            (*(*eax_65 + 0x40))(232f / var_100)
            (*(*eax_65 + 0x4c))(&var_10c)
            (*(*ebx + 0xfc))(eax_65, 0)
        
        void* ecx_73 = &ebx[0xcc]
        int32_t esi_10 = 0
        uint32_t edx_29 = 0x67 u>> 2
        
        if (ecx_73 u> ecx_73 + 0x64)
            edx_29 = 0
        
        if (edx_29 != 0)
            do
                esi_10 += 1
                *ecx_73 = 0
                ecx_73 += 4
            while (esi_10 != edx_29)
        
        void* ecx_74 = &ebx[0xfe]
        int32_t esi_11 = 0
        uint32_t edx_33 = 0x13 u>> 2
        
        if (ecx_74 u> ecx_74 + 0x10)
            edx_33 = 0
        
        if (edx_33 != 0)
            do
                esi_11 += 1
                *ecx_74 = 0
                ecx_74 += 4
            while (esi_11 != edx_33)
        
        void* ecx_75 = &ebx[0x102]
        int32_t esi_12 = 0
        uint32_t edx_37 = 0xf u>> 2
        
        if (ecx_75 u> ecx_75 + 0xc)
            edx_37 = 0
        
        if (edx_37 != 0)
            do
                esi_12 += 1
                *ecx_75 = 0
                ecx_75 += 4
            while (esi_12 != edx_37)
        
        void* ecx_76 = &ebx[0x105]
        int32_t esi_13 = 0
        uint32_t edx_41 = 0x13 u>> 2
        
        if (ecx_76 u> ecx_76 + 0x10)
            edx_41 = 0
        
        if (edx_41 != 0)
            do
                esi_13 += 1
                *ecx_76 = 0
                ecx_76 += 4
            while (esi_13 != edx_41)
        
        void* ecx_77 = &ebx[0x109]
        int32_t esi_14 = 0
        uint32_t edx_45 = 0xf u>> 2
        
        if (ecx_77 u> ecx_77 + 0xc)
            edx_45 = 0
        
        if (edx_45 != 0)
            do
                esi_14 += 1
                *ecx_77 = 0
                ecx_77 += 4
            while (esi_14 != edx_45)
        
        var_68 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_d660f835e836f221b5ce965f8d9a26eb>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        int32_t* var_64_1 = ebx
        void** var_58_1 = &var_68
        var_c_2.b = 0x15
        int32_t var_130_46 = 0x14
        char const* const var_134_27 = "images/up-pushed.png"
        int32_t var_b4_1 = 0xf
        int32_t var_b8_1 = 0
        char var_c8 = 0
        sub_401ae0(&var_c8, var_134_27, var_130_46)
        var_c_2.b = 0x16
        int32_t var_130_47 = 0xd
        char const* const var_134_28 = "images/up.png"
        int32_t var_6c_1 = 0xf
        int32_t var_70_1 = 0
        char var_80 = 0
        sub_401ae0(&var_80, var_134_28, var_130_47)
        float var_e8 = 75f
        float var_e4_1 = 1185f
        var_c_2.b = 0x18
        class cocos2d::MenuItemImage* eax_75 = cocos2d::MenuItemImage::create(&var_80, &var_c8, &var_68)
        class cocos2d::Size* eax_76
        cocos2d::Size* ecx_81
        eax_76, ecx_81 = (*(*eax_75 + 0xa8))()
        cocos2d::Size::Size(ecx_81, eax_76)
        (*(*eax_75 + 0x3c))(110f / var_10c, 110f / var_108_9)
        (*(*eax_75 + 0x4c))(&var_e8)
        
        if (var_6c_1 u>= 0x10)
            operator delete(var_80.d)
        
        int32_t var_6c_2 = 0xf
        int32_t var_70_2 = 0
        var_80 = 0
        
        if (var_b4_1 u>= 0x10)
            operator delete(var_c8.d)
        
        var_c_2.b = 0x12
        int32_t var_b4_2 = 0xf
        int32_t var_b8_2 = 0
        var_c8 = 0
        
        if (var_58_1 != 0)
            (*(*var_58_1 + 0x10))(var_58_1 != &var_68)
            int32_t var_58_2 = 0
        
        float var_fc
        char var_b0
        char var_98
        class cocos2d::Menu* eax_87
        
        if (data_42e4d5 != 0)
            int32_t var_130_66 = 0
            eax_87 = cocos2d::Menu::create(eax_75)
        else
            var_e0 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_63796c7637e299b80890a1721587d55e>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            int32_t* var_dc_1 = ebx
            void** var_d0_2 = &var_e0
            var_c_2.b = 0x1a
            int32_t var_130_55 = 0x17
            char const* const var_134_31 = "images/medal-ribbon.png"
            int32_t var_84_1 = 0xf
            int32_t var_88_1 = 0
            var_98 = 0
            sub_401ae0(&var_98, var_134_31, var_130_55)
            var_c_2.b = 0x1b
            int32_t var_130_56 = 0x17
            char const* const var_134_32 = "images/medal-ribbon.png"
            int32_t var_9c_1 = 0xf
            int32_t var_a0_1 = 0
            var_b0 = 0
            var_c_2.b = 0x1c
            int32_t eax_80 =
                cocos2d::Vec2::Vec2(sub_401ae0(&var_b0, var_134_32, var_130_56), 725f, 103.333336f)
            var_c_2.b = 0x1d
            class cocos2d::MenuItemImage* eax_81 =
                cocos2d::MenuItemImage::create(&var_b0, &var_98, &var_e0)
            var_114 = eax_81
            class cocos2d::Size* eax_82
            cocos2d::Size* ecx_89
            eax_82, ecx_89 = (*(*eax_81 + 0xa8))()
            cocos2d::Size::Size(ecx_89, eax_82)
            (*(*var_114 + 0x3c))(110f / var_100, 137.5f / var_fc)
            var_c_2.b = 0x1c
            cocos2d::Vec2::~Vec2((*(*var_114 + 0x4c))(eax_80))
            
            if (var_9c_1 u>= 0x10)
                operator delete(var_b0.d)
            
            int32_t var_9c_2 = 0xf
            int32_t var_a0_2 = 0
            var_b0 = 0
            
            if (var_84_1 u>= 0x10)
                operator delete(var_98.d)
            
            var_c_2.b = 0x12
            int32_t var_84_2 = 0xf
            int32_t var_88_2 = 0
            var_98 = 0
            
            if (var_d0_2 != 0)
                (*(*var_d0_2 + 0x10))(var_d0_2 != &var_e0)
                int32_t var_d0_3 = 0
            
            int32_t var_130_65 = 0
            class cocos2d::MenuItemImage* var_134_36 = var_114
            eax_87 = cocos2d::Menu::create(eax_75)
        
        (*(*eax_87 + 0x4c))(cocos2d::Vec2::ZERO)
        (*(*ebx + 0xfc))(eax_87, 3)
        int32_t* var_118_2 = &var_144
        int32_t var_130_69 = 0xf
        int32_t var_134_39 = 0
        var_144.b = 0
        var_c_2.b = 0x1e
        int32_t eax_90
        int32_t ecx_98
        eax_90, ecx_98 = cocos2d::Vec2::Vec2(sub_401ae0(&var_144, &data_41d780, 0), 725f, 113.333336f)
        int32_t edi_3 = eax_90
        var_c_2.b = 0x1f
        int32_t var_14c_12 = ecx_98
        ecx_98.w = *cocos2d::Color3B::BLACK
        eax_90.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_2.b = 0x20
        var_14c_12.w = ecx_98.w
        var_14c_12:2.b = eax_90.b
        class cocos2d::Label* eax_91
        cocos2d::Vec2* ecx_100
        eax_91, ecx_100 = sub_418fa0(eax_90, edi_3, ebx, 32f, var_14c_12, 4)
        ebx[0xc9] = eax_91
        var_c_2.b = 0x12
        cocos2d::Vec2::~Vec2(ecx_100)
        Concurrency::details::UMSFreeVirtualProcessorRoot::CreatePrimary(ebx)
        var_e0 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_9ee43744cbe314f01161fdd1e8c85e3c>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        int32_t* var_dc_2 = ebx
        void** var_d0_4 = &var_e0
        var_c_2.b = 0x22
        int32_t var_130_70 = 0x16
        char const* const var_134_40 = "images/undo-pushed.png"
        int32_t var_9c_3 = 0xf
        int32_t var_a0_3 = 0
        var_b0 = 0
        sub_401ae0(&var_b0, var_134_40, var_130_70)
        var_c_2.b = 0x23
        int32_t var_130_71 = 0xf
        char const* const var_134_41 = "images/undo.png"
        int32_t var_84_3 = 0xf
        int32_t var_88_3 = 0
        var_98 = 0
        var_c_2.b = 0x24
        int32_t eax_92 = cocos2d::Vec2::Vec2(sub_401ae0(&var_98, var_134_41, var_130_71), 750f, 590f)
        var_c_2.b = 0x25
        class cocos2d::MenuItemImage* eax_93 = cocos2d::MenuItemImage::create(&var_98, &var_b0, &var_e0)
        class cocos2d::Size* eax_94
        cocos2d::Size* ecx_106
        eax_94, ecx_106 = (*(*eax_93 + 0xa8))()
        cocos2d::Size::Size(ecx_106, eax_94)
        (*(*eax_93 + 0x3c))(75f / var_100, 75f / var_fc)
        var_c_2.b = 0x24
        cocos2d::Vec2::~Vec2((*(*eax_93 + 0x4c))(eax_92))
        
        if (var_84_3 u>= 0x10)
            operator delete(var_98.d)
        
        int32_t var_84_4 = 0xf
        int32_t var_88_4 = 0
        var_98 = 0
        
        if (var_9c_3 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_2.b = 0x12
        int32_t var_9c_4 = 0xf
        int32_t var_a0_4 = 0
        var_b0 = 0
        
        if (var_d0_4 != 0)
            (*(*var_d0_4 + 0x10))(var_d0_4 != &var_e0)
            int32_t var_d0_5 = 0
        
        class cocos2d::Menu* eax_98
        
        if (data_42e4d5 != 0)
            var_68 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_9ea0d7cf0aabb0107edfb9e8994aafbb>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            int32_t* var_64_2 = ebx
            void** var_58_3 = &var_68
            var_c_2.b = 0x27
            int32_t var_130_81 = 0x16
            char const* const var_134_46 = "images/redo-pushed.png"
            int32_t var_6c_3 = 0xf
            int32_t var_70_3 = 0
            var_80 = 0
            sub_401ae0(&var_80, var_134_46, var_130_81)
            var_c_2.b = 0x28
            int32_t var_130_82 = 0xf
            char const* const var_134_47 = "images/redo.png"
            int32_t var_b4_3 = 0xf
            int32_t var_b8_3 = 0
            var_c8 = 0
            var_c_2.b = 0x29
            int32_t eax_99 =
                cocos2d::Vec2::Vec2(sub_401ae0(&var_c8, var_134_47, var_130_82), 750f, 490f)
            var_c_2.b = 0x2a
            class cocos2d::MenuItemImage* eax_100 =
                cocos2d::MenuItemImage::create(&var_c8, &var_80, &var_68)
            var_114 = eax_100
            class cocos2d::Size* eax_101
            cocos2d::Size* ecx_115
            eax_101, ecx_115 = (*(*eax_100 + 0xa8))()
            cocos2d::Size::Size(ecx_115, eax_101)
            (*(*var_114 + 0x3c))(75f / var_e8, 75f / var_e4_1)
            var_c_2.b = 0x29
            cocos2d::Vec2::~Vec2((*(*var_114 + 0x4c))(eax_99))
            
            if (var_b4_3 u>= 0x10)
                operator delete(var_c8.d)
            
            int32_t var_b4_4 = 0xf
            int32_t var_b8_4 = 0
            var_c8 = 0
            
            if (var_6c_3 u>= 0x10)
                operator delete(var_80.d)
            
            var_c_2.b = 0x12
            int32_t var_6c_4 = 0xf
            int32_t var_70_4 = 0
            var_80 = 0
            
            if (var_58_3 != 0)
                (*(*var_58_3 + 0x10))(var_58_3 != &var_68)
                int32_t var_58_4 = 0
            
            int32_t var_130_91 = 0
            class cocos2d::MenuItemImage* var_134_51 = var_114
            eax_98 = cocos2d::Menu::create(eax_93)
        else
            int32_t var_130_80 = 0
            eax_98 = cocos2d::Menu::create(eax_93)
        
        ebx[0x113] = eax_98
        (*(*eax_98 + 0x4c))(cocos2d::Vec2::ZERO)
        (*(*ebx + 0xfc))(ebx[0x113], 3)
        int32_t var_cc_2 = 0xf
        int32_t var_d0_6 = 0
        var_e0.b = 0
        var_c_2.b = 0x2b
        int32_t eax_108 =
            cocos2d::Vec2::Vec2(sub_401ae0(&var_e0, "images/silver_coin.png", 0x16), 750f, 690f)
        var_c_2.b = 0x2c
        class cocos2d::Sprite* eax_109
        cocos2d::Vec2* ecx_124
        eax_109, ecx_124 = cocos2d::Sprite::create(&var_e0)
        
        if (eax_109 != 0)
            class cocos2d::Size* eax_111
            cocos2d::Size* ecx_126
            eax_111, ecx_126 = (*(*eax_109 + 0xa8))()
            int32_t var_130_98 = cocos2d::Size::Size(ecx_126, eax_111)
            float var_f8
            (*(*eax_109 + 0x40))(75f / var_f8)
            (*(*eax_109 + 0x4c))(eax_108)
            ecx_124 = (*(*ebx + 0xfc))(eax_109, 0)
        
        ebx[0x112] = eax_109
        var_c_2.b = 0x2b
        cocos2d::Vec2::~Vec2(ecx_124)
        var_c_2.b = 0x12
        
        if (var_cc_2 u>= 0x10)
            operator delete(var_e0)
        
        int32_t* var_104_2 = &var_144
        var_c_2.b = 0x2d
        int32_t eax_117
        int32_t ecx_134
        eax_117, ecx_134 =
            cocos2d::Vec2::Vec2(sub_401f70(&var_144, (*(*eax_5 + 4))("nCoin", 0xa)), 750f, 690f)
        int32_t edi_5 = eax_117
        var_c_2.b = 0x2e
        int32_t var_14c_13 = ecx_134
        ecx_134.w = *cocos2d::Color3B::BLACK
        eax_117.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_2.b = 0x2f
        var_14c_13.w = ecx_134.w
        var_14c_13:2.b = eax_117.b
        class cocos2d::Label* eax_118
        cocos2d::Vec2* ecx_136
        eax_118, ecx_136 = sub_418fa0(eax_117, edi_5, ebx, 32f, var_14c_13, 0)
        ebx[0xcb] = eax_118
        var_c_2.b = 0x12
        cocos2d::Vec2::~Vec2(ecx_136)
        class cocos2d::EventListenerTouchOneByOne* edi_6 = cocos2d::EventListenerTouchOneByOne::create()
        int32_t* ecx_137 = *(edi_6 + 0x70)
        class cocos2d::EventListenerTouchOneByOne* eax_119
        
        if (ecx_137 != 0)
            eax_119.b = ecx_137 != edi_6 + 0x60
            (*(*ecx_137 + 0x10))(zx.d(eax_119.b))
            *(edi_6 + 0x70) = 0
        
        *(edi_6 + 0x60) = &std::_Func_impl<struct std::_Callable_obj<class <lambda_321a07a072190774afde8c92ac9a7b40>,0>,class std::allocator<class std::_Func_class<bool,class cocos2d::Touch*,class cocos2d::Event*> >,bool,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<bool, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(edi_6 + 0x64) = ebx
        *(edi_6 + 0x70) = edi_6 + 0x60
        int32_t* ecx_138 = *(edi_6 + 0x88)
        
        if (ecx_138 != 0)
            eax_119.b = ecx_138 != edi_6 + 0x78
            (*(*ecx_138 + 0x10))(zx.d(eax_119.b))
            *(edi_6 + 0x88) = 0
        
        *(edi_6 + 0x78) = &std::_Func_impl<struct std::_Callable_obj<class <lambda_43456d18b6bcbd0926cdf2a492b60d3c>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(edi_6 + 0x7c) = ebx
        *(edi_6 + 0x88) = edi_6 + 0x78
        int32_t* ecx_139 = *(edi_6 + 0xa0)
        
        if (ecx_139 != 0)
            eax_119.b = ecx_139 != edi_6 + 0x90
            (*(*ecx_139 + 0x10))(zx.d(eax_119.b))
            *(edi_6 + 0xa0) = 0
        
        *(edi_6 + 0x90) = &std::_Func_impl<struct std::_Callable_obj<class <lambda_4da6242eda9a9ae9ee550b6972369155>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(edi_6 + 0x94) = ebx
        *(edi_6 + 0xa0) = edi_6 + 0x90
        cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority((*(*ebx + 0x1b4))(edi_6, ebx))
        class cocos2d::EventListener* eax_125 = cocos2d::EventListenerKeyboard::create()
        int32_t* ecx_142 = *(eax_125 + 0x88)
        class cocos2d::EventListener* var_104_3 = eax_125
        void* __offset(cocos2d::EventListener, 0x78) esi_24 = eax_125 + 0x78
        
        if (ecx_142 != 0)
            eax_125.b = ecx_142 != esi_24
            (*(*ecx_142 + 0x10))(zx.d(eax_125.b))
            eax_125 = var_104_3
            *(esi_24 + 0x10) = 0
        
        *esi_24 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_de3170ebcbad532bd8a5fb3ce7f541cf>,0>,class std::allocator<class std::_Func_class<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*> >,void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>'}
        *(esi_24 + 4) = ebx
        *(esi_24 + 0x10) = esi_24
        cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority(ebx[0x77], eax_125, ebx)
        sub_406f90(ebx)
        sub_4067d0(ebx)
        int32_t ecx_147 = cocos2d::Node::scheduleUpdate(ebx)
        
        if (var_20_1 u>= 0x10)
            ecx_147 = operator delete(var_34.d)
        
        int32_t var_20_2 = 0xf
        int32_t var_24_2 = 0
        var_34 = 0
        
        if (var_38_1 u>= 0x10)
            int32_t var_130_111 = ecx_147
            sub_401d40(var_4c.d)
        
        int32_t var_38_2 = 0xf
        sub_401ab0(&var_4c, 0)
        result = true
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_11c)
    return result
}
