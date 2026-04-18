// ============================================================
// 函数名称: sub_415c40
// 虚拟地址: 0x415c40
// WARP GUID: 9fb92096-0de4-5644-af44-83f6f623f94f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_415ca0, sub_415890
// ============================================================

int32_t* __thiscallsub_415c40(int32_t* arg1, int32_t* arg2, int32_t arg3)
{
    // 第一条实际指令: int32_t edx = arg1[1]
    int32_t edx = arg1[1]
    int32_t esi = *arg1
    
    if (arg3 s< 0 && edx u< neg.d(arg3))
        int32_t edx_1 = edx + arg3
        *arg2 = esi + 0xfffffffc - ((0xffffffff - edx_1) u>> 5 << 2)
        arg2[1] = edx_1 & 0x1f
        return arg2
    
    int32_t edx_3 = edx + arg3
    *arg2 = esi + (edx_3 u>> 5 << 2)
    arg2[1] = edx_3 & 0x1f
    return arg2
}
