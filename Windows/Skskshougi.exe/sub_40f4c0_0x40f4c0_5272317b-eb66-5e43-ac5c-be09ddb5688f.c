// ============================================================
// 函数名称: sub_40f4c0
// 虚拟地址: 0x40f4c0
// WARP GUID: 5272317b-eb66-5e43-ac5c-be09ddb5688f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40f490
// ============================================================

int32_t __fastcallsub_40f4c0(cocos2d::Layer* arg1)
{
    // 第一条实际指令: int32_t* ecx = *(arg1 + 0x2d8)
    int32_t* ecx = *(arg1 + 0x2d8)
    
    if (ecx != 0)
        (*(*ecx + 0x10))(ecx != arg1 + 0x2c8)
        *(arg1 + 0x2d8) = 0
    
    int32_t* ecx_1 = *(arg1 + 0x2d8)
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x10))(ecx_1 != arg1 + 0x2c8)
        *(arg1 + 0x2d8) = 0
    
    if (*(arg1 + 0x2b4) u>= 0x10)
        operator delete(*(arg1 + 0x2a0))
    
    *(arg1 + 0x2b4) = 0xf
    *(arg1 + 0x2b0) = 0
    *(arg1 + 0x2a0) = 0
    return cocos2d::Layer::~Layer(arg1) __tailcall
}
