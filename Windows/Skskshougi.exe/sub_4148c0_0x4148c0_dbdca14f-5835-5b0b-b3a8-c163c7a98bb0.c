// ============================================================
// 函数名称: sub_4148c0
// 虚拟地址: 0x4148c0
// WARP GUID: dbdca14f-5835-5b0b-b3a8-c163c7a98bb0
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_413640, sub_413540
// ============================================================

int32_t __thiscallsub_4148c0(void* arg1, class cocos2d::Vec2* arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41bbb9
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_38 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t i = 0
    
    if (((*(arg1 + 0x2cc) - *(arg1 + 0x2c8)) & 0xfffffffc) != 0)
        do
            int32_t var_8_1 = 0
            int32_t var_8_2 = 0xffffffff
            void var_24
            
            if (cocos2d::Rect::containsPoint((*(**(*(arg1 + 0x2c8) + (i << 2)) + 0x1a8))(&var_24), arg2)
                    != 0)
                fsbase->NtTib.ExceptionList = ExceptionList
                return i
            
            i += 1
        while (i != (*(arg1 + 0x2cc) - *(arg1 + 0x2c8)) s>> 2)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return 0xffffffff
}
