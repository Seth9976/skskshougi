// ============================================================
// 函数名称: sub_414c30
// 虚拟地址: 0x414c30
// WARP GUID: 5c2aeb8c-237c-5e02-aa68-d05bd911df0f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401f70, sub_401ae0, sub_419230, sub_403ed0, sub_40d460, sub_411390, sub_410f50, sub_403b20, sub_4039c0, sub_403f60, sub_419120, sub_4199b8, sub_413c30
// [被调用的父级函数]: sub_416160
// ============================================================

void* const __fastcallsub_414c30(void* arg1)
{
    // 第一条实际指令: int32_t var_c = 0xffffffff
    int32_t var_c = 0xffffffff
    void (* var_10)(void* arg1) __noreturn = sub_41bd6b
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_c4
    int32_t eax_2 = __security_cookie ^ &var_c4
    int32_t __saved_edi
    class cocos2d::network::HttpRequest* eax_4 = __security_cookie ^ &__saved_edi
    fsbase->NtTib.ExceptionList = &ExceptionList
    void* const result = arg1
    void* const result_1 = result
    
    if (*(result + 0x2a4) == 0)
        class cocos2d::UserDefault* eax_5 = cocos2d::UserDefault::getInstance()
        void* esi_1 = operator new(0x88)
        void* var_b8 = esi_1
        int32_t var_c_1 = 0
        
        if (esi_1 == 0)
            esi_1 = nullptr
        else
            cocos2d::network::HttpRequest::HttpRequest(esi_1)
            *esi_1 = &cocos2d::network::HttpRequest::`vftable'{for `cocos2d::Ref'}
        
        int32_t var_c_2 = 0xffffffff
        int32_t var_38_1 = 0xf
        int32_t var_3c_1 = 0
        char var_4c = 0
        sub_401ae0(&var_4c, 0x41fc04, 1)
        int32_t var_c_3 = 1
        int32_t var_68_1 = 0xf
        int32_t var_6c_1 = 0
        char var_7c = 0
        sub_401ae0(&var_7c, "http://vivi.dyndns.org/form/postSkskShogi.php?act=post", 0x36)
        var_c_3.b = 2
        void* var_94
        int32_t* eax_8 = sub_40d460(&var_4c, "&version=", &var_94, &var_4c)
        var_c_3.b = 3
        var_c_3.b = 4
        char var_b0
        sub_403b20(&var_7c, sub_403f60(eax_8.b, eax_8, &var_b0, "1.022"), nullptr, 0xffffffff)
        int32_t var_9c
        
        if (var_9c u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 2
        int32_t var_9c_1 = 0xf
        int32_t var_a0_1 = 0
        var_b0 = 0
        int32_t var_80
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        uint32_t eax_11 = (*(*eax_5 + 4))("userID", 0xffffffff)
        uint32_t var_c0 = eax_11
        
        if (eax_11 s< 0)
            uint32_t temp1_1 = modu.dp.d(0:(sub_4039c0(&data_42e530)), 0x7fffffff)
            int32_t eax_13 = *eax_5
            var_c0 = temp1_1
            (*(eax_13 + 0x1c))("userID", temp1_1)
        
        char const* const var_d8_5 = "UserName"
        char var_34
        cocos2d::UserDefault::getStringForKey(eax_5, &var_34)
        var_c_3.b = 5
        char* eax_14 = sub_419120(&var_94, &var_34)
        var_c_3.b = 6
        var_c_3.b = 7
        sub_403b20(&var_7c, sub_403ed0(eax_14.b, "&userName=", &var_b0, eax_14), nullptr, 0xffffffff)
        
        if (var_9c_1 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_2 = 0xf
        int32_t var_a0_2 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        char* eax_16 = sub_401f70(&var_94, var_c0)
        var_c_3.b = 8
        var_c_3.b = 9
        sub_403b20(&var_7c, sub_403ed0(eax_16.b, "&userID=", &var_b0, eax_16), nullptr, 0xffffffff)
        
        if (var_9c_2 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_3 = 0xf
        int32_t var_a0_3 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        char* eax_20 = sub_401f70(&var_94, (*(*eax_5 + 4))("rate", 0x190))
        var_c_3.b = 0xa
        var_c_3.b = 0xb
        sub_403b20(&var_7c, sub_403ed0(eax_20.b, "&rate=", &var_b0, eax_20), nullptr, 0xffffffff)
        
        if (var_9c_3 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_4 = 0xf
        int32_t var_a0_4 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        char* eax_24 = sub_401f70(&var_94, (*(*eax_5 + 4))("maxRate", 0x190))
        var_c_3.b = 0xc
        var_c_3.b = 0xd
        sub_403b20(&var_7c, sub_403ed0(eax_24.b, "&maxrate=", &var_b0, eax_24), nullptr, 0xffffffff)
        
        if (var_9c_4 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_5 = 0xf
        int32_t var_a0_5 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        int32_t eax_26 = sub_411390()
        int32_t eax_27
        int32_t edx_8
        edx_8:eax_27 = muls.dp.d(0x88888889, eax_26)
        int32_t eax_29 = (eax_26 + edx_8) s>> 3
        char* eax_31 = sub_401f70(&var_94, (eax_29 u>> 0x1f) + eax_29 + 1)
        var_c_3.b = 0xe
        var_c_3.b = 0xf
        sub_403b20(&var_7c, sub_403ed0(eax_31.b, "&rank=", &var_b0, eax_31), nullptr, 0xffffffff)
        
        if (var_9c_5 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_6 = 0xf
        int32_t var_a0_6 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        sub_413c30(&var_b8, &var_c0)
        char* eax_33 = sub_401f70(&var_94, var_c0)
        var_c_3.b = 0x10
        var_c_3.b = 0x11
        sub_403b20(&var_7c, sub_403ed0(eax_33.b, "&nwin=", &var_b0, eax_33), nullptr, 0xffffffff)
        
        if (var_9c_6 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_7 = 0xf
        int32_t var_a0_7 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        char* eax_35 = sub_401f70(&var_94, var_b8)
        var_c_3.b = 0x12
        var_c_3.b = 0x13
        sub_403b20(&var_7c, sub_403ed0(eax_35.b, "&ngame=", &var_b0, eax_35), nullptr, 0xffffffff)
        
        if (var_9c_7 u>= 0x10)
            operator delete(var_b0.d)
        
        var_c_3.b = 5
        int32_t var_9c_8 = 0xf
        int32_t var_a0_8 = 0
        var_b0 = 0
        
        if (var_80 u>= 0x10)
            operator delete(var_94)
        
        char* eax_37 = &var_7c
        
        if (var_68_1 u>= 0x10)
            eax_37 = var_7c.d
        
        cocos2d::network::HttpRequest::setUrl(esi_1, eax_37)
        *(esi_1 + 0x14) = 0
        void* const result_2 = result_1
        var_b0.d = &std::_Func_impl<struct std::_Callable_obj<class <lambda_1d7a1f1af3f55ff440bbe0f66f727ef4>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::network::HttpClient*,class cocos2d::network::HttpResponse*> >,void,class cocos2d::network::HttpClient*,class cocos2d::network::HttpResponse*>::`vftable'{for `std::_Func_base<void, class cocos2d::network::HttpClient*, class cocos2d::network::HttpResponse*>'}
        char* var_a0_9 = &var_b0
        var_c_3.b = 0x15
        cocos2d::network::HttpRequest::setResponseCallback(esi_1, &var_b0)
        var_c_3.b = 5
        
        if (var_a0_9 != 0)
            (*(*var_a0_9 + 0x10))(var_a0_9 != &var_b0)
        
        cocos2d::network::HttpRequest::setTag(esi_1, "GET info.txt")
        void* var_d8_31 = esi_1
        cocos2d::network::HttpClient::send(cocos2d::network::HttpClient::getInstance(), eax_4)
        cocos2d::Ref::release(esi_1)
        int32_t* var_64
        sub_419230(&var_64)
        var_c_3.b = 0x16
        int32_t var_9c_9 = 0xf
        int32_t var_a0_10 = 0
        var_b0 = 0
        sub_401ae0(&var_b0, &data_41d780, 0)
        var_c_3.b = 0x17
        uint32_t* eax_43 = (*(*eax_5 + 0x10))(&var_94, "gotCoinData", &var_b0)
        int32_t* edx_15 = &var_64
        var_c0 = eax_43
        int32_t var_50
        
        if (var_50 u>= 0x10)
            edx_15 = var_64
        
        bool cond:11_1 = eax_43[5] u< 0x10
        void* ecx_43 = eax_43[4]
        var_b8 = ecx_43
        
        if (not(cond:11_1))
            var_c0 = *eax_43
        
        void* var_54
        void* eax_45 = var_54
        
        if (ecx_43 u< var_54)
            eax_45 = ecx_43
        
        result = sub_410f50(eax_45, edx_15, var_c0, eax_45)
        bool cond:13_1 = result == 0
        
        if (result == 0)
            void* ecx_45 = var_b8
            
            if (ecx_45 u>= var_54)
                result.b = ecx_45 != var_54
            else
                result = 0xffffffff
            
            cond:13_1 = result == 0
        
        result.b = cond:13_1
        bool var_b9_1 = result.b == 0
        
        if (var_80 u>= 0x10)
            result = operator delete(var_94)
        
        var_c_3.b = 0x16
        int32_t var_80_1 = 0xf
        int32_t var_84_1 = 0
        var_94.b = 0
        
        if (var_9c_9 u>= 0x10)
            result = operator delete(var_b0.d)
        
        if (var_b9_1 != 0)
            (*(*eax_5 + 0x28))("gotCoinData", &var_64)
            int32_t esi_3 = (*(*eax_5 + 4))("nCoin", 0xa) + 1
            (*(*eax_5 + 0x1c))("nCoin", esi_3)
            var_c_3.b = 0x18
            result = (*(*(*(result_1 + 0x2c0) + 0x310) + 4))(sub_401f70(&var_94, esi_3))
            
            if (var_80_1 u>= 0x10)
                result = operator delete(var_94)
        
        if (var_50 u>= 0x10)
            result = operator delete(var_64)
        
        int32_t var_50_1 = 0xf
        int32_t var_54_1 = 0
        var_64.b = 0
        int32_t var_20
        
        if (var_20 u>= 0x10)
            result = operator delete(var_34.d)
        
        int32_t var_20_1 = 0xf
        int32_t var_24_1 = 0
        var_34 = 0
        
        if (var_68_1 u>= 0x10)
            result = operator delete(var_7c.d)
        
        int32_t var_68_2 = 0xf
        int32_t var_6c_2 = 0
        var_7c = 0
        
        if (var_38_1 u>= 0x10)
            result = operator delete(var_4c.d)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &var_c4)
    return result
}
