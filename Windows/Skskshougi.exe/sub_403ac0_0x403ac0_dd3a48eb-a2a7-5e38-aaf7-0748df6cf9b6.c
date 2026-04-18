// ============================================================
// 函数名称: sub_403ac0
// 虚拟地址: 0x403ac0
// WARP GUID: dd3a48eb-a2a7-5e38-aaf7-0748df6cf9b6
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_406900, sub_40ce10, sub_410970, sub_4114c0, sub_410810, sub_410760, sub_4108c0, sub_410bb0, sub_408a30, sub_409c90, sub_4106b0, ?OnAsanReport@__vcasan@@YAXPBD0_N@Z
// ============================================================

int32_t __thiscallsub_403ac0(int32_t* arg1, char* arg2)
{
    // 第一条实际指令: if (*(arg2 + 0x14) u>= 0x10)
    if (*(arg2 + 0x14) u>= 0x10)
        if (arg1 != 0)
            *arg1 = *arg2
        
        *arg2 = 0
    else
        int32_t eax_1 = *(arg2 + 0x10)
        
        if (eax_1 != 0xffffffff)
            memmove(arg1, arg2, eax_1 + 1)
    
    arg1[4] = *(arg2 + 0x10)
    int32_t result = *(arg2 + 0x14)
    arg1[5] = result
    *(arg2 + 0x14) = 0xf
    *(arg2 + 0x10) = 0
    *arg2 = 0
    return result
}
