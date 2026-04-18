// ============================================================
// 函数名称: sub_41a488
// 虚拟地址: 0x41a488
// WARP GUID: bce4954d-2819-5fe4-88d6-3c8ad2c1da69
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_4035b0
// ============================================================

voidsub_41a488(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x54) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x54) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
