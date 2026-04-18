// ============================================================
// 函数名称: sub_41b4f0
// 虚拟地址: 0x41b4f0
// WARP GUID: 264605b9-2b90-5492-80b2-3634a6d5e2b4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_411390
// ============================================================

voidsub_41b4f0(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x54) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x54) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
