// ============================================================
// 函数名称: sub_40d600
// 虚拟地址: 0x40d600
// WARP GUID: bcf7a2ec-af44-5d95-928f-f57457fc83a8
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403b20
// [被调用的父级函数]: sub_409c90
// ============================================================

char* __convention("regparm")sub_40d600(int32_t arg1, int32_t* arg2, char* arg3, void** arg4)
{
    // 第一条实际指令: char* var_8 = arg3
    char* var_8 = arg3
    int32_t var_8_1 = 0
    int32_t* eax = sub_403b20(arg2, arg4, nullptr, 0xffffffff)
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
