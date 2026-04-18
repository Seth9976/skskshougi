// ============================================================
// 函数名称: sub_41b9c6
// 虚拟地址: 0x41b9c6
// WARP GUID: 45831f47-30ab-56f5-8e34-916bc961e9b1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_413640
// ============================================================

voidsub_41b9c6(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x60) ^ (arg1 - 0x5c))
    sub_4199b8(*(arg1 - 0x60) ^ (arg1 - 0x5c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x50))
    noreturn __CxxFrameHandler3() __tailcall
}
