// ============================================================
// 函数名称: sub_416730
// 虚拟地址: 0x416730
// WARP GUID: c8ffd1b1-7a4e-553f-b6b5-b40ccf22d38a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_4199b8
// [被调用的父级函数]: sub_4169c0
// ============================================================

class cocos2d::MenuItemImage* __stdcallsub_416730(class std::string* arg1, class cocos2d::Label** arg2, class std::string* arg3, class std::function<void __cdecl (class cocos2d::Ref*)>* arg4, class cocos2d::Sprite** arg5)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41be58
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_1c = 0xf
    int32_t var_20 = 0
    char var_30 = 0
    sub_401ae0(&var_30, "images/white-800x90-pushed.png", 0x1e)
    int32_t var_8_1 = 0
    int32_t var_4c = 0xf
    int32_t var_50 = 0
    char var_60 = 0
    sub_401ae0(&var_60, "images/white-800x90.png", 0x17)
    var_8_1.b = 1
    class cocos2d::MenuItemImage* result_1 = cocos2d::MenuItemImage::create(&var_60, &var_30, arg4)
    
    if (var_4c u>= 0x10)
        operator delete(var_60.d)
    
    int32_t var_8_2 = 0xffffffff
    int32_t var_4c_1 = 0xf
    int32_t var_50_1 = 0
    var_60 = 0
    
    if (var_1c u>= 0x10)
        operator delete(var_30.d)
    
    int32_t var_1c_1 = 0xf
    int32_t var_20_1 = 0
    var_30 = 0
    class cocos2d::Size* eax_7
    cocos2d::Size* ecx_3
    eax_7, ecx_3 = (*(*result_1 + 0xa8))(eax_2)
    cocos2d::Size::Size(ecx_3, eax_7)
    int32_t var_34 = 0xf
    int32_t var_38 = 0
    char var_48 = 0
    int32_t var_8_3 = 2
    int32_t var_a8 = sub_401ae0(&var_48, "Arial", 5)
    class cocos2d::Label* eax_8 =
        cocos2d::Label::createWithSystemFont(arg1, &var_48, 36f, cocos2d::Size::ZERO, 0, 0)
    int32_t var_8_4 = 0xffffffff
    
    if (var_34 u>= 0x10)
        operator delete(var_48.d)
    
    int32_t var_34_1 = 0xf
    int32_t var_38_1 = 0
    var_48 = 0
    class cocos2d::Size* eax_10
    cocos2d::Size* ecx_7
    eax_10, ecx_7 = (*(*eax_8 + 0xa8))()
    cocos2d::Size::Size(ecx_7, eax_10)
    float var_7c
    float var_70
    (*(*eax_8 + 0x48))(var_7c * 0.5f + 102f, var_70 * 0.5f)
    (*(*eax_8 + 0x24c))(cocos2d::Color3B::BLACK)
    (*(*result_1 + 0x100))(eax_8)
    *arg2 = eax_8
    class cocos2d::MenuItemImage* result
    
    if (*(arg3 + 0x10) == 0)
        result = result_1
    else
        class cocos2d::Sprite* eax_16 = cocos2d::Sprite::create(arg3)
        
        if (eax_16 != 0)
            class cocos2d::Size* eax_17
            cocos2d::Size* ecx_12
            eax_17, ecx_12 = (*(*eax_16 + 0xa8))()
            int32_t var_9c_11 = cocos2d::Size::Size(ecx_12, eax_17)
            float var_84
            (*(*eax_16 + 0x40))(48f / var_84)
            (*(*eax_16 + 0x48))(0x42700000, var_70 * 0.5f)
            (*(*result_1 + 0x100))(eax_16)
        
        result = result_1
        
        if (arg5 != 0)
            *arg5 = eax_16
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
