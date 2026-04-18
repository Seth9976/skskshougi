// ============================================================
// 函数名称: sub_415ef0
// 虚拟地址: 0x415ef0
// WARP GUID: 8fa5a7f7-0070-58e9-a6c0-2a5b54fdcd6d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_415d70
// ============================================================

int32_t* __thiscallsub_415ef0(int32_t* arg1, int32_t* arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t ecx = *arg1
    int32_t ecx = *arg1
    
    if (arg3 == ecx && arg4 == arg1[1])
        arg1[1] = ecx
    else if (arg3 != arg4)
        int32_t esi = (arg1[1] - arg4) s>> 2 << 2
        memmove(arg3, arg4, esi)
        arg1[1] = esi + arg3
        *arg2 = arg3
        return arg2
    
    *arg2 = arg3
    return arg2
}
