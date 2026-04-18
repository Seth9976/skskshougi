// ============================================================
// 函数名称: sub_41b069
// 虚拟地址: 0x41b069
// WARP GUID: 745eccbd-e3d1-5ebb-993b-7c1bebf8f21b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_40c770
// ============================================================

voidsub_41b069(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xd0) ^ (arg1 - 0xcc))
    sub_4199b8(*(arg1 - 0xd0) ^ (arg1 - 0xcc))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0xc0))
    noreturn __CxxFrameHandler3() __tailcall
}
