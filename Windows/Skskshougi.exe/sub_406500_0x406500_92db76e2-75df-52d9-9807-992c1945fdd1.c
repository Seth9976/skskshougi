// ============================================================
// 函数名称: sub_406500
// 虚拟地址: 0x406500
// WARP GUID: 92db76e2-75df-52d9-9807-992c1945fdd1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402320, sub_403de0, sub_40cfa0, sub_40d150, ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z, sub_409540, sub_40d710, sub_40d010, sub_402600, sub_40d0c0, sub_40ce90, sub_4067d0
// [被调用的父级函数]: sub_405f80
// ============================================================

int32_t __thiscallsub_406500(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t* ecx = arg1[0x10e]
    int32_t* ecx = arg1[0x10e]
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        arg1[0x10e] = 0
    
    int32_t* ecx_1 = arg1[0x10f]
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x12c))(1)
        arg1[0x10f] = 0
    
    uint32_t eax_3 = arg1[0xae]
    
    if (eax_3 s> 0x13)
        eax_3.b = 0x18
        eax_3.b = 0x18 - arg1[0xae].b
        eax_3 = zx.d(eax_3.b)
    
    long double x87_r0
    sub_409540(arg1, x87_r0, eax_3, arg2)
    arg1[0xb4] += 1
    sub_40d010(&arg1[0x119], arg1[0xb4])
    sub_40cfa0(&arg1[0x11c], arg1[0xb4])
    sub_40ce90(&arg1[0x11f], arg1[0xb4])
    sub_40ce90(&arg1[0x122], arg1[0xb4])
    sub_40d0c0(&arg1[0x119], arg1[0xa8])
    void* ecx_8 = &arg1[0x11c]
    
    if (arg1[0x11d] == *(ecx_8 + 8))
        sub_403de0(ecx_8, 1)
        ecx_8 = &arg1[0x11c]
    
    char* edx = *(ecx_8 + 4)
    
    if (edx != 0)
        int32_t eax_4
        eax_4.b = arg1[0xae].b
        *edx = eax_4.b
        edx[1] = arg2.b
    
    *(ecx_8 + 4) += 2
    int32_t eax_6 = arg1[0x120]
    int32_t var_8 = 0
    int32_t edx_1
    
    if (&var_8 u< eax_6)
        edx_1 = arg1[0x11f]
    
    if (&var_8 u>= eax_6 || edx_1 u> &var_8)
        if (eax_6 == arg1[0x121])
            sub_40d150(&arg1[0x11f], 1)
        
        int32_t* eax_9 = arg1[0x120]
        
        if (eax_9 != 0)
            *eax_9 = 0
    else
        if (eax_6 == arg1[0x121])
            sub_40d150(&arg1[0x11f], 1)
        
        int32_t* edx_2 = arg1[0x120]
        
        if (edx_2 != 0)
            *edx_2 = *(arg1[0x11f] + ((&var_8 - edx_1) s>> 2 << 2))
    
    arg1[0x120] += 4
    int32_t eax_10 = arg1[0x123]
    int32_t var_c = 0
    int32_t ecx_13
    
    if (&var_c u< eax_10)
        ecx_13 = arg1[0x122]
    
    if (&var_c u>= eax_10 || ecx_13 u> &var_c)
        if (eax_10 == arg1[0x124])
            sub_40d150(&arg1[0x122], 1)
        
        int32_t* eax_13 = arg1[0x123]
        
        if (eax_13 != 0)
            *eax_13 = 0
    else
        if (eax_10 == arg1[0x124])
            sub_40d150(&arg1[0x122], 1)
        
        int32_t* ecx_15 = arg1[0x123]
        
        if (ecx_15 != 0)
            *ecx_15 = *(arg1[0x122] + ((&var_c - ecx_13) s>> 2 << 2))
    
    arg1[0x123] += 4
    GSI1::QueryMiniPDBForTiDefnUDT2(arg1, arg2)
    void* ebx_3 = arg1[0xa8]
    char* eax_14 = sub_402600(ebx_3)
    
    if (eax_14.b == 0)
        arg1[0xb0] = 0
    else
        arg1[0xb0] += 1
        void* ecx_19 = &arg1[0xb1]
        
        if (arg1[0xb1] s< arg1[0xb0])
            ecx_19 = &arg1[0xb0]
        
        eax_14 = *ecx_19
        arg1[0xb1] = eax_14
    
    if (*(ebx_3 + 0x11) == 0xd)
        eax_14 = sub_402320(ebx_3, 0x11)
    
    if (*(ebx_3 + 0x11) == 0xd && eax_14.b == 0)
    label_406740:
        *(arg1 + 0x2a7) = 1
        arg1[0xb2] = 0xffffffff
        *(arg1 + 0x2ab) = 1
    else
        if (*(ebx_3 + 0x12) == 0xd)
            eax_14 = sub_402320(ebx_3, 0x12)
        
        if (*(ebx_3 + 0x12) == 0xd && eax_14.b == 0)
            goto label_406740
        
        if (*(ebx_3 + 0x13) == 0xd)
            eax_14 = sub_402320(ebx_3, 0x13)
            
            if (eax_14.b == 0)
                goto label_406740
    
    if (sub_40d710(eax_14, arg1[0x11a], arg1[0x119], ebx_3) s>= 3)
        *(arg1 + 0x2a7) = 1
        arg1[0xb2] = 0
    
    int32_t* ecx_24 = arg1[0x110]
    *(arg1 + 0x2af) = 0
    *(arg1 + 0x2a9) = 1
    (*(*ecx_24 + 0xac))(1)
    (*(*arg1[0x111] + 0xac))(0)
    return sub_4067d0(arg1)
}
