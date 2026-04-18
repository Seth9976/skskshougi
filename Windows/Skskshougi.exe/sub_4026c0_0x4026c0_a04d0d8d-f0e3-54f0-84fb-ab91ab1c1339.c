// ============================================================
// 函数名称: sub_4026c0
// 虚拟地址: 0x4026c0
// WARP GUID: a04d0d8d-f0e3-54f0-84fb-ab91ab1c1339
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4035b0, sub_406250
// ============================================================

char* __fastcallsub_4026c0(int32_t arg1)
{
    // 第一条实际指令: char* result = 5
    char* result = 5
    
    while (result[arg1] != 0xd)
        result = &result[1]
        
        if (result s> 0x13)
            result.b = 0
            return result
    
    char edx = result[arg1 + 4]
    
    if (edx != 1 && edx != 4 && edx != 3 && edx != 5)
        edx = result[arg1 + 5]
        
        if (edx != 2 && edx != 5 && edx != 4)
            edx = result[arg1 + 3]
            
            if (edx != 2 && edx != 5 && edx != 4)
                edx = result[arg1 + 1]
                
                if (edx != 3 && edx != 5 && edx != 4)
                    edx = result[arg1 - 1]
                    
                    if (edx != 3 && edx != 5 && edx != 4)
                        edx = result[arg1 - 3]
                        
                        if (edx != 2 && edx != 5)
                            edx = result[arg1 - 5]
                            
                            if (edx != 2 && edx != 5)
                                result.b = result[arg1 - 4]
                                
                                if (result.b != 3 && result.b != 5 && result.b != 4)
                                    return 0
    
    return 1
}
