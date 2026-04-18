// ============================================================
// 函数名称: sub_418a10
// 虚拟地址: 0x418a10
// WARP GUID: f455cd93-e67d-5316-a9de-7e7a392d853b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_417d10
// [被调用的父级函数]: 无
// ============================================================

void __fastcallsub_418a10(void* arg1)
{
    // 第一条实际指令: void* ebx = *(arg1 + 4)
    void* ebx = *(arg1 + 4)
    
    if (*(ebx + 0x2a0) != 0)
        return 
    
    class cocos2d::UserDefault* eax_1 = cocos2d::UserDefault::getInstance()
    int32_t eax_3
    eax_3.b = (*(*eax_1 + 4))("SoundEffect", 1) == 0
    (*(*eax_1 + 0x1c))("SoundEffect", eax_3)
    sub_417d10(ebx)
}
