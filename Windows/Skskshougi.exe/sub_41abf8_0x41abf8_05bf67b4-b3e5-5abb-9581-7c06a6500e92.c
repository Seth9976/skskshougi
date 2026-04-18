// ============================================================
// 函数名称: sub_41abf8
// 虚拟地址: 0x41abf8
// WARP GUID: 05bf67b4-b3e5-5abb-9581-7c06a6500e92
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_409400
// ============================================================

voidsub_41abf8(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x60) ^ (arg1 - 0x5c))
    sub_4199b8(*(arg1 - 0x60) ^ (arg1 - 0x5c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x54))
    noreturn __CxxFrameHandler3() __tailcall
}
