// ============================================================
// 函数名称: ?OnAsanReport@__vcasan@@YAXPBD0_N@Z
// 虚拟地址: 0x413a60
// WARP GUID: 77c9185c-cc1d-5f8a-a9a8-058432d172d4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_40d460, sub_403f60, sub_4199b8, sub_403ac0
// [被调用的父级函数]: sub_411640
// ============================================================

int32_t?OnAsanReport@__vcasan@@YAXPBD0_N@Z()
{
    // 第一条实际指令: int32_t var_8 = 0xffffffff
    int32_t var_8 = 0xffffffff
    void (* var_c)(void* arg1) __noreturn = __ehhandler$___std_fs_get_file_id@8
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    int32_t __saved_ebp
    class cocos2d::network::HttpRequest* eax_2 = __security_cookie ^ &__saved_ebp
    fsbase->NtTib.ExceptionList = &ExceptionList
    void* esi = operator new(0x88)
    void* var_64 = esi
    int32_t var_8_1 = 0
    
    if (esi == 0)
        esi = nullptr
    else
        cocos2d::network::HttpRequest::HttpRequest(esi)
        *esi = &cocos2d::network::HttpRequest::`vftable'{for `cocos2d::Ref'}
    
    int32_t var_8_2 = 0xffffffff
    int32_t var_18 = 0xf
    int32_t var_1c = 0
    char var_2c = 0
    sub_401ae0(&var_2c, 0x41fc04, 1)
    int32_t var_8_3 = 1
    void* var_5c
    int32_t* eax_5 =
        sub_40d460(&var_2c, "http://vivi.dyndns.org/games/SkskShogi/info.txt?from=", &var_5c, &var_2c)
    var_8_3.b = 2
    char var_44
    char* eax_6 = sub_403f60(eax_5.b, eax_5, &var_44, "1.022")
    
    if (&var_2c != eax_6)
        if (var_18 u>= 0x10)
            operator delete(var_2c.d)
        
        var_18 = 0xf
        int32_t var_1c_1 = 0
        var_2c = 0
        sub_403ac0(&var_2c, eax_6)
    
    int32_t var_30
    
    if (var_30 u>= 0x10)
        operator delete(var_44.d)
    
    var_8_3.b = 1
    int32_t var_30_1 = 0xf
    int32_t var_34 = 0
    var_44 = 0
    int32_t var_48
    
    if (var_48 u>= 0x10)
        operator delete(var_5c)
    
    char* eax_7 = &var_2c
    
    if (var_18 u>= 0x10)
        eax_7 = var_2c.d
    
    cocos2d::network::HttpRequest::setUrl(esi, eax_7)
    *(esi + 0x14) = 0
    int32_t ecx
    int32_t var_40 = ecx
    var_44.d = &std::_Func_impl<struct std::_Callable_obj<class <lambda_ccf73617010ddd8d43332ba3d03e85fd>,0>,class std::allocator<class std::_Func_class<void,class cocos2d::network::HttpClient*,class cocos2d::network::HttpResponse*> >,void,class cocos2d::network::HttpClient*,class cocos2d::network::HttpResponse*>::`vftable'{for `std::_Func_base<void, class cocos2d::network::HttpClient*, class cocos2d::network::HttpResponse*>'}
    char* var_34_1 = &var_44
    var_8_3.b = 4
    cocos2d::network::HttpRequest::setResponseCallback(esi, &var_44)
    var_8_3.b = 1
    
    if (var_34_1 != 0)
        (*(*var_34_1 + 0x10))(var_34_1 != &var_44)
    
    cocos2d::network::HttpRequest::setTag(esi, "GET info.txt")
    void* var_78_8 = esi
    cocos2d::network::HttpClient::send(cocos2d::network::HttpClient::getInstance(), eax_2)
    int32_t result = cocos2d::Ref::release(esi)
    
    if (var_18 u>= 0x10)
        result = operator delete(var_2c.d)
    
    fsbase->NtTib.ExceptionList = ExceptionList
    sub_4199b8(eax_2 ^ &__saved_ebp)
    return result
}
