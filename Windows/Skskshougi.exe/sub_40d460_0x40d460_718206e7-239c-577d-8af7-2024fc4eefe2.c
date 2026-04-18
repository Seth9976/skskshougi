// ============================================================
// 函数名称: sub_40d460
// 虚拟地址: 0x40d460
// WARP GUID: 718206e7-239c-577d-8af7-2024fc4eefe2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401c80, sub_403b20, sub_403be0
// [被调用的父级函数]: sub_4169c0, sub_406900, sub_414c30, sub_406f90, sub_417760, sub_418440, sub_408a30, sub_409c90, ?OnAsanReport@__vcasan@@YAXPBD0_N@Z, sub_413c30
// ============================================================

int32_t* __convention("regparm")sub_40d460(int32_t arg1, char* arg2, int32_t* arg3, void** arg4)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b0b9
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_28 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* var_18 = arg3
    int32_t var_14 = 0
    arg3[5] = 0xf
    arg3[4] = 0
    *arg3 = 0
    int32_t var_8_1 = 0
    int32_t var_14_1 = 1
    void* ecx
    
    if (*arg2 != 0)
        char* ecx_1 = arg2
        char i
        
        do
            i = *ecx_1
            ecx_1 = &ecx_1[1]
        while (i != 0)
        ecx = ecx_1 - &ecx_1[1]
    else
        ecx = nullptr
    
    int32_t ebx = arg3[4]
    int32_t* eax_5 = arg4[4] + ecx
    
    if (ebx u<= eax_5 && arg3[5] != eax_5 && sub_401c80(arg3, eax_5, 1).b != 0)
        bool cond:1_1 = arg3[5] u< 0x10
        arg3[4] = ebx
        
        if (cond:1_1)
            eax_5 = arg3
        else
            eax_5 = *arg3
        
        *(eax_5 + ebx) = 0
    
    void* ecx_3
    
    if (*arg2 != 0)
        char* ecx_4 = arg2
        
        do
            eax_5.b = *ecx_4
            ecx_4 = &ecx_4[1]
        while (eax_5.b != 0)
        
        ecx_3 = ecx_4 - &ecx_4[1]
    else
        ecx_3 = nullptr
    
    sub_403be0(arg3, arg2, ecx_3)
    sub_403b20(arg3, arg4, nullptr, 0xffffffff)
    fsbase->NtTib.ExceptionList = ExceptionList
    return arg3
}
