// ============================================================
// 函数名称: ??1_Pop_finalizer@_Micro_queue@details@Concurrency@@QAE@XZ
// 虚拟地址: 0x416680
// WARP GUID: b917cd98-869c-575d-8547-dc8a01e45733
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

cocos2d::Layer* __thiscall??1_Pop_finalizer@_Micro_queue@details@Concurrency@@QAE@XZ(cocos2d::Layer* arg1, char arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41be19
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    cocos2d::Layer* var_14 = arg1
    int32_t __saved_ebp
    int32_t var_20 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    cocos2d::Layer* var_14_1 = arg1
    int32_t var_8_1 = 0
    int32_t* ecx = *(arg1 + 0x2f0)
    
    if (ecx != 0)
        (*(*ecx + 0x10))(ecx != arg1 + 0x2e0)
        *(arg1 + 0x2f0) = 0
    
    int32_t* ecx_1 = *(arg1 + 0x2f0)
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x10))(ecx_1 != arg1 + 0x2e0)
        *(arg1 + 0x2f0) = 0
    
    int32_t var_8_2 = 0xffffffff
    cocos2d::Layer::~Layer(arg1)
    
    if ((arg2 & 1) != 0)
        operator delete(arg1)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return arg1
}
