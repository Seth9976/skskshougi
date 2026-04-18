// ============================================================
// 函数名称: sub_4084f0
// 虚拟地址: 0x4084f0
// WARP GUID: 0764c815-38eb-552d-9156-ab11aa9207ef
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d2b0
// [被调用的父级函数]: sub_405d60
// ============================================================

void* __thiscallsub_4084f0(int32_t* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41aa82
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_48 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* var_18 = arg1
    int32_t eax_3 = arg1[0x117]
    int32_t* esi = arg1[0x116]
    int32_t ebx = 0
    uint32_t edi_3 = (eax_3 - esi + 3) u>> 2
    
    if (esi u> eax_3)
        edi_3 = 0
    
    if (edi_3 != 0)
        do
            (*(**esi + 0x12c))(1)
            ebx += 1
            esi = &esi[1]
        while (ebx != edi_3)
        
        arg1 = var_18
    
    void* result = arg1[0x116]
    arg1[0x117] = result
    void* esi_1 = *arg2
    int32_t edi_6 = arg2[1]
    
    while (esi_1 != edi_6)
        arg1.b = *(esi_1 + 1)
        double xmm3_1 = 200.0
        int32_t eax_6 = zx.d(arg1.b) & 0x80000003
        
        if (eax_6 s< 0)
            eax_6 = ((eax_6 - 1) | 0xfffffffc) + 1
        
        arg1.b u>>= 2
        int32_t xmm2_1 = _mm_cvtpd_ps((_mm_cvtepi32_pd(zx.q(eax_6)) - 0.5) * xmm3_1 + 100.0)
        double xmm0_7 = _mm_cvtepi32_pd(zx.q(arg1.b))
        int32_t var_28 = xmm2_1
        int32_t var_24_1 = _mm_cvtpd_ps((4.5 - xmm0_7) * xmm3_1 + 190.0)
        int32_t var_8_1 = 0
        class cocos2d::Sprite* eax_10
        cocos2d::Rect* ecx_1
        eax_10, ecx_1 = cocos2d::Sprite::create()
        arg2 = eax_10
        var_8_1.b = 1
        (*(*arg2 + 0x290))(cocos2d::Rect::Rect(ecx_1, 0f, 0f, 200f, 200f))
        var_8_1.b = 0
        (*(*arg2 + 0x24c))(cocos2d::Color3B::GREEN)
        (*(*arg2 + 0x4c))(&var_28)
        (*(*var_18 + 0xfc))(arg2, 4)
        int32_t* var_1c = arg2
        int32_t var_8_2 = 0xffffffff
        arg1 = var_18[0x117]
        int32_t edx_2
        
        if (&var_1c u< arg1)
            edx_2 = var_18[0x116]
        
        if (&var_1c u>= arg1 || edx_2 u> &var_1c)
            int32_t edx_8 = var_18[0x118]
            
            if (arg1 == edx_8 && (edx_8 - arg1) s>> 2 u< 1)
                int32_t ecx_13 = (arg1 - var_18[0x116]) s>> 2
                
                if (0x3fffffff - ecx_13 u< 1)
                    result = std::_Xlength_error("vector<T> too long")
                    break
                    break
                
                int32_t edx_10 = (edx_8 - var_18[0x116]) s>> 2
                uint32_t ecx_16 = edx_10 u>> 1
                int32_t edx_11
                
                if (0x3fffffff - ecx_16 u>= edx_10)
                    edx_11 = edx_10 + ecx_16
                else
                    edx_11 = 0
                
                if (edx_11 u< ecx_13 + 1)
                    edx_11 = ecx_13 + 1
                
                sub_40d2b0(&var_18[0x116], edx_11)
            
            result = var_18[0x117]
            
            if (result != 0)
                *result = arg2
        else
            int32_t edx_3 = var_18[0x118]
            result = (&var_1c - edx_2) s>> 2
            void* result_1 = result
            
            if (arg1 == edx_3)
                result = (edx_3 - arg1) s>> 2
                
                if (result u< 1)
                    int32_t ecx_7 = (arg1 - var_18[0x116]) s>> 2
                    
                    if (0x3fffffff - ecx_7 u< 1)
                        result = std::_Xlength_error("vector<T> too long")
                        break
                        break
                    
                    int32_t edx_5 = (edx_3 - var_18[0x116]) s>> 2
                    uint32_t ecx_10 = edx_5 u>> 1
                    int32_t* edx_6
                    
                    if (0x3fffffff - ecx_10 u>= edx_5)
                        edx_6 = edx_5 + ecx_10
                    else
                        edx_6 = nullptr
                    
                    if (edx_6 u< ecx_7 + 1)
                        edx_6 = ecx_7 + 1
                    
                    result, arg1 = sub_40d2b0(&var_18[0x116], edx_6)
            
            void** edx_7 = var_18[0x117]
            
            if (edx_7 != 0)
                result = *(var_18[0x116] + (result_1 << 2))
                *edx_7 = result
                var_18[0x117] += 4
                esi_1 += 2
                continue
        
        var_18[0x117] += 4
        esi_1 += 2
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
