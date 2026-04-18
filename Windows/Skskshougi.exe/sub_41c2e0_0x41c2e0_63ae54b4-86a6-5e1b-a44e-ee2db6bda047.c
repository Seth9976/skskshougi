// ============================================================
// 函数名称: sub_41c2e0
// 虚拟地址: 0x41c2e0
// WARP GUID: 63ae54b4-86a6-5e1b-a44e-ee2db6bda047
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_418fa0
// ============================================================

voidsub_41c2e0(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x34) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x34) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
