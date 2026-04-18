// ============================================================
// 函数名称: _atexit
// 虚拟地址: 0x419aac
// WARP GUID: 77179337-e2b5-5198-b2bd-796d7843ae1b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_419a03
// [被调用的父级函数]: sub_401030, sub_401180, sub_401040, sub_4011e0, sub_401020, _pre_cpp_init, sub_4011f0
// ============================================================

int32_t_atexit(int32_t arg1)
{
    // 第一条实际指令: int32_t eax = sub_419a03(arg1)
    int32_t eax = sub_419a03(arg1)
    int32_t eax_1 = neg.d(eax)
    return neg.d(sbb.d(eax_1, eax_1, eax != 0)) - 1
}
