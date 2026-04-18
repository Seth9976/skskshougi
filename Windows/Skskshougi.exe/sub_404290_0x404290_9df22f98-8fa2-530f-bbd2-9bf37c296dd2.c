// ============================================================
// 函数名称: sub_404290
// 虚拟地址: 0x404290
// WARP GUID: 9df22f98-8fa2-530f-bbd2-9bf37c296dd2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: ??2@YAPAXIABUnothrow_t@std@@@Z, sub_404330
// [被调用的父级函数]: sub_404660, sub_413d80
// ============================================================

struct cocos2d::Layer::GameLayer::VTable**sub_404290()
{
    // 第一条实际指令: int32_t ebp
    int32_t ebp
    int32_t var_4 = ebp
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41a4f2
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t ecx
    int32_t var_14 = ecx
    int32_t esi
    int32_t var_18 = esi
    int32_t var_1c = __security_cookie ^ &var_4
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_20 = 0x42cdc0
    cocos2d::Layer* eax_3
    int32_t* ebp_1
    int32_t edi
    eax_3, ebp_1 = operator new(esi, edi, 0x498)
    ebp_1[-4] = eax_3
    ebp_1[-1] = 0
    struct cocos2d::Layer::GameLayer::VTable** result
    
    if (eax_3 == 0)
        result = nullptr
    else
        result = sub_404330(eax_3)
    
    ebp_1[-1] = 0xffffffff
    
    if (result != 0)
        cocos2d::Layer* result_1 = result
        
        if ((*result)->vFunc_154(result) != 0)
            cocos2d::Ref::autorelease(result_1)
            fsbase->NtTib.ExceptionList = ebp_1[-3]
            *ebp_1
            return result
        
        (*result)->vFunc_0(result_1, 1)
    
    fsbase->NtTib.ExceptionList = ebp_1[-3]
    *ebp_1
    return 0
}
