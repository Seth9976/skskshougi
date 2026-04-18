// ============================================================
// 函数名称: sub_410f50
// 虚拟地址: 0x410f50
// WARP GUID: 209359f8-9399-53aa-9f9c-1906273a3359
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_414c30
// ============================================================

int32_t __convention("regparm")sub_410f50(int32_t arg1, int32_t* arg2, int32_t* arg3, int32_t arg4)
{
    // 第一条实际指令: if (arg4 != 0)
    if (arg4 != 0)
        int32_t i_1 = arg4 - 4
        
        if (arg4 u>= 4)
            int32_t i
            
            do
                if (*arg3 != *arg2)
                    goto label_410f76
                
                arg3 = &arg3[1]
                arg2 = &arg2[1]
                i = i_1
                i_1 -= 4
            while (i u>= 4)
        
        if (i_1 != 0xfffffffc)
        label_410f76:
            arg1.b = *arg3
            char temp1_1 = *arg2
            
            if (arg1.b != temp1_1)
                return sbb.d(arg1, arg1, arg1.b u< temp1_1) | 1
            
            if (i_1 != 0xfffffffd)
                arg1.b = *(arg3 + 1)
                char temp3_1 = *(arg2 + 1)
                
                if (arg1.b != temp3_1)
                    return sbb.d(arg1, arg1, arg1.b u< temp3_1) | 1
                
                if (i_1 != 0xfffffffe)
                    arg1.b = *(arg3 + 2)
                    char temp4_1 = *(arg2 + 2)
                    
                    if (arg1.b != temp4_1)
                        return sbb.d(arg1, arg1, arg1.b u< temp4_1) | 1
                    
                    if (i_1 != 0xffffffff)
                        arg1.b = *(arg3 + 3)
                        char temp5_1 = *(arg2 + 3)
                        
                        if (arg1.b != temp5_1)
                            return sbb.d(arg1, arg1, arg1.b u< temp5_1) | 1
    
    return 0
}
