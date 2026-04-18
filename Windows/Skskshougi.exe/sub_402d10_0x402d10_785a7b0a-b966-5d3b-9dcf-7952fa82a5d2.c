// ============================================================
// 函数名称: sub_402d10
// 虚拟地址: 0x402d10
// WARP GUID: 785a7b0a-b966-5d3b-9dcf-7952fa82a5d2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_404000, sub_4023d0, sub_403de0
// [被调用的父级函数]: sub_4028d0, sub_4031b0, sub_405d60, sub_4032a0, sub_403740
// ============================================================

void __thiscallsub_402d10(int32_t arg1, int32_t* arg2, char arg3, char arg4)
{
    // 第一条实际指令: if (arg3 != 0)
    if (arg3 != 0)
        arg2[1] = *arg2
    
    void* arg_8
    void* ebx = arg_8
    int32_t eax
    void* eax_5
    void* eax_28
    
    if (ebx s>= 5)
        switch (zx.d(*(ebx + arg1)) - 1)
            case 0
                eax.b = *(ebx + arg1 - 4)
                
                if (eax.b == 0)
                label_402da2:
                    arg3.d = ebx - 4
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402da2
            case 1
                eax.b = *(ebx + arg1 - 5)
                
                if (eax.b == 0)
                    arg3.d = ebx - 5
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        arg3.d = ebx - 5
                        sub_404000(arg2, &arg_8, &arg3)
                
                eax.b = *(ebx + arg1 - 3)
                
                if (eax.b == 0)
                    arg3.d = ebx - 3
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        arg3.d = ebx - 3
                        sub_404000(arg2, &arg_8, &arg3)
                
                eax.b = *(ebx + arg1 + 3)
                
                if (eax.b != 0)
                    eax.b -= 9
                    
                    if (eax.b u> 4)
                        goto label_402e13
                    
                    goto label_402dfe
                
            label_402dfe:
                eax_5 = ebx + 3
            label_402e01:
                arg3.d = eax_5
                sub_404000(arg2, &arg_8, &arg3)
            label_402e13:
                eax.b = *(ebx + arg1 + 5)
                
                if (eax.b == 0)
                label_402e25:
                    arg3.d = ebx + 5
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402e25
            case 2
                eax.b = *(ebx + arg1 - 4)
                
                if (eax.b != 0)
                    eax.b -= 9
                    
                    if (eax.b u> 4)
                        goto label_40312b
                    
                    goto label_402e3f
                
            label_402e3f:
                eax_28 = ebx - 4
            label_403119:
                arg3.d = eax_28
                sub_404000(arg2, &arg_8, &arg3)
            label_40312b:
                eax.b = *(ebx + arg1 - 1)
                
                if (eax.b == 0)
                    arg3.d = ebx - 1
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        arg3.d = ebx - 1
                        sub_404000(arg2, &arg_8, &arg3)
                
                eax.b = *(ebx + arg1 + 1)
                
                if (eax.b == 0)
                    arg3.d = ebx + 1
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        arg3.d = ebx + 1
                        sub_404000(arg2, &arg_8, &arg3)
                
                eax.b = *(ebx + arg1 + 4)
                
                if (eax.b == 0)
                label_40317f:
                    arg3.d = ebx + 4
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_40317f
            case 3
                eax.b = *(ebx + arg1 - 5)
                
                if (eax.b == 0)
                    arg3.d = ebx - 5
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        arg3.d = ebx - 5
                        sub_404000(arg2, &arg_8, &arg3)
                
                eax.b = *(ebx + arg1 - 4)
                
                if (eax.b == 0)
                    arg3.d = ebx - 4
                    sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        arg3.d = ebx - 4
                        sub_404000(arg2, &arg_8, &arg3)
                
                eax.b = *(ebx + arg1 - 3)
                
                if (eax.b == 0)
                    eax_28 = ebx - 3
                    goto label_403119
                
                eax.b -= 9
                
                if (eax.b u> 4)
                    goto label_40312b
                
                eax_28 = ebx - 3
                goto label_403119
            case 4
                eax.b = *(ebx + arg1 - 5)
                
                if (arg4 == 0)
                    if (eax.b == 0)
                        arg3.d = ebx - 5
                        sub_404000(arg2, &arg_8, &arg3)
                    else
                        eax.b -= 9
                        
                        if (eax.b u<= 4)
                            arg3.d = ebx - 5
                            sub_404000(arg2, &arg_8, &arg3)
                    
                    eax.b = *(ebx + arg1 - 4)
                    
                    if (eax.b == 0)
                        arg3.d = ebx - 4
                        sub_404000(arg2, &arg_8, &arg3)
                    else
                        eax.b -= 9
                        
                        if (eax.b u<= 4)
                            arg3.d = ebx - 4
                            sub_404000(arg2, &arg_8, &arg3)
                    
                    eax.b = *(ebx + arg1 - 3)
                    
                    if (eax.b == 0)
                        arg3.d = ebx - 3
                        sub_404000(arg2, &arg_8, &arg3)
                    else
                        eax.b -= 9
                        
                        if (eax.b u<= 4)
                            arg3.d = ebx - 3
                            sub_404000(arg2, &arg_8, &arg3)
                    
                    eax.b = *(ebx + arg1 - 1)
                    
                    if (eax.b == 0)
                        arg3.d = ebx - 1
                        sub_404000(arg2, &arg_8, &arg3)
                    else
                        eax.b -= 9
                        
                        if (eax.b u<= 4)
                            arg3.d = ebx - 1
                            sub_404000(arg2, &arg_8, &arg3)
                    
                    eax.b = *(ebx + arg1 + 1)
                    
                    if (eax.b == 0)
                        arg3.d = ebx + 1
                        sub_404000(arg2, &arg_8, &arg3)
                    else
                        eax.b -= 9
                        
                        if (eax.b u<= 4)
                            arg3.d = ebx + 1
                            sub_404000(arg2, &arg_8, &arg3)
                    
                    eax.b = *(ebx + arg1 + 3)
                    
                    if (eax.b == 0)
                        arg3.d = ebx + 3
                        sub_404000(arg2, &arg_8, &arg3)
                    else
                        eax.b -= 9
                        
                        if (eax.b u<= 4)
                            arg3.d = ebx + 3
                            sub_404000(arg2, &arg_8, &arg3)
                    
                    eax.b = *(ebx + arg1 + 4)
                    
                    if (eax.b == 0)
                        eax_5 = ebx + 4
                        goto label_402e01
                    
                    eax.b -= 9
                    
                    if (eax.b u> 4)
                        goto label_402e13
                    
                    eax_5 = ebx + 4
                    goto label_402e01
                
                if (eax.b == 0)
                label_402e63:
                    
                    if (sub_4023d0(arg1, ebx - 5).b == 0)
                        arg3.d = ebx - 5
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402e63
                
                eax.b = *(ebx + arg1 - 4)
                
                if (eax.b == 0)
                label_402e95:
                    
                    if (sub_4023d0(arg1, ebx - 4).b == 0)
                        arg3.d = ebx - 4
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402e95
                
                eax.b = *(ebx + arg1 - 3)
                
                if (eax.b == 0)
                label_402ec7:
                    
                    if (sub_4023d0(arg1, ebx - 3).b == 0)
                        arg3.d = ebx - 3
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402ec7
                
                eax.b = *(ebx + arg1 - 1)
                
                if (eax.b == 0)
                label_402ef9:
                    
                    if (sub_4023d0(arg1, ebx - 1).b == 0)
                        arg3.d = ebx - 1
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402ef9
                
                eax.b = *(ebx + arg1 + 1)
                
                if (eax.b == 0)
                label_402f2b:
                    
                    if (sub_4023d0(arg1, ebx + 1).b == 0)
                        arg3.d = ebx + 1
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402f2b
                
                eax.b = *(ebx + arg1 + 3)
                
                if (eax.b == 0)
                label_402f5d:
                    
                    if (sub_4023d0(arg1, ebx + 3).b == 0)
                        arg3.d = ebx + 3
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402f5d
                
                eax.b = *(ebx + arg1 + 4)
                
                if (eax.b == 0)
                label_402f8f:
                    
                    if (sub_4023d0(arg1, ebx + 4).b == 0)
                        arg3.d = ebx + 4
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402f8f
                
                eax.b = *(ebx + arg1 + 5)
                
                if (eax.b == 0)
                label_402fc5:
                    
                    if (sub_4023d0(arg1, ebx + 5).b == 0)
                        arg3.d = ebx + 5
                        sub_404000(arg2, &arg_8, &arg3)
                else
                    eax.b -= 9
                    
                    if (eax.b u<= 4)
                        goto label_402fc5
    else if (*(ebx + arg1 + 0x19) != 0)
        char* i = 5
        arg3.d = 5
        
        do
            if (i[arg1] == 0)
                if (arg2[1] == arg2[2])
                    sub_403de0(arg2, 1)
                    i = arg3.d
                
                eax = arg2[1]
                
                if (eax != 0)
                    *eax = ebx.b
                    *(eax + 1) = i.b
                
                arg2[1] += 2
            
            i = &i[1]
            arg3.d = i
        while (i s<= 0x13)
}
