// ============================================================
// 函数名称: sub_40f550
// 虚拟地址: 0x40f550
// WARP GUID: 853d55e0-e5ec-5a41-b1ab-656194909117
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401990, sub_40f3c0
// [被调用的父级函数]: sub_413640, sub_4087d0
// ============================================================

int32_t __convention("regparm")sub_40f550(int32_t arg1, void** arg2, void** arg3, int32_t arg4)
{
    // 第一条实际指令: if (arg3 != &data_429080)
    if (arg3 != &data_429080)
        sub_401990(&data_429080, arg3, 0, 0xffffffff)
    
    if (arg2 != &data_4290a0)
        sub_401990(&data_4290a0, arg2, 0, 0xffffffff)
    
    data_42f900 = arg4
    data_42f8f0 = 0
    return sub_40f3c0() __tailcall
}
