// ============================================================
// 函数名称: sub_401d60
// 虚拟地址: 0x401d60
// WARP GUID: 9e895e9f-078d-5b7e-b16e-a75b14030b9e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401eb0
// [被调用的父级函数]: sub_401c80, sub_401ae0, sub_401990, sub_419400
// ============================================================

void* __thiscallsub_401d60(void* arg1, int32_t arg2, int32_t arg3)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$??_U@YAPAXIW4align_val_t@std@@ABUnothrow_t@1@@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_2c = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* var_14 = &var_2c
    void* result_2 = arg1
    void* result_3 = result_2
    int32_t edi_1 = arg2 | 0xf
    
    if (edi_1 u<= 0xfffffffe)
        int32_t ebx_1 = *(result_2 + 0x14)
        uint32_t ecx_1 = ebx_1 u>> 1
        
        if (ecx_1 u> edi_1 u/ 3)
            edi_1 = ecx_1 + ebx_1
            
            if (ebx_1 u> 0xfffffffe - ecx_1)
                edi_1 = 0xfffffffe
    else
        edi_1 = arg2
    
    int32_t var_8_1 = 0
    void* result_1 = nullptr
    void* result = nullptr
    
    if (edi_1 != 0xffffffff)
        if (edi_1 + 1 u<= 0xffffffff)
            result_1 = operator new(edi_1 + 1)
            result = result_1
        
        if (edi_1 + 1 u> 0xffffffff || result_1 == 0)
            std::_Xbad_alloc()
            int32_t eax_6 = arg2
            arg2 = eax_6
            var_8_1.b = 2
            void* var_18 = sub_401eb0(eax_6 + 1)
            return 0x401e14
    
    if (arg3 != 0)
        void* result_4
        
        if (*(result_2 + 0x14) u< 0x10)
            result_4 = result_2
        else
            result_4 = *result_2
        
        if (arg3 != 0)
            memcpy(result_1, result_4, arg3)
    
    if (*(result_2 + 0x14) u>= 0x10)
        operator delete(*result_2)
    
    *result_2 = 0
    *result_2 = result
    *(result_2 + 0x14) = edi_1
    *(result_2 + 0x10) = arg3
    
    if (edi_1 u>= 0x10)
        result_2 = result
    
    *(result_2 + arg3) = 0
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
