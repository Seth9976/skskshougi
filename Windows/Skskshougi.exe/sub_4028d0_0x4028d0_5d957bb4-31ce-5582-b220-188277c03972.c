// ============================================================
// 函数名称: sub_4028d0
// 虚拟地址: 0x4028d0
// WARP GUID: 5d957bb4-31ce-5582-b220-188277c03972
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_404000, sub_4023d0, sub_402480, sub_403de0, sub_402780, sub_402d10, sub_403a50
// [被调用的父级函数]: sub_403740, sub_403230, sub_4035b0, sub_4032a0
// ============================================================

int32_t __thiscallsub_4028d0(int32_t arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t* esi = arg2
    int32_t* esi = arg2
    arg2.w = 0
    esi[1] = *esi
    
    if (sub_402780(arg1, &arg2) != 0)
        return sub_403a50(esi, &arg2)
    
    int32_t var_8
    char* result
    void* arg_8
    
    if (sub_402480(arg1, &var_8, &arg2) == 0)
        int32_t* i = nullptr
        arg2 = nullptr
        
        do
            if (*(arg1 + i + 0x19) != 0)
                for (char* j = 5; j s<= 0x13; j = &j[1])
                    if (j[arg1] == 0)
                        if (esi[1] == esi[2])
                            sub_403de0(esi, 1)
                            i = arg2
                        
                        char* eax_15 = esi[1]
                        
                        if (eax_15 != 0)
                            *eax_15 = i.b
                            eax_15[1] = j.b
                        
                        esi[1] += 2
            
            i += 1
            arg2 = i
        while (i s< 3)
        
        for (int32_t i_1 = 5; i_1 s<= 0x13; i_1 += 1)
            void* var_1c_18 = arg_8
            result = sub_402d10(arg1, esi, i_1.b, 0)
    else
        int32_t ebx_1 = var_8
        
        if (sub_4023d0(arg1, ebx_1).b == 0)
            if (*esi == esi[2])
                sub_403de0(esi, 1)
            
            result = esi[1]
            
            if (result != 0)
                *result = arg2.b
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        result.b = *(ebx_1 + arg1 + 4)
        
        if (result.b == 1 || result.b == 4 || result.b == 3)
            char ecx_4 = ebx_1.b + 4
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_4 = ebx_1.b + 4
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_4
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        result.b = *(ebx_1 + arg1 + 5)
        
        if (result.b == 2 || result.b == 4)
            char ecx_6 = ebx_1.b + 5
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_6 = ebx_1.b + 5
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_6
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        result.b = *(ebx_1 + arg1 + 3)
        
        if (result.b == 2 || result.b == 4)
            char ecx_8 = ebx_1.b + 3
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_8 = ebx_1.b + 3
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_8
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        result.b = *(ebx_1 + arg1 + 1)
        
        if (result.b == 3 || result.b == 4)
            char ecx_10 = ebx_1.b + 1
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_10 = ebx_1.b + 1
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_10
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        result.b = *(ebx_1 + arg1 - 1)
        
        if (result.b == 3 || result.b == 4)
            char ecx_12 = ebx_1.b - 1
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_12 = ebx_1.b - 1
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_12
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        result.b = *(ebx_1 + arg1 - 4)
        
        if (result.b == 3 || result.b == 4)
            char ecx_14 = ebx_1.b - 4
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_14 = ebx_1.b - 4
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_14
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        if (*(ebx_1 + arg1 - 3) == 2)
            char ecx_16 = ebx_1.b - 3
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_16 = ebx_1.b - 3
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_16
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        if (*(ebx_1 + arg1 - 5) == 2)
            char ecx_18 = ebx_1.b - 5
            
            if (esi[1] == esi[2])
                sub_403de0(esi, 1)
                ecx_18 = ebx_1.b - 5
            
            result = esi[1]
            
            if (result != 0)
                *result = ecx_18
                result[1] = ebx_1.b
            
            esi[1] += 2
        
        int32_t* ecx_22 = arg2
        result.b = *(ecx_22 + arg1 - 5)
        
        if (result.b == 0)
        label_402afe:
            
            if (sub_4023d0(arg1, ecx_22 - 5).b == 0)
                arg_8 = ecx_22 - 5
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402afe
        
        result.b = *(ecx_22 + arg1 - 4)
        
        if (result.b == 0)
        label_402b32:
            
            if (sub_4023d0(arg1, &ecx_22[-1]).b == 0)
                arg_8 = &ecx_22[-1]
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402b32
        
        result.b = *(ecx_22 + arg1 - 3)
        
        if (result.b == 0)
        label_402b66:
            
            if (sub_4023d0(arg1, ecx_22 - 3).b == 0)
                arg_8 = ecx_22 - 3
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402b66
        
        result.b = *(ecx_22 + arg1 - 1)
        
        if (result.b == 0)
        label_402b9a:
            
            if (sub_4023d0(arg1, ecx_22 - 1).b == 0)
                arg_8 = ecx_22 - 1
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402b9a
        
        result.b = *(ecx_22 + arg1 + 1)
        
        if (result.b == 0)
        label_402bce:
            
            if (sub_4023d0(arg1, ecx_22 + 1).b == 0)
                arg_8 = ecx_22 + 1
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402bce
        
        result.b = *(ecx_22 + arg1 + 3)
        
        if (result.b == 0)
        label_402c02:
            
            if (sub_4023d0(arg1, ecx_22 + 3).b == 0)
                arg_8 = ecx_22 + 3
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402c02
        
        result.b = *(ecx_22 + arg1 + 4)
        
        if (result.b == 0)
        label_402c36:
            
            if (sub_4023d0(arg1, &ecx_22[1]).b == 0)
                arg_8 = &ecx_22[1]
                sub_404000(esi, &arg2, &arg_8)
            
            ecx_22 = arg2
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402c36
        
        result.b = *(ecx_22 + arg1 + 5)
        
        if (result.b == 0)
        label_402c72:
            result = sub_4023d0(arg1, ecx_22 + 5)
            
            if (result.b == 0)
                arg_8 = ecx_22 + 5
                return sub_404000(esi, &arg2, &arg_8)
        else if (result.b != 0xff && (result.b & 8) != 0)
            goto label_402c72
    return result
}
