// ============================================================
// 函数名称: __SEH_epilog4
// 虚拟地址: 0x419fa5
// WARP GUID: bacc9b2c-5d88-5a0b-83ea-a76a0511b83b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: ?__ArrayUnwind@@YGXPAXIHP6EX0@Z@Z, ??_M@YGXPAXIHP6EX0@Z@Z, sub_419c5e, sub_419a03, sub_41a06e
// ============================================================

int32_t__SEH_epilog4(int32_t* arg1 @ ebp, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: TEB* fsbase
    TEB* fsbase
    fsbase->NtTib.ExceptionList = arg1[-4]
    *arg1
    *arg1 = __return_addr
}
