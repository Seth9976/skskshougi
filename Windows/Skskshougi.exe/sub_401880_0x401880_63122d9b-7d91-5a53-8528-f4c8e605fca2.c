// ============================================================
// 函数名称: sub_401880
// 虚拟地址: 0x401880
// WARP GUID: 63122d9b-7d91-5a53-8528-f4c8e605fca2
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_tsub_401880()
{
    // 第一条实际指令: (*(*cocos2d::Director::getInstance() + 0xc))()
    (*(*cocos2d::Director::getInstance() + 0xc))()
    int32_t result = (*(*cocos2d::UserDefault::getInstance() + 4))(&data_41d6a4, 0)
    
    if (result == 0)
        return result
    
    jump(*(*CocosDenshion::SimpleAudioEngine::getInstance() + 0xc))
}
