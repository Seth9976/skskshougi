// ============================================================
// 函数名称: sub_418840
// 虚拟地址: 0x418840
// WARP GUID: 09759817-ed1a-5ae9-9742-932c5df4c49c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

void* __fastcallsub_418840(void* arg1)
{
    // 第一条实际指令: void* result = *(arg1 + 4)
    void* result = *(arg1 + 4)
    
    if (*(result + 0x2a0) != 0)
        return result
    
    if (*(result + 0x2f0) != 0)
        int32_t* ecx = *(result + 0x2f0)
        
        if (ecx == 0)
            ecx = std::_Xbad_function_call()
        
        (*(*ecx + 8))()
    
    return cocos2d::Director::popScene(cocos2d::Director::getInstance())
}
