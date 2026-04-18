// ============================================================
// 函数名称: sub_41a458
// 虚拟地址: 0x41a458
// WARP GUID: b586aa2f-6218-542e-b672-ef40eef3ba4c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_401050, sub_401280
// ============================================================

voidsub_41a458(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x30) ^ (arg1 - 0x2c))
    sub_4199b8(*(arg1 - 0x30) ^ (arg1 - 0x2c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x28))
    noreturn __CxxFrameHandler3() __tailcall
}
