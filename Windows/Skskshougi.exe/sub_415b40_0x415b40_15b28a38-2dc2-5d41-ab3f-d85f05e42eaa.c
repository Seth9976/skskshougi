// ============================================================
// 函数名称: sub_415b40
// 虚拟地址: 0x415b40
// WARP GUID: 15b28a38-2dc2-5d41-ab3f-d85f05e42eaa
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_415fc0, sub_415ca0
// [被调用的父级函数]: sub_415890
// ============================================================

int32_t* __thiscallsub_415b40(int32_t* arg1, int32_t* arg2, void* arg3, char* arg4, int32_t arg5, int32_t arg6)
{
    // 第一条实际指令: void* eax = sub_415ca0(arg1, arg3, arg5, arg6)
    void* eax = sub_415ca0(arg1, arg3, arg5, arg6)
    void* ecx = *arg1
    int32_t var_10 = 0
    void* edx = eax + arg3
    
    if (edx s>= 0 || neg.d(edx) == 0)
        arg3 = ecx + (edx u>> 5 << 2)
    else
        arg3 = ecx + 0xfffffffc - ((0xffffffff - edx) u>> 5 << 2)
    
    void* edx_1 = edx & 0x1f
    int32_t var_10_1 = 0
    int32_t* ecx_11
    
    if (eax s>= 0 || neg.d(eax) == 0)
        ecx_11 = ecx + (eax u>> 5 << 2)
    else
        ecx_11 = ecx + 0xfffffffc - ((0xffffffff - eax) u>> 5 << 2)
    
    void* esi_3 = eax & 0x1f
    int32_t eax_10 = esi_3
    sub_415fc0(eax_10, edx_1, arg4, ecx_11, eax_10, arg3, edx_1)
    arg6 = 0
    int32_t ecx_14 = *arg1
    
    if (eax s< 0 && neg.d(eax) != 0)
        *arg2 = ecx_14 + 0xfffffffc - ((0xffffffff - eax) u>> 5 << 2)
        arg2[1] = esi_3
        return arg2
    
    arg2[1] = esi_3
    *arg2 = ecx_14 + (eax u>> 5 << 2)
    return arg2
}
