// ============================================================
// 函数名称: __FindPESection
// 虚拟地址: 0x41a160
// WARP GUID: 3a196466-4e7b-54f5-bc1f-4d70167606b8
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: __IsNonwritableInCurrentImage
// ============================================================

void*__FindPESection(void* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t edx = 0
    int32_t edx = 0
    void* ecx_1 = *(arg1 + 0x3c) + arg1
    uint32_t ebx = zx.d(*(ecx_1 + 6))
    void* result = zx.d(*(ecx_1 + 0x14)) + 0x18 + ecx_1
    
    if (ebx != 0)
        do
            int32_t esi_1 = *(result + 0xc)
            
            if (arg2 u>= esi_1 && arg2 u< *(result + 8) + esi_1)
                return result
            
            edx += 1
            result += 0x28
        while (edx u< ebx)
    
    return nullptr
}
