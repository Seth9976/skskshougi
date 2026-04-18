// ============================================================
// 函数名称: __EH_epilog3
// 虚拟地址: 0x41a0b0
// WARP GUID: 557622c5-8a0c-5c56-8442-52520fe2474c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_419b54
// ============================================================

int32_t__EH_epilog3(int32_t* arg1 @ ebp, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: TEB* fsbase
    TEB* fsbase
    fsbase->NtTib.ExceptionList = arg1[-3]
    *arg1
    *arg1 = __return_addr
}
