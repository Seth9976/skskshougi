// ============================================================
// 函数名称: sub_40e3c0
// 虚拟地址: 0x40e3c0
// WARP GUID: 140acfbe-1bd5-5ac9-b675-f49e030a8acb
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_40d150
// [被调用的父级函数]: sub_40e320
// ============================================================

int32_t __thiscallsub_40e3c0(int32_t* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t* var_8 = arg1
    int32_t* var_8 = arg1
    int32_t edx = arg1[1]
    int32_t eax = *arg1
    int32_t ecx_2 = (edx - eax) s>> 2
    
    if (ecx_2 u> 9)
        int32_t eax_2 = edx + ((9 - ecx_2) << 2)
        arg1[1] = eax_2
        return eax_2
    
    if (ecx_2 u< 9)
        int32_t* edi_1 = arg2
        
        if (edi_1 u>= edx || eax u> edi_1)
            sub_40d150(arg1, 9 - ecx_2)
        else
            sub_40d150(arg1, 9 - ecx_2)
            edi_1 = *arg1 + ((edi_1 - eax) s>> 2 << 2)
        
        void* edx_1 = arg1[1]
        int32_t eax_8 = (edx_1 - *arg1) s>> 2
        
        if (9 != eax_8)
            int32_t i_1 = 9 - eax_8
            int32_t i
            
            do
                edx_1 += 4
                *(edx_1 - 4) = *edi_1
                i = i_1
                i_1 -= 1
            while (i != 1)
        
        int32_t ecx_6 = arg1[1]
        eax = ecx_6 + ((9 - ((ecx_6 - *arg1) s>> 2)) << 2)
        arg1[1] = eax
    
    return eax
}
