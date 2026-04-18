// ============================================================
// 函数名称: ??1_Concurrent_queue_iterator_base_v4@details@Concurrency@@IAE@XZ
// 虚拟地址: 0x4112b0
// WARP GUID: eabce82f-5e4a-5fc7-a676-fda6a74364a5
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_4155b0
// ============================================================

void* __thiscall??1_Concurrent_queue_iterator_base_v4@details@Concurrency@@IAE@XZ(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn =
        __ehhandler$??0system_error@std@@QAE@HABVerror_category@1@PBD@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_18 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_8_1 = 0
    void arg_4
    void* result = &arg_4
    int32_t* ecx_1
    
    if (arg1 + 0x2e0 == &arg_4)
        ecx_1 = arg2
    else
        int32_t* ecx = *(arg1 + 0x2f0)
        
        if (ecx != 0)
            result.b = ecx != arg1 + 0x2e0
            result = (*(*ecx + 0x10))(zx.d(result.b))
            *(arg1 + 0x2f0) = 0
        
        ecx_1 = arg2
        
        if (ecx_1 != 0)
            void* var_1c_2
            
            if (ecx_1 != &arg_4)
                var_1c_2 = nullptr
            else
                var_1c_2 = arg1 + 0x2e0
            
            result = (**ecx_1)(var_1c_2)
            *(arg1 + 0x2f0) = result
            ecx_1 = arg2
        else
            *(arg1 + 0x2f0) = ecx_1
    
    int32_t var_8_2 = 0xffffffff
    
    if (ecx_1 != 0)
        result = (*(*ecx_1 + 0x10))(ecx_1 != &arg_4)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
