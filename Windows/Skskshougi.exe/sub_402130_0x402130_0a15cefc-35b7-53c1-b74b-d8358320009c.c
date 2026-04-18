// ============================================================
// 函数名称: sub_402130
// 虚拟地址: 0x402130
// WARP GUID: 0a15cefc-35b7-53c1-b74b-d8358320009c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_409c90
// ============================================================

char* __fastcallsub_402130(void* arg1)
{
    // 第一条实际指令: void* edx = arg1
    void* edx = arg1
    char* result
    
    if (*(edx + 0x1d) == 0 && *(edx + 0x1e) == 0 && *(edx + 0x1f) == 0)
        result = 5
        
        while (true)
            arg1.b = *(result + edx)
            
            if (arg1.b u>= 9 && arg1.b u<= 0xd)
                break
            
            result = &result[1]
            
            if (result s> 0x13)
                result.b = 1
                return result
    
    result.b = 0
    return result
}
