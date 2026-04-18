// ============================================================
// 函数名称: sub_402600
// 虚拟地址: 0x402600
// WARP GUID: ba28fc1c-0398-540c-944d-e43e8a1e1e6d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_406500
// ============================================================

char* __fastcallsub_402600(int32_t arg1)
{
    // 第一条实际指令: char* result = 5
    char* result = 5
    
    while (result[arg1] != 5)
        result = &result[1]
        
        if (result s> 0x13)
            result.b = 0
            return result
    
    char edx = result[arg1 - 4]
    
    if (edx != 9 && edx != 0xc && edx != 0xb && edx != 0xd)
        edx = result[arg1 - 3]
        
        if (edx != 0xa && edx != 0xd && edx != 0xc)
            edx = result[arg1 - 5]
            
            if (edx != 0xa && edx != 0xd && edx != 0xc)
                edx = result[arg1 + 1]
                
                if (edx != 0xb && edx != 0xd && edx != 0xc)
                    edx = result[arg1 - 1]
                    
                    if (edx != 0xb && edx != 0xd && edx != 0xc)
                        edx = result[arg1 + 5]
                        
                        if (edx != 0xa && edx != 0xd)
                            edx = result[arg1 + 3]
                            
                            if (edx != 0xa && edx != 0xd)
                                result.b = result[arg1 + 4]
                                
                                if (result.b != 0xb && result.b != 0xd && result.b != 0xc)
                                    return 0
    
    return 1
}
