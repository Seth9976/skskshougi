// ============================================================
// 函数名称: sub_4188d0
// 虚拟地址: 0x4188d0
// WARP GUID: ebee7d6f-fa1f-58a3-9d3d-3de5cb53b1a6
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_417a30
// [被调用的父级函数]: 无
// ============================================================

int32_t __fastcallsub_4188d0(void* arg1)
{
    // 第一条实际指令: void* edi = *(arg1 + 4)
    void* edi = *(arg1 + 4)
    class cocos2d::UserDefault* eax = cocos2d::UserDefault::getInstance()
    int32_t temp1 = mods.dp.d(sx.q((*(*eax + 4))("difficulty", 0) + 1), 3)
    data_42e4d8 = temp1
    (*(*eax + 0x1c))("difficulty", temp1)
    return sub_417a30(edi)
}
