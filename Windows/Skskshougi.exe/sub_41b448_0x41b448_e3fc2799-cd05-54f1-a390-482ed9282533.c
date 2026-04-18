// ============================================================
// 函数名称: sub_41b448
// 虚拟地址: 0x41b448
// WARP GUID: e3fc2799-cd05-54f1-a390-482ed9282533
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_410a20, sub_4146d0
// ============================================================

voidsub_41b448(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x3c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x3c) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
