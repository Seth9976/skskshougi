// ============================================================
// 函数名称: sub_415950
// 虚拟地址: 0x415950
// WARP GUID: bf1dc918-92b7-5607-a40d-c82f1b917556
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_415ca0, sub_415890
// ============================================================

int32_t* __thiscallsub_415950(int32_t* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t edx = arg1[3]
    int32_t edx = arg1[3]
    int32_t edi = *arg1
    *arg2 = edi
    arg2[1] = 0
    
    if (edx != 0)
        if (edx s< 0 && neg.d(edx) != 0)
            *arg2 = edi - (((0xffffffff - edx) u>> 5 << 2) + 4)
            arg2[1] = edx & 0x1f
            return arg2
        
        arg2[1] = edx & 0x1f
        *arg2 = edi + (edx u>> 5 << 2)
    
    return arg2
}
