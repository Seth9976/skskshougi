// ============================================================
// 函数名称: sub_4013b0
// 虚拟地址: 0x4013b0
// WARP GUID: 80f5d403-a5f8-51a6-9a99-d925595a4c16
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_404140
// ============================================================

int32_t __convention("regparm")sub_4013b0(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: if (arg4 != 0)
    if (arg4 != 0)
        return memcpy(arg3, arg2, arg4)
    
    return arg3
}
