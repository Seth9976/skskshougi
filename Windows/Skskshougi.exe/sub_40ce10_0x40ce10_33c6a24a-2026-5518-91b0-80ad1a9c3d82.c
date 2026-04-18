// ============================================================
// 函数名称: sub_40ce10
// 虚拟地址: 0x40ce10
// WARP GUID: 33c6a24a-2026-5518-91b0-80ad1a9c3d82
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403ac0
// [被调用的父级函数]: sub_409c90
// ============================================================

int32_t* __thiscallsub_40ce10(int32_t* arg1, char* arg2)
{
    // 第一条实际指令: if (arg1 != arg2)
    if (arg1 != arg2)
        if (arg1[5] u>= 0x10)
            operator delete(*arg1)
        
        arg1[5] = 0xf
        arg1[4] = 0
        *arg1 = 0
        sub_403ac0(arg1, arg2)
    
    return arg1
}
