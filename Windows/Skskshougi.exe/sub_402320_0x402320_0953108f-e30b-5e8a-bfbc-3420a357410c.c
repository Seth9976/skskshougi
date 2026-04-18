// ============================================================
// 函数名称: sub_402320
// 虚拟地址: 0x402320
// WARP GUID: 0953108f-e30b-5e8a-bfbc-3420a357410c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4035b0, sub_4033e0, sub_40c770, sub_406500, sub_4022e0
// ============================================================

int32_t __thiscallsub_402320(int32_t arg1, int32_t arg2)
{
    // 第一条实际指令: char edx = *(arg2 + arg1 + 4)
    char edx = *(arg2 + arg1 + 4)
    int32_t result
    
    if (edx != 1 && edx != 4 && edx != 3 && edx != 5)
        edx = *(arg2 + arg1 + 5)
        
        if (edx != 2 && edx != 5 && edx != 4)
            edx = *(arg2 + arg1 + 3)
            
            if (edx != 2 && edx != 5 && edx != 4)
                edx = *(arg2 + arg1 + 1)
                
                if (edx != 3 && edx != 5 && edx != 4)
                    edx = *(arg2 + arg1 - 1)
                    
                    if (edx != 3 && edx != 5 && edx != 4)
                        edx = *(arg2 + arg1 - 3)
                        
                        if (edx != 2 && edx != 5)
                            edx = *(arg2 + arg1 - 5)
                            
                            if (edx != 2 && edx != 5)
                                result.b = *(arg2 + arg1 - 4)
                                
                                if (result.b != 3 && result.b != 5 && result.b != 4)
                                    result.b = 0
                                    return result
    
    result.b = 1
    return result
}
