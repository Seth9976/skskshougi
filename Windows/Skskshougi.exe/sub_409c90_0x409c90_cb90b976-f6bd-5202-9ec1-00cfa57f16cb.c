// ============================================================
// 函数名称: sub_409c90
// 虚拟地址: 0x409c90
// WARP GUID: cb90b976-f6bd-5202-9ec1-00cfa57f16cb
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403ed0, sub_40f5a0, sub_403b20, sub_401f70, sub_40d460, ??1_Init_atexit@@QAE@XZ, sub_40ce10, sub_403ac0, sub_401960, sub_411390, sub_418fa0, sub_406900, sub_403be0, sub_4114c0, sub_40ce50, sub_4190b0, sub_403980, sub_40cf60, sub_401ae0, sub_401900, sub_403f60, sub_40d600, sub_402130, sub_4199b8, ?CreatePrimary@UMSFreeVirtualProcessorRoot@details@Concurrency@@AAEXXZ
// [被调用的父级函数]: sub_40c770
// ============================================================

int32_t __fastcallsub_409c90(int32_t* arg1)
{
    // 第一条实际指令: int32_t __saved_ebp_2
    int32_t __saved_ebp_2
    int32_t __saved_ebp_1 = __saved_ebp_2
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41ad2c
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t* eax_2 = __security_cookie ^ &__saved_ebp
    int32_t ebx
    int32_t var_138 = ebx
    int32_t esi
    int32_t var_13c = esi
    int32_t edi
    int32_t var_140 = edi
    int32_t* var_144 = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* esi_1 = arg1
    int32_t* var_120 = esi_1
    esi_1[0xaa].b = 1
    esi_1[0xa9].b = 1
    class cocos2d::UserDefault* eax_3 = cocos2d::UserDefault::getInstance()
    int32_t* var_2c
    sub_40d460(eax_3, "nGame-", &var_2c, &esi_1[0xb8])
    int32_t var_8_1 = 0
    int32_t var_48 = 0xf
    int32_t var_4c = 0
    char var_5c = 0
    int32_t var_c0 = 0xf
    int32_t var_c4 = 0
    char var_d4 = 0
    var_8_1.b = 2
    int32_t* ecx_1 = &var_2c
    int32_t eax_4 = *eax_3
    int32_t var_18
    
    if (var_18 u>= 0x10)
        ecx_1 = var_2c
    
    int32_t var_148_1 = 0
    int32_t* var_14c = ecx_1
    int32_t eax_5 = (*(eax_4 + 4))(var_14c, var_148_1)
    int32_t edx = *eax_3
    int32_t var_148_2 = 0x190
    var_14c = "rate"
    int32_t eax_7 = (*(edx + 4))(var_14c, var_148_2)
    int32_t var_10c = eax_7
    int32_t* var_bc
    sub_40d460(eax_7, "rate", &var_bc, &esi_1[0xb8])
    var_8_1.b = 3
    int32_t* ecx_7 = &var_bc
    int32_t edx_1 = (data_42e4d8 + data_42e4dc + 4) * 0x64
    int32_t eax_10 = *eax_3
    int32_t var_a8
    
    if (var_a8 u>= 0x10)
        ecx_7 = var_bc
    
    var_14c = ecx_7
    int32_t eax_11 = (*(eax_10 + 4))(var_14c, edx_1)
    char* var_110 = *(data_42e4e0 + (data_42e4dc << 2))
    int32_t ecx_11 = esi_1[0xb2]
    int32_t var_a4
    char var_8c
    char var_74
    int32_t var_60
    void* var_44
    int32_t var_30
    int32_t** esp_144
    int32_t var_118
    int32_t var_108
    
    if (ecx_11 == 1)
        if (data_42e4d5 == 0)
            int32_t var_12c
            int32_t* edx_3 = &var_12c
            var_118 = 0x20
            var_108 = 0
            int32_t ecx_12 =
                0x10 - int.d(_mm_cvtepi32_pd(zx.q(eax_11 - var_10c)) * -0.040000000000000001)
            var_12c = ecx_12
            
            if (ecx_12 s>= 0x20)
                edx_3 = &var_118
            
            int32_t* eax_14 = &var_108
            
            if (*edx_3 s> 0)
                eax_14 = edx_3
            
            int32_t esi_2 = *eax_14
            int32_t ecx_14 = var_10c + esi_2
            int32_t eax_15 = *eax_3
            var_10c = ecx_14
            var_14c = "rate"
            (*(eax_15 + 0x1c))(var_14c, ecx_14)
            int32_t* ecx_16 = &var_bc
            int32_t eax_16 = *eax_3
            
            if (var_a8 u>= 0x10)
                ecx_16 = var_bc
            
            var_14c = ecx_16
            (*(eax_16 + 0x1c))(var_14c, eax_11 - esi_2)
            esi_1 = var_120
        
        if (var_10c s> esi_1[0xac])
            esi_1[0xac] = var_10c
            int32_t eax_17 = *eax_3
            var_14c = "maxRate"
            (*(eax_17 + 0x1c))(var_14c, var_10c)
        
        int32_t* ecx_21 = &var_2c
        var_118 = sub_411390() s/ 0xf
        
        if (var_18 u>= 0x10)
            ecx_21 = var_2c
        
        int32_t eax_23 = *eax_3
        var_14c = ecx_21
        (*(eax_23 + 0x1c))(var_14c, eax_5 + 1)
        int32_t var_148_9 = 0x1c
        var_14c = &data_41e340
        sub_401ae0(&var_5c, var_14c, var_148_9)
        int32_t** esp_1 = &var_144
        
        if (data_42e4d5 == 0)
            if (*(esi_1 + 0x2ab) != 0)
                int32_t* ecx_24 = &var_a4
                void* const var_148_12
                
                if (data_42e4d4 == 0)
                    sub_40ce10(&var_2c, sub_40d460(&esi_1[0xb8], "whiteTry-", ecx_24, &esi_1[0xb8]))
                    sub_401960(&var_a4)
                    var_148_12 = &data_41e3a8
                else
                    sub_40ce10(&var_2c, sub_40d460(&esi_1[0xb8], "blackTry-", ecx_24, &esi_1[0xb8]))
                    sub_401960(&var_a4)
                    var_148_12 = &data_41e36c
                
                sub_40ce50(var_148_12)
                int32_t* ecx_29 = &var_2c
                int32_t eax_27 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_29 = var_2c
                
                int32_t var_148_14 = 0
                var_14c = ecx_29
                esp_1 = &var_14c
                
                if ((*(eax_27 + 4))(var_14c, var_148_14) == 0)
                    int32_t** ecx_31 = &var_2c
                    
                    if (var_18 u>= 0x10)
                        ecx_31 = var_2c
                    
                    int32_t var_150_1 = 1
                    (*(*eax_3 + 0x1c))(ecx_31, 1)
                    int32_t ecx_33 = data_42e4dc
                    int32_t eax_30 = data_42e4e0
                    int32_t var_150_2 = 0xffffffff
                    int32_t var_154_2 = 0
                    *(eax_30 + (ecx_33 << 2)) += 1
                    sub_403b20(&var_5c, &var_d4, nullptr, 0xffffffff)
                    esp_1 = &var_14c
            
            if (*(esi_1 + 0x2aa) != 0)
                bool cond:19_1 = data_42e4d4 == 0
                int32_t* ecx_35 = &var_a4
                *(esp_1 - 4) = &esi_1[0xb8]
                void* esp_6
                
                if (cond:19_1)
                    *(esp_1 - 4) = sub_40d460(&esi_1[0xb8], "whiteWin-", ecx_35)
                    sub_40ce10(&var_2c)
                    sub_401960(&var_a4)
                    *(esp_1 - 4) = 0x41e42c
                    esp_6 = esp_1 - 4
                else
                    *(esp_1 - 4) = sub_40d460(&esi_1[0xb8], "blackWin-", ecx_35)
                    sub_40ce10(&var_2c)
                    sub_401960(&var_a4)
                    *(esp_1 - 4) = 0x41e3e4
                    esp_6 = esp_1 - 4
                
                sub_40ce50()
                int32_t** ecx_40 = &var_2c
                int32_t eax_34 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_40 = var_2c
                
                *esp_6 = 0
                *(esp_6 - 4) = ecx_40
                esp_1 = esp_6 - 4
                
                if ((*(eax_34 + 4))() == 0)
                    int32_t** ecx_42 = &var_2c
                    int32_t eax_36 = *eax_3
                    
                    if (var_18 u>= 0x10)
                        ecx_42 = var_2c
                    
                    *(esp_1 - 4) = 1
                    *(esp_1 - 8) = ecx_42
                    (*(eax_36 + 0x1c))()
                    int32_t ecx_44 = data_42e4dc
                    int32_t eax_37 = data_42e4e0
                    *(esp_1 - 4) = 0xffffffff
                    *(esp_1 - 8) = 0
                    *(eax_37 + (ecx_44 << 2)) += 1
                    *(esp_1 - 0xc) = &var_d4
                    sub_403b20(&var_5c)
            
            if (sub_402130(esi_1[0xa8]) != 0)
                *(esp_1 - 4) = &esi_1[0xb8]
                sub_40d460(&esi_1[0xb8], "perfectWin-", &var_74)
                var_8_1.b = 4
                char* ecx_48 = &var_74
                int32_t eax_40 = *eax_3
                
                if (var_60 u>= 0x10)
                    ecx_48 = var_74.d
                
                *(esp_1 - 4) = 0
                *(esp_1 - 8) = ecx_48
                
                if ((*(eax_40 + 4))() == 0)
                    char* ecx_50 = &var_74
                    int32_t eax_42 = *eax_3
                    
                    if (var_60 u>= 0x10)
                        ecx_50 = var_74.d
                    
                    *(esp_1 - 4) = 1
                    *(esp_1 - 8) = ecx_50
                    (*(eax_42 + 0x1c))()
                    int32_t ecx_52 = data_42e4dc
                    int32_t eax_43 = data_42e4e0
                    *(esp_1 - 4) = 0x41e474
                    *(eax_43 + (ecx_52 << 2)) += 1
                    sub_403980()
                
                var_8_1.b = 3
                
                if (var_60 u>= 0x10)
                    *(esp_1 - 4) = var_74.d
                    operator delete()
        
        *(esp_1 - 4) = &esi_1[0xb8]
        int32_t eax_45 = sub_40d460(&esi_1[0xb8], "nWin-", &var_44)
        var_108 = eax_45
        void* esp_28 = esp_1
        
        if (&var_2c != eax_45)
            if (var_18 u>= 0x10)
                *(esp_28 - 4) = var_2c
                operator delete()
                eax_45 = var_108
            
            *(esp_28 - 4) = eax_45
            var_18 = 0xf
            int32_t var_1c_1 = 0
            var_2c.b = 0
            sub_403ac0(&var_2c)
        
        if (var_30 u>= 0x10)
            *(esp_28 - 4) = var_44
            operator delete()
        
        int32_t** ecx_55 = &var_2c
        int32_t eax_46 = *eax_3
        
        if (var_18 u>= 0x10)
            ecx_55 = var_2c
        
        *(esp_28 - 4) = 0
        *(esp_28 - 8) = ecx_55
        int32_t eax_47 = (*(eax_46 + 4))()
        int32_t edx_13 = *eax_3
        int32_t** ecx_57 = &var_2c
        *(esp_28 - 4) = eax_47 + 1
        
        if (var_18 u>= 0x10)
            ecx_57 = var_2c
        
        *(esp_28 - 8) = ecx_57
        var_108 = eax_47 + 1
        (*(edx_13 + 0x1c))()
        void* esp_37 = esp_28
        
        if (data_42e4d5 == 0 && var_108 s>= 0xa)
            *(esp_37 - 4) = &esi_1[0xb8]
            *(esp_37 - 4) = sub_40d460(&esi_1[0xb8], "win10-", &var_44)
            sub_40ce10(&var_2c)
            
            if (var_30 u>= 0x10)
                *(esp_37 - 4) = var_44
                operator delete()
            
            int32_t* ecx_61 = &var_2c
            int32_t eax_51 = *eax_3
            
            if (var_18 u>= 0x10)
                ecx_61 = var_2c
            
            *(esp_37 - 4) = 0
            *(esp_37 - 8) = ecx_61
            esp_37 = esp_37
            
            if ((*(eax_51 + 4))() == 0)
                int32_t* ecx_63 = &var_2c
                int32_t eax_53 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_63 = var_2c
                
                *(esp_37 - 4) = 1
                *(esp_37 - 8) = ecx_63
                (*(eax_53 + 0x1c))()
                int32_t ecx_65 = data_42e4dc
                int32_t eax_54 = data_42e4e0
                *(esp_37 - 4) = 0x41e4ac
                *(eax_54 + (ecx_65 << 2)) += 1
                sub_403980()
        
        *(esp_37 - 4) = &esi_1[0xb8]
        int32_t eax_56 = sub_40d460(&esi_1[0xb8], "nStreak-", &var_44)
        var_108 = eax_56
        
        if (&var_2c != eax_56)
            if (var_18 u>= 0x10)
                *(esp_37 - 4) = var_2c
                operator delete()
                eax_56 = var_108
            
            *(esp_37 - 4) = eax_56
            var_18 = 0xf
            int32_t var_1c_2 = 0
            var_2c.b = 0
            sub_403ac0(&var_2c)
        
        if (var_30 u>= 0x10)
            *(esp_37 - 4) = var_44
            operator delete()
        
        int32_t* ecx_68 = &var_2c
        int32_t eax_57 = *eax_3
        
        if (var_18 u>= 0x10)
            ecx_68 = var_2c
        
        *(esp_37 - 4) = 0
        *(esp_37 - 8) = ecx_68
        int32_t eax_58 = (*(eax_57 + 4))()
        int32_t edx_16 = *eax_3
        int32_t* ecx_70 = &var_2c
        *(esp_37 - 4) = eax_58 + 1
        
        if (var_18 u>= 0x10)
            ecx_70 = var_2c
        
        *(esp_37 - 8) = ecx_70
        var_108 = eax_58 + 1
        (*(edx_16 + 0x1c))()
        void* esp_59 = esp_37
        
        if (data_42e4d5 == 0)
            if (var_108 s>= 5)
                *(esp_59 - 4) = &esi_1[0xb8]
                *(esp_59 - 4) = sub_40d460(&esi_1[0xb8], "streak5-", &var_44)
                sub_40ce10(&var_2c)
                
                if (var_30 u>= 0x10)
                    *(esp_59 - 4) = var_44
                    operator delete()
                
                int32_t* ecx_74 = &var_2c
                int32_t eax_62 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_74 = var_2c
                
                *(esp_59 - 4) = 0
                *(esp_59 - 8) = ecx_74
                esp_59 = esp_59
                
                if ((*(eax_62 + 4))() == 0)
                    int32_t* ecx_76 = &var_2c
                    int32_t eax_64 = *eax_3
                    
                    if (var_18 u>= 0x10)
                        ecx_76 = var_2c
                    
                    *(esp_59 - 4) = 1
                    *(esp_59 - 8) = ecx_76
                    (*(eax_64 + 0x1c))()
                    int32_t ecx_78 = data_42e4dc
                    int32_t eax_65 = data_42e4e0
                    *(esp_59 - 4) = 0x41e4d4
                    *(eax_65 + (ecx_78 << 2)) += 1
                    sub_403980()
            
            *(esp_59 - 4) = &esi_1[0xb8]
            int32_t eax_67 = sub_40d460(&esi_1[0xb8], "noMoveKing-", &var_44)
            var_108 = eax_67
            
            if (&var_2c != eax_67)
                if (var_18 u>= 0x10)
                    *(esp_59 - 4) = var_2c
                    operator delete()
                    eax_67 = var_108
                
                *(esp_59 - 4) = eax_67
                var_18 = 0xf
                int32_t var_1c_3 = 0
                var_2c.b = 0
                sub_403ac0(&var_2c)
            
            if (var_30 u>= 0x10)
                *(esp_59 - 4) = var_44
                operator delete()
            
            if (esi_1[0xab].b == 0)
                int32_t* ecx_81 = &var_2c
                int32_t eax_68 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_81 = var_2c
                
                *(esp_59 - 4) = 0
                *(esp_59 - 8) = ecx_81
                
                if ((*(eax_68 + 4))() == 0)
                    int32_t* ecx_83 = &var_2c
                    int32_t eax_70 = *eax_3
                    
                    if (var_18 u>= 0x10)
                        ecx_83 = var_2c
                    
                    *(esp_59 - 4) = 1
                    *(esp_59 - 8) = ecx_83
                    (*(eax_70 + 0x1c))()
                    int32_t ecx_85 = data_42e4dc
                    int32_t eax_71 = data_42e4e0
                    *(esp_59 - 4) = 0x41e500
                    *(eax_71 + (ecx_85 << 2)) += 1
                    sub_403980()
            
            *(esp_59 - 4) = &esi_1[0xb8]
            int32_t eax_73 = sub_40d460(&esi_1[0xb8], "twoTokin-", &var_44)
            var_108 = eax_73
            
            if (&var_2c != eax_73)
                if (var_18 u>= 0x10)
                    *(esp_59 - 4) = var_2c
                    operator delete()
                    eax_73 = var_108
                
                *(esp_59 - 4) = eax_73
                var_18 = 0xf
                int32_t var_1c_4 = 0
                var_2c.b = 0
                sub_403ac0(&var_2c)
            
            if (var_30 u>= 0x10)
                *(esp_59 - 4) = var_44
                operator delete()
            
            if (*(esi_1 + 0x2ad) != 0)
                int32_t* ecx_88 = &var_2c
                int32_t eax_74 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_88 = var_2c
                
                *(esp_59 - 4) = 0
                *(esp_59 - 8) = ecx_88
                
                if ((*(eax_74 + 4))() == 0)
                    int32_t* ecx_90 = &var_2c
                    int32_t eax_76 = *eax_3
                    
                    if (var_18 u>= 0x10)
                        ecx_90 = var_2c
                    
                    *(esp_59 - 4) = 1
                    *(esp_59 - 8) = ecx_90
                    (*(eax_76 + 0x1c))()
                    int32_t ecx_92 = data_42e4dc
                    int32_t eax_77 = data_42e4e0
                    *(esp_59 - 4) = 0x41e53c
                    *(eax_77 + (ecx_92 << 2)) += 1
                    sub_403980()
            
            *(esp_59 - 4) = &esi_1[0xb8]
            int32_t eax_79 = sub_40d460(&esi_1[0xb8], "check4-", &var_44)
            var_108 = eax_79
            esp_59 = esp_59
            
            if (&var_2c != eax_79)
                if (var_18 u>= 0x10)
                    *(esp_59 - 4) = var_2c
                    operator delete()
                    eax_79 = var_108
                
                *(esp_59 - 4) = eax_79
                var_18 = 0xf
                int32_t var_1c_5 = 0
                var_2c.b = 0
                sub_403ac0(&var_2c)
            
            if (var_30 u>= 0x10)
                *(esp_59 - 4) = var_44
                operator delete()
            
            if (esi_1[0xb1] s>= 4)
                int32_t* ecx_95 = &var_2c
                int32_t eax_80 = *eax_3
                
                if (var_18 u>= 0x10)
                    ecx_95 = var_2c
                
                *(esp_59 - 4) = 0
                *(esp_59 - 8) = ecx_95
                
                if ((*(eax_80 + 4))() == 0)
                    int32_t* ecx_97 = &var_2c
                    int32_t eax_82 = *eax_3
                    
                    if (var_18 u>= 0x10)
                        ecx_97 = var_2c
                    
                    *(esp_59 - 4) = 1
                    *(esp_59 - 8) = ecx_97
                    (*(eax_82 + 0x1c))()
                    int32_t ecx_99 = data_42e4dc
                    int32_t eax_83 = data_42e4e0
                    *(esp_59 - 4) = 0x41e57c
                    *(eax_83 + (ecx_99 << 2)) += 1
                    sub_403980()
        
        int32_t ecx_100 = data_42e4dc
        char const* const edi_2
        
        if (ecx_100 s>= 8 || var_110 s>= 5 || *(data_42e4e0 + (ecx_100 << 2)) s< 5)
            edi_2 = "sounds/button82.mp3"
        else
            char* eax_85 = sub_401f70(&var_8c, 5)
            *(esp_59 - 4) = eax_85
            var_8_1.b = 5
            int32_t eax_86 = sub_403ed0(eax_85, 0x41e5f8, &var_44)
            *(esp_59 - 4) = 0x41e5b0
            var_8_1.b = 6
            int32_t eax_87 = sub_403f60(eax_86, eax_86, &var_a4)
            *(esp_59 - 4) = 0xffffffff
            *(esp_59 - 8) = 0
            *(esp_59 - 0xc) = eax_87
            var_8_1.b = 7
            sub_403b20(&var_5c)
            sub_401960(&var_a4)
            sub_401960(&var_44)
            var_8_1.b = 3
            sub_401960(&var_8c)
            edi_2 = "sounds/one18.mp3"
            *(esp_59 - 0x1c) = 0x41e618
            int32_t eax_88
            int32_t ecx_109
            eax_88, ecx_109 = sub_401900(esp_59 - 0x18)
            int32_t var_114 = 0x43c80000
            var_110 = 0x42f6aaab
            var_8_1.b = 8
            *(esp_59 - 0x1c) = 0xc
            *(esp_59 - 0x20) = ecx_109
            eax_88.w = *cocos2d::Color3B::WHITE
            *(esp_59 - 0x20) = eax_88.w
            eax_88.b = *(cocos2d::Color3B::WHITE + 2)
            *(esp_59 - 0x1e) = eax_88.b
            esi_1[0xca] = sub_418fa0(eax_88, &var_114, esi_1, 0x42100000)
            var_74.d = &std::_Func_impl<struct std::_Callable_obj<class <lambda_7144c90b5d53a47d7ca2c455eaeacffc>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::Ref*> >,void,class cocos2d::Ref*>::`vftable'{for `std::_Func_base<void, class cocos2d::Ref*>'}
            int32_t* var_70_1 = esi_1
            char* var_64_1 = &var_74
            *(esp_59 - 4) = "images/star-pushed.png"
            var_8_1.b = 0xa
            sub_401900(&var_8c)
            *(esp_59 - 4) = "images/star.png"
            var_8_1.b = 0xb
            int32_t ecx_113 = sub_401900(&var_44)
            var_114 = 0x44354000
            var_110 = 0x42f6aaab
            var_8_1.b = 0xd
            void* esp_119
            *esp_119 = &var_74
            *(esp_59 - 8) = ecx_113
            *(esp_59 - 8) = 0x42dc0000
            *(esp_119 - 8) = &var_114
            int32_t eax_91 = sub_4190b0(&var_114, &var_8c, &var_44, 0x42dc0000)
            sub_401960(&var_44)
            sub_401960(&var_8c)
            var_8_1.b = 3
            sub_40cf60(&var_74)
            *esp_119 = 0
            *(esp_119 - 4) = eax_91
            int32_t* eax_92 = cocos2d::Menu::create()
            esi_1 = var_120
            esi_1[0x115] = eax_92
            int32_t edx_26 = *eax_92
            *esp_119 = cocos2d::Vec2::ZERO
            (*(edx_26 + 0x4c))()
            int32_t eax_93 = *esi_1
            *esp_119 = 0xc
            *(esp_119 - 4) = esi_1[0x115]
            (*(eax_93 + 0xfc))()
            esp_59 = esp_119 + 4
        
        if (sub_411390() s/ 0xf s> var_118)
            *(esp_59 - 4) = 0x15
            *(esp_59 - 8) = 0x41e670
            sub_403be0(&var_5c)
            char* eax_99 = sub_4114c0(&var_44)
            *(esp_59 - 4) = 0x41e688
            var_8_1.b = 0xe
            int32_t eax_100 = sub_403f60(eax_99, eax_99, &var_74)
            *(esp_59 - 4) = 0xffffffff
            *(esp_59 - 8) = 0
            *(esp_59 - 0xc) = eax_100
            var_8_1.b = 0xf
            sub_403b20(&var_5c)
            
            if (var_60 u>= 0x10)
                *(esp_59 - 4) = var_74.d
                operator delete()
            
            var_8_1.b = 3
            var_60 = 0xf
            int32_t var_64_2 = 0
            var_74 = 0
            
            if (var_30 u>= 0x10)
                *(esp_59 - 4) = var_44
                operator delete()
            
            edi_2 = "sounds/one18.mp3"
        
        class cocos2d::UserDefault* eax_101 = cocos2d::UserDefault::getInstance()
        *(esp_59 - 4) = 1
        *(esp_59 - 8) = "SoundEffect"
        esp_144 = esp_59
        
        if ((*(*eax_101 + 4))() != 0)
            int32_t edx_32 = *CocosDenshion::SimpleAudioEngine::getInstance()
            *(esp_144 - 4) = 0x3f800000
            *(esp_144 - 8) = 0
            *(esp_144 - 0xc) = 0x3f800000
            *(esp_144 - 0x10) = 0
            *(esp_144 - 0x14) = edi_2
            (*(edx_32 + 0x30))()
        
        Concurrency::details::UMSFreeVirtualProcessorRoot::CreatePrimary(esi_1)
    else if (ecx_11 != 0xffffffff)
        int32_t var_148_26 = 0x35
        var_14c = &data_41e700
        sub_401ae0(&var_5c, var_14c, var_148_26)
        esp_144 = &var_144
    else
        if (data_42e4d5 == 0)
            int32_t* edx_33 = &var_110
            var_108 = 0x20
            var_118 = 0
            char* ecx_128 =
                0x10 - int.d(_mm_cvtepi32_pd(zx.q(var_10c - eax_11)) * -0.040000000000000001)
            var_110 = ecx_128
            
            if (ecx_128 s>= 0x20)
                edx_33 = &var_108
            
            int32_t* eax_107 = &var_118
            
            if (*edx_33 s> 0)
                eax_107 = edx_33
            
            int32_t esi_4 = *eax_107
            int32_t ecx_130 = var_10c - esi_4
            int32_t eax_108 = *eax_3
            var_10c = ecx_130
            var_14c = "rate"
            (*(eax_108 + 0x1c))(var_14c, ecx_130)
            int32_t* ecx_132 = &var_bc
            int32_t eax_109 = *eax_3
            
            if (var_a8 u>= 0x10)
                ecx_132 = var_bc
            
            var_14c = ecx_132
            (*(eax_109 + 0x1c))(var_14c, eax_11 + esi_4)
            esi_1 = var_120
        
        int32_t* ecx_134 = &var_2c
        
        if (var_18 u>= 0x10)
            ecx_134 = var_2c
        
        int32_t eax_110 = *eax_3
        var_14c = ecx_134
        (*(eax_110 + 0x1c))(var_14c, eax_5 + 1)
        int32_t var_148_18
        
        if (*(esi_1 + 0x2ab) == 0)
            var_148_18 = 0x19
            var_14c = &data_41e6d0
        else
            var_148_18 = 0x22
            var_14c = &data_41e6ac
        
        sub_401ae0(&var_5c, var_14c, var_148_18)
        char* eax_112 = sub_40d460(&esi_1[0xb8], "nStreak-", &var_44, &esi_1[0xb8])
        var_110 = eax_112
        
        if (&var_2c != eax_112)
            if (var_18 u>= 0x10)
                operator delete(var_2c)
                eax_112 = var_110
            
            var_18 = 0xf
            int32_t var_1c_6 = 0
            var_2c.b = 0
            sub_403ac0(&var_2c, eax_112)
        
        if (var_30 u>= 0x10)
            operator delete(var_44)
        
        int32_t* ecx_139 = &var_2c
        int32_t eax_113 = *eax_3
        
        if (var_18 u>= 0x10)
            ecx_139 = var_2c
        
        int32_t var_148_23 = 0
        var_14c = ecx_139
        (*(eax_113 + 0x1c))(var_14c, var_148_23)
        class cocos2d::UserDefault* eax_114 = cocos2d::UserDefault::getInstance()
        int32_t var_148_24 = 1
        var_14c = "SoundEffect"
        esp_144 = &var_144
        
        if ((*(*eax_114 + 4))(var_14c, var_148_24) != 0)
            int32_t edx_37 = *CocosDenshion::SimpleAudioEngine::getInstance()
            int32_t var_148_25 = 0x3f800000
            var_14c = nullptr
            int32_t var_150_3 = 0x3f800000
            int32_t var_154_3 = 0
            char const* const var_158_2 = "sounds/button74.mp3"
            (*(edx_37 + 0x30))("sounds/button74.mp3", 0, 0x3f800000, var_14c, var_148_25)
            esp_144 = &var_144
    sub_406900(esi_1)
    
    if (data_42e4d5 == 0)
        int32_t var_90
        int32_t var_78
        
        if (var_10c == eax_7)
            char* eax_125 = sub_401f70(&var_a4, var_10c)
            *(esp_144 - 4) = eax_125
            var_8_1.b = 0x16
            int32_t eax_126 = sub_403ed0(eax_125, 0x41e774, &var_8c)
            *(esp_144 - 4) = 0x41e768
            var_8_1.b = 0x17
            int32_t eax_127 = sub_403f60(eax_126, eax_126, &var_44)
            *(esp_144 - 4) = 0xffffffff
            *(esp_144 - 8) = 0
            *(esp_144 - 0xc) = eax_127
            var_8_1.b = 0x18
            sub_403b20(&var_5c)
            
            if (var_30 u>= 0x10)
                *(esp_144 - 4) = var_44
                operator delete()
            
            var_30 = 0xf
            int32_t var_34_1 = 0
            var_44.b = 0
            
            if (var_78 u>= 0x10)
                *(esp_144 - 4) = var_8c.d
                operator delete()
            
            var_8_1.b = 3
            int32_t var_78_2 = 0xf
            int32_t var_7c_2 = 0
            var_8c = 0
            
            if (var_90 u>= 0x10)
                *(esp_144 - 4) = var_a4
                operator delete()
                esp_144 = esp_144
        else
            sub_401f70(&var_44, var_10c - eax_7)
            var_8_1.b = 0x10
            
            if (var_10c s> eax_7)
                *(esp_144 - 4) = &var_44
                *(esp_144 - 4) = sub_40d460(&var_44, U"+", &var_8c)
                sub_40ce10(&var_44)
                
                if (var_78 u>= 0x10)
                    *(esp_144 - 4) = var_8c.d
                    operator delete()
            
            char* eax_120 = sub_401f70(&var_a4, var_10c)
            *(esp_144 - 4) = eax_120
            var_8_1.b = 0x11
            int32_t eax_121 = sub_403ed0(eax_120, 0x41e748, &var_8c)
            *(esp_144 - 4) = &data_41e1bc
            var_8_1.b = 0x12
            char var_104
            int32_t eax_122 = sub_403f60(eax_121, eax_121, &var_104)
            var_8_1.b = 0x13
            *(esp_144 - 4) = &var_44
            char var_ec
            int32_t eax_123 = sub_40d600(eax_122, eax_122, &var_ec)
            *(esp_144 - 4) = 0x41e73c
            var_8_1.b = 0x14
            int32_t eax_124 = sub_403f60(eax_123, eax_123, &var_74)
            *(esp_144 - 4) = 0xffffffff
            *(esp_144 - 8) = 0
            *(esp_144 - 0xc) = eax_124
            var_8_1.b = 0x15
            sub_403b20(&var_5c)
            
            if (var_60 u>= 0x10)
                *(esp_144 - 4) = var_74.d
                operator delete()
            
            int32_t var_60_1 = 0xf
            int32_t var_64_3 = 0
            var_74 = 0
            int32_t var_d8
            
            if (var_d8 u>= 0x10)
                *(esp_144 - 4) = var_ec.d
                operator delete()
            
            int32_t var_d8_1 = 0xf
            int32_t var_dc_1 = 0
            var_ec = 0
            int32_t var_f0
            
            if (var_f0 u>= 0x10)
                *(esp_144 - 4) = var_104.d
                operator delete()
            
            int32_t var_f0_1 = 0xf
            int32_t var_f4_1 = 0
            var_104 = 0
            
            if (var_78 u>= 0x10)
                *(esp_144 - 4) = var_8c.d
                operator delete()
            
            int32_t var_78_1 = 0xf
            int32_t var_7c_1 = 0
            var_8c = 0
            
            if (var_90 u>= 0x10)
                *(esp_144 - 4) = var_a4
                operator delete()
            
            var_8_1.b = 3
            
            if (var_30 u>= 0x10)
                *(esp_144 - 4) = var_44
                operator delete()
                esp_144 = esp_144
    
    int32_t eax_128
    void* esp_184
    
    if (data_42e4d5 != 0 || data_42e4d5 != 0)
        *(esp_144 - 4) = 0x2f
        *(esp_144 - 8) = 0x41e7cc
        sub_403be0(&var_5c)
        *(esp_144 - 4) = &data_41e26c
        int32_t ecx_163
        eax_128, ecx_163 = sub_401900(&var_44)
        *(esp_144 - 4) = ecx_163
        var_8_1.b = 0x1a
        *(esp_144 - 8) = "undo"
        esp_184 = esp_144 - 8
    else
        *(esp_144 - 4) = 0x32
        *(esp_144 - 8) = 0x41e790
        sub_403be0(&var_5c)
        *(esp_144 - 4) = &data_41e26c
        int32_t ecx_160
        eax_128, ecx_160 = sub_401900(&var_44)
        *(esp_144 - 4) = ecx_160
        var_8_1.b = 0x19
        *(esp_144 - 8) = 0x41e7c4
        esp_184 = esp_144 - 8
    
    void* esp_191 = esp_184 + 8
    esi_1[0x125] = sub_40f5a0(eax_128, &var_5c, &var_44)
    
    if (var_30 u>= 0x10)
        *(esp_191 - 4) = var_44
        operator delete()
    
    *(esp_191 - 0x18) = &std::_Func_impl<struct std::_Callable_obj<class <lambda_2842dbc8334a15eaaf4292933c6e4f0d>,0>,class std::allocator<class std::_Func_class<void,int32_t> >,void,int32_t>::`vftable'{for `std::_Func_base<void, int32_t>'}
    *(esp_191 - 0x14) = esi_1
    *(esp_191 - 8) = esp_191 - 0x18
    var_8_1.b = 3
    _Init_atexit::~_Init_atexit(esi_1[0x125])
    int32_t eax_131 = *esi_1
    *(esp_191 - 4) = 0xb
    *(esp_191 - 8) = esi_1[0x125]
    int32_t result = (*(eax_131 + 0xfc))()
    *(esi_1 + 0x2af) = 0
    
    if (var_a8 u>= 0x10)
        *(esp_191 - 4) = var_bc
        result = operator delete()
    
    int32_t var_a8_1 = 0xf
    int32_t var_ac = 0
    var_bc.b = 0
    
    if (var_c0 u>= 0x10)
        *(esp_191 - 4) = var_d4.d
        result = operator delete()
    
    int32_t var_c0_1 = 0xf
    int32_t var_c4_1 = 0
    var_d4 = 0
    
    if (var_48 u>= 0x10)
        *(esp_191 - 4) = var_5c.d
        result = operator delete()
    
    int32_t var_48_1 = 0xf
    int32_t var_4c_1 = 0
    var_5c = 0
    
    if (var_18 u>= 0x10)
        *(esp_191 - 4) = var_2c
        result = operator delete()
    
    fsbase->NtTib.ExceptionList = ExceptionList
    *(esp_191 + 4)
    *(esp_191 + 8)
    *(esp_191 + 0xc)
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
