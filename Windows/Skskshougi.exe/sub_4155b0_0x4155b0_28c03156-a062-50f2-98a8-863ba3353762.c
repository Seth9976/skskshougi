// ============================================================
// 函数名称: sub_4155b0
// 虚拟地址: 0x4155b0
// WARP GUID: 28c03156-a062-50f2-98a8-863ba3353762
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4165d0, ??1_Concurrent_queue_iterator_base_v4@details@Concurrency@@IAE@XZ
// [被调用的父级函数]: sub_416220
// ============================================================

struct _EXCEPTION_REGISTRATION_RECORD** __fastcallsub_4155b0(void* arg1)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41bde8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_28 = __security_cookie ^ &__saved_ebp
    struct _EXCEPTION_REGISTRATION_RECORD** result = &ExceptionList
    fsbase->NtTib.ExceptionList = &ExceptionList
    
    if (*(arg1 + 0x2a4) == 0)
        class cocos2d::Scene* eax_3 = cocos2d::Scene::create()
        struct cocos2d::Layer::SettingsLayer::VTable** eax_4 = sub_4165d0()
        (*(*eax_3 + 0x100))(eax_4)
        int32_t* var_40 = &std::_Func_impl<struct std::_Callable_obj<class <lambda_6dee18a5bccbe7ca5f8a4fa19268c696>, 0>, class std::allocator<class std::_Func_class<void>>, void>::`vftable'{for `std::_Func_base<void>'}
        void* var_3c_1 = arg1
        int32_t** var_30_1 = &var_40
        int32_t var_8_1 = 0xffffffff
        Concurrency::details::_Concurrent_queue_iterator_base_v4::~_Concurrent_queue_iterator_base_v4(
            eax_4, var_40)
        class cocos2d::Director* eax_5
        int32_t ecx_2
        eax_5, ecx_2 = cocos2d::Director::getInstance()
        int32_t var_30_2 = ecx_2
        result = cocos2d::Director::pushScene(eax_5, cocos2d::TransitionFlipY::create(1f, eax_3))
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return result
}
