// ============================================================
// 函数名称: sub_41ae68
// 虚拟地址: 0x41ae68
// WARP GUID: 14ec09b3-4e17-5eab-8143-eea40c94fde0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_40b490
// ============================================================

voidsub_41ae68(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x30) ^ (arg1 - 0x2c))
    sub_4199b8(*(arg1 - 0x30) ^ (arg1 - 0x2c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x20))
    noreturn __CxxFrameHandler3() __tailcall
}
