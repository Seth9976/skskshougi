// ============================================================
// 函数名称: sub_40d550
// 虚拟地址: 0x40d550
// WARP GUID: f2e0fd24-76e5-5af1-837a-e8d6edae8ad2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403910, sub_403b20, sub_404140
// [被调用的父级函数]: sub_40baa0, sub_419230, sub_406900, sub_40c770, sub_40b730
// ============================================================

char* __convention("regparm")sub_40d550(int32_t arg1, void* arg2, char* arg3, int32_t* arg4)
{
    // 第一条实际指令: char* var_8 = arg3
    char* var_8 = arg3
    int32_t esi = *(arg2 + 0x10)
    int32_t var_8_1 = 0
    
    if (arg4[4] u> *(arg2 + 0x14) - esi && arg4[5] - arg4[4] u>= esi)
        int32_t var_14_1 = 0xffffffff
        sub_403910(arg3, sub_404140(arg4, arg4, arg2, nullptr))
        return arg3
    
    int32_t* eax_6 = sub_403b20(arg2, arg4, nullptr, 0xffffffff)
    *(arg3 + 0x14) = 0xf
    *(arg3 + 0x10) = 0
    *arg3 = 0
    
    if (eax_6[5] u>= 0x10)
        *arg3 = *eax_6
        *eax_6 = 0
    else
        int32_t eax_7 = eax_6[4]
        
        if (eax_7 != 0xffffffff)
            memmove(arg3, eax_6, eax_7 + 1)
    
    *(arg3 + 0x10) = eax_6[4]
    *(arg3 + 0x14) = eax_6[5]
    eax_6[5] = 0xf
    eax_6[4] = 0
    *eax_6 = 0
    return arg3
}
