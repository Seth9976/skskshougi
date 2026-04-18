// ============================================================
// 函数名称: sub_40f170
// 虚拟地址: 0x40f170
// WARP GUID: 9ed7b6c7-69e7-50cc-8148-715797c4b43d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40eea0
// [被调用的父级函数]: 无
// ============================================================

int32_t* __thiscallsub_40f170(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t esi
    int32_t esi
    int32_t var_18 = esi
    void var_10
    void* var_1c = &var_10
    int32_t* result = cocos2d::Touch::getLocation(*arg2)
    int32_t xmm1 = *result
    
    if (not(30f f> xmm1) && not(xmm1 f>= 770f))
        float xmm1_1[0x2] = result[1]
        
        if (not(85f f> xmm1_1))
            double xmm2_1 = 1015.0
            
            if (not(_mm_cvtps_pd(xmm1_1) f>= xmm2_1))
                int32_t eax
                int32_t edx_1
                edx_1:eax = muls.dp.d(0x2c0b02c1, int.d(xmm2_1 - _mm_cvtps_pd(xmm1_1)))
                int32_t edx_2 = edx_1 s>> 4
                uint32_t eax_2 = edx_2 u>> 0x1f
                result = eax_2 + edx_2
                
                if (eax_2 + edx_2 s>= 0)
                    int32_t* ecx_3 = *(arg1 + 4)
                    
                    if (result == ecx_3[0xa9])
                        return sub_40eea0(ecx_3)
    
    return result
}
