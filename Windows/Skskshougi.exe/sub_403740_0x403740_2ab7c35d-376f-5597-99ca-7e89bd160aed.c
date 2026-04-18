// ============================================================
// 函数名称: sub_403740
// 虚拟地址: 0x403740
// WARP GUID: 2ab7c35d-376f-5597-99ca-7e89bd160aed
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_4028d0, sub_4035b0, sub_4021b0, sub_402d10, sub_403340, sub_4199b8
// [被调用的父级函数]: sub_4038a0
// ============================================================

int32_t __thiscallsub_403740(char* arg1, int16_t* arg2, int32_t arg3)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a4b8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    data_42d120 = 0
    void* var_44 = nullptr
    *(arg2 + 1) = 0
    int32_t var_40 = 0
    int32_t var_3c = 0
    int32_t var_64 = 0
    int32_t var_8_1 = 0
    sub_4028d0(arg1, &var_44)
    int32_t eax_4 = var_40
    void* ecx = var_44
    
    if (ecx == eax_4)
        int32_t eax_5 = 5
        
        while (arg1[eax_5] != 5)
            eax_5 += 1
            
            if (eax_5 s> 0x13)
                eax_5 = 0xffffffff
                break
        
        int32_t var_64_1 = 0
        sub_402d10(arg1, &var_44, eax_5.b, 0)
        eax_4 = var_40
        ecx = var_44
    
    int32_t result = 0xffff8001
    char* esi = ecx
    int32_t result_1 = 0xffff8001
    
    if (ecx != eax_4)
        do
            void var_38
            memcpy(&var_38, arg1, 0x19, eax_2)
            void var_1b
            void* edx_1 = &var_1b
            void* eax_8 = &arg1[0x1d]
            int32_t i_1 = 4
            int32_t i
            
            do
                char ecx_2 = *(eax_8 - 4)
                eax_8 += 1
                *(edx_1 - 4) = ecx_2
                edx_1 += 1
                *(edx_1 - 1) = *(eax_8 - 1)
                i = i_1
                i_1 -= 1
            while (i != 1)
            sub_403340(&var_38, esi)
            sub_4021b0(&var_38)
            int32_t i_2 = i_1
            result = result_1
            int32_t result_2 = neg.d(sub_4035b0(&var_38, 0xffff8001, neg.d(result), arg3 - 1))
            
            if (result_2 s> result)
                result = result_2
                result_2.w = *esi
                result_1 = result
                *arg2 = result_2.w
            
            esi = &esi[2]
        while (esi != var_40)
        
        ecx = var_44
    
    if (ecx != 0)
        operator delete(ecx)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
