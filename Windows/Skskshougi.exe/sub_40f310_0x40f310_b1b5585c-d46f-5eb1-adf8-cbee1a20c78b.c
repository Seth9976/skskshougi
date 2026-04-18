// ============================================================
// 函数名称: sub_40f310
// 虚拟地址: 0x40f310
// WARP GUID: b1b5585c-d46f-5eb1-adf8-cbee1a20c78b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: ?_Do_call@?$_Func_impl@U?$_Callable_obj@V<lambda_61710bb2f65fa5c843243e2ef45f5091>@@$0A@@std@@V?$allocator@V?$_Func_class@XABIU_Nil@std@@U12@U12@U12@U12@U12@@std@@@2@XABIU_Nil@2@U42@U42@U42@U42@U42@@std@@UAEXABI@Z
// ============================================================

void* __thiscallsub_40f310(int32_t* arg1, int32_t* arg2)
{
    // 第一条实际指令: if (*(*arg1 + 0x2a0) != 0)
    if (*(*arg1 + 0x2a0) != 0)
        void* eax
        eax.b = 0
        return eax
    
    void var_c
    void* var_14 = &var_c
    int32_t* eax_1 = cocos2d::Touch::getLocation(*arg2)
    int32_t xmm1 = *eax_1
    
    if (not(30f f> xmm1) && not(xmm1 f>= 770f))
        float xmm1_1[0x2] = eax_1[1]
        
        if (not(85f f> xmm1_1))
            double xmm2_1 = 1015.0
            
            if (not(_mm_cvtps_pd(xmm1_1) f>= xmm2_1))
                int32_t eax_2
                int32_t edx
                edx:eax_2 = muls.dp.d(0x2c0b02c1, int.d(xmm2_1 - _mm_cvtps_pd(xmm1_1)))
                int32_t edx_1 = edx s>> 4
                *(*arg1 + 0x2a4) = (edx_1 u>> 0x1f) + edx_1
                void* eax_3
                eax_3.b = 1
                return eax_3
    
    *(*arg1 + 0x2a4) = 0xffffffff
    void* eax_4
    eax_4.b = 1
    return eax_4
}
