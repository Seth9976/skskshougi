// ============================================================
// 函数名称: sub_401440
// 虚拟地址: 0x401440
// WARP GUID: f011feae-4505-556a-81c6-dfadc601a932
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

void** __thiscallsub_401440(int32_t* arg1, int32_t arg2, int32_t* arg3)
{
    // 第一条实际指令: void var_c
    void var_c
    void** result = (*(*arg1 + 0xc))(&var_c, arg2)
    
    if (result[1] == arg3[1] && *result == *arg3)
        result.b = 1
        return result
    
    result.b = 0
    return result
}
