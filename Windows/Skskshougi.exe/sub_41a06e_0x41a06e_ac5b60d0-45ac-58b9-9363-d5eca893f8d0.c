// ============================================================
// 函数名称: sub_41a06e
// 虚拟地址: 0x41a06e
// WARP GUID: ac5b60d0-45ac-58b9-9363-d5eca893f8d0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: ?terminate@@YAXXZ
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_tsub_41a06e(int32_t* arg1 @ ebp)
{
    // 第一条实际指令: arg1[-7] = arg1[-5]
    arg1[-7] = arg1[-5]
    arg1[-8] = *arg1[-7]
    
    if (*arg1[-8] != 0xe06d7363)
        arg1[-9] = 0
        return arg1[-9]
    
    int32_t result = terminate()
    int32_t esp = arg1[-6]
    arg1[-1] = 0xfffffffe
    *(esp - 4) = &data_41a0a6
    TEB* fsbase
    fsbase->NtTib.ExceptionList = arg1[-4]
    *(esp + 4)
    *(esp + 8)
    *(esp + 0xc)
    *arg1
    *arg1 = *(esp - 4)
    *arg1
    return result
}
