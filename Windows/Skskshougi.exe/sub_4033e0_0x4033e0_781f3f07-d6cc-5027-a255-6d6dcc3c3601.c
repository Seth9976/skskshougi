// ============================================================
// 函数名称: sub_4033e0
// 虚拟地址: 0x4033e0
// WARP GUID: 781f3f07-d6cc-5027-a255-6d6dcc3c3601
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402320, sub_4023d0, sub_403cd0
// [被调用的父级函数]: sub_4035b0
// ============================================================

int32_t __fastcallsub_4033e0(void* arg1)
{
    // 第一条实际指令: void* i = 5
    void* i = 5
    int32_t esi = 0
    
    do
        switch (zx.d(*(i + arg1)) - 1)
            case 0
                esi += 0x64
            case 1
                esi += 0x10b
            case 2
                esi += 0x172
            case 3
                esi += 0x1f5
            case 8
                esi -= 0x64
            case 9
                esi -= 0x10b
            case 0xa
                esi -= 0x172
            case 0xb
                esi -= 0x1f5
        
        i += 1
    while (i s<= 0x13)
    
    int32_t i_1 = 5
    int32_t eax_9 = (zx.d(*(arg1 + 0x19)) - zx.d(*(arg1 + 0x1d))) * 0x64 + esi
        + (zx.d(*(arg1 + 0x1b)) - zx.d(*(arg1 + 0x1f))) * 0x17a
        + (zx.d(*(arg1 + 0x1a)) - zx.d(*(arg1 + 0x1e))) * 0x10b
    int32_t var_c = 0
    int32_t var_8 = 0
    int32_t ecx_7
    
    do
        if (sub_402320(arg1, i_1) != 0)
            var_c += 1
        
        ecx_7 = var_8
        
        if (sub_4023d0(arg1, i_1) != 0)
            ecx_7 += 1
            var_8 = ecx_7
        
        i_1 += 1
    while (i_1 s<= 0x13)
    
    int32_t eax_15 = data_42d140
    
    if (eax_15 == 0x270)
        for (void* i_2 = &data_42d148; i_2 s< 0x42db08; i_2 += 4)
            int32_t edx_5 = ((*(i_2 - 4) ^ *i_2) & 0x7fffffff) ^ *(i_2 - 4)
            uint32_t ecx_10 = zx.d(edx_5.b) & 1
            int32_t ecx_11 = neg.d(ecx_10)
            *(i_2 + 0x9bc) =
                (sbb.d(ecx_11, ecx_11, ecx_10 != 0) & 0x9908b0df) ^ *(i_2 + 0x630) ^ edx_5 u>> 1
        
        eax_15 = data_42d140
    else if (eax_15 u>= 0x4e0)
        sub_403cd0(&data_42d140)
        eax_15 = data_42d140
    
    int32_t ecx_16 = (&data_42d144)[eax_15]
    int32_t esi_1 = data_429020
    data_42d140 = eax_15 + 1
    int32_t ecx_17 = ecx_16 ^ (ecx_16 u>> 0xb & data_42e4c4)
    int32_t ecx_18 = ecx_17 ^ (ecx_17 & 0xff3a58ad) << 7
    int32_t ecx_19 = ecx_18 ^ (ecx_18 & 0xffffdf8c) << 0xf
    return eax_9 + (var_c - ecx_7) * 0xa + modu.dp.d(0:(ecx_19 u>> 0x12 ^ ecx_19), (esi_1 << 1) + 1)
        - esi_1
}
