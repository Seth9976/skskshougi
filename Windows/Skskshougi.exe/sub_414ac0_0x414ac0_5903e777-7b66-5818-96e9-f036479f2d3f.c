// ============================================================
// 函数名称: sub_414ac0
// 虚拟地址: 0x414ac0
// WARP GUID: 5903e777-7b66-5818-96e9-f036479f2d3f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8, sub_414200
// [被调用的父级函数]: sub_4161c0, sub_413640
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __fastcallsub_414ac0(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41bc38
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_38
    int32_t eax_2 = __security_cookie ^ &var_38
    int32_t __saved_edi
    int32_t var_44 = __security_cookie ^ &__saved_edi
    struct _EXCEPTION_REGISTRATION_RECORD** result = &ExceptionList
    fsbase->NtTib.ExceptionList = &ExceptionList
    
    if (*(arg1 + 0x2a4) == 0)
        class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
        int32_t eax_6 = (*(*eax_5 + 4))("difficulty", 0)
        data_42e4d8 = eax_6
        int32_t ecx_3
        
        if (eax_6 != 3)
            ecx_3 = eax_6 + 1
        else
            (*(**(arg1 + 0x2c4) + 0xac))(0)
            ecx_3 = 0
        
        data_42e4d8 = ecx_3
        (*(*eax_5 + 0x1c))("difficulty", ecx_3)
        int32_t eax_9 = data_42e4d8
        int32_t var_20_1 = 0xf
        int32_t var_24_1 = 0
        char var_34 = 0
        char* edx_2 = (&data_41d8a4)[eax_9]
        void* ecx_5
        
        if (*edx_2 != 0)
            char* ecx_6 = edx_2
            
            do
                eax_9.b = *ecx_6
                ecx_6 = &ecx_6[1]
            while (eax_9.b != 0)
            
            ecx_5 = ecx_6 - &ecx_6[1]
        else
            ecx_5 = nullptr
        
        sub_401ae0(&var_34, edx_2, ecx_5)
        int32_t var_c_1 = 0
        (*(*(*(arg1 + 0x2b4) + 0x310) + 4))(&var_34)
        int32_t var_c_2 = 0xffffffff
        
        if (var_20_1 u>= 0x10)
            operator delete(var_34.d)
        
        bool cond:0_1 = data_42e4d8 == 3
        int32_t var_20_2 = 0xf
        int32_t var_24_2 = 0
        var_34 = 0
        
        if (cond:0_1)
            result = (*(**(arg1 + 0x2c4) + 0xac))(1)
        else
            result = sub_414200(arg1)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_38)
    return result
}
