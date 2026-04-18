// ============================================================
// 函数名称: sub_41c120
// 虚拟地址: 0x41c120
// WARP GUID: c6f36b7c-1729-5985-b0f8-da3cebf67cbc
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_417a30
// ============================================================

voidsub_41c120(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x50) ^ (arg1 - 0x4c))
    sub_4199b8(*(arg1 - 0x50) ^ (arg1 - 0x4c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x48))
    noreturn __CxxFrameHandler3() __tailcall
}
