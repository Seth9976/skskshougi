// ============================================================
// 函数名称: sub_413c30
// 虚拟地址: 0x413c30
// WARP GUID: 1b22c2d0-cc55-58f1-b5aa-46b008ea2eb2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_40d460, sub_4199b8
// [被调用的父级函数]: sub_414c30
// ============================================================

int32_t __stdcallsub_413c30(int32_t* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41ba68
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_64 = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    *arg1 = 0
    *arg2 = 0
    class cocos2d::UserDefault* eax_4 = cocos2d::UserDefault::getInstance()
    int32_t i = 0
    int32_t i_1 = 0
    
    do
        for (int32_t j = 0; j s< 9; j += 1)
            void* var_44
            sub_401f70(&var_44, i + j)
            int32_t var_8_1 = 0
            void* var_2c
            int32_t* ecx_3 = sub_40d460(&var_44, "nGame-", &var_2c, &var_44)
            var_8_1.b = 1
            
            if (ecx_3[5] u>= 0x10)
                ecx_3 = *ecx_3
            
            int32_t eax_8 = (*(*eax_4 + 4))(ecx_3, 0)
            *arg1 += eax_8
            var_8_1.b = 0
            int32_t var_18
            
            if (var_18 u>= 0x10)
                operator delete(var_2c)
            
            int32_t* eax_10 = sub_40d460(&var_44, "nWin-", &var_2c, &var_44)
            var_8_1.b = 2
            
            if (eax_10[5] u>= 0x10)
                eax_10 = *eax_10
            
            int32_t eax_11 = (*(*eax_4 + 4))(eax_10, 0)
            *arg2 += eax_11
            
            if (var_18 u>= 0x10)
                operator delete(var_2c)
            
            int32_t var_8_2 = 0xffffffff
            int32_t var_30
            
            if (var_30 u>= 0x10)
                operator delete(var_44)
            
            i = i_1
        
        i += 0xa
        i_1 = i
    while (i s< 0x1e)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return i
}
