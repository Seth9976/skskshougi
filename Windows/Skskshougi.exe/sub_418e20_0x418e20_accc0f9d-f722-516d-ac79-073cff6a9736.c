// ============================================================
// 函数名称: sub_418e20
// 虚拟地址: 0x418e20
// WARP GUID: accc0f9d-f722-516d-ac79-073cff6a9736
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_411640
// ============================================================

int32_t* __convention("regparm")sub_418e20(int32_t arg1, int32_t arg2, int32_t* arg3, float arg4 @ xmm2, float arg5 @ xmm3, int32_t arg6, int32_t* arg7)
{
    // 第一条实际指令: arg4 f- 0
    arg4 f- 0
    arg1:1.b = (arg4 == 0f ? 1 : 0) << 6 | (is_unordered.d(arg4, 0f) ? 1 : 0) << 2 | (arg4 < 0f ? 1 : 0)
    bool p_1 = unimplemented  {test ah, 0x44}
    
    if (p_1)
        class cocos2d::Size* eax_1
        cocos2d::Size* ecx_1
        eax_1, ecx_1 = (*(*arg7 + 0xa8))()
        int32_t ecx_2 = cocos2d::Size::Size(ecx_1, eax_1)
        arg5 f- 0
        bool p_2 = unimplemented  {test ah, 0x44}
        int32_t eax_2 = *arg7
        float var_10
        float var_14
        
        if (not(p_2))
            int32_t var_28_3 = ecx_2
            (*(eax_2 + 0x40))(arg4 / var_14)
        else
            (*(eax_2 + 0x3c))(arg4 / var_14, arg5 / var_10)
    
    (*(*arg7 + 0x4c))(arg2)
    (*(*arg3 + 0xfc))(arg7, arg6)
    return arg7
}
