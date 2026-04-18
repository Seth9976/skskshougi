// ============================================================
// 函数名称: sub_4146d0
// 虚拟地址: 0x4146d0
// WARP GUID: 24bb04a9-a34c-56a1-8ff2-91b036b55eb2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4159b0, sub_401ae0, sub_4199b8, sub_415890
// [被调用的父级函数]: sub_414200
// ============================================================

int32_t __fastcallsub_4146d0(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b448
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_4c = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t edi = *(arg1 + 0x2f8)
    int32_t eax_4 = *(arg1 + 0x304)
    int32_t edx = 0
    int32_t esi = edi
    
    if (eax_4 != 0)
        if (eax_4 s>= 0 || neg.d(eax_4) == 0)
            esi += eax_4 u>> 5 << 2
        else
            esi += 0xfffffffc - ((0xffffffff - eax_4) u>> 5 << 2)
        
        edx = eax_4 & 0x1f
    
    void var_38
    sub_4159b0(arg1 + 0x2f8, &var_38, edi, 0, esi, edx)
    sub_415890(arg1 + 0x2f8)
    int32_t* eax_9 = *(arg1 + 0x2f8)
    *eax_9 &= 0xfffffffe
    int32_t* eax_10 = data_42e4e0
    
    if (*eax_10 s>= 5)
        int32_t* eax_11 = *(arg1 + 0x2f8)
        *eax_11 &= 0xfffffffd
        eax_10 = data_42e4e0
    
    if (eax_10[1] s>= 5)
        int32_t* eax_12 = *(arg1 + 0x2f8)
        *eax_12 &= 0xfffffffb
        eax_10 = data_42e4e0
    
    if (eax_10[2] s>= 5)
        int32_t* eax_13 = *(arg1 + 0x2f8)
        *eax_13 &= 0xfffffff7
        eax_10 = data_42e4e0
    
    if (eax_10[3] s>= 5)
        int32_t* eax_14 = *(arg1 + 0x2f8)
        *eax_14 &= 0xffffffef
        eax_10 = data_42e4e0
    
    if (eax_10[4] s>= 5)
        int32_t* eax_15 = *(arg1 + 0x2f8)
        *eax_15 &= 0xffffffdf
        eax_10 = data_42e4e0
    
    if (eax_10[5] s>= 5)
        int32_t* eax_16 = *(arg1 + 0x2f8)
        *eax_16 &= 0xffffffbf
        eax_10 = data_42e4e0
    
    if (eax_10[6] s>= 5)
        int32_t* eax_17 = *(arg1 + 0x2f8)
        *eax_17 &= 0xffffff7f
        eax_10 = data_42e4e0
    
    if (eax_10[7] s>= 5)
        int32_t* eax_18 = *(arg1 + 0x2f8)
        *eax_18 &= 0xfffffeff
    
    int32_t result
    
    for (int32_t i = 1; i s< 9; i += 1)
        char* edx_3
        
        if ((*(*(arg1 + 0x2f8) + (i u>> 5 << 2)) & 1 << (i.b & 0x1f)) == 0)
            edx_3 = (&data_41d880)[i]
        else
            edx_3 = (&data_41d850)[i]
        
        int32_t var_18_1 = 0xf
        int32_t var_1c_1 = 0
        char var_2c = 0
        void* eax_22
        
        if (*edx_3 != 0)
            char* eax_23 = edx_3
            void* ecx_8
            
            do
                ecx_8.b = *eax_23
                eax_23 = &eax_23[1]
            while (ecx_8.b != 0)
            eax_22 = eax_23 - &eax_23[1]
        else
            eax_22 = nullptr
        
        sub_401ae0(&var_2c, edx_3, eax_22)
        int32_t var_8_1 = 0
        result = (*(**((i << 2) + *(arg1 + 0x2d4)) + 0x288))(&var_2c)
        int32_t var_8_2 = 0xffffffff
        
        if (var_18_1 u>= 0x10)
            result = operator delete(var_2c.d)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
