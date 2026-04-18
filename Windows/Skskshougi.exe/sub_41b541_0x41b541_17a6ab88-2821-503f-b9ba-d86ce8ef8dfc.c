// ============================================================
// 函数名称: sub_41b541
// 虚拟地址: 0x41b541
// WARP GUID: 17a6ab88-2821-503f-b9ba-d86ce8ef8dfc
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_4114c0
// ============================================================

voidsub_41b541(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x4c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x4c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
