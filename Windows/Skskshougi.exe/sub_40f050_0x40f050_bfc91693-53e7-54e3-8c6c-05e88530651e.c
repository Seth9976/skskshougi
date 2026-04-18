// ============================================================
// 函数名称: sub_40f050
// 虚拟地址: 0x40f050
// WARP GUID: bfc91693-53e7-54e3-8c6c-05e88530651e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

void* __fastcallsub_40f050(void* arg1)
{
    // 第一条实际指令: void* result = *(arg1 + 4)
    void* result = *(arg1 + 4)
    
    if (*(result + 0x2a0) != 0)
        return result
    
    return cocos2d::Director::popScene(cocos2d::Director::getInstance())
}
