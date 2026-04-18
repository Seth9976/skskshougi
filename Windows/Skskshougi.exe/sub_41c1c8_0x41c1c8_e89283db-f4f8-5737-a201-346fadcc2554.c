// ============================================================
// 函数名称: sub_41c1c8
// 虚拟地址: 0x41c1c8
// WARP GUID: e89283db-f4f8-5737-a201-346fadcc2554
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_417f30, sub_418090
// ============================================================

voidsub_41c1c8(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x48) ^ (arg1 - 0x44))
    sub_4199b8(*(arg1 - 0x48) ^ (arg1 - 0x44))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x40))
    noreturn __CxxFrameHandler3() __tailcall
}
