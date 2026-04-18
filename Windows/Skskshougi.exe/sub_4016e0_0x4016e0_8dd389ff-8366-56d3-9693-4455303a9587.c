// ============================================================
// 函数名称: sub_4016e0
// 虚拟地址: 0x4016e0
// WARP GUID: 8dd389ff-8366-56d3-9693-4455303a9587
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401ae0, sub_410fb0, sub_4199b8
// [被调用的父级函数]: 无
// ============================================================

int32_tsub_4016e0()
{
    // 第一条实际指令: int32_t __saved_ebp_1
    int32_t __saved_ebp_1
    int32_t __saved_ebp = __saved_ebp_1
    int32_t var_44 = 0xffffffff
    void (* var_48)(void* arg1) __noreturn = sub_41a408
    TEB* fsbase
    struct _EXCEPTION_REGISTRATION_RECORD* ExceptionList = fsbase->NtTib.ExceptionList
    void var_b8
    int32_t var_84 = __security_cookie ^ &var_b8
    int32_t esi
    int32_t var_bc = esi
    float edi
    float var_c0 = edi
    int32_t var_c4 = __security_cookie ^ &var_c0
    int32_t* esp_1 = &var_c4
    fsbase->NtTib.ExceptionList = &ExceptionList
    class cocos2d::Director* eax_5 = cocos2d::Director::getInstance()
    float esi_1 = *(eax_5 + 0x74)
    
    if (esi_1 == 0)
        int32_t var_c8_1 = 0x17
        char const* const var_cc_1 = "SakusakuShogi ver 1.022"
        class cocos2d::GLView* var_88 = 0xf
        float var_8c_1 = esi_1
        char var_9c = 0
        float var_44_1 = esi_1
        int32_t var_c8_2 = 0x3f800000
        int32_t var_dc_1 = 0x44400000
        int32_t var_e0_1 = 0x43f00000
        cocos2d::Rect::Rect(sub_401ae0(&var_9c, "SakusakuShogi ver 1.022", 0x17), esi_1, esi_1, 480f, 
            768f)
        int32_t var_30_1 = 0xffffffff
        esi_1 = cocos2d::GLViewImpl::createWithRect(&var_88, var_c4, var_c0)
        class cocos2d::GLView* var_b4
        int32_t var_74
        
        if (var_74 u>= 0x10)
            var_b4 = var_88
            operator delete(var_b4)
        
        var_b4 = esi_1
        esp_1 = &var_b4
        int32_t var_74_1 = 0xf
        int32_t var_78_1 = 0
        var_88.b = 0
        cocos2d::Director::setOpenGLView(eax_5, var_b4)
    
    int32_t eax_7 = *esi_1
    *(esp_1 - 4) = 2
    *(esp_1 - 8) = 0x44a00000
    *(esp_1 - 0xc) = 0x44480000
    (*(eax_7 + 0x50))()
    int32_t eax_8 = *eax_5
    *(esp_1 - 8) = 0x3f91111111111111
    (*(eax_8 + 8))()
    class cocos2d::UserDefault* eax_9 = cocos2d::UserDefault::getInstance()
    *(esp_1 - 4) = 0
    *(esp_1 - 8) = &data_41d6a4
    void* esp_9 = esp_1
    
    if ((*(*eax_9 + 4))() != 0)
        class CocosDenshion::SimpleAudioEngine* eax_11
        int32_t ecx_7
        eax_11, ecx_7 = CocosDenshion::SimpleAudioEngine::getInstance()
        *(esp_9 - 4) = ecx_7
        *(esp_9 - 4) = 0x3e99999a
        (*(*eax_11 + 0x24))()
        class CocosDenshion::SimpleAudioEngine* eax_12 = CocosDenshion::SimpleAudioEngine::getInstance()
        *(esp_9 - 4) = 1
        *(esp_9 - 8) = "sounds/honwaka.mp3"
        (*(*eax_12 + 4))()
    
    class cocos2d::Scene* eax_13 = cocos2d::Scene::create()
    cocos2d::Layer* eax_14 = sub_410fb0()
    int32_t edx_3 = *eax_13
    *(esp_9 - 4) = eax_14
    (*(edx_3 + 0x100))()
    *(esp_9 - 4) = eax_13
    cocos2d::Director::runWithScene()
    int32_t result
    result.b = 1
    fsbase->NtTib.ExceptionList = *(esp_9 + 0x74)
    *esp_9
    *(esp_9 + 4)
    sub_4199b8(*(esp_9 + 0x3c) ^ (esp_9 + 8))
    return result
}
