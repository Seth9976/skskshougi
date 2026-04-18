// ============================================================
// 函数名称: sub_4038a0
// 虚拟地址: 0x4038a0
// WARP GUID: e6e00139-2e57-5783-9dd5-7d979bd9b9ca
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403740, sub_402020, sub_4199b8, sub_4021b0
// [被调用的父级函数]: sub_40c770
// ============================================================

int32_t __thiscallsub_4038a0(void* arg1, int16_t* arg2, int32_t arg3)
{
    // 第一条实际指令: int32_t __saved_ebp
    int32_t __saved_ebp
    int32_t eax_1 = __security_cookie ^ &__saved_ebp
    char var_2c[0x24]
    sub_402020(&var_2c, arg1)
    sub_4021b0(&var_2c)
    int32_t result = sub_403740(&var_2c, arg2, arg3)
    int32_t ebx
    ebx.b = *(arg2 + 1)
    int32_t result_1 = result
    
    if (ebx.b != 0)
        char ecx_3 = *arg2
        
        if (ecx_3 u>= 5)
            result.b = 0x18
            result.b = 0x18 - ecx_3
            *arg2 = result.b
        
        result.b = 0x18
        result.b = 0x18 - ebx.b
        *(arg2 + 1) = result.b
        result = result_1
    
    sub_4199b8(eax_1 ^ &__saved_ebp)
    return result
}
