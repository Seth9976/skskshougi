// ============================================================
// 函数名称: sub_4018c0
// 虚拟地址: 0x4018c0
// WARP GUID: 8f957c4e-305f-5892-b569-782aeabc182c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_tsub_4018c0()
{
    // 第一条实际指令: (*(*cocos2d::Director::getInstance() + 0x10))()
    (*(*cocos2d::Director::getInstance() + 0x10))()
    int32_t result = (*(*cocos2d::UserDefault::getInstance() + 4))(&data_41d6a4, 0)
    
    if (result == 0)
        return result
    
    jump(*(*CocosDenshion::SimpleAudioEngine::getInstance() + 0x10))
}
