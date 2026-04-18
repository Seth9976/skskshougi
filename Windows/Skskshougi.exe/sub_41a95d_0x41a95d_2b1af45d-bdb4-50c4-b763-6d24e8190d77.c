// ============================================================
// 函数名称: sub_41a95d
// 虚拟地址: 0x41a95d
// WARP GUID: 2b1af45d-bdb4-50c4-b763-6d24e8190d77
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_406f90
// ============================================================

voidsub_41a95d(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xec) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0xec) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
