// ============================================================
// 函数名称: sub_40e1e0
// 虚拟地址: 0x40e1e0
// WARP GUID: bc0ea0a4-d195-5256-9a3d-e1d0217c95e3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40baa0
// [被调用的父级函数]: 无
// ============================================================

int32_t __fastcallsub_40e1e0(void* arg1)
{
    // 第一条实际指令: int32_t* ecx = *(arg1 + 4)
    int32_t* ecx = *(arg1 + 4)
    int32_t result = ecx[0xb3]
    
    if (result == 0)
        return result
    
    ecx[0xb3] = result - 1
    return sub_40baa0(ecx)
}
