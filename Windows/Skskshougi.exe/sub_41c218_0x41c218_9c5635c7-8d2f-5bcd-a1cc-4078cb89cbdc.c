// ============================================================
// 函数名称: sub_41c218
// 虚拟地址: 0x41c218
// WARP GUID: 9c5635c7-8d2f-5bcd-a1cc-4078cb89cbdc
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_4181f0
// ============================================================

voidsub_41c218(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x80) ^ (arg1 - 0x7c))
    sub_4199b8(*(arg1 - 0x80) ^ (arg1 - 0x7c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x70))
    noreturn __CxxFrameHandler3() __tailcall
}
