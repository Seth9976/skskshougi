// ============================================================
// 函数名称: sub_417d10
// 虚拟地址: 0x417d10
// WARP GUID: 1912d196-7cd0-59bd-938a-7ef64476f577
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_4169c0, sub_418a10
// ============================================================

int32_t __fastcallsub_417d10(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c188
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    float var_44
    int32_t eax_2 = __security_cookie ^ &var_44
    int32_t ebx
    int32_t var_48 = ebx
    int32_t esi
    int32_t var_4c = esi
    int32_t edi
    int32_t var_50 = edi
    int32_t eax_4 = __security_cookie ^ &var_50
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
    ebx.b = (*(*eax_5 + 4))("langJpn", 1) != 0
    int32_t eax_8
    eax_8.b = (*(*eax_5 + 4))("SoundEffect", 1) != 0
    char const* const eax_9
    void* const edx_1
    
    if (eax_8.b == 0)
        edx_1 = &data_4208c8
        eax_9 = "Sound Effect OFF"
    else
        edx_1 = &data_4208a8
        eax_9 = "Sound Effect ON"
    
    int32_t var_20 = 0xf
    int32_t var_24 = 0
    
    if (ebx.b == 0)
        edx_1 = eax_9
    
    char var_34 = 0
    void* ecx_2
    
    if (*edx_1 != 0)
        char* ecx_3 = edx_1
        
        do
            eax_9.b = *ecx_3
            ecx_3 = &ecx_3[1]
        while (eax_9.b != 0)
        
        ecx_2 = ecx_3 - &ecx_3[1]
    else
        ecx_2 = nullptr
    
    sub_401ae0(&var_34, edx_1, ecx_2)
    int32_t var_c_1 = 0
    (*(*(*(arg1 + 0x2b8) + 0x310) + 4))(&var_34)
    int32_t var_c_2 = 0xffffffff
    
    if (var_20 u>= 0x10)
        operator delete(var_34.d)
    
    int32_t* ecx_7 = *(arg1 + 0x2b8)
    int32_t var_20_1 = 0xf
    int32_t var_24_1 = 0
    var_34 = 0
    class cocos2d::Size* eax_12
    cocos2d::Size* ecx_8
    eax_12, ecx_8 = (*(*ecx_7 + 0xa8))(eax_4)
    cocos2d::Size::Size(ecx_8, eax_12)
    class cocos2d::Size* eax_14
    cocos2d::Size* ecx_10
    eax_14, ecx_10 = (*(**(arg1 + 0x2dc) + 0xa8))()
    cocos2d::Size::Size(ecx_10, eax_14)
    float var_38
    int32_t result = (*(**(arg1 + 0x2b8) + 0x48))(var_44 * 0.5f + 102f, var_38 * 0.5f)
    fsbase->NtTib.ExceptionList = eax_2
    sub_4199b8(var_24_1 ^ &var_4c)
    return result
}
