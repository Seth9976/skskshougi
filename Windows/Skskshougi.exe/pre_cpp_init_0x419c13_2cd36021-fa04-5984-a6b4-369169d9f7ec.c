// ============================================================
// 函数名称: _pre_cpp_init
// 虚拟地址: 0x419c13
// WARP GUID: 2cd36021-fa04-5984-a6b4-369169d9f7ec
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: _amsg_exit
// [内部子函数调用]: _atexit
// [被调用的父级函数]: 无
// ============================================================

int32_t_pre_cpp_init()
{
    // 第一条实际指令: _atexit(__RTC_Terminate)
    _atexit(__RTC_Terminate)
    int32_t var_8 = data_42d10c
    data_42cde0 = data_42d110
    int32_t result = __wgetmainargs(0x42cdd0, 0x42cdd4, 0x42cdd8, var_8, &data_42cde0)
    data_42cddc = result
    
    if (result s< 0)
        result = _amsg_exit(8)
    
    return result
}
