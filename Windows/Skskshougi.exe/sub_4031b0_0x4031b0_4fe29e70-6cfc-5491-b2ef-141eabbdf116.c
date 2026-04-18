// ============================================================
// 函数名称: sub_4031b0
// 虚拟地址: 0x4031b0
// WARP GUID: 4fe29e70-6cfc-5491-b2ef-141eabbdf116
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_402d10, sub_402020, sub_4199b8, sub_4021b0
// [被调用的父级函数]: sub_405d60
// ============================================================

char* __thiscallsub_4031b0(void* arg1, int32_t* arg2, char arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t __saved_ebp
    int32_t __saved_ebp
    int32_t eax_1 = __security_cookie ^ &__saved_ebp
    void var_2c
    sub_402020(&var_2c, arg1)
    sub_4021b0(&var_2c)
    int32_t var_34_1 = arg4
    sub_402d10(&var_2c, arg2, 0x18 - arg3, 1)
    int32_t ecx_3 = arg2[1]
    char* result = *arg2
    
    if (result != ecx_3)
        int32_t __saved_esi_2
        int32_t __saved_esi_1 = __saved_esi_2
        
        do
            char edx_1 = *result
            
            if (edx_1 u>= 5)
                __saved_esi_2.b = 0x18
                __saved_esi_2.b = 0x18 - edx_1
                *result = __saved_esi_2.b
            
            result[1] = 0x18 - result[1]
            result = &result[2]
        while (result != ecx_3)
    
    sub_4199b8(eax_1 ^ &__saved_ebp)
    return result
}
