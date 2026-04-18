// ============================================================
// 函数名称: sub_40c770
// 虚拟地址: 0x40c770
// WARP GUID: cb0dedc7-2361-5437-8bb6-c265dd26b650
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402320, sub_403ed0, sub_40cef0, ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z, sub_409540, sub_403a50, sub_4067d0, sub_418ed0, sub_401f70, sub_4032a0, sub_4039c0, sub_4038a0, sub_40d550, sub_409c90, sub_403230, sub_40ce90, sub_4022e0, sub_401960, sub_4023d0, sub_40d010, sub_403a20, sub_403f60, sub_40cfa0, sub_408790, sub_40d710, sub_40d0c0, sub_4199b8
// [被调用的父级函数]: 无
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __fastcallsub_40c770(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41b069
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_d4
    int32_t eax_2 = __security_cookie ^ &var_d4
    float ebx
    float var_d8 = ebx
    int32_t __saved_edi
    int32_t eax_4 = __security_cookie ^ &__saved_edi
    struct _EXCEPTION_REGISTRATION_RECORD** result = &ExceptionList
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* esi = arg1
    int32_t* var_cc = esi
    
    if (esi[0xa9].b == 0 && esi[0xaf] == 0)
        result.b = *(esi + 0x2a7)
        
        if (result.b == 0)
            int32_t var_bc
            
            if (*(esi + 0x2ae) == 0)
            label_40c81f:
                
                if (*(esi + 0x2a9) == 0 && data_42e4d5 == 0)
                    sub_408790(arg1)
                    *(esi + 0x2ae) = 1
                    int32_t eax_5 = data_42e4d8
                    int32_t ecx = data_42e4dc
                    uint16_t var_d0 = 0
                    var_bc = 0
                    float eax_6 = eax_5 + ecx
                    float var_c8
                    
                    if (eax_5 != neg.d(ecx))
                        int32_t eax_9 = sub_4038a0(esi[0xa8], &var_d0, eax_6)
                        int32_t edx_3 = data_42d120
                        var_bc = eax_9
                        void var_34
                        int32_t* eax_10 = sub_401f70(&var_34, edx_3)
                        int32_t var_c_3 = 1
                        void var_64
                        char* eax_11 = sub_401f70(&var_64, eax_9)
                        var_c_3.b = 2
                        void var_94
                        char* eax_12 = sub_403ed0(eax_11.b, 0x41e90c, &var_94, eax_11)
                        var_c_3.b = 3
                        void var_4c
                        char* eax_13 = sub_403f60(eax_12.b, eax_12, &var_4c, " (")
                        var_c_3.b = 4
                        void var_7c
                        char* eax_14 = sub_40d550(eax_13, eax_13, &var_7c, eax_10)
                        var_c_3.b = 5
                        var_c_3.b = 6
                        esi = var_cc
                        void var_ac
                        (*(*(esi[0xc0] + 0x310) + 4))(sub_403f60(eax_14.b, eax_14, &var_ac, U")("))
                        sub_401960(&var_ac)
                        sub_401960(&var_7c)
                        sub_401960(&var_4c)
                        sub_401960(&var_94)
                        sub_401960(&var_64)
                        int32_t var_c_4 = 0xffffffff
                        sub_401960(&var_34)
                        class cocos2d::Size* eax_17
                        cocos2d::Size* ecx_20
                        eax_17, ecx_20 = (*(*esi[0xc0] + 0xa8))(eax_4)
                        cocos2d::Size::Size(ecx_20, eax_17)
                        (*(*esi[0xc0] + 0x48))(_mm_cvtpd_ps(780.0 - _mm_cvtps_pd(var_c8 * 0.5f)), 
                            0x449d8000)
                    else
                        var_c8 = eax_6
                        float var_c0_1 = eax_6
                        float var_c_1 = eax_6
                        int32_t var_e8_1 = ecx
                        sub_403230(esi[0xa8], &var_c8)
                        ebx = var_c8
                        float edi_1 = eax_6
                        
                        if (ebx == edi_1)
                            sub_4032a0(esi[0xa8], &var_c8)
                            edi_1 = eax_6
                            ebx = var_c8
                        
                        var_d0 = *(ebx
                            i+ (modu.dp.d(0:(sub_4039c0(&data_42e530)), (edi_1 i- ebx) s>> 1) << 1))
                        int32_t var_c_2 = 0xffffffff
                        sub_403a20(&var_c8)
                    ebx.b = var_d0:1.b
                    
                    if (ebx.b != 0)
                        int32_t* ecx_22 = esi[0x10e]
                        
                        if (ecx_22 != 0)
                            (*(*ecx_22 + 0x12c))(1)
                            esi[0x10e] = 0
                        
                        int32_t* ecx_23 = esi[0x10f]
                        
                        if (ecx_23 != 0)
                            (*(*ecx_23 + 0x12c))(1)
                            esi[0x10f] = 0
                        
                        long double x87_r0
                        sub_409540(esi, x87_r0, zx.d(var_d0.b), zx.d(ebx.b))
                        esi[0xb4] += 1
                        sub_40d010(&esi[0x119], esi[0xb4])
                        sub_40cfa0(&esi[0x11c], esi[0xb4])
                        sub_40ce90(&esi[0x11f], esi[0xb4])
                        sub_40ce90(&esi[0x122], var_cc[0xb4])
                        sub_40d0c0(&esi[0x119], var_cc[0xa8])
                        sub_403a50(&var_cc[0x11c], &var_d0)
                        sub_40cef0(&esi[0x11f], &var_bc)
                        sub_40cef0(&esi[0x122], &data_42d120)
                        esi = var_cc
                        GSI1::QueryMiniPDBForTiDefnUDT2(esi, zx.d(var_d0:1.b))
                    
                    void* ecx_35 = esi[0xa8]
                    int32_t eax_26 = sub_4022e0(ecx_35)
                    
                    if (eax_26.b != 0)
                        *(esi + 0x2a7) = 1
                        esi[0xb2] = 0xffffffff
                        *(esi + 0x2ab) = 1
                    
                    if (sub_40d710(eax_26, esi[0x11a], esi[0x119], ecx_35) s>= 3)
                        *(esi + 0x2a7) = 1
                        esi[0xb2] = 0
                    
                    int32_t* ecx_37 = esi[0x110]
                    *(esi + 0x2ae) = 0
                    *(esi + 0x2a9) = 1
                    (*(*ecx_37 + 0xac))(1)
                    (*(*esi[0x111] + 0xac))(0)
                    result = sub_4067d0(esi)
                
                goto label_40cbc5
            
        label_40cbc5:
            double xmm1_3 = 0.5
            double xmm4_1 = 200.0
            double xmm2_1 = 100.0
            double xmm3_1 = 4.5
            double xmm5_1 = 190.0
            
            if (esi[0x10e] == 0)
                char* ecx_40 = esi[0xa8]
                
                for (int32_t i = 5; i s<= 0x13; i += 1)
                    if (ecx_40[i] == 5)
                        if (i s> 0)
                            result = sub_4023d0(ecx_40, i)
                            
                            if (result.b != 0)
                                cocos2d::Color3B* ecx_42 = i & 0x80000003
                                
                                if (ecx_42 s< 0)
                                    ecx_42 = ((ecx_42 - 1) | 0xfffffffc) + 1
                                
                                int32_t eax_31
                                int32_t edx_10
                                edx_10:eax_31 = sx.q(i)
                                int32_t xmm2_2 = _mm_cvtpd_ps(
                                    (_mm_cvtepi32_pd(zx.q(ecx_42)) - xmm1_3) * xmm4_1 + xmm2_1)
                                double xmm0_11 = _mm_cvtepi32_pd(zx.q((eax_31 + (edx_10 & 3)) s>> 2))
                                var_bc = xmm2_2
                                float var_b8_1 = fconvert.s((xmm3_1 - xmm0_11) * xmm4_1 + xmm5_1)
                                cocos2d::Color3B* var_ec_5 = ecx_42
                                int32_t var_c_5 = 7
                                int32_t eax_34 = cocos2d::Color3B::Color3B(ecx_42, 0xff, 0xc0, 0xcb)
                                result = sub_418ed0(eax_34, eax_34, esi, 200f, &var_bc, 200f, 4)
                                int32_t var_c_6 = 0xffffffff
                                xmm3_1 = 4.5
                                xmm4_1 = 200.0
                                xmm1_3 = 0.5
                                xmm2_1 = 100.0
                                xmm5_1 = 190.0
                                esi[0x10e] = result
                        
                        break
            
            if (esi[0x10f] == 0)
                char* ecx_46 = esi[0xa8]
                
                for (int32_t i_1 = 5; i_1 s<= 0x13; i_1 += 1)
                    if (ecx_46[i_1] == 0xd)
                        if (i_1 s> 0)
                            result = sub_402320(ecx_46, i_1)
                            
                            if (result.b != 0)
                                cocos2d::Color3B* ecx_48 = i_1 & 0x80000003
                                
                                if (ecx_48 s< 0)
                                    ecx_48 = ((ecx_48 - 1) | 0xfffffffc) + 1
                                
                                int32_t eax_36
                                int32_t edx_13
                                edx_13:eax_36 = sx.q(i_1)
                                int32_t xmm1_8 = _mm_cvtpd_ps(
                                    (_mm_cvtepi32_pd(zx.q(ecx_48)) - xmm1_3) * xmm4_1 + xmm2_1)
                                double xmm0_19 = _mm_cvtepi32_pd(zx.q((eax_36 + (edx_13 & 3)) s>> 2))
                                int32_t var_b4 = xmm1_8
                                float var_b0_1 = fconvert.s((xmm3_1 - xmm0_19) * xmm4_1 + xmm5_1)
                                cocos2d::Color3B* var_ec_6 = ecx_48
                                int32_t var_c_7 = 8
                                int32_t eax_39 = cocos2d::Color3B::Color3B(ecx_48, 0xff, 0xc0, 0xcb)
                                result = sub_418ed0(eax_39, eax_39, esi, 200f, &var_b4, 200f, 4)
                                esi[0x10f] = result
                        
                        break
        else
            if (esi[0xaa].b != 0 || *(esi + 0x2a6) != 0)
                if (result.b != 0 || *(esi + 0x2ae) != 0)
                    goto label_40cbc5
                
                goto label_40c81f
            
            result = sub_409c90(arg1)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_d4)
    return result
}
