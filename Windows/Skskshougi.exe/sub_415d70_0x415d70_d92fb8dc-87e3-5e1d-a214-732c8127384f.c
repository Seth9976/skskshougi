// ============================================================
// 函数名称: sub_415d70
// 虚拟地址: 0x415d70
// WARP GUID: d92fb8dc-87e3-5e1d-a214-732c8127384f
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_415ef0
// [被调用的父级函数]: sub_4159b0
// ============================================================

int32_t* __thiscallsub_415d70(int32_t* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t esi = arg2
    int32_t esi = arg2
    
    if (esi u> 0xffffffff)
        std::_Xlength_error("vector<bool> too long")
    
    int32_t ecx = arg1[1]
    int32_t edx = *arg1
    uint32_t ebx_1 = (esi + 0x1f) u>> 5
    int32_t* result = (ecx - edx) s>> 2
    
    if (ebx_1 u< result)
        result = sub_415ef0(arg1, &arg2, edx + (ebx_1 << 2), ecx)
    
    arg1[3] = esi
    int32_t esi_1 = esi & 0x1f
    
    if (esi_1 u> 0)
        void* edx_1 = *arg1 + (ebx_1 << 2)
        result = (1 << esi_1.b) - 1
        *(edx_1 - 4) &= result
    
    return result
}
