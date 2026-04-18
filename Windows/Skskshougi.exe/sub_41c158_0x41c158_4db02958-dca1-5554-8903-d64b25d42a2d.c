// ============================================================
// 函数名称: sub_41c158
// 虚拟地址: 0x41c158
// WARP GUID: 4db02958-dca1-5554-8903-d64b25d42a2d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_417ba0
// ============================================================

voidsub_41c158(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x40) ^ (arg1 - 0x3c))
    sub_4199b8(*(arg1 - 0x40) ^ (arg1 - 0x3c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x34))
    noreturn __CxxFrameHandler3() __tailcall
}
