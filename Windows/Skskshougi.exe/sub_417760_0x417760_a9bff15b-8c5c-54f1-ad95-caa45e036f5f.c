// ============================================================
// 函数名称: sub_417760
// 虚拟地址: 0x417760
// WARP GUID: a9bff15b-8c5c-54f1-ad95-caa45e036f5f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8, sub_401ae0, sub_40d460, sub_401900
// [被调用的父级函数]: sub_4169c0, sub_418970
// ============================================================

int32_t __fastcallsub_417760(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41c0d3
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_ac
    int32_t eax_2 = __security_cookie ^ &var_ac
    int32_t esi
    int32_t var_b4 = esi
    int32_t edi
    int32_t var_b8 = edi
    int32_t eax_4 = __security_cookie ^ &var_b8
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t eax_6 = (*(*cocos2d::UserDefault::getInstance() + 4))("komaPict", 0)
    int32_t var_a8 = eax_6
    void* const edx_1
    
    if (eax_6 == 0)
        edx_1 = &data_420804
    else if (eax_6 != 1)
        edx_1 = &data_420824
        
        if (eax_6 != 2)
            edx_1 = &data_420834
    else
        edx_1 = &data_420814
    
    bool cond:1 = *edx_1 != 0
    int32_t var_80 = 0xf
    void* var_84 = nullptr
    char var_94 = 0
    void* ecx_1
    
    if (cond:1)
        void* const ecx_2 = edx_1
        void* esi_1 = ecx_2 + 1
        
        do
            eax_6.b = *ecx_2
            ecx_2 += 1
        while (eax_6.b != 0)
        
        ecx_1 = ecx_2 - esi_1
    else
        ecx_1 = nullptr
    
    sub_401ae0(&var_94, edx_1, ecx_1)
    int32_t var_c_1 = 0
    var_c_1.b = 1
    void* var_7c
    (*(*(*(arg1 + 0x2b0) + 0x310) + 4))(sub_40d460(&var_94, 0x420840, &var_7c, &var_94))
    var_c_1.b = 0
    int32_t var_68
    
    if (var_68 u>= 0x10)
        operator delete(var_7c)
    
    class cocos2d::Size* eax_10
    cocos2d::Size* ecx_8
    eax_10, ecx_8 = (*(**(arg1 + 0x2b0) + 0xa8))(eax_4)
    cocos2d::Size::Size(ecx_8, eax_10)
    class cocos2d::Size* eax_12
    cocos2d::Size* ecx_10
    eax_12, ecx_10 = (*(**(arg1 + 0x2d4) + 0xa8))()
    cocos2d::Size::Size(ecx_10, eax_12)
    float var_a0
    float var_9c
    (*(**(arg1 + 0x2b0) + 0x48))(var_9c * 0.5f + 102f, var_a0 * 0.5f)
    int32_t entry_result
    int32_t result = entry_result
    
    switch (result)
        case 0
            void* var_3c
            sub_401900(&var_3c, "images/melon-3.png")
            ExceptionList.b = 2
            result = (*(**(arg1 + 0x2a8) + 0x288))(&var_3c)
            int32_t var_28
            
            if (var_28 u>= 0x10)
                result = operator delete(var_3c)
        case 1
            void* var_6c
            sub_401900(&var_6c, "images/kujira.png")
            ExceptionList.b = 3
            result = (*(**(arg1 + 0x2a8) + 0x288))(&var_6c)
            int32_t var_58
            
            if (var_58 u>= 0x10)
                result = operator delete(var_6c)
        case 2
            void* var_54
            sub_401900(&var_54, "images/lion.png")
            ExceptionList.b = 4
            result = (*(**(arg1 + 0x2a8) + 0x288))(&var_54)
            int32_t var_40
            
            if (var_40 u>= 0x10)
                result = operator delete(var_54)
        case 3
            sub_401900(&var_84, "images/gyoku.png")
            ExceptionList.b = 5
            result = (*(**(arg1 + 0x2a8) + 0x288))(&var_84)
            int32_t var_70
            
            if (var_70 u>= 0x10)
                result = operator delete(var_84)
    
    int32_t var_88
    
    if (var_88 u>= 0x10)
        result = operator delete(var_9c)
    
    fsbase->NtTib.ExceptionList = eax_2
    int32_t var_24
    sub_4199b8(var_24 ^ &var_b4)
    return result
}
