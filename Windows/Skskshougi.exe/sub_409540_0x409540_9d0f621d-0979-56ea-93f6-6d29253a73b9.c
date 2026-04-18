// ============================================================
// 函数名称: sub_409540
// 虚拟地址: 0x409540
// WARP GUID: 9d0f621d-0979-56ea-93f6-6d29253a73b9
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401900, sub_4021b0, sub_403f60, sub_403340, sub_4199b8
// [被调用的父级函数]: sub_40b730, sub_40c770, sub_406500, sub_40b620
// ============================================================

int32_t __thiscallsub_409540(void* arg1, long double arg2 @ st0, int32_t arg3, int32_t arg4)
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
    
    char* esi = *(arg1 + 0x2a0)
    char var_7a = arg3.b
    char var_79 = arg4.b
    int32_t result
    int16_t var_7c
    struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_6db028b942db885355c5969cb41c29a2>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
        * const var_2c
    
    if (arg3 s>= 5)
        int32_t* eax_21 = *(arg1 + (arg4 << 2) + 0x330)
        int32_t var_84_2 = zx.d(esi[arg4]) & 7
        int32_t eax_23
        eax_23.b = esi[arg3]
        char var_77_2 = eax_23.b
        eax_23.w = var_7a.w
        var_7c = eax_23.w
        
        if (arg3.b u>= 5)
            eax_23.b = 0x18
            eax_23.b = 0x18 - arg3.b
            var_7c.b = eax_23.b
        
        eax_23.b = 0x18
        eax_23.b = 0x18 - var_7c:1.b
        var_7c:1.b = eax_23.b
        sub_4021b0(esi)
        sub_403340(esi, &var_7c)
        sub_4021b0(esi)
        char var_77_3
        int32_t eax_25
        int32_t edx_5
        
        if (arg3 s>= 9 && var_77_2 == 9)
            var_77_3 = 1
            edx_5:eax_25 = sx.q(arg4)
        
        if (arg3 s< 9 || var_77_2 != 9 || (eax_25 + (edx_5 & 3)) s>> 2 != 4)
            var_77_3 = 0
        
        int32_t* esi_4 = *(arg1 + (arg3 << 2) + 0x330)
        *(arg1 + (arg4 << 2) + 0x330) = esi_4
        *(arg1 + (arg3 << 2) + 0x330) = 0
        var_7c.d = esi_4
        (*(*esi_4 + 0xc))(9)
        int32_t eax_30 = arg4 & 0x80000003
        
        if (eax_30 s< 0)
            eax_30 = ((eax_30 - 1) | 0xfffffffc) + 1
        
        int32_t eax_34
        int32_t edx_7
        edx_7:eax_34 = sx.q(arg4)
        int32_t xmm3_2 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(eax_30)) - 0.5) * 200.0 + 100.0)
        double xmm0_24 = _mm_cvtepi32_pd(zx.q((eax_34 + (edx_7 & 3)) s>> 2))
        int32_t var_94 = xmm3_2
        int32_t var_90_1 = _mm_cvtpd_ps((4.5 - xmm0_24) * 200.0 + 190.0)
        int32_t var_8_4 = 3
        int32_t var_ac_4 = arg4
        class cocos2d::MoveTo* eax_37 = cocos2d::MoveTo::create(0.5f, &var_94)
        int32_t* var_1c_3 = esi_4
        int32_t var_34_1 = 0
        int32_t var_8_5 = 4
        void* ecx_25 = operator new(0x14)
        
        if (ecx_25 == 0)
            ecx_25 = std::_Xbad_alloc()
        
        *ecx_25 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_3cd70c01d224d29ae60e73621cd86ac6>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
        *(ecx_25 + 4) = arg1.q
        *(ecx_25 + 0xc) = var_77_3.d
        int32_t var_8_6 = 5
        char var_44
        class cocos2d::CallFunc* eax_40 = cocos2d::CallFunc::create(&var_44)
        int32_t var_8_7 = 0xffffffff
        
        if (ecx_25 != 0)
            (*(*ecx_25 + 0x10))(ecx_25 != &var_44)
            esi_4 = var_7c.d
            int32_t var_34_3 = 0
        
        int32_t var_a8_11 = 0
        class cocos2d::CallFunc* var_ac_5 = eax_40
        result = (*(*esi_4 + 0x1c4))(cocos2d::Sequence::create(eax_37))
        *(arg1 + 0x2bc) = 1
        
        if (eax_21 != 0)
            int32_t esi_7 = var_84_2
            
            if (esi_7 == 4)
                esi_7 = 1
                char* eax_43 = sub_401900(&var_2c, "images/")
                int32_t var_8_8 = 6
                char* eax_44 = sub_403f60(eax_43.b, eax_43, &var_44, *data_42904c)
                var_8_8.b = 7
                void* var_74
                sub_403f60(eax_44.b, eax_44, &var_74, ".png")
                int32_t var_30
                
                if (var_30 u>= 0x10)
                    operator delete(var_44.d)
                
                int32_t var_30_1 = 0xf
                int32_t var_34_4 = 0
                var_44 = 0
                var_8_8.b = 0xa
                
                if (var_77_3.d u>= 0x10)
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
            
            int32_t esi_8
            
            if (esi_7 != 5)
                esi_8 = mods.dp.d(sx.q(esi_7 - 1), 3)
            else
                esi_8 = 3
                *(arg1 + 0x2a7) = 1
                *(arg1 + 0x2c8) = 0xffffffff
                *(arg1 + 0x2aa) = 1
            
            int32_t* ecx_33 = *(arg1 + (esi_8 << 2) + 0x414)
            
            if (ecx_33 != 0)
                double xmm0_28 = _mm_cvtepi32_pd(zx.q(esi_8))
                *(arg1 + (esi_8 << 2) + 0x424) = ecx_33
                (*(*ecx_33 + 0x48))(
                    _mm_cvtpd_ps(_mm_cvtps_pd(_mm_cvtpd_ps((xmm0_28 * 1.5 + 0.5) * 100.0 + 100.0))
                        + 25.0), 
                    0x44841555)
                (*(**(arg1 + (esi_8 << 2) + 0x424) + 0xc))(6)
            
            *(arg1 + (esi_8 << 2) + 0x414) = eax_21
            int32_t var_a8_18 = (*(*eax_21 + 0x44))(eax_2)
            (*(*eax_21 + 0x40))(_mm_cvtpd_ps(_mm_cvtps_pd(fconvert.s(arg2)) * 0.5))
            (*(*eax_21 + 0xc))(0xa)
            class cocos2d::RotateBy* eax_55
            int32_t ecx_39
            eax_55, ecx_39 = cocos2d::RotateBy::create(0.300000012f, 180f)
            int32_t var_90_2 = 0x44841555
            var_94 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(esi_8)) * 1.5 + 0.5) * 100.0 + 100.0)
            int32_t var_8_10 = 0xb
            int32_t var_ac_7 = ecx_39
            class cocos2d::MoveTo* eax_56 = cocos2d::MoveTo::create(0.5f, &var_94)
            struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_2f7651a0ae7803a7a0771d39d94abeb2>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
                * const var_5c = &std::_Func_impl<struct std::_Callable_obj<class <lambda_2f7651a0ae7803a7a0771d39d94abeb2>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
            void* var_58_1 = arg1
            int32_t* var_54_1 = eax_21
            struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_2f7651a0ae7803a7a0771d39d94abeb2>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
                * const* var_4c_1 = &var_5c
            int32_t var_8_11 = 0xd
            class cocos2d::CallFunc* eax_57 = cocos2d::CallFunc::create(&var_5c)
            int32_t var_8_12 = 0xffffffff
            
            if (var_4c_1 != 0)
                (*var_4c_1)->__offset(0x10).d(var_4c_1 != &var_5c)
                int32_t var_4c_2 = 0
            
            int32_t var_a8_22 = 0
            class cocos2d::CallFunc* var_ac_8 = eax_57
            class cocos2d::MoveTo* var_b0_5 = eax_56
            result = (*(*eax_21 + 0x1c4))(cocos2d::Sequence::create(eax_55))
            *(arg1 + 0x2bc) = 2
    else
        int32_t eax_5
        eax_5.w = var_7a.w
        int16_t var_78 = eax_5.w
        
        if (arg3.b u>= 5)
            eax_5.b = 0x18
            eax_5.b = 0x18 - arg3.b
            var_78.b = eax_5.b
        
        eax_5.b = 0x18
        char var_77
        eax_5.b = 0x18 - var_77
        char var_77_1 = eax_5.b
        sub_4021b0(esi)
        sub_403340(esi, &var_78)
        result = sub_4021b0(esi)
        int32_t* ecx_6 = *(arg1 + (arg3 << 2) + 0x424)
        int32_t* esi_1 = *(arg1 + (arg3 << 2) + 0x414)
        double xmm1 = 100.0
        var_7c.d = esi_1
        
        if (ecx_6 == 0)
            *(arg1 + (arg3 << 2) + 0x414) = 0
        else
            double xmm0_2 = _mm_cvtepi32_pd(zx.q(arg3))
            *(arg1 + (arg3 << 2) + 0x414) = ecx_6
            (*(*ecx_6 + 0x48))(_mm_cvtpd_ps((xmm0_2 * 1.5 + 0.5) * xmm1 + xmm1), 0x44841555)
            result = (*(**(arg1 + (arg3 << 2) + 0x414) + 0xc))(7)
            *(arg1 + (arg3 << 2) + 0x424) = 0
        
        if (esi_1 != 0)
            *(arg1 + (arg4 << 2) + 0x330) = esi_1
            int32_t var_a8_1 = (*(*esi_1 + 0x44))(eax_2)
            (*(*esi_1 + 0x40))(fconvert.s(arg2) * 2f)
            (*(*esi_1 + 0xc))(0xa)
            int32_t ecx_13 = arg4 & 0x80000003
            
            if (ecx_13 s< 0)
                ecx_13 = ((ecx_13 - 1) | 0xfffffffc) + 1
            
            int32_t eax_14
            int32_t edx_2
            edx_2:eax_14 = sx.q(arg4)
            int32_t xmm3_1 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(ecx_13)) - 0.5) * 200.0 + 100.0)
            double xmm0_16 = _mm_cvtepi32_pd(zx.q((eax_14 + (edx_2 & 3)) s>> 2))
            int32_t var_88 = xmm3_1
            int32_t var_84_1 = _mm_cvtpd_ps((4.5 - xmm0_16) * 200.0 + 190.0)
            int32_t var_8_1 = 0
            int32_t var_ac_2 = ecx_13
            class cocos2d::MoveTo* eax_17 = cocos2d::MoveTo::create(0.5f, &var_88)
            var_2c = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6db028b942db885355c5969cb41c29a2>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
            void* var_28_1 = arg1
            int32_t* var_24_1 = esi_1
            struct std::_Func_base<void>::std::_Func_impl<struct std::_Callable_obj<class <lambda_6db028b942db885355c5969cb41c29a2>, 0>, class std::allocator<class std::_Func_class<void>>, void>::VTable
                * const* var_1c_1 = &var_2c
            int32_t var_8_2 = 2
            class cocos2d::CallFunc* eax_18 = cocos2d::CallFunc::create(&var_2c)
            int32_t var_8_3 = 0xffffffff
            
            if (var_1c_1 != 0)
                (*var_1c_1)->__offset(0x10).d(var_1c_1 != &var_2c)
                esi_1 = var_7c.d
                int32_t var_1c_2 = 0
            
            int32_t var_a8_5 = 0
            class cocos2d::CallFunc* var_ac_3 = eax_18
            result = (*(*esi_1 + 0x1c4))(cocos2d::Sequence::create(eax_17))
            *(arg1 + 0x2bc) = 1
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
