// ============================================================
// 函数名称: ___security_init_cookie
// 虚拟地址: 0x41a2a1
// WARP GUID: 130b5f16-bc2c-5016-8462-f5c967b42867
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: _start
// ============================================================

uint32_t___security_init_cookie()
{
    // 第一条实际指令: FILETIME systemTimeAsFileTime
    FILETIME systemTimeAsFileTime
    __builtin_memset(&systemTimeAsFileTime, 0, 8)
    uint32_t __security_cookie_1 = __security_cookie
    uint32_t result
    
    if (__security_cookie_1 == 0xbb40e64e || (0xffff0000 & __security_cookie_1) == 0)
        GetSystemTimeAsFileTime(&systemTimeAsFileTime)
        uint32_t var_8 = systemTimeAsFileTime.dwHighDateTime ^ systemTimeAsFileTime.dwLowDateTime
        uint32_t eax_2 = GetCurrentThreadId()
        var_8 ^= eax_2
        uint32_t eax_3 = GetCurrentProcessId()
        var_8 ^= eax_3
        int32_t performanceCount
        QueryPerformanceCounter(&performanceCount)
        result = &var_8
        int32_t var_14
        uint32_t ecx_4 = var_14 ^ performanceCount ^ var_8 ^ &var_8
        
        if (ecx_4 == 0xbb40e64e)
            ecx_4 = 0xbb40e64f
        else if ((0xffff0000 & ecx_4) == 0)
            result = (ecx_4 | 0x4711) << 0x10
            ecx_4 |= result
        
        __security_cookie = ecx_4
        data_429004 = not.d(ecx_4)
    else
        result = not.d(__security_cookie_1)
        data_429004 = result
    
    return result
}
