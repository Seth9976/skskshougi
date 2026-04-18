// ============================================================
// 函数名称: sub_40d8d0
// 虚拟地址: 0x40d8d0
// WARP GUID: 1ccb01fc-725c-55e3-bad9-283ccee96c1a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_t __thiscallsub_40d8d0(int32_t* arg1, char arg2)
{
    // 第一条实际指令: int32_t result = (*(*arg1 + 0x14))(0)
    int32_t result = (*(*arg1 + 0x14))(0)
    
    if (arg2 == 0)
        return result
    
    return operator delete(arg1)
}
