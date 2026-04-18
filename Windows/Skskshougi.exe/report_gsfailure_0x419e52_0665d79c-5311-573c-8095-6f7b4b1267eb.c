// ============================================================
// 函数名称: ___report_gsfailure
// 虚拟地址: 0x419e52
// WARP GUID: 0665d79c-5311-573c-8095-6f7b4b1267eb
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: IsProcessorFeaturePresent
// [内部子函数调用]: ___raise_securityfailure
// [被调用的父级函数]: sub_4199b8
// ============================================================

void___report_gsfailure(uint64_t stack_cookie) __noreturn
{
    // 第一条实际指令: BOOL eax
    BOOL eax
    int32_t ecx
    int32_t edx
    eax, ecx, edx = IsProcessorFeaturePresent(PF_FASTFAIL_AVAILABLE)
    bool p = unimplemented  {test eax, eax}
    bool a = undefined
    bool z = eax == 0
    
    if (not(z))
        trap(0xd)
    
    data_42cee8 = eax
    data_42cee4 = ecx
    data_42cee0 = edx
    int32_t entry_ebx
    data_42cedc = entry_ebx
    int32_t entry_esi
    data_42ced8 = entry_esi
    int32_t entry_edi
    data_42ced4 = entry_edi
    int16_t ss
    data_42cf00 = ss
    int16_t cs
    data_42cef4 = cs
    int16_t ds
    data_42ced0 = ds
    int16_t es
    data_42cecc = es
    int16_t fs
    data_42cec8 = fs
    int16_t gs
    data_42cec4 = gs
    bool d
    data_42cef8 = (d ? 1 : 0) << 0xa | (eax s< 0 ? 1 : 0) << 7 | (z ? 1 : 0) << 6 | (a ? 1 : 0) << 4
        | (p ? 1 : 0) << 2
    int32_t entry_ebp
    data_42ceec = entry_ebp
    data_42cef0 = __return_addr
    data_42cefc = &stack_cookie
    data_42ce38 = 0x10001
    data_42cdf4 = data_42cef0
    data_42cde8 = 0xc0000409
    data_42cdec = 1
    data_42cdf8 = 1
    int32_t var_32c_1 = 4
    data_42cdfc = 2
    int32_t var_32c_2 = 4
    uint32_t __security_cookie_1 = __security_cookie
    (&__security_cookie_1)[1] = data_429004
    ___raise_securityfailure(&data_41d640)
}
