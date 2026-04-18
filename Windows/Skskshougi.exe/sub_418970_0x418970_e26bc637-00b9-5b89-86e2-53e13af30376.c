// ============================================================
// 函数名称: sub_418970
// 虚拟地址: 0x418970
// WARP GUID: e26bc637-00b9-5b89-86e2-53e13af30376
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_417760
// [被调用的父级函数]: 无
// ============================================================

int32_t __fastcallsub_418970(void* arg1)
{
    // 第一条实际指令: void* edi = *(arg1 + 4)
    void* edi = *(arg1 + 4)
    class cocos2d::UserDefault* eax = cocos2d::UserDefault::getInstance()
    int32_t eax_3 = ((*(*eax + 4))("komaPict", 0) + 1) & 0x80000003
    
    if (eax_3 s< 0)
        eax_3 = ((eax_3 - 1) | 0xfffffffc) + 1
    
    (*(*eax + 0x1c))("komaPict", eax_3)
    return sub_417760(edi)
}
