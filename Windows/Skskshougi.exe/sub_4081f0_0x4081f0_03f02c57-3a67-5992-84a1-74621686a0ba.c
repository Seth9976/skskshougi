// ============================================================
// 函数名称: sub_4081f0
// 虚拟地址: 0x4081f0
// WARP GUID: 03f02c57-3a67-5992-84a1-74621686a0ba
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_405f80, sub_405d60
// ============================================================

int32_t __stdcallsub_4081f0(int64_t* arg1, int32_t* arg2, int32_t* arg3)
{
    // 第一条实际指令: float xmm2[0x2] = *arg1
    float xmm2[0x2] = *arg1
    
    if (not(xmm2 f< 100f) && not(700f f<= xmm2))
        float xmm3_1[0x2] = *(arg1 + 4)
        
        if (not(xmm3_1 f< 190f) && not(0x408ef00000000000 f<= _mm_cvtps_pd(xmm3_1)))
            double xmm1_2 = _mm_cvtps_pd(xmm3_1)
            int32_t edx = int.d(_mm_cvtps_pd(xmm2 f- 100f) / 200.0 + 1.0)
            *arg2 = edx
            int32_t ecx_1 = int.d(5.0 - (xmm1_2 - 190.0) / 200.0)
            *arg3 = ecx_1
            return edx + (ecx_1 << 2)
    
    double xmm3_2 = 100.0
    int64_t xmm4 = 0x407f400000000000
    
    if (not(_mm_cvtps_pd(xmm2) f< xmm3_2) && not(xmm4 f<= _mm_cvtps_pd(xmm2)))
        float xmm1_5[0x2] = *(arg1 + 4)
        
        if (not(_mm_cvtps_pd(xmm1_5) f< 73.333333333333329)
                && not(0x4065aaaaaaaaaaaa f<= _mm_cvtps_pd(xmm1_5)))
            return int.d((_mm_cvtps_pd(xmm2) - xmm3_2) / 150.0)
    
    if (not(_mm_cvtps_pd(xmm2) f< xmm3_2) && not(xmm4 f<= _mm_cvtps_pd(xmm2)))
        float xmm1_7[0x2] = *(arg1 + 4)
        
        if (not(_mm_cvtps_pd(xmm1_7) f< 1006.6666666666667)
                && not(0x40914aaaaaaaaaab f<= _mm_cvtps_pd(xmm1_7)))
            return zx.d(0x18 - (int.d((_mm_cvtps_pd(xmm2) - xmm3_2) / 150.0)).b)
    
    return 0xffffffff
}
