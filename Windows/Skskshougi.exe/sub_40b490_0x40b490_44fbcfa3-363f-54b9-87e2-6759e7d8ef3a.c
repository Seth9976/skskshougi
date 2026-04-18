// ============================================================
// 函数名称: sub_40b490
// 虚拟地址: 0x40b490
// WARP GUID: 44fbcfa3-363f-54b9-87e2-6759e7d8ef3a
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401960, sub_40bee0, ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z, sub_40be50, sub_4199b8, sub_4067d0
// [被调用的父级函数]: sub_40adb0, sub_40d9f0
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __fastcallsub_40b490(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41ae68
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_34
    int32_t eax_2 = __security_cookie ^ &var_34
    int32_t __saved_edi
    int32_t var_44 = __security_cookie ^ &__saved_edi
    struct _EXCEPTION_REGISTRATION_RECORD** result = &ExceptionList
    fsbase->NtTib.ExceptionList = &ExceptionList
    
    if (arg1[0xa9].b == 0)
        result.b = data_42e4d5
        
        if ((result.b != 0 || *(arg1 + 0x2a9) != result.b) && arg1[0xaf] == 0)
            if (result.b != 0)
                result = arg1[0xb4]
                
                if (result s>= 1)
                    bool cond:0_1 = *(arg1 + 0x2a9) == 0
                    arg1[0xb4] = result - 1
                    void* eax_8
                    eax_8.b = cond:0_1
                    *(arg1 + 0x2a9) = eax_8.b
                label_40b59c:
                    int128_t* ecx_8 = arg1[0xa8]
                    int128_t* edx_7 = arg1[0xb4] * 0x21 + arg1[0x119]
                    *ecx_8 = *edx_7
                    ecx_8[1] = edx_7[1]
                    int32_t eax_9
                    eax_9.b = edx_7[2].b
                    ecx_8[2].b = eax_9.b
                    sub_40bee0(arg1)
                    int32_t ecx_10 = arg1[0xb4]
                    
                    if (ecx_10 != 0)
                        GSI1::QueryMiniPDBForTiDefnUDT2(arg1, zx.d(*(arg1[0x11c] + (ecx_10 << 1) + 1)))
                    
                    sub_4067d0(arg1)
                    result = sub_40be50(arg1)
            else
                class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
                result = (*(*eax_5 + 4))("nCoin", 0xa)
                
                if (result != 0)
                    int32_t ecx_1 = arg1[0xb4]
                    
                    if (ecx_1 s>= 2)
                        arg1[0xb4] = ecx_1 - 2
                        (*(*eax_5 + 0x1c))("nCoin", result - 1)
                        int32_t var_c_1 = 0
                        (*(*(arg1[0xcb] + 0x310) + 4))(sub_401f70(&var_34, result - 1))
                        int32_t var_c_2 = 0xffffffff
                        sub_401960(&var_34)
                        goto label_40b59c
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_34)
    return result
}
