// ============================================================
// 函数名称: sub_415e10
// 虚拟地址: 0x415e10
// WARP GUID: 74b9e027-badc-5306-8770-58b05134f036
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_415f50
// [被调用的父级函数]: sub_411050
// ============================================================

void* __thiscallsub_415e10(int32_t* arg1, void* arg2, int32_t* arg3)
{
    // 第一条实际指令: void* result = sub_415f50(arg1, arg2)
    void* result = sub_415f50(arg1, arg2)
    
    if (result.b != 0)
        void* eax = *arg1
        void* i_1 = arg2
        void* edx_1 = eax
        
        if (arg2 != 0)
            void* i
            
            do
                edx_1 += 4
                *(edx_1 - 4) = *arg3
                i = i_1
                i_1 -= 1
            while (i != 1)
        
        result = eax + (arg2 << 2)
        arg1[1] = result
    
    return result
}
