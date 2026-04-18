// ============================================================
// 函数名称: sub_404450
// 虚拟地址: 0x404450
// WARP GUID: 40d425ec-c37f-5b9f-8824-2c5787e68e5e
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_404420
// ============================================================

int32_t __fastcallsub_404450(cocos2d::Layer* arg1)
{
    // 第一条实际指令: void* eax = *(arg1 + 0x488)
    void* eax = *(arg1 + 0x488)
    
    if (eax != 0)
        operator delete(eax)
        *(arg1 + 0x488) = 0
        *(arg1 + 0x48c) = 0
        *(arg1 + 0x490) = 0
    
    void* eax_1 = *(arg1 + 0x47c)
    
    if (eax_1 != 0)
        operator delete(eax_1)
        *(arg1 + 0x47c) = 0
        *(arg1 + 0x480) = 0
        *(arg1 + 0x484) = 0
    
    void* eax_2 = *(arg1 + 0x470)
    
    if (eax_2 != 0)
        operator delete(eax_2)
        *(arg1 + 0x470) = 0
        *(arg1 + 0x474) = 0
        *(arg1 + 0x478) = 0
    
    void* eax_3 = *(arg1 + 0x464)
    
    if (eax_3 != 0)
        operator delete(eax_3)
        *(arg1 + 0x464) = 0
        *(arg1 + 0x468) = 0
        *(arg1 + 0x46c) = 0
    
    void* eax_4 = *(arg1 + 0x458)
    
    if (eax_4 != 0)
        operator delete(eax_4)
        *(arg1 + 0x458) = 0
        *(arg1 + 0x45c) = 0
        *(arg1 + 0x460) = 0
    
    if (*(arg1 + 0x2f4) u>= 0x10)
        operator delete(*(arg1 + 0x2e0))
    
    *(arg1 + 0x2f4) = 0xf
    *(arg1 + 0x2f0) = 0
    *(arg1 + 0x2e0) = 0
    void* eax_5 = *(arg1 + 0x2d4)
    
    if (eax_5 != 0)
        operator delete(eax_5)
        *(arg1 + 0x2d4) = 0
        *(arg1 + 0x2d8) = 0
        *(arg1 + 0x2dc) = 0
    
    return cocos2d::Layer::~Layer(arg1) __tailcall
}
