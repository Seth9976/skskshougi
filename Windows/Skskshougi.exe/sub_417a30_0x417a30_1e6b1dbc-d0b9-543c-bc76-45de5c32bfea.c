// ============================================================
// 函数名称: sub_417a30
// 虚拟地址: 0x417a30
// WARP GUID: 1e6b1dbc-d0b9-543c-bc76-45de5c32bfea
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8, sub_401ae0, sub_403f60
// [被调用的父级函数]: sub_4169c0, sub_4188d0
// ============================================================

int32_t __fastcallsub_417a30(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c120
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_5c
    int32_t var_1c = __security_cookie ^ &var_5c
    float ebx
    float var_60 = ebx
    int32_t eax_4 = __security_cookie ^ &var_60
    fsbase->NtTib.ExceptionList = &ExceptionList
    char* var_68 = 0xc
    int32_t var_38 = 0xf
    int32_t var_3c = 0
    char var_4c = 0
    sub_401ae0(&var_4c, 0x420888, var_68)
    int32_t var_c_1 = 0
    int32_t eax_5 = data_42e4d8
    var_68 = (&data_41d8a4)[eax_5]
    void var_34
    sub_403f60(eax_5.b, &var_4c, &var_34, var_68)
    var_c_1.b = 2
    
    if (var_38 u>= 0x10)
        var_68 = var_4c.d
        operator delete(var_68)
    
    int32_t* ecx_3 = *(arg1 + 0x2ac) + 0x310
    int32_t var_38_1 = 0xf
    var_68 = &var_34
    int32_t var_3c_1 = 0
    var_4c = 0
    (*(*ecx_3 + 4))(var_68, eax_4)
    class cocos2d::Size* eax_8
    cocos2d::Size* ecx_5
    eax_8, ecx_5 = (*(**(arg1 + 0x2ac) + 0xa8))()
    cocos2d::Size::Size(ecx_5, eax_8)
    class cocos2d::Size* eax_10
    cocos2d::Size* ecx_7
    eax_10, ecx_7 = (*(**(arg1 + 0x2d0) + 0xa8))()
    cocos2d::Size::Size(ecx_7, eax_10)
    float var_54
    int32_t result = (*(**(arg1 + 0x2ac) + 0x48))(var_60 * 0.5f + 102f, var_54 * 0.5f)
    int32_t var_2c
    void* var_40
    
    if (var_2c u>= 0x10)
        result = operator delete(var_40)
    int32_t var_20
    fsbase->NtTib.ExceptionList = var_20
    int32_t var_28
    sub_4199b8(var_28 ^ &var_68)
    return result
}
