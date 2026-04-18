// ============================================================
// 函数名称: sub_415470
// 虚拟地址: 0x415470
// WARP GUID: 45504dac-dda4-50a6-8666-ecdec40d8ab9
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_403ed0, sub_403b20, sub_4199b8
// [被调用的父级函数]: sub_416540
// ============================================================

HINSTANCEsub_415470()
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41bdb8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_64
    int32_t eax_2 = __security_cookie ^ &var_64
    int32_t esi
    int32_t var_68 = esi
    void* lpFile_1 = __security_cookie ^ &var_68
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t edx = *cocos2d::UserDefault::getInstance()
    int32_t eax_6 = (*(edx + 4))("userID", 0, lpFile_1)
    int32_t var_58 = 0xf
    int32_t var_5c = 0
    lpFile_1.b = 0
    sub_401ae0(&lpFile_1, "http://vivi.dyndns.org/games/SkskShogi/rank.php", 0x2f)
    ExceptionList = nullptr
    void* var_3c
    char* eax_7 = sub_401f70(&var_3c, eax_6)
    ExceptionList.b = 1
    char var_54
    char* eax_8 = sub_403ed0(eax_7.b, "?userID=", &var_54, eax_7)
    ExceptionList.b = 2
    sub_403b20(&lpFile_1, eax_8, nullptr, 0xffffffff)
    int32_t var_40
    
    if (var_40 u>= 0x10)
        operator delete(var_54.d)
    
    int32_t var_40_1 = 0xf
    int32_t var_44 = 0
    var_54 = 0
    int32_t var_28
    
    if (var_28 u>= 0x10)
        operator delete(var_3c)
    
    int32_t* lpFile = &lpFile_1
    
    if (var_58 u>= 0x10)
        lpFile = lpFile_1
    
    HINSTANCE result = ShellExecuteA(nullptr, "open", lpFile, nullptr, nullptr, SW_SHOWNORMAL)
    
    if (var_58 u>= 0x10)
        result = operator delete(lpFile_1)
    
    fsbase->NtTib.ExceptionList = eax_2
    int32_t var_24
    sub_4199b8(var_24 ^ &lpFile_1)
    return result
}
