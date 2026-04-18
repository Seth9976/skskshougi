// ============================================================
// 函数名称: __setdefaultprecision
// 虚拟地址: 0x41a380
// WARP GUID: 1d4d3047-e3d5-5fca-aa3b-d3634b8458fc
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: _invoke_watson, _controlfp_s
// [内部子函数调用]: 无
// [被调用的父级函数]: _pre_c_init
// ============================================================

int32_t__setdefaultprecision()
{
    // 第一条实际指令: int32_t result = _controlfp_s(0, 0x10000, 0x30000)
    int32_t result = _controlfp_s(0, 0x10000, 0x30000)
    
    if (result == 0)
        return result
    
    _invoke_watson(nullptr, nullptr, nullptr, 0, 0)
    noreturn
}
