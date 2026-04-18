// ============================================================
// 函数名称: sub_409400
// 虚拟地址: 0x409400
// WARP GUID: ec1146b7-495a-5a6d-9f2e-7f20329c498d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8, sub_401ae0, sub_403f60
// [被调用的父级函数]: sub_40de90
// ============================================================

void* __fastcallsub_409400(int32_t* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41abf8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    char var_68
    int32_t var_1c = __security_cookie ^ &var_68
    int32_t esi
    int32_t var_6c = esi
    int32_t edi
    int32_t var_70 = edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    (*(*arg1[1] + 0xc))(7, __security_cookie ^ &var_70)
    
    if (arg1[2].b != 0)
        int32_t var_54_1 = 0xf
        int32_t var_58_1 = 0
        var_68 = 0
        sub_401ae0(&var_68, "images/", 7)
        int32_t var_10_1 = 0
        void* eax_6 = data_42904c
        char var_50
        char* eax_7 = sub_403f60(eax_6.b, &var_68, &var_50, *(eax_6 + 0xc))
        var_10_1.b = 1
        void* var_38
        sub_403f60(eax_7.b, eax_7, &var_38, ".png")
        int32_t var_3c
        
        if (var_3c u>= 0x10)
            operator delete(var_50.d)
        
        int32_t var_3c_1 = 0xf
        int32_t var_40_1 = 0
        var_50 = 0
        var_10_1.b = 4
        
        if (var_54_1 u>= 0x10)
            operator delete(var_68.d)
        
        int32_t var_54_2 = 0xf
        int32_t var_58_2 = 0
        int32_t eax_8 = *arg1[1]
        var_68 = 0
        (*(eax_8 + 0x288))(&var_38)
        int32_t var_24
        
        if (var_24 u>= 0x10)
            operator delete(var_38)
    
    void* result = *arg1
    *(result + 0x2bc) -= 1
    int32_t var_18
    fsbase->NtTib.ExceptionList = var_18
    int32_t var_20
    sub_4199b8(var_20 ^ &var_6c)
    return result
}
