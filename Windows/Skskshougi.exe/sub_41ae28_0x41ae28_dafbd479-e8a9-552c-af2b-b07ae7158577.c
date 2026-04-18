// ============================================================
// 函数名称: sub_41ae28
// 虚拟地址: 0x41ae28
// WARP GUID: dafbd479-e8a9-552c-af2b-b07ae7158577
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_40adb0
// ============================================================

voidsub_41ae28(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x188) ^ (arg1 - 0x184))
    sub_4199b8(*(arg1 - 0x188) ^ (arg1 - 0x184))
    sub_4199b8(*(arg1 - 8) ^ (arg1 - 0x178))
    noreturn __CxxFrameHandler3() __tailcall
}
