// ============================================================
// 函数名称: sub_40d940
// 虚拟地址: 0x40d940
// WARP GUID: 123197d0-5909-58fc-955f-c701335f0d90
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: ??4?$basic_string@DU?$char_traits@D@std@@V?$allocator@D@2@@std@@QAEAAV01@$$QAV01@@Z
// [被调用的父级函数]: 无
// ============================================================

void* __fastcallsub_40d940(void* arg1)
{
    // 第一条实际指令: void* result = *(arg1 + 4)
    void* result = *(arg1 + 4)
    
    if (*(result + 0x2a4) != 0 || data_42e4d5 != 0)
        return result
    
    class cocos2d::Scene* eax = cocos2d::Scene::create()
    (*(*eax + 0x100))(
        std::basic_string<char,struct std::char_traits<char>,class std::allocator<char> >::operator=())
    class cocos2d::Director* eax_2
    int32_t ecx_1
    eax_2, ecx_1 = cocos2d::Director::getInstance()
    int32_t var_10_1 = ecx_1
    return cocos2d::Director::pushScene(eax_2, cocos2d::TransitionFlipX::create(1f, eax))
}
