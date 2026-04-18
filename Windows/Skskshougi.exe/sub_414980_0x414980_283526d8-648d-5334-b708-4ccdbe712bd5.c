// ============================================================
// 函数名称: sub_414980
// 虚拟地址: 0x414980
// WARP GUID: 283526d8-648d-5334-b708-4ccdbe712bd5
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_413640, sub_413540
// ============================================================

int32_t __thiscallsub_414980(void* arg1, class cocos2d::Vec2* arg2)
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = sub_41bc0c
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    int32_t var_50 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    int32_t ebx = 0
    int32_t i = 0
    int32_t var_1c = 0
    int32_t var_18 = 0
    
    if (((*(arg1 + 0x2cc) - *(arg1 + 0x2c8)) & 0xfffffffc) != 0)
        do
            int32_t var_8_1 = 0
            ebx |= 1
            int32_t var_1c_1 = ebx
            void var_30
            int32_t eax_8
            
            if (cocos2d::Rect::containsPoint((*(**(*(arg1 + 0x2c8) + (i << 2)) + 0x1a8))(&var_30), arg2)
                    .b == 0 || *(*(arg1 + 0x2e0) + (i << 2)) == 0)
                eax_8.b = 0
            else
                eax_8.b = 1
            
            int32_t var_8_2 = 0xffffffff
            
            if ((ebx.b & 1) != 0)
                ebx &= 0xfffffffe
            
            if (eax_8.b != 0)
                class cocos2d::Vec2* var_54_3 = arg2
                void var_20
                cocos2d::Node::convertToNodeSpace(*(*(arg1 + 0x2c8) + (i << 2)), &var_20)
                int32_t var_8_3 = 1
                var_8_3.b = 2
                int32_t result = 0xffffffff
                void var_40
                
                if (cocos2d::Rect::containsPoint((*(**(*(arg1 + 0x2e0) + (i << 2)) + 0x1a8))(&var_40), 
                        &var_20) != 0)
                    result = var_18
                
                fsbase->NtTib.ExceptionList = ExceptionList
                return result
            
            i += 1
            var_18 = i
        while (i != (*(arg1 + 0x2cc) - *(arg1 + 0x2c8)) s>> 2)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    return 0xffffffff
}
