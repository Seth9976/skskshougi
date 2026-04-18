// ============================================================
// 函数名称: sub_417ba0
// 虚拟地址: 0x417ba0
// WARP GUID: c072dbb7-1863-59ca-ab8c-c132775b6113
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_4169c0, sub_417eb0
// ============================================================

int32_t __fastcallsub_417ba0(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c158
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_48
    int32_t eax_2 = __security_cookie ^ &var_48
    int32_t esi
    int32_t var_4c = esi
    int32_t edi
    int32_t var_50 = edi
    int32_t eax_4 = __security_cookie ^ &var_50
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_20 = 0xf
    char const* const edx_1 = "BGM ON"
    int32_t var_24 = 0
    int32_t eax_6
    eax_6.b = (*(*cocos2d::UserDefault::getInstance() + 4))(&data_41d6a4, 0) != 0
    char var_34 = 0
    
    if (eax_6.b == 0)
        edx_1 = "BGM OFF"
    
    void* ecx_1
    
    if (*edx_1 != 0)
        char const* const ecx_2 = edx_1
        
        do
            eax_6.b = *ecx_2
            ecx_2 = &ecx_2[1]
        while (eax_6.b != 0)
        
        ecx_1 = ecx_2 - &ecx_2[1]
    else
        ecx_1 = nullptr
    
    sub_401ae0(&var_34, edx_1, ecx_1)
    int32_t var_c_1 = 0
    (*(*(*(arg1 + 0x2b4) + 0x310) + 4))(&var_34)
    int32_t var_c_2 = 0xffffffff
    
    if (var_20 u>= 0x10)
        operator delete(var_34.d)
    
    int32_t* ecx_6 = *(arg1 + 0x2b4)
    int32_t var_20_1 = 0xf
    int32_t var_24_1 = 0
    var_34 = 0
    class cocos2d::Size* eax_9
    cocos2d::Size* ecx_7
    eax_9, ecx_7 = (*(*ecx_6 + 0xa8))(eax_4)
    cocos2d::Size::Size(ecx_7, eax_9)
    class cocos2d::Size* eax_11
    cocos2d::Size* ecx_9
    eax_11, ecx_9 = (*(**(arg1 + 0x2d8) + 0xa8))()
    cocos2d::Size::Size(ecx_9, eax_11)
    float var_44
    float var_38
    int32_t result = (*(**(arg1 + 0x2b4) + 0x48))(var_44 * 0.5f + 102f, var_38 * 0.5f)
    fsbase->NtTib.ExceptionList = eax_2
    sub_4199b8(var_24_1 ^ &var_50)
    return result
}
