// ============================================================
// 函数名称: sub_41c0d3
// 虚拟地址: 0x41c0d3
// WARP GUID: 521d700c-923a-56ef-af9f-158938d9a8a7
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_417760
// ============================================================

voidsub_41c0d3(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xa8) ^ (arg1 - 0xa4))
    sub_4199b8(*(arg1 - 0xa8) ^ (arg1 - 0xa4))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x98))
    noreturn __CxxFrameHandler3() __tailcall
}
