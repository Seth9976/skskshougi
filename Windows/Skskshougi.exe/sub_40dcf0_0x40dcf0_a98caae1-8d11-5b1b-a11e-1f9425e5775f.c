// ============================================================
// 函数名称: sub_40dcf0
// 虚拟地址: 0x40dcf0
// WARP GUID: a98caae1-8d11-5b1b-a11e-1f9425e5775f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_414200, sub_406f90
// [被调用的父级函数]: 无
// ============================================================

int32_t __thiscallsub_40dcf0(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t* esi = *(arg1 + 4)
    int32_t* esi = *(arg1 + 4)
    int32_t edi = *arg2
    int32_t* ecx = esi[0x125]
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        esi[0x125] = 0
    
    esi[0xa9].b = 0
    
    if (edi == 1)
        return sub_406f90(esi)
    
    void* ecx_2 = data_42e4d0
    
    if (ecx_2 != 0)
        sub_414200(ecx_2)
    
    return cocos2d::Director::popScene(cocos2d::Director::getInstance())
}
