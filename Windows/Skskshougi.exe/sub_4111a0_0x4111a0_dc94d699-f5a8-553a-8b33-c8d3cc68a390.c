// ============================================================
// 函数名称: sub_4111a0
// 虚拟地址: 0x4111a0
// WARP GUID: dc94d699-f5a8-553a-8b33-c8d3cc68a390
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_411170
// ============================================================

int32_t __fastcallsub_4111a0(cocos2d::Layer* arg1)
{
    // 第一条实际指令: *(arg1 + 0x304) = 0
    *(arg1 + 0x304) = 0
    void* eax = *(arg1 + 0x2f8)
    
    if (eax != 0)
        operator delete(eax)
        *(arg1 + 0x2f8) = 0
        *(arg1 + 0x2fc) = 0
        *(arg1 + 0x300) = 0
    
    void* eax_1 = *(arg1 + 0x2ec)
    
    if (eax_1 != 0)
        operator delete(eax_1)
        *(arg1 + 0x2ec) = 0
        *(arg1 + 0x2f0) = 0
        *(arg1 + 0x2f4) = 0
    
    void* eax_2 = *(arg1 + 0x2e0)
    
    if (eax_2 != 0)
        operator delete(eax_2)
        *(arg1 + 0x2e0) = 0
        *(arg1 + 0x2e4) = 0
        *(arg1 + 0x2e8) = 0
    
    void* eax_3 = *(arg1 + 0x2d4)
    
    if (eax_3 != 0)
        operator delete(eax_3)
        *(arg1 + 0x2d4) = 0
        *(arg1 + 0x2d8) = 0
        *(arg1 + 0x2dc) = 0
    
    void* eax_4 = *(arg1 + 0x2c8)
    
    if (eax_4 != 0)
        operator delete(eax_4)
        *(arg1 + 0x2c8) = 0
        *(arg1 + 0x2cc) = 0
        *(arg1 + 0x2d0) = 0
    
    *(arg1 + 0x2a0) = cocos2d::ui::EditBoxDelegate::`vftable'
    return cocos2d::Layer::~Layer(arg1) __tailcall
}
