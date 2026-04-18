// ============================================================
// 函数名称: sub_402780
// 虚拟地址: 0x402780
// WARP GUID: e0e838b9-7af2-5ba6-8408-14d105d39ad0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4028d0
// ============================================================

char* __thiscallsub_402780(int32_t arg1, char* arg2)
{
    // 第一条实际指令: char* result = 5
    char* result = 5
    
    while (result[arg1] != 0xd)
        result = &result[1]
        
        if (result s> 0x13)
            result.b = 0
            return result
    
    arg2[1] = result.b
    int32_t ebx
    ebx.b = result[arg1 + 4]
    
    if (ebx.b == 1 || ebx.b == 4 || ebx.b == 3 || ebx.b == 5)
        result.b += 4
        *arg2 = result.b
        result.b = 1
        return result
    
    ebx.b = result[arg1 + 5]
    
    if (ebx.b == 2 || ebx.b == 5 || ebx.b == 4)
        result.b += 5
        *arg2 = result.b
        result.b = 1
        return result
    
    ebx.b = result[arg1 + 3]
    
    if (ebx.b == 2 || ebx.b == 5 || ebx.b == 4)
        result.b += 3
        *arg2 = result.b
        result.b = 1
        return result
    
    ebx.b = result[arg1 + 1]
    
    if (ebx.b == 3 || ebx.b == 5 || ebx.b == 4)
        result.b += 1
        *arg2 = result.b
        result.b = 1
        return result
    
    ebx.b = result[arg1 - 1]
    
    if (ebx.b == 3 || ebx.b == 5 || ebx.b == 4)
        result.b -= 1
        *arg2 = result.b
        result.b = 1
        return result
    
    ebx.b = result[arg1 - 4]
    
    if (ebx.b == 3 || ebx.b == 5 || ebx.b == 4)
        result.b -= 4
        *arg2 = result.b
        result.b = 1
        return result
    
    ebx.b = result[arg1 - 3]
    
    if (ebx.b == 2 || ebx.b == 5)
        result.b -= 3
        *arg2 = result.b
        result.b = 1
        return result
    
    int32_t edx
    edx.b = result[arg1 - 5]
    
    if (edx.b != 2 && edx.b != 5)
        result.b = 0
        return result
    
    result.b -= 5
    *arg2 = result.b
    result.b = 1
    return result
}
