// ============================================================
// 函数名称: sub_41aec6
// 虚拟地址: 0x41aec6
// WARP GUID: 8b0c73ce-0549-5494-9044-09635adb2a9e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_40b730
// ============================================================

voidsub_41aec6(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xb0) ^ (arg1 - 0xac))
    sub_4199b8(*(arg1 - 0xb0) ^ (arg1 - 0xac))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0xa4))
    noreturn __CxxFrameHandler3() __tailcall
}
