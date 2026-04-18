// ============================================================
// 函数名称: sub_40d0c0
// 虚拟地址: 0x40d0c0
// WARP GUID: 71c78ece-20e1-5439-820f-c86f06d96849
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402020, sub_40d200
// [被调用的父级函数]: sub_40c770, sub_406500, sub_406250, sub_406f90
// ============================================================

void __thiscallsub_40d0c0(int32_t* arg1, void* arg2)
{
    // 第一条实际指令: int32_t ecx = arg1[1]
    int32_t ecx = arg1[1]
    int32_t eax
    
    if (arg2 u< ecx)
        eax = *arg1
    
    if (arg2 u>= ecx || eax u> arg2)
        if (ecx == arg1[2])
            sub_40d200(arg1, 1)
        
        void* ecx_4 = arg1[1]
        
        if (ecx_4 != 0)
            sub_402020(ecx_4, arg2)
    else
        int32_t edx_1
        edx_1:eax = muls.dp.d(0x3e0f83e1, arg2 - eax)
        int32_t edx_2 = edx_1 s>> 3
        
        if (ecx == arg1[2])
            sub_40d200(arg1, 1)
        
        void* ecx_2 = arg1[1]
        
        if (ecx_2 != 0)
            sub_402020(ecx_2, ((edx_2 u>> 0x1f) + edx_2) * 0x21 + *arg1)
            arg1[1] += 0x21
            return 
    
    arg1[1] += 0x21
}
