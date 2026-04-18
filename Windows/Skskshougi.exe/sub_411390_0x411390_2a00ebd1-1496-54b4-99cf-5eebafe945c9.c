// ============================================================
// 函数名称: sub_411390
// 虚拟地址: 0x411390
// WARP GUID: 2a00ebd1-1496-54b4-99cf-5eebafe945c9
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_403ed0, sub_4199b8
// [被调用的父级函数]: sub_414c30, sub_409c90, sub_4114c0
// ============================================================

int32_tsub_411390()
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41b4f0
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    int32_t var_64 = eax_2
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* eax_3 = cocos2d::UserDefault::getInstance()
    int32_t i = 0
    int32_t result_1 = 0
    int32_t i_1 = 0
    int32_t result
    
    do
        int32_t j = 0
        int32_t j_1 = 0
        
        do
            int32_t ebx_1 = 0
            
            for (char const (** const k)[0xa] = &data_41d800; k s< &data_41d828; )
                void* var_44
                int32_t* eax_4 = sub_401f70(&var_44, i + j)
                int32_t var_8_1 = 0
                int32_t* var_2c
                sub_403ed0(eax_4.b, *k, &var_2c, eax_4)
                var_8_1.b = 2
                int32_t var_30
                
                if (var_30 u>= 0x10)
                    operator delete(var_44)
                
                int32_t* ecx_2 = &var_2c
                int32_t var_18
                
                if (var_18 u>= 0x10)
                    ecx_2 = var_2c
                
                var_30 = 0xf
                int32_t var_34_1 = 0
                var_44.b = 0
                ebx_1 += (*(*eax_3 + 4))(ecx_2, 0)
                int32_t var_8_2 = 0xffffffff
                
                if (var_18 u>= 0x10)
                    operator delete(var_2c)
                
                j = j_1
                k = &k[1]
                i = i_1
            
            j += 1
            result = result_1 + ebx_1
            j_1 = j
            result_1 = result
        while (j s< 9)
        
        i += 0xa
        i_1 = i
    while (i s< 0x1e)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
