// ============================================================
// 函数名称: ?CreatePrimary@UMSFreeVirtualProcessorRoot@details@Concurrency@@AAEXXZ
// 虚拟地址: 0x406e90
// WARP GUID: 9e8df2eb-1f4b-5071-a13b-81d12dc2a0fb
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_409c90, sub_404680
// ============================================================

int32_t __fastcall?CreatePrimary@UMSFreeVirtualProcessorRoot@details@Concurrency@@AAEXXZ(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a870
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_4c = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t result
    
    if (data_42e4d5 == 0)
        int32_t edx_1 = *(data_42e4e0 + (data_42e4dc << 2))
        
        if (edx_1 s>= 0xa)
            int32_t var_18_1 = 0xf
            int32_t var_1c_1 = 0
            char var_2c = 0
            sub_401ae0(&var_2c, 0x41e1d8, 3)
            int32_t var_8_2 = 1
            result = (*(*(*(arg1 + 0x324) + 0x310) + 4))(&var_2c)
            
            if (var_18_1 u>= 0x10)
                result = operator delete(var_2c.d)
        else
            int32_t var_8_1 = 0
            void* var_44
            result = (*(*(*(arg1 + 0x324) + 0x310) + 4))(sub_401f70(&var_44, edx_1))
            int32_t var_30
            
            if (var_30 u>= 0x10)
                result = operator delete(var_44)
    else
        result = (*(**(arg1 + 0x324) + 0xac))(0)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
