// ============================================================
// 函数名称: sub_403a20
// 虚拟地址: 0x403a20
// WARP GUID: c8eeaced-fd18-551a-875d-6183e76577c4
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40c770
// ============================================================

void* __fastcallsub_403a20(int32_t* arg1)
{
    // 第一条实际指令: void* result = *arg1
    void* result = *arg1
    
    if (result != 0)
        result = operator delete(result)
        *arg1 = 0
        arg1[1] = 0
        arg1[2] = 0
    
    return result
}
