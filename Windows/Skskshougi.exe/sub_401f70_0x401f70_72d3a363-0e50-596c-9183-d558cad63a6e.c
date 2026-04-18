// ============================================================
// 函数名称: sub_401f70
// 虚拟地址: 0x401f70
// WARP GUID: 72d3a363-0e50-596c-9183-d558cad63a6e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_404680, sub_40b730, sub_4067d0, sub_40baa0, sub_414c30, sub_411640, sub_418440, sub_409c90, sub_419230, sub_411390, sub_414200, sub_406900, sub_413e00, sub_4114c0, sub_413c30, sub_40b490, sub_415470, sub_406f90, sub_413fd0, sub_40c770, sub_414130, sub_40e550, ?CreatePrimary@UMSFreeVirtualProcessorRoot@details@Concurrency@@AAEXXZ
// ============================================================

char* __fastcallsub_401f70(char* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t __saved_ebp
    int32_t __saved_ebp
    int32_t eax_1 = __security_cookie ^ &__saved_ebp
    int32_t var_4c = 0
    char var_48
    sprintf_s(&var_48, 0x40, &data_41d784, arg2)
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    int32_t ecx
    
    if (var_48 != 0)
        char* ecx_1 = &var_48
        char i
        
        do
            i = *ecx_1
            ecx_1 = &ecx_1[1]
        while (i != 0)
        void var_47
        ecx = ecx_1 - &var_47
    else
        ecx = 0
    
    sub_401ae0(arg1, &var_48, ecx)
    sub_4199b8(eax_1 ^ &__saved_ebp)
    return arg1
}
