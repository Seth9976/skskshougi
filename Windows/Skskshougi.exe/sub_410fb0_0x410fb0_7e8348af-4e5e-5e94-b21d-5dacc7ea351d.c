// ============================================================
// 函数名称: sub_410fb0
// 虚拟地址: 0x410fb0
// WARP GUID: 7e8348af-4e5e-5e94-b21d-5dacc7ea351d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_411050, ??2@YAPAXIABUnothrow_t@std@@@Z
// [被调用的父级函数]: sub_4016e0
// ============================================================

cocos2d::Layer*sub_410fb0()
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
    int32_t eax_2 = __security_cookie ^ &var_4
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t var_20 = 0x42cdc0
    cocos2d::Layer* eax_3
    int32_t* ebp_1
    int32_t edi
    eax_3, ebp_1 = operator new(esi, edi, 0x310)
    ebp_1[-4] = eax_3
    ebp_1[-1] = 0
    cocos2d::Layer* result
    
    if (eax_3 == 0)
        result = nullptr
    else
        result = sub_411050(eax_3)
    
    ebp_1[-1] = 0xffffffff
    
    if (result != 0)
        if ((*(*result + 0x268))(eax_2) != 0)
            cocos2d::Ref::autorelease(result)
            fsbase->NtTib.ExceptionList = ebp_1[-3]
            *ebp_1
            return result
        
        (**result)(1)
    
    fsbase->NtTib.ExceptionList = ebp_1[-3]
    *ebp_1
    return 0
}
