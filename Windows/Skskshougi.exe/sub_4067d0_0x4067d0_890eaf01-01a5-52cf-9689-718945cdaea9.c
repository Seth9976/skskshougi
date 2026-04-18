// ============================================================
// 函数名称: sub_4067d0
// 虚拟地址: 0x4067d0
// WARP GUID: 890eaf01-01a5-52cf-9689-718945cdaea9
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_403f60, sub_4199b8
// [被调用的父级函数]: sub_40baa0, sub_40b490, sub_404680, sub_406f90, sub_40c770, sub_406500, sub_406250, sub_40b730, sub_40b620
// ============================================================

int32_t __fastcallsub_4067d0(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$?_Init@?$numpunct@D@std@@IAEXABV_Locinfo@2@_N@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t edx
    
    if (*(arg1 + 0x2a6) != 0)
        edx = *(arg1 + 0x2cc)
    else
        edx = *(arg1 + 0x2d0)
    
    char var_44
    char* eax_3 = sub_401f70(&var_44, edx + 1)
    int32_t var_8_1 = 0
    var_8_1.b = 1
    char var_2c
    (*(*(*(arg1 + 0x2f8) + 0x310) + 4))(sub_403f60(eax_3.b, eax_3, &var_2c, 0x41e198))
    int32_t var_18
    
    if (var_18 u>= 0x10)
        operator delete(var_2c.d)
    
    int32_t var_8_2 = 0xffffffff
    int32_t var_18_1 = 0xf
    int32_t var_1c = 0
    var_2c = 0
    int32_t var_30
    
    if (var_30 u>= 0x10)
        operator delete(var_44.d)
    
    int32_t* ecx_4 = *(arg1 + 0x2f8)
    int32_t var_30_1 = 0xf
    int32_t var_34 = 0
    var_44 = 0
    class cocos2d::Size* eax_6
    cocos2d::Size* ecx_5
    eax_6, ecx_5 = (*(*ecx_4 + 0xa8))(eax_2)
    cocos2d::Size::Size(ecx_5, eax_6)
    float var_4c
    int32_t result = (*(**(arg1 + 0x2f8) + 0x48))(var_4c * 0.5f + 20f, 0x447c8000)
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
