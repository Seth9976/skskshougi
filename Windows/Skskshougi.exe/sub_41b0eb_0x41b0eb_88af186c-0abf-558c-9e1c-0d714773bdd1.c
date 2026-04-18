// ============================================================
// 函数名称: sub_41b0eb
// 虚拟地址: 0x41b0eb
// WARP GUID: 88af186c-0abf-558c-9e1c-0d714773bdd1
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_40e320
// ============================================================

voidsub_41b0eb(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xc) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0xc) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
