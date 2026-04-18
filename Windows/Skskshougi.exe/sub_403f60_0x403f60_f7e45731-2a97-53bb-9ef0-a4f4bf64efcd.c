// ============================================================
// 函数名称: sub_403f60
// 虚拟地址: 0x403f60
// WARP GUID: f7e45731-2a97-53bb-9ef0-a4f4bf64efcd
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403be0
// [被调用的父级函数]: sub_40baa0, sub_408ce0, sub_419230, sub_4181f0, sub_406900, sub_414c30, sub_40bee0, sub_406f90, sub_4114c0, sub_40c770, sub_409540, sub_417a30, ?OnAsanReport@__vcasan@@YAXPBD0_N@Z, sub_409c90, sub_409400, sub_40b730, sub_4067d0
// ============================================================

char* __convention("regparm")sub_403f60(char arg1, int32_t* arg2, char* arg3, char* arg4)
{
    // 第一条实际指令: char* var_8 = arg3
    char* var_8 = arg3
    int32_t var_8_1 = 0
    void* esi
    
    if (*arg4 != 0)
        char* esi_1 = arg4
        
        do
            arg1 = *esi_1
            esi_1 = &esi_1[1]
        while (arg1 != 0)
        
        esi = esi_1 - &esi_1[1]
    else
        esi = nullptr
    
    int32_t* eax = sub_403be0(arg2, arg4, esi)
    *(arg3 + 0x14) = 0xf
    *(arg3 + 0x10) = 0
    *arg3 = 0
    
    if (eax[5] u>= 0x10)
        *arg3 = *eax
        *eax = 0
    else
        int32_t eax_1 = eax[4]
        
        if (eax_1 != 0xffffffff)
            memmove(arg3, eax, eax_1 + 1)
    
    *(arg3 + 0x10) = eax[4]
    *(arg3 + 0x14) = eax[5]
    eax[5] = 0xf
    eax[4] = 0
    *eax = 0
    return arg3
}
