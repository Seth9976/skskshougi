// ============================================================
// 函数名称: sub_408ce0
// 虚拟地址: 0x408ce0
// WARP GUID: 50d29904-226c-5f2b-b9d2-0db964dc2306
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402170, sub_401900, sub_403f60, sub_403340, sub_4199b8
// [被调用的父级函数]: sub_40b730, sub_406250, sub_40b620
// ============================================================

uint32_t __thiscallsub_408ce0(void* arg1, long double arg2 @ st0, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$?_Getffld@?$num_get@DV?$istreambuf_iterator@DU?$char_traits@D@std@@@std@@@std@@ABAHPADAAV?$istreambuf_iterator@DU?$char_traits@D@std@@@2@1AAVios_base@2@PAH@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    
    if ((*(*cocos2d::UserDefault::getInstance() + 4))("SoundEffect", 1) != 0)
        (*(*CocosDenshion::SimpleAudioEngine::getInstance() + 0x30))("sounds/button45.mp3", 0, 
            0x3f800000, 0, 0x3f800000)
    
    uint32_t result
    int32_t* var_80
    struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_6ea96c7c106cffeb911057939d93c50c>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
        * const var_2c
    
    if (arg3 s>= 5)
        char* edx_5 = *(arg1 + 0x2a0)
        int32_t* eax_21 = *(arg1 + (arg4 << 2) + 0x330)
        int32_t var_84_2 = zx.d(edx_5[arg4]) & 7
        int32_t eax_23
        eax_23.b = edx_5[arg3]
        char var_75_1 = eax_23.b
        
        if (eax_23.b == 5)
            *(arg1 + 0x2ac) = 1
        
        var_80:3.b = arg4.b
        var_80:2.b = arg3.b
        int32_t var_a8_8 = sub_403340(edx_5, &var_80:2)
        
        if (sub_402170(*(arg1 + 0x2a0)) == 2)
            *(arg1 + 0x2ad) = 1
        
        char var_75_2
        int32_t eax_26
        int32_t edx_6
        
        if (arg3 s>= 9 && var_75_1 == 1)
            var_75_2 = 1
            edx_6:eax_26 = sx.q(arg4)
        
        if (arg3 s< 9 || var_75_1 != 1 || (eax_26 + (edx_6 & 3)) s>> 2 != 1)
            var_75_2 = 0
        
        int32_t* esi_3 = *(arg1 + (arg3 << 2) + 0x330)
        *(arg1 + (arg4 << 2) + 0x330) = esi_3
        *(arg1 + (arg3 << 2) + 0x330) = 0
        int32_t eax_29 = *esi_3
        var_80 = esi_3
        (*(eax_29 + 0xc))(9)
        int32_t eax_31 = arg4 & 0x80000003
        
        if (eax_31 s< 0)
            eax_31 = ((eax_31 - 1) | 0xfffffffc) + 1
        
        int32_t eax_35
        int32_t edx_8
        edx_8:eax_35 = sx.q(arg4)
        int32_t xmm3_2 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(eax_31)) - 0.5) * 200.0 + 100.0)
        double xmm0_24 = _mm_cvtepi32_pd(zx.q((eax_35 + (edx_8 & 3)) s>> 2))
        int32_t var_94 = xmm3_2
        int32_t var_90_1 = _mm_cvtpd_ps((4.5 - xmm0_24) * 200.0 + 190.0)
        int32_t var_8_4 = 3
        int32_t var_ac_4 = arg4
        class cocos2d::MoveTo* eax_38 = cocos2d::MoveTo::create(0.5f, &var_94)
        int32_t* var_1c_3 = esi_3
        int32_t var_34_1 = 0
        int32_t var_8_5 = 4
        void* ecx_23 = operator new(0x14)
        
        if (ecx_23 == 0)
            ecx_23 = std::_Xbad_alloc()
        
        *ecx_23 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_2cf07c9087bb2e686ca5c0c0960ff228>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
        *(ecx_23 + 4) = arg1.q
        *(ecx_23 + 0xc) = var_75_2.d
        int32_t var_8_6 = 5
        char var_44
        class cocos2d::CallFunc* eax_41 = cocos2d::CallFunc::create(&var_44)
        int32_t var_8_7 = 0xffffffff
        
        if (ecx_23 != 0)
            (*(*ecx_23 + 0x10))(ecx_23 != &var_44)
            esi_3 = var_80
            int32_t var_34_3 = 0
        
        int32_t var_a8_12 = 0
        class cocos2d::CallFunc* var_ac_5 = eax_41
        *(arg1 + 0x2bc) = 1
        result = (*(*esi_3 + 0x1c4))(cocos2d::Sequence::create(eax_38))
        
        if (eax_21 != 0)
            int32_t esi_6 = var_84_2
            
            if (esi_6 == 4)
                esi_6 = 1
                char* eax_44 = sub_401900(&var_2c, "images/")
                int32_t var_8_8 = 6
                char* eax_45 = sub_403f60(eax_44.b, eax_44, &var_44, *data_42904c)
                var_8_8.b = 7
                void* var_74
                sub_403f60(eax_45.b, eax_45, &var_74, ".png")
                int32_t var_30
                
                if (var_30 u>= 0x10)
                    operator delete(var_44.d)
                
                int32_t var_30_1 = 0xf
                int32_t var_34_4 = 0
                var_44 = 0
                var_8_8.b = 0xa
                
                if (var_75_2.d u>= 0x10)
                    operator delete(var_2c)
                
                char var_18_1
                var_18_1.d = 0xf
                int32_t var_1c_4 = 0
                var_2c.b = 0
                (*(*eax_21 + 0x288))(&var_74)
                int32_t var_8_9 = 0xffffffff
                int32_t var_60
                
                if (var_60 u>= 0x10)
                    operator delete(var_74)
            
            int32_t esi_7
            
            if (esi_6 != 5)
                esi_7 = mods.dp.d(sx.q(esi_6 - 1), 3)
            else
                esi_7 = 3
                *(arg1 + 0x2a7) = 1
                *(arg1 + 0x2c8) = 1
                *(arg1 + 0x2aa) = 1
            
            int32_t* ecx_31 = *(arg1 + (esi_7 << 2) + 0x3f8)
            
            if (ecx_31 != 0)
                double xmm0_28 = _mm_cvtepi32_pd(zx.q(esi_7))
                *(arg1 + (esi_7 << 2) + 0x408) = ecx_31
                (*(*ecx_31 + 0x48))(
                    _mm_cvtpd_ps(_mm_cvtps_pd(_mm_cvtpd_ps((xmm0_28 * 1.5 + 0.5) * 100.0 + 100.0))
                        + 25.0), 
                    0x42f6aaab)
                (*(**(arg1 + (esi_7 << 2) + 0x408) + 0xc))(6)
            
            *(arg1 + (esi_7 << 2) + 0x3f8) = eax_21
            int32_t var_a8_19 = (*(*eax_21 + 0x44))(eax_2)
            (*(*eax_21 + 0x40))(_mm_cvtpd_ps(_mm_cvtps_pd(fconvert.s(arg2)) * 0.5))
            (*(*eax_21 + 0xc))(0xa)
            class cocos2d::RotateBy* eax_56
            int32_t ecx_37
            eax_56, ecx_37 = cocos2d::RotateBy::create(0.300000012f, 180f)
            int32_t var_90_2 = 0x42f6aaab
            var_94 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(esi_7)) * 1.5 + 0.5) * 100.0 + 100.0)
            int32_t var_8_10 = 0xb
            int32_t var_ac_7 = ecx_37
            class cocos2d::MoveTo* eax_57 = cocos2d::MoveTo::create(0.5f, &var_94)
            struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_6300c12aab0e9f097ae7e7b50f310e4c>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
                * const var_5c = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6300c12aab0e9f097ae7e7b50f310e4c>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
            void* var_58_1 = arg1
            int32_t* var_54_1 = eax_21
            struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_6300c12aab0e9f097ae7e7b50f310e4c>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
                * const* var_4c_1 = &var_5c
            int32_t var_8_11 = 0xd
            class cocos2d::CallFunc* eax_58 = cocos2d::CallFunc::create(&var_5c)
            int32_t var_8_12 = 0xffffffff
            
            if (var_4c_1 != 0)
                (*var_4c_1)->__offset(0x10).d(var_4c_1 != &var_5c)
                int32_t var_4c_2 = 0
            
            int32_t var_a8_23 = 0
            class cocos2d::CallFunc* var_ac_8 = eax_58
            class cocos2d::MoveTo* var_b0_5 = eax_57
            result = (*(*eax_21 + 0x1c4))(cocos2d::Sequence::create(eax_56))
            *(arg1 + 0x2bc) = 2
    else
        char var_75 = arg4.b
        void* ecx_3 = *(arg1 + 0x2a0)
        char var_76 = arg3.b
        result = sub_403340(ecx_3, &var_76)
        int32_t* esi = *(arg1 + (arg3 << 2) + 0x3f8)
        var_80 = esi
        
        if (esi != 0)
            int32_t* ecx_4 = *(arg1 + (arg3 << 2) + 0x408)
            double xmm1_1 = 100.0
            
            if (ecx_4 == 0)
                *(arg1 + (arg3 << 2) + 0x3f8) = 0
            else
                double xmm0_2 = _mm_cvtepi32_pd(zx.q(arg3))
                *(arg1 + (arg3 << 2) + 0x3f8) = ecx_4
                (*(*ecx_4 + 0x48))(_mm_cvtpd_ps((xmm0_2 * 1.5 + 0.5) * xmm1_1 + xmm1_1), 0x42f6aaab)
                (*(**(arg1 + (arg3 << 2) + 0x3f8) + 0xc))(7)
                *(arg1 + (arg3 << 2) + 0x408) = 0
            
            *(arg1 + (arg4 << 2) + 0x330) = esi
            int32_t var_a8_1 = (*(*esi + 0x44))(eax_2)
            (*(*esi + 0x40))(fconvert.s(arg2) * 2f)
            (*(*esi + 0xc))(0xa)
            int32_t ecx_11 = arg4 & 0x80000003
            
            if (ecx_11 s< 0)
                ecx_11 = ((ecx_11 - 1) | 0xfffffffc) + 1
            
            int32_t eax_14
            int32_t edx_2
            edx_2:eax_14 = sx.q(arg4)
            int32_t xmm3_1 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(ecx_11)) - 0.5) * 200.0 + 100.0)
            double xmm0_16 = _mm_cvtepi32_pd(zx.q((eax_14 + (edx_2 & 3)) s>> 2))
            int32_t var_88 = xmm3_1
            int32_t var_84_1 = _mm_cvtpd_ps((4.5 - xmm0_16) * 200.0 + 190.0)
            int32_t var_8_1 = 0
            int32_t var_ac_2 = ecx_11
            class cocos2d::MoveTo* eax_17 = cocos2d::MoveTo::create(0.5f, &var_88)
            var_2c = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6ea96c7c106cffeb911057939d93c50c>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
            void* var_28_1 = arg1
            int32_t* var_24_1 = esi
            struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_6ea96c7c106cffeb911057939d93c50c>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
                * const* var_1c_1 = &var_2c
            int32_t var_8_2 = 2
            class cocos2d::CallFunc* eax_18 = cocos2d::CallFunc::create(&var_2c)
            int32_t var_8_3 = 0xffffffff
            
            if (var_1c_1 != 0)
                (*var_1c_1)->__offset(0x10).d(var_1c_1 != &var_2c)
                esi = var_80
                int32_t var_1c_2 = 0
            
            int32_t var_a8_5 = 0
            class cocos2d::CallFunc* var_ac_3 = eax_18
            result = (*(*esi + 0x1c4))(cocos2d::Sequence::create(eax_17))
            *(arg1 + 0x2bc) = 1
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
