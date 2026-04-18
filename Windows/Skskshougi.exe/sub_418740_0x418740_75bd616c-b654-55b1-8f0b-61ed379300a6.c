// ============================================================
// 函数名称: sub_418740
// 虚拟地址: 0x418740
// WARP GUID: 75bd616c-b654-55b1-8f0b-61ed379300a6
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401c80, sub_403b20, sub_403be0
// [被调用的父级函数]: sub_4169c0
// ============================================================

int32_t* __fastcallsub_418740(void* arg1, void** arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b0b9
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_28 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t* result = arg1
    int32_t* result_1 = result
    int32_t var_14 = 0
    result[5] = 0xf
    result[4] = 0
    *result = 0
    int32_t var_8_1 = 0
    int32_t edi = result[4]
    char* eax_4 = arg2[4] + 0x10
    int32_t var_14_1 = 1
    
    if (edi u<= eax_4 && result[5] != eax_4 && sub_401c80(arg1, eax_4, 1) != 0)
        bool cond:0_1 = result[5] u< 0x10
        result[4] = edi
        int32_t* result_2
        
        if (cond:0_1)
            result_2 = result
        else
            result_2 = *result
        
        *(result_2 + edi) = 0
    
    sub_403b20(result, arg2, nullptr, 0xffffffff)
    sub_403be0(result, 0x4207dc, 0x10)
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
