// ============================================================
// 函数名称: sub_4023d0
// 虚拟地址: 0x4023d0
// WARP GUID: 67c4170c-cb01-588a-b693-7636f15e30f8
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4028d0, sub_4033e0, sub_40c770, sub_402d10, sub_406250
// ============================================================

int32_t __thiscallsub_4023d0(int32_t arg1, int32_t arg2)
{
    // 第一条实际指令: char edx = *(arg2 + arg1 - 4)
    char edx = *(arg2 + arg1 - 4)
    int32_t result
    
    if (edx != 9 && edx != 0xc && edx != 0xb && edx != 0xd)
        edx = *(arg2 + arg1 - 3)
        
        if (edx != 0xa && edx != 0xd && edx != 0xc)
            edx = *(arg2 + arg1 - 5)
            
            if (edx != 0xa && edx != 0xd && edx != 0xc)
                edx = *(arg2 + arg1 + 1)
                
                if (edx != 0xb && edx != 0xd && edx != 0xc)
                    edx = *(arg2 + arg1 - 1)
                    
                    if (edx != 0xb && edx != 0xd && edx != 0xc)
                        edx = *(arg2 + arg1 + 5)
                        
                        if (edx != 0xa && edx != 0xd)
                            edx = *(arg2 + arg1 + 3)
                            
                            if (edx != 0xa && edx != 0xd)
                                result.b = *(arg2 + arg1 + 4)
                                
                                if (result.b != 0xb && result.b != 0xd && result.b != 0xc)
                                    result.b = 0
                                    return result
    
    result.b = 1
    return result
}
