// ============================================================
// 函数名称: ?default_error_condition@error_category@std@@UBE?AVerror_condition@2@H@Z
// 虚拟地址: 0x401420
// WARP GUID: 44f4b4cb-a626-52f7-a027-a1ab4512e0cd
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_t* __thiscall?default_error_condition@error_category@std@@UBE?AVerror_condition@2@H@Z(int32_t arg1, int32_t* arg2, int32_t arg3)
{
    // 第一条实际指令: *arg2 = arg3
    *arg2 = arg3
    arg2[1] = arg1
    return arg2
}
