// ============================================================
// 函数名称: sub_415e50
// 虚拟地址: 0x415e50
// WARP GUID: ce297a96-c6b5-5526-adcb-146305a569de
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d150
// [被调用的父级函数]: sub_415ca0
// ============================================================

int32_t __thiscallsub_415e50(int32_t* arg1, int32_t arg2, int32_t* arg3)
{
    // 第一条实际指令: int32_t* var_8 = arg1
    int32_t* var_8 = arg1
    int32_t eax = arg1[1]
    int32_t edx = *arg1
    int32_t ecx_2 = (eax - edx) s>> 2
    
    if (ecx_2 u> arg2)
        int32_t eax_1 = eax + ((arg2 - ecx_2) << 2)
        arg1[1] = eax_1
        return eax_1
    
    if (ecx_2 u< arg2)
        int32_t* ebx_1 = arg3
        
        if (ebx_1 u>= eax || edx u> ebx_1)
            sub_40d150(arg1, arg2 - ecx_2)
        else
            sub_40d150(arg1, arg2 - ecx_2)
            ebx_1 = *arg1 + ((ebx_1 - edx) s>> 2 << 2)
        
        void* edx_1 = arg1[1]
        int32_t eax_9 = (edx_1 - *arg1) s>> 2
        int32_t i_1 = arg2 - eax_9
        
        if (arg2 != eax_9)
            int32_t i
            
            do
                edx_1 += 4
                *(edx_1 - 4) = *ebx_1
                i = i_1
                i_1 -= 1
            while (i != 1)
        
        int32_t ecx_6 = arg1[1]
        eax = ecx_6 + ((arg2 - ((ecx_6 - *arg1) s>> 2)) << 2)
        arg1[1] = eax
    
    return eax
}
