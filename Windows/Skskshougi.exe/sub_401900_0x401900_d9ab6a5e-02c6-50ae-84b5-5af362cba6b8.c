// ============================================================
// 函数名称: sub_401900
// 虚拟地址: 0x401900
// WARP GUID: d9ab6a5e-02c6-50ae-84b5-5af362cba6b8
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0
// [被调用的父级函数]: sub_408ce0, sub_4169c0, sub_40adb0, sub_40f5f0, sub_409540, sub_417760, sub_413640, sub_411640, sub_409c90, sub_4087d0
// ============================================================

char* __thiscallsub_401900(char* arg1, char* arg2)
{
    // 第一条实际指令: *(arg1 + 0x14) = 0xf
    *(arg1 + 0x14) = 0xf
    *(arg1 + 0x10) = 0
    *arg1 = 0
    
    if (*arg2 == 0)
        sub_401ae0(arg1, arg2, 0)
        return arg1
    
    char* edx = arg2
    char i
    
    do
        i = *edx
        edx = &edx[1]
    while (i != 0)
    sub_401ae0(arg1, arg2, edx - &edx[1])
    return arg1
}
