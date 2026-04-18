// ============================================================
// 函数名称: sub_41ad2c
// 虚拟地址: 0x41ad2c
// WARP GUID: 875f3f54-ea64-5dc9-b5e1-ea55aa3aee10
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_409c90
// ============================================================

voidsub_41ad2c(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x134) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x134) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
