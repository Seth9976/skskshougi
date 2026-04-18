// ============================================================
// 函数名称: sub_41aad0
// 虚拟地址: 0x41aad0
// WARP GUID: 1ab7079c-4fef-5b09-8f1e-1f863a50227b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_4087d0
// ============================================================

voidsub_41aad0(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x80) ^ (arg1 - 0x7c))
    sub_4199b8(*(arg1 - 0x80) ^ (arg1 - 0x7c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x78))
    noreturn __CxxFrameHandler3() __tailcall
}
