// ============================================================
// 函数名称: sub_413540
// 虚拟地址: 0x413540
// WARP GUID: 2d7e38ce-dbb6-55f9-8dc0-6a6fba194a5a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_414980, sub_4148c0
// [被调用的父级函数]: sub_416280
// ============================================================

bool __thiscallsub_413540(int32_t* arg1, cocos2d::Touch* arg2)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41b934
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_edi
    int32_t eax_2 = __security_cookie ^ &__saved_edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    
    if (*(*arg1 + 0x2a4) != 0)
        void* result
        result.b = 0
        fsbase->NtTib.ExceptionList = ExceptionList
        return result
    
    class cocos2d::Vec2* eax_3 = cocos2d::Touch::getLocation(arg2)
    int32_t var_10_1 = 0
    int32_t var_10_2 = 0xffffffff
    *(*arg1 + 0x2ac) = sub_4148c0(*arg1, eax_3)
    class cocos2d::Vec2* eax_5 = cocos2d::Touch::getLocation(arg2)
    ExceptionList = 1
    int32_t eax_6 = sub_414980(*arg1, eax_5)
    void* edx = *arg1
    ExceptionList = 0xffffffff
    *(edx + 0x2b0) = eax_6
    class cocos2d::Vec2* eax_7 = cocos2d::Touch::getLocation(arg2)
    int32_t var_18 = 2
    char var_1c = 3
    void var_3c
    void var_38
    void var_34
    *(*arg1 + 0x2a5) = cocos2d::Rect::containsPoint(
        (*(**(*arg1 + 0x2b4) + 0x1a8))(&var_34, &var_38, &var_3c, &var_38, eax_2), eax_7)
    int32_t var_28
    fsbase->NtTib.ExceptionList = var_28
    return true
}
