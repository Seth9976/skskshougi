// ============================================================
// 函数名称: sub_419c5e
// 虚拟地址: 0x419c5e
// WARP GUID: 11254457-1284-5708-92f5-1ed0996efce2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: _amsg_exit, _initterm_e, _initterm
// [内部子函数调用]: sub_4194b0, __IsNonwritableInCurrentImage
// [被调用的父级函数]: _start
// ============================================================

int32_tsub_419c5e()
{
    // 第一条实际指令: int32_t __saved_ebp_2 = 0x14
    int32_t __saved_ebp_2 = 0x14
    int32_t var_8 = 0x4246c0
    int32_t (* var_10)(int32_t arg1, int32_t arg2, int32_t arg3, int32_t arg4) = __except_handler4
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t ebx
    int32_t var_2c_9 = ebx
    int32_t esi
    int32_t var_30_4 = esi
    int32_t edi
    int32_t var_34_2 = edi
    uint32_t __security_cookie_1 = __security_cookie
    int32_t var_8_4 = 0x4246c0 ^ __security_cookie_1
    int32_t __saved_ebp
    struct DOS_Header* const var_38 = __security_cookie_1 ^ &__saved_ebp
    int32_t* var_1c = &var_38
    void* const var_3c = &data_419c6a
    int32_t var_8_5 = 0xfffffffe
    int32_t var_c = var_8_4
    fsbase->NtTib.ExceptionList = &ExceptionList
    int16_t* var_20 = nullptr
    int32_t var_24 = 0
    uint32_t ebx_1 = zx.d(__crtGetShowWindowMode())
    int32_t var_8_1 = 0
    void* StackBase = fsbase->NtTib.Self->NtTib.StackBase
    int32_t edi_1 = 0
    
    while (true)
        int32_t eax_2 = 0
        
        if (0 == data_42f948)
            data_42f948 = StackBase
        else
            eax_2 = data_42f948
        
        if (eax_2 == 0)
            break
        
        if (eax_2 == StackBase)
            edi_1 = 1
            break
    
    int32_t status
    
    if (data_42f94c != 1)
        if (data_42f94c != 0)
            data_42cdc4 = 1
            goto label_419cfb
        
        data_42f94c = 1
        
        if (_initterm_e(0x41d5e8, 0x41d5f8) == 0)
            goto label_419cfb
        
        int32_t var_8_2 = 0xfffffffe
        status = 0xff
    else
        _amsg_exit(0x1f)
    label_419cfb:
        
        if (data_42f94c == 1)
            _initterm(0x41d56c, 0x41d5e4)
            data_42f94c = 2
        
        if (edi_1 == 0)
            data_42f948
            data_42f948 = 0
        
        if (data_42f950 != 0 && __IsNonwritableInCurrentImage(&data_42f950) != 0)
            data_42f950(0, 2, 0)
        
        int16_t* ecx_6 = *_wcmdln
        var_20 = ecx_6
        int32_t var_2c_5 = 0x20
        int32_t edx = var_24
        
        while (true)
            uint32_t eax_6 = zx.d(*ecx_6)
            
            if (eax_6.w u<= 0x20)
                if (eax_6.w == 0)
                    break
                
                if (edx == 0)
                    break
            
            if (eax_6 == 0x22)
                int32_t eax_8
                eax_8.b = edx == 0
                edx = eax_8
                var_24 = edx
            
            ecx_6 = &ecx_6[1]
            var_20 = ecx_6
        
        while (true)
            int16_t eax_7 = *ecx_6
            
            if (eax_7 == 0)
                break
            
            if (eax_7 u> 0x20)
                break
            
            ecx_6 = &ecx_6[1]
            var_20 = ecx_6
        
        uint32_t var_2c_6 = ebx_1
        int16_t* var_30_3 = ecx_6
        int32_t var_34_1 = 0
        var_38 = &__dos_header
        status = sub_4194b0()
        data_42cdc8 = status
        
        if (data_42cdcc == 0)
            exit(status)
            noreturn
        
        if (data_42cdc4 == 0)
            _cexit()
            status = data_42cdc8
        
        int32_t var_8_3 = 0xfffffffe
    
    fsbase->NtTib.ExceptionList = ExceptionList
    void* const __saved_ebp_1 = &data_419e0a
    return status
}
