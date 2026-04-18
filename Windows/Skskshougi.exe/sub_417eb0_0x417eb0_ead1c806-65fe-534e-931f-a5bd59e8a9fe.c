// ============================================================
// 函数名称: sub_417eb0
// 虚拟地址: 0x417eb0
// WARP GUID: ead1c806-65fe-534e-931f-a5bd59e8a9fe
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_417ba0
// [被调用的父级函数]: sub_418ab0
// ============================================================

void __fastcallsub_417eb0(void* arg1)
{
    // 第一条实际指令: if (*(arg1 + 0x2a0) != 0)
    if (*(arg1 + 0x2a0) != 0)
        return 
    
    int32_t ebx
    int32_t var_8_1 = ebx
    int32_t esi
    int32_t var_c_1 = esi
    class cocos2d::UserDefault* eax_1 = cocos2d::UserDefault::getInstance()
    ebx.b = (*(*eax_1 + 4))(&data_41d6a4, 0) == 0
    int32_t eax_3
    eax_3.b = ebx.b != 0
    (*(*eax_1 + 0x1c))(&data_41d6a4, eax_3)
    sub_417ba0(arg1)
    
    if (ebx.b != 0)
        (*(*CocosDenshion::SimpleAudioEngine::getInstance() + 4))("sounds/honwaka.mp3", 1)
        return 
    
    (*(*CocosDenshion::SimpleAudioEngine::getInstance() + 8))(0)
}
