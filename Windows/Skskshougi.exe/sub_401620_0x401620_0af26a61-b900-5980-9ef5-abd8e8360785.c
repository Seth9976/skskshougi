// ============================================================
// 函数名称: sub_401620
// 虚拟地址: 0x401620
// WARP GUID: 0af26a61-b900-5980-9ef5-abd8e8360785
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_t* __stdcallsub_401620(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: bool cond:0 = std::_Syserror_map(arg2) == 0
    bool cond:0 = std::_Syserror_map(arg2) == 0
    *arg1 = arg2
    
    if (cond:0)
        arg1[1] = &data_4290b8
        return arg1
    
    arg1[1] = &data_4290bc
    return arg1
}
