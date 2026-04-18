// ============================================================
// 函数名称: sub_41bd6b
// 虚拟地址: 0x41bd6b
// WARP GUID: 70994829-7efb-5a1a-afa5-0964cc496175
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_414c30
// ============================================================

voidsub_41bd6b(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xc0) ^ (arg1 - 0xbc))
    sub_4199b8(*(arg1 - 0xc0) ^ (arg1 - 0xbc))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0xb0))
    noreturn __CxxFrameHandler3() __tailcall
}
