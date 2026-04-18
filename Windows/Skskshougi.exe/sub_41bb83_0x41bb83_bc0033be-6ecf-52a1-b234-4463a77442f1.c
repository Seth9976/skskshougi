// ============================================================
// 函数名称: sub_41bb83
// 虚拟地址: 0x41bb83
// WARP GUID: bc0033be-6ecf-52a1-b234-4463a77442f1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_414200
// ============================================================

voidsub_41bb83(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x7c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x7c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
