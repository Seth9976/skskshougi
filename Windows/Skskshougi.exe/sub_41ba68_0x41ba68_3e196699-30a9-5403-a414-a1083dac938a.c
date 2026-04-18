// ============================================================
// 函数名称: sub_41ba68
// 虚拟地址: 0x41ba68
// WARP GUID: 3e196699-30a9-5403-a414-a1083dac938a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_413c30
// ============================================================

voidsub_41ba68(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x54) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x54) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
