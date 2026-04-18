// ============================================================
// 函数名称: sub_415660
// 虚拟地址: 0x415660
// WARP GUID: 04d45650-6d13-5627-971c-b3367509be82
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8, sub_414200
// [被调用的父级函数]: sub_4165a0
// ============================================================

int32_t __fastcallsub_415660(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41bc38
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    char var_38
    int32_t var_1c = __security_cookie ^ &var_38
    int32_t esi
    int32_t var_3c = esi
    int32_t edi
    int32_t var_40 = edi
    int32_t eax_4 = __security_cookie ^ &var_40
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t eax_5 = data_42e4d8
    int32_t var_20 = 0xf
    int32_t var_24 = 0
    char var_34 = 0
    char* edx = (&data_41d8a4)[eax_5]
    void* ecx
    
    if (*edx != 0)
        char* ecx_1 = edx
        
        do
            eax_5.b = *ecx_1
            ecx_1 = &ecx_1[1]
        while (eax_5.b != 0)
        
        ecx = ecx_1 - &ecx_1[1]
    else
        ecx = nullptr
    
    sub_401ae0(&var_34, edx, ecx)
    int32_t var_c_1 = 0
    (*(*(*(arg1 + 0x2b4) + 0x310) + 4))(&var_34, eax_4)
    int32_t var_10_1 = 0xffffffff
    
    if (var_24 u>= 0x10)
        operator delete(var_38.d)
    
    int32_t var_24_1 = 0xf
    int32_t var_28 = 0
    var_38 = 0
    int32_t result = sub_414200(arg1)
    int32_t var_18
    fsbase->NtTib.ExceptionList = var_18
    sub_4199b8(var_20 ^ &var_3c)
    return result
}
