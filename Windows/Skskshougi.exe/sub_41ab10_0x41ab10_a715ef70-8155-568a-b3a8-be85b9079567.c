// ============================================================
// 函数名称: sub_41ab10
// 虚拟地址: 0x41ab10
// WARP GUID: a715ef70-8155-568a-b3a8-be85b9079567
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_408a30
// ============================================================

voidsub_41ab10(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x78) ^ (arg1 - 0x74))
    sub_4199b8(*(arg1 - 0x78) ^ (arg1 - 0x74))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x68))
    noreturn __CxxFrameHandler3() __tailcall
}
