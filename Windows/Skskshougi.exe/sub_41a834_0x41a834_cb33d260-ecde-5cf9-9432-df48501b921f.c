// ============================================================
// 函数名称: sub_41a834
// 虚拟地址: 0x41a834
// WARP GUID: cb33d260-ecde-5cf9-9432-df48501b921f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_406900
// ============================================================

voidsub_41a834(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x104) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x104) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
