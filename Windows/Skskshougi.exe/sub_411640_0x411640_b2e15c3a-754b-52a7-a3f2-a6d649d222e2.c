// ============================================================
// 函数名称: sub_411640
// 虚拟地址: 0x411640
// WARP GUID: b2e15c3a-754b-52a7-a3f2-a6d649d222e2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_414200, sub_418fa0, sub_401900, sub_415820, sub_40cf60, ?OnAsanReport@__vcasan@@YAXPBD0_N@Z, sub_4199b8, sub_418ed0, sub_418e20
// [被调用的父级函数]: 无
// ============================================================

bool __fastcallsub_411640(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41b8d4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    class cocos2d::Sprite* var_16c
    int32_t var_1c = __security_cookie ^ &var_16c
    int32_t ebx
    int32_t var_170 = ebx
    int32_t esi
    int32_t var_174 = esi
    float edi
    float var_178 = edi
    float var_17c = __security_cookie ^ &var_178
    int32_t* esp = &var_17c
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* edi_1 = arg1
    bool result = cocos2d::Layer::init(arg1)
    
    if (result != 0)
        data_42e4d0 = edi_1
        class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
        int32_t var_180_1 = 0
        char const* const var_184 = "difficulty"
        data_42e4d8 = (*(*eax_5 + 4))(var_184, var_180_1)
        char eax_7
        cocos2d::Color4B* ecx_1
        eax_7, ecx_1 = std::_Random_device()
        data_42e4d4 = (eax_7 ^ 0xff) & 1
        int32_t var_180_2 = 0x44a00000
        var_184 = 0x44480000
        uint8_t var_188_1 = -1
        uint8_t var_18c_1 = 0x75
        uint8_t var_190_1 = -0x19
        class std::string* var_194 = 0xdc
        edi_1[0xa9].b = 0
        edi_1[0xb1] = 0
        class cocos2d::LayerColor* eax_9 = cocos2d::LayerColor::create(
            cocos2d::Color4B::Color4B(ecx_1, var_194.b, var_190_1, var_18c_1, var_188_1), var_17c, 
            var_178)
        var_178 = 0f
        int32_t edx_2 = *eax_9
        var_17c = 0f
        (*(edx_2 + 0x48))(var_17c, var_178)
        (*(*edi_1 + 0x100))(eax_9)
        int32_t eax_11 = data_42e4d8
        int32_t var_b4_1 = 0xf
        int32_t var_b8_1 = 0
        char var_c8 = 0
        char* edx_3 = (&data_41d8a4)[eax_11]
        void* ecx_4
        
        if (*edx_3 != 0)
            char* ecx_5 = edx_3
            
            do
                eax_11.b = *ecx_5
                ecx_5 = &ecx_5[1]
            while (eax_11.b != 0)
            
            ecx_4 = ecx_5 - &ecx_5[1]
        else
            ecx_4 = nullptr
        
        var_184 = edx_3
        sub_401ae0(&var_c8, var_184, ecx_4)
        int32_t var_c_1 = 0
        int32_t var_180_6 = 5
        var_184 = "Arial"
        int32_t var_114_1 = 0xf
        int32_t var_118_1 = 0
        char var_128 = 0
        int32_t ecx_8 = sub_401ae0(&var_128, var_184, var_180_6)
        enum cocos2d::TextVAlignment var_180_7 = 0
        var_184 = nullptr
        var_c_1.b = 1
        class cocos2d::Size const* const var_188_2 = cocos2d::Size::ZERO
        int32_t var_18c_2 = ecx_8
        float var_18c_3 = 72f
        class std::string* var_190_2 = &var_128
        var_194 = &var_c8
        var_c_1.b = 0
        edi_1[0xad] = cocos2d::Label::createWithSystemFont(var_194, var_190_2, var_18c_3, var_188_2, 
            var_184, var_180_7)
        
        if (var_114_1 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t eax_13 = *edi_1[0xad]
        int32_t var_180_9 = 0x44961aab
        var_184 = 0x43c80000
        (*(eax_13 + 0x48))(var_184, var_180_9)
        (*(*edi_1[0xad] + 0x24c))(cocos2d::Color3B::BLACK)
        int32_t eax_15 = *edi_1
        int32_t var_180_11 = 0xa
        var_184 = edi_1[0xad]
        (*(eax_15 + 0xfc))(var_184, var_180_11)
        int32_t var_180_12 = 5
        var_184 = "Arial"
        int32_t var_114_2 = 0xf
        int32_t var_118_2 = 0
        var_128 = 0
        sub_401ae0(&var_128, var_184, var_180_12)
        var_c_1.b = 2
        int32_t var_180_13 = 0x27
        var_184 = &data_41f7d0
        int32_t var_fc_1 = 0xf
        int32_t var_100_1 = 0
        char var_110 = 0
        int32_t ecx_14 = sub_401ae0(&var_110, var_184, var_180_13)
        enum cocos2d::TextVAlignment var_180_14 = 0
        var_184 = nullptr
        var_c_1.b = 3
        class cocos2d::Size const* const var_188_3 = cocos2d::Size::ZERO
        int32_t var_18c_4 = ecx_14
        float var_18c_5 = 32f
        class std::string* var_190_3 = &var_128
        var_194 = &var_110
        class cocos2d::Label* eax_16 = cocos2d::Label::createWithSystemFont(var_194, var_190_3, 
            var_18c_5, var_188_3, var_184, var_180_14)
        
        if (var_fc_1 u>= 0x10)
            operator delete(var_110.d)
        
        var_c_1.b = 0
        int32_t var_fc_2 = 0xf
        int32_t var_100_2 = 0
        var_110 = 0
        
        if (var_114_2 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_3 = 0xf
        int32_t var_118_3 = 0
        var_128 = 0
        int32_t eax_17 = *eax_16
        int32_t var_180_17 = 0x44855555
        var_184 = 0x43c80000
        (*(eax_17 + 0x48))(var_184, var_180_17)
        (*(*eax_16 + 0x24c))(cocos2d::Color3B::BLACK)
        int32_t eax_19 = *edi_1
        int32_t var_180_19 = 0xa
        var_184 = eax_16
        int32_t var_180_20 = (*(eax_19 + 0xfc))(var_184, var_180_19)
        cocos2d::Color3B* ecx_20 = sub_415820(&edi_1[0xb2])
        uint8_t var_180_21 = 0x33
        var_184 = 0xca
        char* ecx_21 = cocos2d::Color3B::Color3B(ecx_20, -0x40, var_184.b, var_180_21)
        class std::string** var_168 = 0x43055555
        int32_t var_164_1 = 0x44610000
        int32_t var_180_22 = 0
        var_184 = ecx_21
        var_c_1.b = 4
        class cocos2d::Sprite** esi_4 = edi_1[0xb2]
        var_184 = nullptr
        void var_14c
        class cocos2d::Sprite* eax_21
        char* ecx_23
        eax_21, ecx_23 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_22)
        *esi_4 = eax_21
        var_168 = 0x43c80000
        int32_t var_164_2 = 0x44610000
        int32_t var_180_23 = 0
        var_184 = ecx_23
        var_c_1.b = 5
        void* esi_5 = edi_1[0xb2]
        var_184 = nullptr
        class cocos2d::Sprite* eax_23
        char* ecx_25
        eax_23, ecx_25 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_23)
        *(esi_5 + 4) = eax_23
        var_168 = 0x4426aaab
        int32_t var_164_3 = 0x44610000
        int32_t var_180_24 = 0
        var_184 = ecx_25
        var_c_1.b = 6
        void* esi_6 = edi_1[0xb2]
        var_184 = nullptr
        class cocos2d::Sprite* eax_25
        char* ecx_27
        eax_25, ecx_27 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_24)
        *(esi_6 + 8) = eax_25
        var_168 = 0x43055555
        int32_t var_164_4 = 0x441e5555
        int32_t var_180_25 = 0
        var_c_1.b = 7
        void* esi_7 = edi_1[0xb2]
        var_184 = ecx_27
        var_184 = nullptr
        class cocos2d::Sprite* eax_27
        char* ecx_29
        eax_27, ecx_29 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_25)
        *(esi_7 + 0xc) = eax_27
        var_168 = 0x43c80000
        int32_t var_164_5 = 0x441e5555
        int32_t var_180_26 = 0
        var_184 = ecx_29
        var_c_1.b = 8
        void* esi_8 = edi_1[0xb2]
        var_184 = nullptr
        class cocos2d::Sprite* eax_29
        char* ecx_31
        eax_29, ecx_31 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_26)
        *(esi_8 + 0x10) = eax_29
        var_168 = 0x4426aaab
        int32_t var_164_6 = 0x441e5555
        int32_t var_180_27 = 0
        var_184 = ecx_31
        var_c_1.b = 9
        void* esi_9 = edi_1[0xb2]
        var_184 = nullptr
        class cocos2d::Sprite* eax_31
        char* ecx_33
        eax_31, ecx_33 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_27)
        *(esi_9 + 0x14) = eax_31
        var_168 = 0x43055555
        int32_t var_164_7 = 0x43b75555
        int32_t var_180_28 = 0
        var_184 = ecx_33
        var_c_1.b = 0xa
        void* esi_10 = edi_1[0xb2]
        var_184 = nullptr
        class cocos2d::Sprite* eax_33
        char* ecx_35
        eax_33, ecx_35 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_28)
        *(esi_10 + 0x18) = eax_33
        var_168 = 0x43c80000
        int32_t var_164_8 = 0x43b75555
        int32_t var_180_29 = 0
        var_184 = ecx_35
        var_c_1.b = 0xb
        void* esi_11 = edi_1[0xb2]
        var_184 = nullptr
        class cocos2d::Sprite* eax_35
        char* ecx_37
        eax_35, ecx_37 = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_29)
        *(esi_11 + 0x1c) = eax_35
        var_168 = 0x4426aaab
        int32_t var_164_9 = 0x43b75555
        int32_t var_180_30 = 0
        var_c_1.b = 0xc
        void* esi_12 = edi_1[0xb2]
        var_184 = ecx_37
        var_184 = nullptr
        *(esi_12 + 0x20) = sub_418ed0(&var_168, &var_14c, edi_1, 240f, &var_168, var_184, var_180_30)
        var_c_1.b = 0
        sub_415820(&edi_1[0xb5])
        int32_t var_114_4 = 0xf
        int32_t var_118_4 = 0
        var_128 = 0
        char const* const ecx_41 = "images/girl-1.png"
        char const i
        
        do
            i = *ecx_41
            ecx_41 = &ecx_41[1]
        while (i != 0)
        var_184 = "images/girl-1.png"
        sub_401ae0(&var_128, var_184, ecx_41 - "mages/girl-1.png")
        float var_158 = 120f
        int32_t var_154_1 = 0x42f00000
        var_c_1.b = 0xe
        void* esi_13 = &edi_1[0xb2]
        var_168 = **esi_13
        class cocos2d::Sprite* eax_40 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_40
        float var_160
        
        if (eax_40 != 0)
            class cocos2d::Size* eax_42
            cocos2d::Size* ecx_44
            eax_42, ecx_44 = (*(*eax_40 + 0xa8))()
            cocos2d::Size::Size(ecx_44, eax_42)
            class cocos2d::Sprite* ecx_45 = var_16c
            class cocos2d::Sprite* var_180_34 = ecx_45
            (*(*ecx_45 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_47 = var_168
            int32_t var_180_37 = 0
            var_184 = var_16c
            (*(*ecx_47 + 0xfc))(var_184, var_180_37)
        else
            var_16c = eax_40
        
        var_c_1.b = 0
        *edi_1[0xb5] = var_16c
        
        if (var_114_4 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_5 = 0xf
        int32_t var_118_5 = 0
        var_128 = 0
        char const* const ecx_50 = "images/girl-2.png"
        var_168 = "mages/girl-2.png"
        char const i_1
        
        do
            i_1 = *ecx_50
            ecx_50 = &ecx_50[1]
        while (i_1 != 0)
        void* ecx_49 = ecx_50 - var_168
        var_184 = "images/girl-2.png"
        sub_401ae0(&var_128, var_184, ecx_49)
        var_158 = 120f
        int32_t var_154_2 = 0x42f00000
        var_c_1.b = 0x10
        var_168 = *(*esi_13 + 4)
        class cocos2d::Sprite* eax_49 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_49
        
        if (eax_49 != 0)
            class cocos2d::Size* eax_51
            cocos2d::Size* ecx_53
            eax_51, ecx_53 = (*(*eax_49 + 0xa8))()
            cocos2d::Size::Size(ecx_53, eax_51)
            class cocos2d::Sprite* ecx_54 = var_16c
            class cocos2d::Sprite* var_180_42 = ecx_54
            (*(*ecx_54 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_56 = var_168
            int32_t var_180_45 = 0
            var_184 = var_16c
            (*(*ecx_56 + 0xfc))(var_184, var_180_45)
        else
            var_16c = eax_49
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 4) = var_16c
        
        if (var_114_5 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_6 = 0xf
        int32_t var_118_6 = 0
        var_128 = 0
        char const* const ecx_59 = "images/girl-3.png"
        var_168 = "mages/girl-3.png"
        char const i_2
        
        do
            i_2 = *ecx_59
            ecx_59 = &ecx_59[1]
        while (i_2 != 0)
        void* ecx_58 = ecx_59 - var_168
        var_184 = "images/girl-3.png"
        sub_401ae0(&var_128, var_184, ecx_58)
        var_158 = 120f
        int32_t var_154_3 = 0x42f00000
        var_c_1.b = 0x12
        var_168 = *(*esi_13 + 8)
        class cocos2d::Sprite* eax_58 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_58
        
        if (eax_58 != 0)
            class cocos2d::Size* eax_60
            cocos2d::Size* ecx_62
            eax_60, ecx_62 = (*(*eax_58 + 0xa8))()
            cocos2d::Size::Size(ecx_62, eax_60)
            class cocos2d::Sprite* ecx_63 = var_16c
            class cocos2d::Sprite* var_180_50 = ecx_63
            (*(*ecx_63 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_65 = var_168
            int32_t var_180_53 = 0
            var_184 = var_16c
            (*(*ecx_65 + 0xfc))(var_184, var_180_53)
        else
            var_16c = eax_58
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 8) = var_16c
        
        if (var_114_6 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_7 = 0xf
        int32_t var_118_7 = 0
        var_128 = 0
        char const* const ecx_68 = "images/girl-4.png"
        var_168 = "mages/girl-4.png"
        char const i_3
        
        do
            i_3 = *ecx_68
            ecx_68 = &ecx_68[1]
        while (i_3 != 0)
        void* ecx_67 = ecx_68 - var_168
        var_184 = "images/girl-4.png"
        sub_401ae0(&var_128, var_184, ecx_67)
        var_158 = 120f
        int32_t var_154_4 = 0x42f00000
        var_c_1.b = 0x14
        var_168 = *(*esi_13 + 0xc)
        class cocos2d::Sprite* eax_67 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_67
        
        if (eax_67 != 0)
            class cocos2d::Size* eax_69
            cocos2d::Size* ecx_71
            eax_69, ecx_71 = (*(*eax_67 + 0xa8))()
            cocos2d::Size::Size(ecx_71, eax_69)
            class cocos2d::Sprite* ecx_72 = var_16c
            class cocos2d::Sprite* var_180_58 = ecx_72
            (*(*ecx_72 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_74 = var_168
            int32_t var_180_61 = 0
            var_184 = var_16c
            (*(*ecx_74 + 0xfc))(var_184, var_180_61)
        else
            var_16c = eax_67
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 0xc) = var_16c
        
        if (var_114_7 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_8 = 0xf
        int32_t var_118_8 = 0
        var_128 = 0
        char const* const ecx_77 = "images/girl-5.png"
        var_168 = "mages/girl-5.png"
        char const i_4
        
        do
            i_4 = *ecx_77
            ecx_77 = &ecx_77[1]
        while (i_4 != 0)
        void* ecx_76 = ecx_77 - var_168
        var_184 = "images/girl-5.png"
        sub_401ae0(&var_128, var_184, ecx_76)
        var_158 = 120f
        int32_t var_154_5 = 0x42f00000
        var_c_1.b = 0x16
        var_168 = *(*esi_13 + 0x10)
        class cocos2d::Sprite* eax_76 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_76
        
        if (eax_76 != 0)
            class cocos2d::Size* eax_78
            cocos2d::Size* ecx_80
            eax_78, ecx_80 = (*(*eax_76 + 0xa8))()
            cocos2d::Size::Size(ecx_80, eax_78)
            class cocos2d::Sprite* ecx_81 = var_16c
            class cocos2d::Sprite* var_180_66 = ecx_81
            (*(*ecx_81 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_83 = var_168
            int32_t var_180_69 = 0
            var_184 = var_16c
            (*(*ecx_83 + 0xfc))(var_184, var_180_69)
        else
            var_16c = eax_76
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 0x10) = var_16c
        
        if (var_114_8 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_9 = 0xf
        int32_t var_118_9 = 0
        var_128 = 0
        char const* const ecx_86 = "images/girl-6.png"
        var_168 = "mages/girl-6.png"
        char const i_5
        
        do
            i_5 = *ecx_86
            ecx_86 = &ecx_86[1]
        while (i_5 != 0)
        void* ecx_85 = ecx_86 - var_168
        var_184 = "images/girl-6.png"
        sub_401ae0(&var_128, var_184, ecx_85)
        var_158 = 120f
        int32_t var_154_6 = 0x42f00000
        var_c_1.b = 0x18
        var_168 = *(*esi_13 + 0x14)
        class cocos2d::Sprite* eax_85 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_85
        
        if (eax_85 != 0)
            class cocos2d::Size* eax_87
            cocos2d::Size* ecx_89
            eax_87, ecx_89 = (*(*eax_85 + 0xa8))()
            cocos2d::Size::Size(ecx_89, eax_87)
            class cocos2d::Sprite* ecx_90 = var_16c
            class cocos2d::Sprite* var_180_74 = ecx_90
            (*(*ecx_90 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_92 = var_168
            int32_t var_180_77 = 0
            var_184 = var_16c
            (*(*ecx_92 + 0xfc))(var_184, var_180_77)
        else
            var_16c = eax_85
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 0x14) = var_16c
        
        if (var_114_9 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_10 = 0xf
        int32_t var_118_10 = 0
        var_128 = 0
        char const* const ecx_95 = "images/girl-7.png"
        var_168 = "mages/girl-7.png"
        char const i_6
        
        do
            i_6 = *ecx_95
            ecx_95 = &ecx_95[1]
        while (i_6 != 0)
        void* ecx_94 = ecx_95 - var_168
        var_184 = "images/girl-7.png"
        sub_401ae0(&var_128, var_184, ecx_94)
        var_158 = 120f
        int32_t var_154_7 = 0x42f00000
        var_c_1.b = 0x1a
        var_168 = *(*esi_13 + 0x18)
        class cocos2d::Sprite* eax_94 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_94
        
        if (eax_94 != 0)
            class cocos2d::Size* eax_96
            cocos2d::Size* ecx_98
            eax_96, ecx_98 = (*(*eax_94 + 0xa8))()
            cocos2d::Size::Size(ecx_98, eax_96)
            class cocos2d::Sprite* ecx_99 = var_16c
            class cocos2d::Sprite* var_180_82 = ecx_99
            (*(*ecx_99 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_101 = var_168
            int32_t var_180_85 = 0
            var_184 = var_16c
            (*(*ecx_101 + 0xfc))(var_184, var_180_85)
        else
            var_16c = eax_94
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 0x18) = var_16c
        
        if (var_114_10 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_11 = 0xf
        int32_t var_118_11 = 0
        var_128 = 0
        char const* const ecx_104 = "images/girl-8.png"
        var_168 = "mages/girl-8.png"
        char const i_7
        
        do
            i_7 = *ecx_104
            ecx_104 = &ecx_104[1]
        while (i_7 != 0)
        void* ecx_103 = ecx_104 - var_168
        var_184 = "images/girl-8.png"
        sub_401ae0(&var_128, var_184, ecx_103)
        var_158 = 120f
        int32_t var_154_8 = 0x42f00000
        var_c_1.b = 0x1c
        var_168 = *(*esi_13 + 0x1c)
        class cocos2d::Sprite* eax_103 = cocos2d::Sprite::create(&var_128)
        var_16c = eax_103
        
        if (eax_103 != 0)
            class cocos2d::Size* eax_105
            cocos2d::Size* ecx_107
            eax_105, ecx_107 = (*(*eax_103 + 0xa8))()
            cocos2d::Size::Size(ecx_107, eax_105)
            class cocos2d::Sprite* ecx_108 = var_16c
            class cocos2d::Sprite* var_180_90 = ecx_108
            (*(*ecx_108 + 0x40))(213.333328f / var_160)
            (*(*var_16c + 0x4c))(&var_158)
            class std::string** ecx_110 = var_168
            int32_t var_180_93 = 0
            var_184 = var_16c
            (*(*ecx_110 + 0xfc))(var_184, var_180_93)
        else
            var_16c = eax_103
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 0x1c) = var_16c
        
        if (var_114_11 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_12 = 0xf
        int32_t var_118_12 = 0
        var_128 = 0
        char const* const ecx_113 = "images/girl-9.png"
        var_168 = "mages/girl-9.png"
        char const i_8
        
        do
            i_8 = *ecx_113
            ecx_113 = &ecx_113[1]
        while (i_8 != 0)
        void* ecx_112 = ecx_113 - var_168
        var_184 = "images/girl-9.png"
        sub_401ae0(&var_128, var_184, ecx_112)
        var_158 = 120f
        int32_t var_154_9 = 0x42f00000
        var_c_1.b = 0x1e
        var_168 = *(*esi_13 + 0x20)
        class cocos2d::Sprite* eax_112
        int32_t ecx_115
        eax_112, ecx_115 = cocos2d::Sprite::create(&var_128)
        
        if (eax_112 != 0)
            class cocos2d::Size* eax_114
            cocos2d::Size* ecx_117
            eax_114, ecx_117 = (*(*eax_112 + 0xa8))()
            int32_t var_180_98 = cocos2d::Size::Size(ecx_117, eax_114)
            (*(*eax_112 + 0x40))(213.333328f / var_160)
            (*(*eax_112 + 0x4c))(&var_158)
            class std::string** ecx_121 = var_168
            int32_t var_180_101 = 0
            var_184 = eax_112
            ecx_115 = (*(*ecx_121 + 0xfc))(var_184, var_180_101)
        
        var_c_1.b = 0
        *(edi_1[0xb5] + 0x20) = eax_112
        
        if (var_114_12 u>= 0x10)
            ecx_115 = operator delete(var_128.d)
        
        int32_t var_180_103 = ecx_115
        sub_415820(&edi_1[0xbb])
        int32_t var_180_104 = 0xf
        var_184 = nullptr
        var_194.b = 0
        int32_t ecx_124 = sub_401ae0(&var_194, 0x41e0cc, 1)
        var_158 = 133.333328f
        int32_t var_154_10 = 0x443faaab
        var_c_1.b = 0x1f
        int32_t var_19c_1 = ecx_124
        var_19c_1.w = *cocos2d::Color3B::BLACK
        uint32_t eax_119
        eax_119.b = *(cocos2d::Color3B::BLACK + 2)
        var_19c_1:2.b = eax_119.b
        var_c_1.b = 0
        *edi_1[0xbb] = sub_418fa0(eax_119, &var_158, edi_1, 20f, var_19c_1, 2)
        int32_t var_180_105 = 0xf
        var_184 = nullptr
        var_194.b = 0
        int32_t ecx_128 = sub_401ae0(&var_194, 0x41e0cc, 1)
        var_158 = 400f
        int32_t var_154_11 = 0x443faaab
        var_c_1.b = 0x20
        int32_t var_19c_2 = ecx_128
        var_19c_2.w = *cocos2d::Color3B::BLACK
        uint32_t eax_121
        eax_121.b = *(cocos2d::Color3B::BLACK + 2)
        var_19c_2:2.b = eax_121.b
        var_c_1.b = 0
        *(edi_1[0xbb] + 4) = sub_418fa0(eax_121, &var_158, edi_1, 20f, var_19c_2, 2)
        int32_t var_180_106 = 0xf
        var_184 = nullptr
        var_194.b = 0
        int32_t ecx_132 = sub_401ae0(&var_194, 0x41e0cc, 1)
        var_158 = 666.666687f
        int32_t var_154_12 = 0x443faaab
        var_c_1.b = 0x21
        int32_t var_19c_3 = ecx_132
        var_19c_3.w = *cocos2d::Color3B::BLACK
        uint32_t eax_123
        eax_123.b = *(cocos2d::Color3B::BLACK + 2)
        var_19c_3:2.b = eax_123.b
        var_c_1.b = 0
        *(edi_1[0xbb] + 8) = sub_418fa0(eax_123, &var_158, edi_1, 20f, var_19c_3, 2)
        int32_t var_180_107 = 0xf
        var_184 = nullptr
        var_194.b = 0
        int32_t ecx_136 = sub_401ae0(&var_194, 0x41e0cc, 1)
        var_158 = 133.333328f
        float var_154_13 = 500f
        var_c_1.b = 0x22
        int32_t var_19c_4 = ecx_136
        var_19c_4.w = *cocos2d::Color3B::BLACK
        uint32_t eax_125
        eax_125.b = *(cocos2d::Color3B::BLACK + 2)
        var_19c_4:2.b = eax_125.b
        class cocos2d::Label* eax_126 = sub_418fa0(eax_125, &var_158, edi_1, 20f, var_19c_4, 2)
        void* ecx_138 = edi_1[0xbb]
        var_c_1.b = 0
        var_168 = &var_194
        *(ecx_138 + 0xc) = eax_126
        int32_t var_180_108 = 0xf
        var_184 = nullptr
        var_194.b = 0
        var_c_1.b = 0x23
        int32_t eax_127
        int32_t ecx_141
        eax_127, ecx_141 = cocos2d::Vec2::Vec2(sub_401ae0(&var_194, 0x41e0cc, 1), 400f, 500f)
        int32_t edi_2 = eax_127
        var_c_1.b = 0x24
        int32_t var_19c_5 = ecx_141
        eax_127.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x25
        var_19c_5.w = *cocos2d::Color3B::BLACK
        var_19c_5:2.b = eax_127.b
        class cocos2d::Label* eax_128 = sub_418fa0(eax_127, edi_2, edi_1, 20f, var_19c_5, 2)
        cocos2d::Vec2* ecx_144 = edi_1[0xbb]
        var_c_1.b = 0
        *(ecx_144 + 0x10) = eax_128
        cocos2d::Vec2::~Vec2(ecx_144)
        var_168 = &var_194
        int32_t var_180_109 = 0xf
        var_184 = nullptr
        var_194.b = 0
        var_c_1.b = 0x26
        int32_t eax_129
        int32_t ecx_147
        eax_129, ecx_147 = cocos2d::Vec2::Vec2(sub_401ae0(&var_194, 0x41e0cc, 1), 666.666687f, 500f)
        int32_t edi_3 = eax_129
        var_c_1.b = 0x27
        int32_t var_19c_6 = ecx_147
        eax_129.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x28
        var_19c_6.w = *cocos2d::Color3B::BLACK
        var_19c_6:2.b = eax_129.b
        class cocos2d::Label* eax_130 = sub_418fa0(eax_129, edi_3, edi_1, 20f, var_19c_6, 2)
        cocos2d::Vec2* ecx_150 = edi_1[0xbb]
        var_c_1.b = 0
        *(ecx_150 + 0x14) = eax_130
        cocos2d::Vec2::~Vec2(ecx_150)
        var_168 = &var_194
        var_c_1.b = 0x29
        int32_t eax_131
        int32_t ecx_153
        eax_131, ecx_153 = cocos2d::Vec2::Vec2(sub_401900(&var_194, U"R"), 133.333328f, 233.333328f)
        int32_t edi_4 = eax_131
        var_c_1.b = 0x2a
        int32_t var_19c_7 = ecx_153
        eax_131.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x2b
        var_19c_7.w = *cocos2d::Color3B::BLACK
        var_19c_7:2.b = eax_131.b
        class cocos2d::Label* eax_132 = sub_418fa0(eax_131, edi_4, edi_1, 20f, var_19c_7, 2)
        cocos2d::Vec2* ecx_156 = edi_1[0xbb]
        var_c_1.b = 0
        *(ecx_156 + 0x18) = eax_132
        cocos2d::Vec2::~Vec2(ecx_156)
        var_168 = &var_194
        var_c_1.b = 0x2c
        int32_t eax_133
        int32_t ecx_159
        eax_133, ecx_159 = cocos2d::Vec2::Vec2(sub_401900(&var_194, U"R"), 400f, 233.333328f)
        int32_t edi_5 = eax_133
        var_c_1.b = 0x2d
        int32_t var_19c_8 = ecx_159
        eax_133.b = *(cocos2d::Color3B::BLACK + 2)
        var_19c_8.w = *cocos2d::Color3B::BLACK
        var_19c_8:2.b = eax_133.b
        var_c_1.b = 0x2e
        class cocos2d::Label* eax_134 = sub_418fa0(eax_133, edi_5, edi_1, 20f, var_19c_8, 2)
        cocos2d::Vec2* ecx_162 = edi_1[0xbb]
        var_c_1.b = 0
        *(ecx_162 + 0x1c) = eax_134
        cocos2d::Vec2::~Vec2(ecx_162)
        var_168 = &var_194
        var_c_1.b = 0x2f
        int32_t eax_135
        int32_t ecx_165
        eax_135, ecx_165 = cocos2d::Vec2::Vec2(sub_401900(&var_194, U"R"), 666.666687f, 233.333328f)
        int32_t edi_6 = eax_135
        var_c_1.b = 0x30
        int32_t var_19c_9 = ecx_165
        eax_135.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x31
        var_19c_9.w = *cocos2d::Color3B::BLACK
        var_19c_9:2.b = eax_135.b
        class cocos2d::Label* eax_136 = sub_418fa0(eax_135, edi_6, edi_1, 20f, var_19c_9, 2)
        cocos2d::Vec2* ecx_168 = edi_1[0xbb]
        var_c_1.b = 0
        *(ecx_168 + 0x20) = eax_136
        cocos2d::Vec2* ecx_169 = cocos2d::Vec2::~Vec2(ecx_168)
        float var_180_110 = 633.333313f
        var_184 = 0x43c80000
        int32_t eax_137
        char* ecx_170
        eax_137, ecx_170 = cocos2d::Vec2::Vec2(ecx_169, var_184, var_180_110)
        int32_t var_180_111 = 3
        var_184 = ecx_170
        var_c_1.b = 0x32
        __builtin_strncpy(&var_184, "UUPD", 4)
        uint8_t var_18c_6 = 0x75
        uint8_t var_190_4 = -0x19
        var_194 = 0xdc
        int32_t eax_138 = cocos2d::Color3B::Color3B(ecx_170, var_194.b, var_190_4, var_18c_6)
        class cocos2d::Node* ebx_2 = edi_1
        class cocos2d::Sprite* eax_139
        cocos2d::Vec2* ecx_172
        eax_139, ecx_172 = sub_418ed0(eax_138, eax_138, ebx_2, 800f, eax_137, var_184, var_180_111)
        *(ebx_2 + 0x2c4) = eax_139
        var_c_1.b = 0
        cocos2d::Vec2::~Vec2(ecx_172)
        cocos2d::Vec2* ecx_174 = (*(**(ebx_2 + 0x2c4) + 0xac))(data_42e4d8 == 3)
        float var_180_113 = 416.666656f
        var_184 = 0x43c80000
        int32_t eax_142
        char* ecx_175
        eax_142, ecx_175 = cocos2d::Vec2::Vec2(ecx_174, var_184, var_180_113)
        int32_t var_180_114 = 0
        var_184 = ecx_175
        var_c_1.b = 0x33
        int32_t* ecx_176 = *(ebx_2 + 0x2c4)
        var_184 = nullptr
        class cocos2d::Sprite* eax_143
        cocos2d::Vec2* ecx_177
        eax_143, ecx_177 = sub_418ed0(eax_142, &var_14c, ecx_176, 240f, eax_142, var_184, var_180_114)
        var_c_1.b = 0
        cocos2d::Vec2::~Vec2(ecx_177)
        void* var_f8
        cocos2d::Vec2* ecx_179 = sub_401900(&var_f8, "images/human-shadow.png")
        var_c_1.b = 0x34
        float var_180_116 = 120f
        var_184 = 0x42f00000
        int32_t eax_144 = cocos2d::Vec2::Vec2(ecx_179, var_184, var_180_116)
        var_c_1.b = 0x35
        class cocos2d::Sprite* eax_145
        cocos2d::Vec2* ecx_180
        eax_145, ecx_180 = cocos2d::Sprite::create(&var_f8)
        
        if (eax_145 != 0)
            int32_t* var_180_118 = eax_145
            var_184 = nullptr
            ecx_180 =
                sub_418e20(eax_145, eax_144, eax_143, 213.333328f, (zx.o(0)).d, var_184, var_180_118)
        
        var_c_1.b = 0x34
        cocos2d::Vec2::~Vec2(ecx_180)
        var_c_1.b = 0
        int32_t var_e4
        
        if (var_e4 u>= 0x10)
            operator delete(var_f8)
        
        var_168 = &var_194
        var_c_1.b = 0x36
        int32_t eax_146
        int32_t ecx_184
        eax_146, ecx_184 = cocos2d::Vec2::Vec2(sub_401900(&var_194, "VS. Human"), 400f, 283.333344f)
        int32_t edi_8 = eax_146
        var_c_1.b = 0x37
        int32_t var_19c_10 = ecx_184
        ecx_184.w = *cocos2d::Color3B::BLACK
        eax_146.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x38
        var_19c_10.w = ecx_184.w
        var_19c_10:2.b = eax_146.b
        var_c_1.b = 0
        cocos2d::Vec2::~Vec2(sub_418fa0(eax_146, edi_8, *(ebx_2 + 0x2c4), 20f, var_19c_10, 2))
        char const* const var_180_120 = "UserName"
        char* var_e0
        var_184 = &var_e0
        cocos2d::UserDefault::getStringForKey(eax_5, var_184)
        var_c_1.b = 0x39
        void* var_d0
        
        if (var_d0 == 0)
            int32_t var_180_121 = 5
            var_184 = "human"
            sub_401ae0(&var_e0, var_184, var_180_121)
        
        sub_401900(&var_128, "images/input.png")
        int32_t var_180_123 = 0
        var_c_1.b = 0x3a
        var_184 = nullptr
        class cocos2d::ui::Scale9Sprite* eax_147
        cocos2d::Size* ecx_190
        eax_147, ecx_190 = cocos2d::ui::Scale9Sprite::create(&var_128)
        class cocos2d::ui::Scale9Sprite* var_180_124 = eax_147
        var_184 = 0x42900000
        class cocos2d::ui::EditBox* eax_149
        cocos2d::Vec2* ecx_191
        eax_149, ecx_191 =
            cocos2d::ui::EditBox::create(cocos2d::Size::Size(ecx_190, 266.666656f, var_184))
        var_c_1.b = 0x39
        
        if (var_114_12 u>= 0x10)
            ecx_191 = operator delete(var_128.d)
        
        int32_t var_114_13 = 0xf
        int32_t var_118_13 = 0
        var_128 = 0
        float var_180_126 = 155.555557f
        var_184 = 0x434eaaab
        var_c_1.b = 0x3b
        var_c_1.b = 0x39
        cocos2d::Vec2::~Vec2((*(*eax_149 + 0x4c))(cocos2d::Vec2::Vec2(ecx_191, var_184, var_180_126)))
        cocos2d::ui::EditBox::setFontName(eax_149, "Arial")
        cocos2d::ui::EditBox::setFontSize(eax_149, 0x20)
        cocos2d::ui::EditBox::setFontColor(eax_149, cocos2d::Color3B::BLACK)
        cocos2d::ui::EditBox::setDelegate(eax_149, ebx_2 + 0x2a0)
        (*(*ebx_2 + 0x100))(eax_149)
        char* eax_153 = &var_e0
        int32_t var_cc
        
        if (var_cc u>= 0x10)
            eax_153 = var_e0
        
        cocos2d::ui::EditBox::setText(eax_149, eax_153)
        var_168 = &var_194
        var_c_1.b = 0x3c
        int32_t eax_154
        int32_t ecx_202
        eax_154, ecx_202 = cocos2d::Vec2::Vec2(sub_401900(&var_194, 0x41f820), 340f, 155.555557f)
        int32_t edi_9 = eax_154
        var_c_1.b = 0x3d
        int32_t var_19c_11 = ecx_202
        eax_154.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x3e
        var_19c_11.w = *cocos2d::Color3B::BLACK
        var_19c_11:2.b = eax_154.b
        class cocos2d::Label* eax_155
        cocos2d::Vec2* ecx_205
        eax_155, ecx_205 = sub_418fa0(eax_154, edi_9, ebx_2, 36f, var_19c_11, 0)
        *(ebx_2 + 0x2b8) = eax_155
        var_c_1.b = 0x39
        cocos2d::Vec2::~Vec2(ecx_205)
        var_168 = &var_194
        var_c_1.b = 0x3f
        int32_t eax_156
        int32_t ecx_208
        eax_156, ecx_208 = cocos2d::Vec2::Vec2(sub_401900(&var_194, U"R"), 540f, 155.555557f)
        int32_t edi_10 = eax_156
        var_c_1.b = 0x40
        int32_t var_19c_12 = ecx_208
        eax_156.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x41
        var_19c_12.w = *cocos2d::Color3B::BLACK
        var_19c_12:2.b = eax_156.b
        class cocos2d::Label* eax_157
        cocos2d::Vec2* ecx_211
        eax_157, ecx_211 = sub_418fa0(eax_156, edi_10, ebx_2, 36f, var_19c_12, 5)
        *(ebx_2 + 0x2bc) = eax_157
        var_c_1.b = 0x39
        cocos2d::Vec2::~Vec2(ecx_211)
        cocos2d::Vec2* ecx_213 = sub_401900(&var_f8, "images/silver_coin.png")
        var_c_1.b = 0x42
        float var_180_135 = 155.555557f
        var_184 = 0x442f0000
        int32_t eax_158 = cocos2d::Vec2::Vec2(ecx_213, var_184, var_180_135)
        var_c_1.b = 0x43
        class cocos2d::Sprite* eax_159
        cocos2d::Vec2* ecx_214
        eax_159, ecx_214 = cocos2d::Sprite::create(&var_f8)
        
        if (eax_159 != 0)
            int32_t* var_180_137 = eax_159
            var_184 = nullptr
            ecx_214 = sub_418e20(eax_159, eax_158, ebx_2, 80f, (zx.o(0)).d, var_184, var_180_137)
        
        var_c_1.b = 0x42
        cocos2d::Vec2::~Vec2(ecx_214)
        var_c_1.b = 0x39
        
        if (var_e4 u>= 0x10)
            operator delete(var_f8)
        
        int32_t var_180_139 = 0xa
        var_184 = "nCoin"
        int32_t eax_161 = (*(*eax_5 + 4))(var_184, var_180_139)
        var_168 = &var_194
        var_c_1.b = 0x44
        int32_t eax_162
        int32_t ecx_219
        eax_162, ecx_219 = cocos2d::Vec2::Vec2(sub_401f70(&var_194, eax_161), 700f, 155.555557f)
        int32_t edi_11 = eax_162
        var_c_1.b = 0x45
        int32_t var_19c_13 = ecx_219
        ecx_219.w = *cocos2d::Color3B::BLACK
        eax_162.b = *(cocos2d::Color3B::BLACK + 2)
        var_c_1.b = 0x46
        var_19c_13.w = ecx_219.w
        var_19c_13:2.b = eax_162.b
        class cocos2d::Label* eax_163
        cocos2d::Vec2* ecx_221
        eax_163, ecx_221 = sub_418fa0(eax_162, edi_11, ebx_2, 30f, var_19c_13, 5)
        *(ebx_2 + 0x2c0) = eax_163
        var_c_1.b = 0x39
        cocos2d::Vec2::~Vec2(ecx_221)
        sub_414200(ebx_2)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_b721fb2455d0e70f073d7f0cf03b7402>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_50 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_b721fb2455d0e70f073d7f0cf03b7402>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_4c_1 = ebx_2
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_b721fb2455d0e70f073d7f0cf03b7402>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_40_1 = &var_50
        var_c_1.b = 0x48
        sub_401900(&var_110, "images/button-220x100-pushed.png")
        var_c_1.b = 0x49
        cocos2d::Vec2* ecx_225 = sub_401900(&var_128, "images/button-220x100.png")
        var_c_1.b = 0x4a
        float var_180_142 = 155.555557f
        var_184 = 0x44070000
        int32_t eax_164 = cocos2d::Vec2::Vec2(ecx_225, var_184, var_180_142)
        var_c_1.b = 0x4b
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_b721fb2455d0e70f073d7f0cf03b7402>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_180_143 = &var_50
        var_184 = &var_110
        class cocos2d::MenuItemImage* eax_165 =
            cocos2d::MenuItemImage::create(&var_128, var_184, var_180_143)
        var_168 = eax_165
        class cocos2d::Size* eax_166
        cocos2d::Size* ecx_227
        eax_166, ecx_227 = (*(*eax_165 + 0xa8))()
        cocos2d::Size::Size(ecx_227, eax_166)
        int32_t edx_34 = *eax_165
        var_184 = 196.666672f / var_158
        (*(edx_34 + 0x3c))(var_184, 98.3333359f / var_154_13)
        var_c_1.b = 0x4a
        cocos2d::Vec2::~Vec2((*(*eax_165 + 0x4c))(eax_164))
        
        if (var_114_13 u>= 0x10)
            operator delete(var_128.d)
        
        int32_t var_114_14 = 0xf
        int32_t var_118_14 = 0
        var_128 = 0
        
        if (var_fc_2 u>= 0x10)
            operator delete(var_110.d)
        
        int32_t var_fc_3 = 0xf
        int32_t var_100_3 = 0
        var_110 = 0
        sub_40cf60(&var_50)
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_41f84d7760fd2caccb8971366c43a569>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const var_38 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_41f84d7760fd2caccb8971366c43a569>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_34_1 = ebx_2
        struct std::_Func_base<void, class cocos2d::Ref*>::std::_Func_impl<struct std::_Callable_obj<class <lambda_41f84d7760fd2caccb8971366c43a569>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::VTable
            * const* var_28_1 = &var_38
        var_c_1.b = 0x4d
        char var_b0
        sub_401900(&var_b0, "images/power-pushed.png")
        var_c_1.b = 0x4e
        char var_80
        cocos2d::Vec2* ecx_234 = sub_401900(&var_80, "images/power.png")
        var_c_1.b = 0x4f
        float var_180_151 = 1200.83337f
        var_184 = 0x42960000
        int32_t eax_168 = cocos2d::Vec2::Vec2(ecx_234, var_184, var_180_151)
        var_c_1.b = 0x50
        class std::function<void __cdecl (class cocos2d::Ref*)>* var_180_152 = &var_38
        var_184 = &var_b0
        class cocos2d::Sprite* eax_169 = cocos2d::MenuItemImage::create(&var_80, var_184, var_180_152)
        var_16c = eax_169
        class cocos2d::Size* eax_170
        cocos2d::Size* ecx_236
        eax_170, ecx_236 = (*(*eax_169 + 0xa8))()
        cocos2d::Size::Size(ecx_236, eax_170)
        int32_t edx_36 = *var_16c
        var_184 = 98.3333359f f/ eax_5
        float var_144
        (*(edx_36 + 0x3c))(var_184, 98.3333359f / var_144)
        var_c_1.b = 0x4f
        cocos2d::Vec2::~Vec2((*(*var_16c + 0x4c))(eax_168))
        int32_t var_6c
        
        if (var_6c u>= 0x10)
            operator delete(var_80.d)
        
        int32_t var_6c_1 = 0xf
        int32_t var_70_1 = 0
        var_80 = 0
        int32_t var_9c
        
        if (var_9c u>= 0x10)
            operator delete(var_b0.d)
        
        int32_t var_9c_1 = 0xf
        int32_t var_a0_1 = 0
        var_b0 = 0
        sub_40cf60(&var_38)
        var_f8 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_eccc48d1d0185514fe53b7b25005dca3>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
        class cocos2d::Node* var_f4_1 = ebx_2
        void** var_e8_1 = &var_f8
        var_c_1.b = 0x52
        char var_68
        sub_401900(&var_68, "images/gear-pushed.png")
        var_c_1.b = 0x53
        char var_98
        cocos2d::Vec2* ecx_243 = sub_401900(&var_98, "images/gear.png")
        var_c_1.b = 0x54
        float var_180_160 = 1200.83337f
        var_184 = 0x44354000
        int32_t eax_173 = cocos2d::Vec2::Vec2(ecx_243, var_184, var_180_160)
        var_c_1.b = 0x55
        void** var_180_161 = &var_f8
        var_184 = &var_68
        class cocos2d::MenuItemImage* eax_174 =
            cocos2d::MenuItemImage::create(&var_98, var_184, var_180_161)
        class cocos2d::Size* eax_175
        cocos2d::Size* ecx_245
        eax_175, ecx_245 = (*(*eax_174 + 0xa8))()
        cocos2d::Size::Size(ecx_245, eax_175)
        int32_t edx_38 = *eax_174
        var_184 = 98.3333359f / var_160
        float var_15c
        (*(edx_38 + 0x3c))(var_184, 98.3333359f / var_15c)
        var_c_1.b = 0x54
        cocos2d::Vec2::~Vec2((*(*eax_174 + 0x4c))(eax_173))
        int32_t var_84
        
        if (var_84 u>= 0x10)
            operator delete(var_98.d)
        
        int32_t var_84_1 = 0xf
        int32_t var_88_1 = 0
        var_98 = 0
        int32_t var_54
        
        if (var_54 u>= 0x10)
            operator delete(var_68.d)
        
        int32_t var_54_1 = 0xf
        int32_t var_58_1 = 0
        var_68 = 0
        var_c_1.b = 0x39
        sub_40cf60(&var_f8)
        int32_t var_180_167 = 0
        var_184 = var_168
        class cocos2d::MenuItemImage* var_188_21 = eax_174
        class cocos2d::Menu* eax_178 = cocos2d::Menu::create(var_16c)
        (*(*eax_178 + 0x4c))(cocos2d::Vec2::ZERO)
        int32_t edx_40 = *ebx_2
        int32_t var_180_169 = 1
        var_184 = eax_178
        (*(edx_40 + 0xfc))(var_184, var_180_169)
        class cocos2d::EventListenerTouchOneByOne* eax_179 =
            cocos2d::EventListenerTouchOneByOne::create()
        int32_t* ecx_252 = *(eax_179 + 0x70)
        class cocos2d::EventListenerTouchOneByOne* var_150_2 = eax_179
        void* __offset(cocos2d::EventListenerTouchOneByOne, 0x60) esi_22 = eax_179 + 0x60
        
        if (ecx_252 != 0)
            eax_179.b = ecx_252 != esi_22
            (*(*ecx_252 + 0x10))(zx.d(eax_179.b))
            eax_179 = var_150_2
            *(esi_22 + 0x10) = 0
        
        *esi_22 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_7090b20b4002368ba395b2e1ff6cd67b>,0>,class std::allocator<class std::_Func_class<bool,class cocos2d::Touch*,class cocos2d::Event*> >,bool,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<bool, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(esi_22 + 4) = ebx_2
        *(esi_22 + 0x10) = esi_22
        void* __offset(cocos2d::EventListenerTouchOneByOne, 0x78) esi_23 = eax_179 + 0x78
        int32_t* ecx_253 = *(esi_23 + 0x10)
        
        if (ecx_253 != 0)
            eax_179.b = ecx_253 != esi_23
            (*(*ecx_253 + 0x10))(zx.d(eax_179.b))
            eax_179 = var_150_2
            *(esi_23 + 0x10) = 0
        
        *esi_23 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6e73d9330f1d605cd290c6cdcb9fb884>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(esi_23 + 4) = ebx_2
        *(esi_23 + 0x10) = esi_23
        void* __offset(cocos2d::EventListenerTouchOneByOne, 0x90) esi_24 = eax_179 + 0x90
        int32_t* ecx_254 = *(esi_24 + 0x10)
        
        if (ecx_254 != 0)
            eax_179.b = ecx_254 != esi_24
            (*(*ecx_254 + 0x10))(zx.d(eax_179.b))
            eax_179 = var_150_2
            *(esi_24 + 0x10) = 0
        
        *esi_24 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_9a1c83d24044c4b00edb2a0f467ed262>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Touch*,class cocos2d::Event*> >,void,class cocos2d::Touch*,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void, class cocos2d::Touch*, class cocos2d::Event*>'}
        *(esi_24 + 4) = ebx_2
        *(esi_24 + 0x10) = esi_24
        var_184 = eax_179
        cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority((*(*ebx_2 + 0x1b4))(var_184, 
            ebx_2))
        class std::string** eax_185 = cocos2d::EventListenerKeyboard::create()
        int32_t* ecx_257 = eax_185[0x22]
        var_168 = eax_185
        void* esi_25 = &eax_185[0x1e]
        
        if (ecx_257 != 0)
            eax_185.b = ecx_257 != esi_25
            (*(*ecx_257 + 0x10))(zx.d(eax_185.b))
            eax_185 = var_168
            *(esi_25 + 0x10) = 0
        
        *esi_25 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_814e13b77771e45b5785307add98633b>,0>,class std::allocator<class std::_Func_class<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*> >,void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>::`vftable'{for `std::_Func_base<void,enum cocos2d::EventKeyboard::KeyCode,class cocos2d::Event*>'}
        *(esi_25 + 4) = ebx_2
        *(esi_25 + 0x10) = esi_25
        cocos2d::EventDispatcher* ecx_258 = *(ebx_2 + 0x1dc)
        var_184 = eax_185
        esp = &var_184
        cocos2d::EventDispatcher::addEventListenerWithSceneGraphPriority(ecx_258, var_184, ebx_2)
        __vcasan::OnAsanReport()
        int32_t var_d4
        
        if (var_d4 u>= 0x10)
            operator delete(var_e8_1)
            esp = &var_184
        
        int32_t var_d4_1 = 0xf
        int32_t var_d8_1 = 0
        var_e8_1.b = 0
        int32_t var_bc
        
        if (var_bc u>= 0x10)
            operator delete(var_d0)
            esp = &var_184
        
        result = true
    
    fsbase->NtTib.ExceptionList = esp[0x5a]
    esp[1]
    esp[2]
    esp[3]
    sub_4199b8(esp[0x58] ^ &esp[4])
    return result
}
