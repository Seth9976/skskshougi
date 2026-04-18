// ============================================================
// 函数名称: sub_414200
// 虚拟地址: 0x414200
// WARP GUID: f729bd06-4295-56ef-9481-f6e7fd45864f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_418fa0, sub_413e00, sub_4146d0, sub_40d2b0, sub_4199b8
// [被调用的父级函数]: sub_414ac0, sub_415660, sub_408a30, sub_411640, sub_4087d0, sub_40dcf0
// ============================================================

int32_t __fastcallsub_414200(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41bb83
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    sub_413e00(arg1)
    void* edi = arg1 + 0x2e0
    int32_t* esi_1 = *edi
    int32_t ebx = 0
    uint32_t ecx_3 = (*(arg1 + 0x2e4) - esi_1 + 3) u>> 2
    
    if (esi_1 u> *(edi + 4))
        ecx_3 = 0
    
    if (ecx_3 != 0)
        uint32_t eax_3 = ecx_3
        
        do
            int32_t* ecx_4 = *esi_1
            
            if (ecx_4 != 0)
                (*(*ecx_4 + 0x12c))(1)
                eax_3 = ecx_3
            
            ebx += 1
            esi_1 = &esi_1[1]
        while (ebx != eax_3)
    
    void* esi_2 = arg1
    *(edi + 4) = *edi
    class cocos2d::Size* eax_8
    cocos2d::Size* ecx_6
    eax_8, ecx_6 = (*(***(esi_2 + 0x2c8) + 0xa8))(eax_2)
    cocos2d::Size::Size(ecx_6, eax_8)
    int32_t* ebx_1 = nullptr
    float var_4c
    float xmm0_1[0x2] = var_4c / 5f
    int32_t* var_30_1 = nullptr
    float var_38 = xmm0_1
    double xmm0_3 = _mm_cvtps_pd(xmm0_1) * 0.75
    int32_t var_48
    double xmm1_2 = _mm_cvtps_pd(var_48) - xmm0_3
    
    while (true)
        int32_t* ebx_6
        
        if (*(ebx_1 + data_42e4e0) == 0)
            int32_t ecx_32 = *(edi + 4)
            int32_t var_3c = 0
            int32_t ebx_7
            
            if (&var_3c u< ecx_32)
                ebx_7 = *edi
            
            if (&var_3c u>= ecx_32 || ebx_7 u> &var_3c)
                int32_t edx_16 = *(edi + 8)
                
                if (ecx_32 == edx_16 && (edx_16 - ecx_32) s>> 2 u< 1)
                    int32_t esi_6 = *edi
                    int32_t ecx_41 = (ecx_32 - esi_6) s>> 2
                    
                    if (0x3fffffff - ecx_41 u< 1)
                        std::_Xlength_error("vector<T> too long")
                        break
                        break
                    
                    int32_t edx_18 = (edx_16 - esi_6) s>> 2
                    uint32_t ecx_43 = edx_18 u>> 1
                    int32_t edx_19
                    
                    if (0x3fffffff - ecx_43 u>= edx_18)
                        edx_19 = edx_18 + ecx_43
                    else
                        edx_19 = 0
                    
                    if (edx_19 u< ecx_41 + 1)
                        edx_19 = ecx_41 + 1
                    
                    sub_40d2b0(edi, edx_19)
                
                int32_t* eax_44 = *(edi + 4)
                
                if (eax_44 != 0)
                    *eax_44 = 0
                
                ebx_6 = var_30_1
                *(edi + 4) += 4
            else
                int32_t edx_12 = *(edi + 8)
                
                if (ecx_32 == edx_12 && (edx_12 - ecx_32) s>> 2 u< 1)
                    int32_t ecx_34 = (ecx_32 - ebx_7) s>> 2
                    
                    if (0x3fffffff - ecx_34 u< 1)
                        std::_Xlength_error("vector<T> too long")
                        break
                        break
                    
                    int32_t edx_14 = (edx_12 - ebx_7) s>> 2
                    uint32_t ecx_37 = edx_14 u>> 1
                    int32_t edx_15
                    
                    if (0x3fffffff - ecx_37 u>= edx_14)
                        edx_15 = edx_14 + ecx_37
                    else
                        edx_15 = 0
                    
                    if (edx_15 u< ecx_34 + 1)
                        edx_15 = ecx_34 + 1
                    
                    sub_40d2b0(edi, edx_15)
                
                int32_t* ecx_39 = *(edi + 4)
                
                if (ecx_39 != 0)
                    *ecx_39 = *(*edi + ((&var_3c - ebx_7) s>> 2 << 2))
                
                ebx_6 = var_30_1
                *(edi + 4) += 4
        else
            int32_t var_90_3 = 0x17
            char const* const var_94_1 = "images/medal-ribbon.png"
            int32_t var_18_1 = 0xf
            int32_t var_1c_1 = 0
            char var_2c = 0
            sub_401ae0(&var_2c, var_94_1, var_90_3)
            int32_t var_8_1 = 0
            int32_t var_5c = _mm_cvtpd_ps(zx.o(xmm0_3))
            int32_t var_58_1 = _mm_cvtpd_ps(zx.o(xmm1_2))
            var_8_1.b = 1
            int32_t* ebx_2 = *(*(esi_2 + 0x2c8) + ebx_1)
            class cocos2d::Sprite* esi_3 = cocos2d::Sprite::create(&var_2c)
            
            if (esi_3 != 0)
                var_38 f- 0
                class cocos2d::Sprite* eax_11
                eax_11:1.b = (var_38 == 0f ? 1 : 0) << 6 | (is_unordered.d(var_38, 0f) ? 1 : 0) << 2
                    | (var_38 < 0f ? 1 : 0)
                bool p_2 = unimplemented  {test ah, 0x44}
                
                if (p_2)
                    class cocos2d::Size* eax_13
                    cocos2d::Size* ecx_9
                    eax_13, ecx_9 = (*(*esi_3 + 0xa8))()
                    int32_t var_90_6 = cocos2d::Size::Size(ecx_9, eax_13)
                    float var_74
                    (*(*esi_3 + 0x40))(var_38 / var_74)
                
                (*(*esi_3 + 0x4c))(&var_5c)
                (*(*ebx_2 + 0xfc))(esi_3, 0)
            
            int32_t var_8_2 = 0xffffffff
            class cocos2d::Sprite* var_40 = esi_3
            
            if (var_18_1 u>= 0x10)
                operator delete(var_2c.d)
            
            int32_t ecx_14 = *(edi + 4)
            int32_t eax_17
            
            if (&var_40 u< ecx_14)
                eax_17 = *edi
            
            if (&var_40 u>= ecx_14 || eax_17 u> &var_40)
                int32_t edx_5 = *(edi + 8)
                
                if (ecx_14 == edx_5 && (edx_5 - ecx_14) s>> 2 u< 1)
                    int32_t ebx_5 = *edi
                    int32_t ecx_23 = (ecx_14 - ebx_5) s>> 2
                    
                    if (0x3fffffff - ecx_23 u< 1)
                        std::_Xlength_error("vector<T> too long")
                        break
                        break
                        break
                    
                    int32_t edx_7 = (edx_5 - ebx_5) s>> 2
                    uint32_t ecx_26 = edx_7 u>> 1
                    int32_t edx_8
                    
                    if (0x3fffffff - ecx_26 u>= edx_7)
                        edx_8 = edx_7 + ecx_26
                    else
                        edx_8 = 0
                    
                    if (edx_8 u< ecx_23 + 1)
                        edx_8 = ecx_23 + 1
                    
                    sub_40d2b0(edi, edx_8)
                
                class cocos2d::Sprite** eax_30 = *(edi + 4)
                
                if (eax_30 != 0)
                    *eax_30 = esi_3
            else
                int32_t edx_1 = *(edi + 8)
                
                if (ecx_14 == edx_1 && (edx_1 - ecx_14) s>> 2 u< 1)
                    int32_t ecx_16 = (ecx_14 - *edi) s>> 2
                    
                    if (0x3fffffff - ecx_16 u< 1)
                        std::_Xlength_error("vector<T> too long")
                        break
                        break
                        break
                    
                    int32_t edx_3 = (edx_1 - *edi) s>> 2
                    uint32_t ecx_19 = edx_3 u>> 1
                    int32_t edx_4
                    
                    if (0x3fffffff - ecx_19 u>= edx_3)
                        edx_4 = edx_3 + ecx_19
                    else
                        edx_4 = 0
                    
                    if (edx_4 u< ecx_16 + 1)
                        edx_4 = ecx_16 + 1
                    
                    sub_40d2b0(edi, edx_4)
                
                int32_t* ecx_21 = *(edi + 4)
                
                if (ecx_21 != 0)
                    *ecx_21 = *(*edi + ((&var_40 - eax_17) s>> 2 << 2))
            
            *(edi + 4) += 4
            int32_t edx_9 = data_42e4e0
            char var_a4
            char* ecx_28 = &var_a4
            ebx_6 = var_30_1
            int32_t var_ac_1
            char* eax_31
            int32_t* edx_11
            
            if (*(ebx_6 + edx_9) s>= 0xa)
                int32_t var_90_13 = 0xf
                int32_t var_94_3 = 0
                var_a4 = 0
                int32_t ecx_30
                eax_31, ecx_30 = sub_401ae0(ecx_28, 0x41e1d8, 3)
                float xmm1_4[0x2] = var_38
                int32_t var_54 = _mm_cvtpd_ps(_mm_cvtps_pd(xmm1_4) * 1.8)
                int32_t var_50_1 = _mm_cvtpd_ps(_mm_cvtps_pd(xmm1_4) * 2.5)
                int32_t var_8_4 = 3
                int32_t var_a8_2 = 0
                var_ac_1 = ecx_30
                eax_31.w = *cocos2d::Color3B::BLACK
                var_ac_1.w = eax_31.w
                eax_31.b = *(cocos2d::Color3B::BLACK + 2)
                var_ac_1:2.b = eax_31.b
                edx_11 = &var_54
            else
                int32_t ecx_29
                eax_31, ecx_29 = sub_401f70(ecx_28, *(ebx_6 + edx_9))
                float xmm1_3[0x2] = var_38
                int32_t var_64 = _mm_cvtpd_ps(_mm_cvtps_pd(xmm1_3) * 1.8)
                int32_t var_60_1 = _mm_cvtpd_ps(_mm_cvtps_pd(xmm1_3) * 2.5)
                int32_t var_8_3 = 2
                int32_t var_a8_1 = 0
                var_ac_1 = ecx_29
                eax_31.w = *cocos2d::Color3B::BLACK
                var_ac_1.w = eax_31.w
                eax_31.b = *(cocos2d::Color3B::BLACK + 2)
                var_ac_1:2.b = eax_31.b
                edx_11 = &var_64
            
            sub_418fa0(eax_31, edx_11, esi_3, 100f, var_ac_1, 0)
            int32_t var_8_5 = 0xffffffff
        
        ebx_1 = &ebx_6[1]
        var_30_1 = ebx_1
        
        if (ebx_1 s>= 0x24)
            break
        
        esi_2 = arg1
    
    int32_t result = sub_4146d0(arg1)
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
