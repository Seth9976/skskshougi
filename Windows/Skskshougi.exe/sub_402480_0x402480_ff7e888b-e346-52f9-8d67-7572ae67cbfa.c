// ============================================================
// 函数名称: sub_402480
// 虚拟地址: 0x402480
// WARP GUID: ff7e888b-e346-52f9-8d67-7572ae67cbfa
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4028d0
// ============================================================

int32_t __thiscallsub_402480(int32_t arg1, void** arg2, char** arg3)
{
    // 第一条实际指令: char* edx = 5
    char* edx = 5
    
    while (edx[arg1] != 5)
        edx = &edx[1]
        
        if (edx s> 0x13)
            int32_t eax
            eax.b = 0
            return eax
    
    *arg3 = edx
    char** eax_1
    eax_1.b = edx[arg1 - 4]
    
    if (eax_1.b == 9 || eax_1.b == 0xc || eax_1.b == 0xb || eax_1.b == 0xd)
        *arg2 = &edx[0xfffffffc]
        int32_t eax_19
        eax_19.b = edx != 4
        return eax_19
    
    eax_1.b = edx[arg1 - 3]
    
    if (eax_1.b == 0xa || eax_1.b == 0xd || eax_1.b == 0xc)
        *arg2 = &edx[0xfffffffd]
        int32_t eax_17
        eax_17.b = edx != 3
        return eax_17
    
    eax_1.b = edx[arg1 - 5]
    
    if (eax_1.b == 0xa || eax_1.b == 0xd || eax_1.b == 0xc)
        *arg2 = &edx[0xfffffffb]
        int32_t eax_15
        eax_15.b = edx != 5
        return eax_15
    
    eax_1.b = edx[arg1 + 1]
    
    if (eax_1.b == 0xb || eax_1.b == 0xd || eax_1.b == 0xc)
        *arg2 = &edx[1]
        int32_t eax_13
        eax_13.b = edx != 0xffffffff
        return eax_13
    
    eax_1.b = edx[arg1 - 1]
    
    if (eax_1.b == 0xb || eax_1.b == 0xd || eax_1.b == 0xc)
        *arg2 = edx - 1
        int32_t eax_11
        eax_11.b = edx != 1
        return eax_11
    
    eax_1.b = edx[arg1 + 4]
    
    if (eax_1.b == 0xb || eax_1.b == 0xd || eax_1.b == 0xc)
        *arg2 = &edx[4]
        int32_t eax_9
        eax_9.b = edx != 0xfffffffc
        return eax_9
    
    eax_1.b = edx[arg1 + 5]
    
    if (eax_1.b == 0xa || eax_1.b == 0xd)
        *arg2 = &edx[5]
        int32_t eax_7
        eax_7.b = edx != 0xfffffffb
        return eax_7
    
    eax_1.b = edx[arg1 + 3]
    
    if (eax_1.b != 0xa && eax_1.b != 0xd)
        *arg2 = nullptr
        int32_t eax_3
        eax_3.b = false
        return 0
    
    *arg2 = &edx[3]
    int32_t eax_5
    eax_5.b = edx != 0xfffffffd
    return eax_5
}
