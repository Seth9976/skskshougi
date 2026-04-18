// ============================================================
// 函数名称: sub_4021b0
// 虚拟地址: 0x4021b0
// WARP GUID: 50556c41-2005-5c32-8e0b-2499eeda86ab
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4031b0, sub_4032a0, sub_4035b0, sub_4038a0, sub_403740, sub_409540, sub_403230
// ============================================================

int32_t __fastcallsub_4021b0(void* arg1)
{
    // 第一条实际指令: void* esi = arg1
    void* esi = arg1
    char edx = *(esi + 0x19)
    *(esi + 0x19) = *(esi + 0x1d)
    *(esi + 0x1d) = edx
    arg1.b = *(esi + 0x1a)
    *(esi + 0x1a) = *(esi + 0x1e)
    *(esi + 0x1e) = arg1.b
    arg1.b = *(esi + 0x1b)
    *(esi + 0x1b) = *(esi + 0x1f)
    *(esi + 0x1f) = arg1.b
    arg1.b = *(esi + 0x1c)
    *(esi + 0x1c) = *(esi + 0x20)
    *(esi + 0x20) = arg1.b
    char eax_3 = *(esi + 0x13)
    arg1.b = *(esi + 5)
    char eax_4
    
    if (eax_3 != 0)
        eax_4 = eax_3 ^ 8
    else
        eax_4 = 0
    
    *(esi + 5) = eax_4
    char eax_6
    
    if (arg1.b != 0)
        eax_6 = arg1.b ^ 8
    else
        eax_6 = 0
    
    arg1.b = *(esi + 6)
    *(esi + 0x13) = eax_6
    eax_6 = *(esi + 0x12)
    char eax_8
    
    if (eax_6 != 0)
        eax_8 = eax_6 ^ 8
    else
        eax_8 = 0
    
    *(esi + 6) = eax_8
    char eax_10
    
    if (arg1.b != 0)
        eax_10 = arg1.b ^ 8
    else
        eax_10 = 0
    
    arg1.b = *(esi + 7)
    *(esi + 0x12) = eax_10
    eax_10 = *(esi + 0x11)
    char eax_12
    
    if (eax_10 != 0)
        eax_12 = eax_10 ^ 8
    else
        eax_12 = 0
    
    *(esi + 7) = eax_12
    char eax_14
    
    if (arg1.b != 0)
        eax_14 = arg1.b ^ 8
    else
        eax_14 = 0
    
    arg1.b = *(esi + 9)
    *(esi + 0x11) = eax_14
    eax_14 = *(esi + 0xf)
    char eax_16
    
    if (eax_14 != 0)
        eax_16 = eax_14 ^ 8
    else
        eax_16 = 0
    
    *(esi + 9) = eax_16
    char eax_18
    
    if (arg1.b != 0)
        eax_18 = arg1.b ^ 8
    else
        eax_18 = 0
    
    arg1.b = *(esi + 0xa)
    *(esi + 0xf) = eax_18
    eax_18 = *(esi + 0xe)
    char eax_20
    
    if (eax_18 != 0)
        eax_20 = eax_18 ^ 8
    else
        eax_20 = 0
    
    *(esi + 0xa) = eax_20
    char eax_22
    
    if (arg1.b != 0)
        eax_22 = arg1.b ^ 8
    else
        eax_22 = 0
    
    arg1.b = *(esi + 0xb)
    *(esi + 0xe) = eax_22
    eax_22 = *(esi + 0xd)
    char eax_24
    
    if (eax_22 != 0)
        eax_24 = eax_22 ^ 8
    else
        eax_24 = 0
    
    *(esi + 0xb) = eax_24
    
    if (arg1.b == 0)
        *(esi + 0xd) = arg1.b
        return eax_24
    
    char eax_27 = arg1.b ^ 8
    *(esi + 0xd) = eax_27
    return eax_27
}
