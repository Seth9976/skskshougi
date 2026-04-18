// ============================================================
// 函数名称: sub_415820
// 虚拟地址: 0x415820
// WARP GUID: 45a65150-8f36-5965-ac2b-875b9a2e98bc
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d150
// [被调用的父级函数]: sub_411640
// ============================================================

void __fastcallsub_415820(int32_t* arg1)
{
    // 第一条实际指令: int32_t ecx = arg1[1]
    int32_t ecx = arg1[1]
    int32_t edx_2 = (ecx - *arg1) s>> 2
    
    if (edx_2 u> 9)
        arg1[1] = ecx + ((9 - edx_2) << 2)
        return 
    
    if (edx_2 u>= 9)
        return 
    
    sub_40d150(arg1, 9 - edx_2)
    int32_t edi_1 = arg1[1]
    int32_t eax_6 = (edi_1 - *arg1) s>> 2
    
    if (9 != eax_6)
        __builtin_memset(edi_1, 0, (9 - eax_6) << 2)
    
    int32_t ecx_3 = arg1[1]
    arg1[1] = ecx_3 + ((9 - ((ecx_3 - *arg1) s>> 2)) << 2)
}
