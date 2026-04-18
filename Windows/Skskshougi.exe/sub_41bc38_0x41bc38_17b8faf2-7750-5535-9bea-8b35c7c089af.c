// ============================================================
// 函数名称: sub_41bc38
// 虚拟地址: 0x41bc38
// WARP GUID: 17b8faf2-7750-5535-9bea-8b35c7c089af
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_414ac0, sub_415750, sub_415660
// ============================================================

voidsub_41bc38(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x30) ^ (arg1 - 0x2c))
    sub_4199b8(*(arg1 - 0x30) ^ (arg1 - 0x2c))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x24))
    noreturn __CxxFrameHandler3() __tailcall
}
