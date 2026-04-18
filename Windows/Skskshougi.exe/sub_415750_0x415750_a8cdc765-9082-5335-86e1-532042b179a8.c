// ============================================================
// 函数名称: sub_415750
// 虚拟地址: 0x415750
// WARP GUID: a8cdc765-9082-5335-86e1-532042b179a8
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: 无
// ============================================================

int32_t __stdcallsub_415750(void* arg1 @ esi, cocos2d::ui::EditBox* arg2)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41bc38
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_38
    int32_t eax_2 = __security_cookie ^ &var_38
    int32_t edi
    int32_t var_40 = edi
    int32_t eax_4 = __security_cookie ^ &var_40
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::UserDefault* edi_1 = cocos2d::UserDefault::getInstance()
    char* edx = cocos2d::ui::EditBox::getText(arg2)
    int32_t var_20 = 0xf
    int32_t var_24 = 0
    char var_34 = 0
    void* ecx_1
    
    if (*edx != 0)
        char* ecx_2 = edx
        char* eax_6
        
        do
            eax_6.b = *ecx_2
            ecx_2 = &ecx_2[1]
        while (eax_6.b != 0)
        ecx_1 = ecx_2 - &ecx_2[1]
    else
        ecx_1 = nullptr
    
    sub_401ae0(&var_34, edx, ecx_1)
    int32_t var_c_1 = 0
    int32_t result = (*(*edi_1 + 0x28))("UserName", &var_34, eax_4)
    int32_t var_28
    
    if (var_28 u>= 0x10)
        result = operator delete(arg1)
    
    fsbase->NtTib.ExceptionList = eax_2
    sub_4199b8(var_24 ^ &var_40)
    return result
}
