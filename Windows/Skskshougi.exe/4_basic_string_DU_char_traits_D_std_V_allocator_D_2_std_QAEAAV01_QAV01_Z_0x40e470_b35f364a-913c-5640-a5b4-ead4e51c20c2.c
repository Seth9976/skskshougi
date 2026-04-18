// ============================================================
// 函数名称: ??4?$basic_string@DU?$char_traits@D@std@@V?$allocator@D@2@@std@@QAEAAV01@$$QAV01@@Z
// 虚拟地址: 0x40e470
// WARP GUID: b35f364a-913c-5640-a5b4-ead4e51c20c2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: ??2@YAPAXIABUnothrow_t@std@@@Z
// [被调用的父级函数]: sub_413640, sub_40d940
// ============================================================

struct cocos2d::Layer::MedalLayer::VTable**??4?$basic_string@DU?$char_traits@D@std@@V?$allocator@D@2@@std@@QAEAAV01@$$QAV01@@Z()
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
    struct cocos2d::Layer::MedalLayer::VTable** result_1
    int32_t* ebp_1
    int32_t edi
    result_1, ebp_1 = operator new(esi, edi, 0x2b8)
    struct cocos2d::Layer::MedalLayer::VTable** result = result_1
    ebp_1[-4] = result
    ebp_1[-1] = 0
    
    if (result == 0)
        result = nullptr
    else
        cocos2d::Layer::Layer(result)
        *result = &MedalLayer::`vftable'{for `cocos2d::Layer'}
    
    ebp_1[-1] = 0xffffffff
    
    if (result != 0)
        cocos2d::Layer* result_2 = result
        
        if ((*result)->vFunc_154(result) != 0)
            cocos2d::Ref::autorelease(result_2)
            fsbase->NtTib.ExceptionList = ebp_1[-3]
            *ebp_1
            return result
        
        (*result)->vFunc_0(result_2, 1)
    
    fsbase->NtTib.ExceptionList = ebp_1[-3]
    *ebp_1
    return 0
}
