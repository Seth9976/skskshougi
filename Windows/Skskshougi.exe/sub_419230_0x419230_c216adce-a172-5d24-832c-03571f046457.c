// ============================================================
// 函数名称: sub_419230
// 虚拟地址: 0x419230
// WARP GUID: c216adce-a172-5d24-832c-03571f046457
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_40d550, sub_403f60, sub_4199b8
// [被调用的父级函数]: sub_414c30
// ============================================================

char* __fastcallsub_419230(char* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$?_Iput@?$num_put@DV?$ostreambuf_iterator@DU?$char_traits@D@std@@@std@@@std@@ABA?AV?$ostreambuf_iterator@DU?$char_traits@D@std@@@2@V32@AAVios_base@2@DPADI@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_b8 = 0
    int32_t eax_3
    int32_t edx
    eax_3, edx = _time64(0, eax_2)
    int32_t var_b4 = eax_3
    int32_t var_b0 = edx
    int32_t eax_4 = _localtime64(&var_b4)
    int32_t edi = *(eax_4 + 0x14)
    int32_t esi = *(eax_4 + 0x10)
    void* var_a4
    char* eax_5 = sub_401f70(&var_a4, *(eax_4 + 0xc))
    int32_t var_8_1 = 0
    char var_74
    char* eax_6 = sub_401f70(&var_74, esi + 1)
    var_8_1.b = 1
    char var_8c
    char* eax_7 = sub_401f70(&var_8c, edi + 0x76c)
    var_8_1.b = 2
    char var_44
    char* eax_8 = sub_403f60(eax_7.b, eax_7, &var_44, U"/")
    var_8_1.b = 3
    char var_2c
    char* eax_9 = sub_40d550(eax_8, eax_8, &var_2c, eax_6)
    var_8_1.b = 4
    char var_5c
    char* eax_10 = sub_403f60(eax_9.b, eax_9, &var_5c, U"/")
    var_8_1.b = 5
    sub_40d550(eax_10, eax_10, arg1, eax_5)
    int32_t var_48
    
    if (var_48 u>= 0x10)
        operator delete(var_5c.d)
    
    int32_t var_48_1 = 0xf
    int32_t var_4c = 0
    var_5c = 0
    int32_t var_18
    
    if (var_18 u>= 0x10)
        operator delete(var_2c.d)
    
    int32_t var_18_1 = 0xf
    int32_t var_1c = 0
    var_2c = 0
    int32_t var_30
    
    if (var_30 u>= 0x10)
        operator delete(var_44.d)
    
    int32_t var_30_1 = 0xf
    int32_t var_34 = 0
    var_44 = 0
    int32_t var_78
    
    if (var_78 u>= 0x10)
        operator delete(var_8c.d)
    
    int32_t var_78_1 = 0xf
    int32_t var_7c = 0
    var_8c = 0
    int32_t var_60
    
    if (var_60 u>= 0x10)
        operator delete(var_74.d)
    
    int32_t var_60_1 = 0xf
    int32_t var_64 = 0
    var_74 = 0
    int32_t var_90
    
    if (var_90 u>= 0x10)
        operator delete(var_a4)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return arg1
}
