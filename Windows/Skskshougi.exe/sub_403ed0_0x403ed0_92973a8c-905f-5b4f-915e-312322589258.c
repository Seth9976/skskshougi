// ============================================================
// 函数名称: sub_403ed0
// 虚拟地址: 0x403ed0
// WARP GUID: 92973a8c-905f-5b4f-915e-312322589258
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_404040
// [被调用的父级函数]: sub_40baa0, sub_4181f0, sub_411390, sub_406900, sub_413e00, sub_415470, sub_404680, sub_414c30, sub_406f90, sub_413fd0, sub_40c770, sub_418440, sub_409c90, sub_40b730, sub_414130, sub_40e550
// ============================================================

char* __convention("regparm")sub_403ed0(char arg1, char* arg2, char* arg3, int32_t* arg4)
{
    // 第一条实际指令: char* var_8 = arg3
    char* var_8 = arg3
    char* result = arg3
    int32_t var_8_1 = 0
    void* esi
    
    if (*arg2 != 0)
        char* esi_1 = arg2
        arg3 = &esi_1[1]
        
        do
            arg1 = *esi_1
            esi_1 = &esi_1[1]
        while (arg1 != 0)
        
        esi = esi_1 - arg3
    else
        esi = nullptr
    
    void* var_14 = esi
    int32_t* eax = sub_404040(arg4, arg3, arg2)
    *(result + 0x14) = 0xf
    *(result + 0x10) = 0
    *result = 0
    
    if (eax[5] u>= 0x10)
        *result = *eax
        *eax = 0
    else
        int32_t eax_1 = eax[4]
        
        if (eax_1 != 0xffffffff)
            memmove(result, eax, eax_1 + 1)
    
    *(result + 0x10) = eax[4]
    *(result + 0x14) = eax[5]
    eax[5] = 0xf
    eax[4] = 0
    *eax = 0
    return result
}
