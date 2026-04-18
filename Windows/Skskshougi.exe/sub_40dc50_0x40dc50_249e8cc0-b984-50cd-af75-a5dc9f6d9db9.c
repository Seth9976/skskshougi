// ============================================================
// 函数名称: sub_40dc50
// 虚拟地址: 0x40dc50
// WARP GUID: 249e8cc0-b984-50cd-af75-a5dc9f6d9db9
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4087d0
// [被调用的父级函数]: 无
// ============================================================

int32_t* __thiscallsub_40dc50(void* arg1, int32_t* arg2)
{
    // 第一条实际指令: int32_t* result = arg2
    int32_t* result = arg2
    int32_t* esi = *(arg1 + 4)
    int32_t edi = *result
    int32_t* ecx = esi[0x125]
    
    if (ecx != 0)
        result = (*(*ecx + 0x12c))(1)
        esi[0x125] = 0
    
    esi[0xa9].b = 0
    
    if (edi != 0)
        return result
    
    return sub_4087d0(esi)
}
