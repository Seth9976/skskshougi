// ============================================================
// 函数名称: sub_403980
// 虚拟地址: 0x403980
// WARP GUID: 6049b2c0-affd-5286-827f-153660de402e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403be0
// [被调用的父级函数]: sub_409c90
// ============================================================

int32_t* __stdcallsub_403980(char* arg1)
{
    // 第一条实际指令: int32_t* ecx
    int32_t* ecx
    
    if (*arg1 == 0)
        return sub_403be0(ecx, arg1, nullptr)
    
    char* edx = arg1
    char i
    
    do
        i = *edx
        edx = &edx[1]
    while (i != 0)
    return sub_403be0(ecx, arg1, edx - &edx[1])
}
