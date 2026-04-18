// ============================================================
// 函数名称: sub_40d710
// 虚拟地址: 0x40d710
// WARP GUID: 416e02da-1100-538f-b60f-8d425e0a55bb
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40c770, sub_406500, sub_406250
// ============================================================

int32_t __convention("regparm")sub_40d710(int32_t arg1, int32_t arg2, int32_t arg3, void* arg4)
{
    // 第一条实际指令: int32_t var_8 = arg3
    int32_t var_8 = arg3
    int32_t result = 0
    
    if (arg3 != arg2)
        char* esi_1 = arg3 - arg4
        void* eax_1 = arg4 + 5
        
        do
            int32_t edx = 5
            void* ecx = eax_1
            
            while (true)
                eax_1.b = *(esi_1 + ecx)
                
                if (eax_1.b != *ecx)
                    break
                
                edx += 1
                ecx += 1
                
                if (edx s> 0x13)
                    int32_t eax_2 = 0
                    
                    while (true)
                        void* edx_1 = arg4 + eax_2
                        ecx.b = *(esi_1 + edx_1 + 0x19)
                        
                        if (ecx.b != *(edx_1 + 0x19))
                            break
                        
                        ecx.b = *(esi_1 + arg4 + eax_2 + 0x1d)
                        
                        if (ecx.b != *(arg4 + eax_2 + 0x1d))
                            break
                        
                        eax_2 += 1
                        
                        if (eax_2 s>= 4)
                            result += 1
                            break
                    
                    break
            
            esi_1 = &esi_1[0x21]
            eax_1 = arg4 + 5
        while (esi_1 + arg4 != arg2)
    
    return result
}
