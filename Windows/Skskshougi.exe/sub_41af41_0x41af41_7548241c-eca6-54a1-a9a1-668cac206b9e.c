// ============================================================
// 函数名称: sub_41af41
// 虚拟地址: 0x41af41
// WARP GUID: 7548241c-eca6-54a1-a9a1-668cac206b9e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_40baa0
// ============================================================

voidsub_41af41(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xc8) ^ (arg1 - 0xc4))
    sub_4199b8(*(arg1 - 0xc8) ^ (arg1 - 0xc4))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0xbc))
    noreturn __CxxFrameHandler3() __tailcall
}
