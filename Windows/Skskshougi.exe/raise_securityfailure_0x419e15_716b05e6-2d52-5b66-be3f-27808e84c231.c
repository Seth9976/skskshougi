// ============================================================
// 函数名称: ___raise_securityfailure
// 虚拟地址: 0x419e15
// WARP GUID: 716b05e6-2d52-5b66-be3f-27808e84c231
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __crtUnhandledException, _crt_debugger_hook, __crtTerminateProcess
// [内部子函数调用]: 无
// [被调用的父级函数]: ___report_gsfailure
// ============================================================

int32_t___raise_securityfailure(int32_t arg1)
{
    // 第一条实际指令: data_42d104 = IsDebuggerPresent()
    data_42d104 = IsDebuggerPresent()
    _crt_debugger_hook(1)
    __crtUnhandledException(arg1)
    
    if (data_42d104 == 0)
        _crt_debugger_hook(1)
    
    return __crtTerminateProcess(0xc0000409)
}
