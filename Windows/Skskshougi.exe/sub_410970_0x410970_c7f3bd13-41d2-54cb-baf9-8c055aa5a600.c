// ============================================================
// 函数名称: sub_410970
// 虚拟地址: 0x410970
// WARP GUID: c7f3bd13-41d2-54cb-baf9-8c055aa5a600
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8, sub_403ac0
// [被调用的父级函数]: sub_410ec0
// ============================================================

int32_t __fastcallsub_410970(int32_t* arg1)
{
    // 第一条实际指令: int32_t __saved_ebp
    int32_t __saved_ebp
    int32_t eax_1 = __security_cookie ^ &__saved_ebp
    void* ecx = *arg1
    
    if (*(ecx + 0x2d8) != 0)
        int32_t var_24 = 3
        int32_t* ecx_1 = *(ecx + 0x2d8)
        
        if (ecx_1 == 0)
            ecx_1 = std::_Xbad_function_call()
        
        (*(*ecx_1 + 8))(&var_24)
    
    bool cond:0 = data_4290b4 u< 0x10
    int32_t var_c = 0xf
    int32_t var_10 = 0
    char var_20 = 0
    
    if (not(cond:0))
        operator delete(data_4290a0.d)
    
    data_4290b4 = 0xf
    data_4290b0 = 0
    data_4290a0 = 0
    int32_t result = sub_403ac0(&data_4290a0, &var_20)
    
    if (var_c u>= 0x10)
        result = operator delete(var_20.d)
    
    sub_4199b8(eax_1 ^ &__saved_ebp)
    return result
}
