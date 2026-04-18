// ============================================================
// 函数名称: sub_41c188
// 虚拟地址: 0x41c188
// WARP GUID: b25b1cc9-3f70-5988-99b2-b804b8a9d76d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_417d10
// ============================================================

voidsub_41c188(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x40) ^ (arg1 - 0x3c))
    sub_4199b8(*(arg1 - 0x40) ^ (arg1 - 0x3c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x30))
    noreturn __CxxFrameHandler3() __tailcall
}
