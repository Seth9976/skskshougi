// ============================================================
// 函数名称: sub_415890
// 虚拟地址: 0x415890
// WARP GUID: a8ba12ff-fd1c-5f10-a1ee-da41335a71f3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4159b0, sub_415950, sub_415c40, sub_415b40
// [被调用的父级函数]: sub_4146d0
// ============================================================

void __fastcallsub_415890(int32_t* arg1)
{
    // 第一条实际指令: char var_8 = 1
    char var_8 = 1
    int32_t esi = arg1[3]
    int32_t var_10
    
    if (esi u>= 9)
        if (esi u> 9)
            void var_18
            int32_t* eax_8 = sub_415950(arg1, &var_18)
            int32_t var_c_1 = 0
            int32_t edi_2 = *eax_8
            int32_t esi_1 = eax_8[1]
            var_10 = *arg1
            void var_20
            int32_t* eax_10 = sub_415c40(&var_10, &var_20, 9)
            sub_4159b0(arg1, &var_10, *eax_10, eax_10[1], edi_2, esi_1)
        
        return 
    
    int32_t edi_1 = *arg1
    int32_t edx = 0
    
    if (esi != 0)
        if (esi s>= 0 || neg.d(esi) == 0)
            edi_1 += esi u>> 5 << 2
        else
            edi_1 += 0xfffffffc - ((0xffffffff - esi) u>> 5 << 2)
        
        edx = esi & 0x1f
    
    sub_415b40(arg1, &var_10, 9 - esi, &var_8, edi_1, edx)
}
