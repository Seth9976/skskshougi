// ============================================================
// 函数名称: sub_405d60
// 虚拟地址: 0x405d60
// WARP GUID: 93317eae-a246-51c8-b604-20b4d11e7eb3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4031b0, sub_4084f0, sub_408340, sub_408490, sub_408790, sub_402d10, sub_4081f0
// [被调用的父级函数]: sub_40dab0
// ============================================================

int32_t __thiscallsub_405d60(int32_t* arg1, cocos2d::Touch* arg2)
{
    // 第一条实际指令: int32_t eax = *arg1
    int32_t eax = *arg1
    
    if (*(eax + 0x2a6) == 0)
        if (*(eax + 0x2a9) == 0 && data_42e4d5 == 0)
            eax.b = 0
            return eax
        
        void var_10
        void* var_2c_1 = &var_10
        int32_t var_18
        int32_t var_14
        eax = sub_4081f0(cocos2d::Touch::getLocation(arg2), &var_14, &var_18)
        *(*arg1 + 0x2b4) = eax
        
        if (eax s>= 0)
            void* edx_1 = *arg1
            int32_t ecx_2 = *(edx_1 + 0x2b4)
            int32_t* ecx_13
            
            if (ecx_2 s>= 5)
                if (data_42e4d5 != 0 && ecx_2 s>= 0x14)
                    eax.b = 0x18
                    eax.b = 0x18 - ecx_2.b
                    uint32_t eax_6 = zx.d(eax.b)
                    
                    if (eax_6 == *(edx_1 + 0x2b8))
                        goto label_405e88
                    
                    void* edi_1 = *(edx_1 + 0x2a0)
                    
                    if (*(edi_1 + eax_6 + 0x1d) == 0)
                        goto label_405e88
                    
                    int32_t var_2c_6 = 1
                    sub_4031b0(edi_1, edx_1 + 0x2d4, ecx_2.b, ecx_2)
                    goto label_405e0f
                
                if (ecx_2 == *(edx_1 + 0x2b8))
                    goto label_405e88
                
                int32_t ebx_1 = var_18
                void* ecx_9 = *(edx_1 + 0x2a0)
                int32_t edi_2 = var_14
                eax.b = *(ecx_9 + (ebx_1 << 2) + edi_2)
                
                if (eax.b != 0)
                    eax.b &= 8
                    
                    if (eax.b == 0 && *(edx_1 + 0x2a9) != eax.b)
                        int32_t var_2c_7 = 0
                        sub_402d10(ecx_9, edx_1 + 0x2d4, edi_2.b + (ebx_1 << 2).b, 1)
                    label_405ef9:
                        int32_t* ecx_10 = *arg1
                        
                        if (ecx_10[0xb5] == ecx_10[0xb6])
                            ecx_13 = ecx_10[0x10c]
                            goto label_405f3f
                        
                        sub_408340(ecx_10, edi_2, ebx_1)
                        int32_t* ecx_11 = *arg1
                        sub_4084f0(ecx_11, &ecx_11[0xb5])
                        void* ecx_12 = *arg1
                        *(ecx_12 + 0x2b8) = *(ecx_12 + 0x2b4)
                        int32_t eax_14
                        eax_14.b = 1
                        return eax_14
                    
                    if (eax.b != 0 && *(edx_1 + 0x2a9) == 0)
                        int32_t var_2c_8 = 0
                        sub_4031b0(ecx_9, edx_1 + 0x2d4, edi_2.b + (ebx_1 << 2).b, ecx_9)
                        goto label_405ef9
            else
                if (ecx_2 != *(edx_1 + 0x2b8))
                    int32_t ecx_3 = *(edx_1 + 0x2a0)
                    
                    if (*(ecx_2 + ecx_3 + 0x19) == 0)
                        goto label_405e88
                    
                    int32_t var_2c_3 = 1
                    sub_402d10(ecx_3, edx_1 + 0x2d4, ecx_2.b, 1)
                label_405e0f:
                    sub_408340(*arg1, var_14, var_18)
                    int32_t* ecx_5 = *arg1
                    sub_4084f0(ecx_5, &ecx_5[0xb5])
                    sub_408790(*arg1)
                    void* ecx_7 = *arg1
                    *(ecx_7 + 0x2b8) = *(ecx_7 + 0x2b4)
                    int32_t eax_5
                    eax_5.b = 1
                    return eax_5
                
            label_405e88:
                ecx_13 = *(edx_1 + 0x430)
            label_405f3f:
                
                if (ecx_13 != 0)
                    (*(*ecx_13 + 0x12c))(1)
                    *(*arg1 + 0x430) = 0
                
                sub_408490(*arg1)
                *(*arg1 + 0x2b8) = 0xffffffff
    
    eax.b = 1
    return eax
}
