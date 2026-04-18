// ============================================================
// 函数名称: __ValidateImageBase
// 虚拟地址: 0x41a270
// WARP GUID: c075d72c-ab30-57d8-90b6-a6c374fce5af
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: __IsNonwritableInCurrentImage
// ============================================================

int32_t__ValidateImageBase(int16_t* arg1)
{
    // 第一条实际指令: if (*arg1 != 0x5a4d)
    if (*arg1 != 0x5a4d)
        return 0
    
    void* ecx_1 = *(arg1 + 0x3c) + arg1
    int32_t result = 0
    
    if (*ecx_1 == 0x4550)
        result.b = *(ecx_1 + 0x18) == 0x10b
    
    return result
}
