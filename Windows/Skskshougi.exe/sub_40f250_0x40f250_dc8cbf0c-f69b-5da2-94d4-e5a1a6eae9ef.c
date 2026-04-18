// ============================================================
// 函数名称: sub_40f250
// 虚拟地址: 0x40f250
// WARP GUID: dc8cbf0c-f69b-5da2-94d4-e5a1a6eae9ef
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_t* __thiscallsub_40f250(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t* result = arg2
    int32_t* result = arg2
    
    if (*result == 6)
        result = *(arg1 + 4)
        
        if (result[0xa8].b == 0)
            return cocos2d::Director::popScene(cocos2d::Director::getInstance())
    
    return result
}
