// ============================================================
// 函数名称: sub_41baa8
// 虚拟地址: 0x41baa8
// WARP GUID: f0121644-4de7-5322-b459-e78a80af2f34
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_413e00
// ============================================================

voidsub_41baa8(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x6c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x6c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
