// ============================================================
// 函数名称: sub_4032a0
// 虚拟地址: 0x4032a0
// WARP GUID: 97cba8d5-d240-503a-a3b4-d790a202cde3
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4028d0, sub_402020, sub_4021b0, sub_402d10, sub_4199b8
// [被调用的父级函数]: sub_40c770
// ============================================================

char* __thiscallsub_4032a0(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t __saved_ebp
    int32_t __saved_ebp
    int32_t eax_1 = __security_cookie ^ &__saved_ebp
    char var_2c[0x24]
    sub_402020(&var_2c, arg1)
    sub_4021b0(&var_2c)
    int32_t var_34_1 = 1
    sub_4028d0(&var_2c, arg2)
    
    if (*arg2 == arg2[1])
        for (int32_t i = 5; i s<= 0x13; i += 1)
            if (var_2c[i] == 5)
                int32_t var_34_2 = 0
                sub_402d10(&var_2c, arg2, i.b, 1)
                break
    
    int32_t ecx_4 = arg2[1]
    char* result = *arg2
    
    if (result != ecx_4)
        int32_t __saved_esi_2
        int32_t __saved_esi_1 = __saved_esi_2
        
        do
            __saved_esi_2.b = *result
            
            if (__saved_esi_2.b u>= 5)
                *result = 0x18 - __saved_esi_2.b
            
            result[1] = 0x18 - result[1]
            result = &result[2]
        while (result != ecx_4)
    
    sub_4199b8(eax_1 ^ &__saved_ebp)
    return result
}
