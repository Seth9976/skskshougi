// ============================================================
// 函数名称: sub_411050
// 虚拟地址: 0x411050
// WARP GUID: 558167f8-51af-588f-88c4-3bd3d4e4029c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_415e10
// [被调用的父级函数]: sub_410fb0
// ============================================================

cocos2d::Layer* __fastcallsub_411050(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$?shortsort@@YAXPAD0IP6AHPBX1@Z@Z
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_24 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    cocos2d::Layer* var_18 = arg1
    cocos2d::Layer::Layer(arg1)
    int32_t var_8_1 = 0
    *arg1 = &OppLayer::`vftable'{for `cocos2d::Layer'}
    *(arg1 + 0x2a0) = &OppLayer::`vftable'{for `cocos2d::ui::EditBoxDelegate'}
    __builtin_memset(arg1 + 0x2c8, 0, 0x30)
    var_8_1.b = 5
    int32_t var_14 = 0
    *(arg1 + 0x2f8) = 0
    *(arg1 + 0x2fc) = 0
    *(arg1 + 0x300) = 0
    sub_415e10(arg1 + 0x2f8, nullptr, &var_14)
    *(arg1 + 0x304) = 0
    fsbase->NtTib.ExceptionList = ExceptionList
    return arg1
}
