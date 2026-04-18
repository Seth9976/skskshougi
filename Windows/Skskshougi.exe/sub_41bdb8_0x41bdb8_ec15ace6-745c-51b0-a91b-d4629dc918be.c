// ============================================================
// 函数名称: sub_41bdb8
// 虚拟地址: 0x41bdb8
// WARP GUID: ec15ace6-745c-51b0-a91b-d4629dc918be
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_415470
// ============================================================

voidsub_41bdb8(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x58) ^ (arg1 - 0x54))
    sub_4199b8(*(arg1 - 0x58) ^ (arg1 - 0x54))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x50))
    noreturn __CxxFrameHandler3() __tailcall
}
