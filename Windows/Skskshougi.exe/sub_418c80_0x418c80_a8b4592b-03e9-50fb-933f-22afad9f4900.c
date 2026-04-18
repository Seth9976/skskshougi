// ============================================================
// 函数名称: sub_418c80
// 虚拟地址: 0x418c80
// WARP GUID: a8b4592b-03e9-50fb-933f-22afad9f4900
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

int32_t* __thiscallsub_418c80(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t* result = arg2
    int32_t* result = arg2
    
    if (*result == 6)
        result = *(arg1 + 4)
        
        if (result[0xa8].b == 0)
            if (result[0xbc] != 0)
                int32_t* ecx = result[0xbc]
                
                if (ecx == 0)
                    ecx = std::_Xbad_function_call()
                
                (*(*ecx + 8))()
            
            return cocos2d::Director::popScene(cocos2d::Director::getInstance())
    
    return result
}
