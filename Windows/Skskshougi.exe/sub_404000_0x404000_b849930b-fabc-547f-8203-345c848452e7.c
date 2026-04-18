// ============================================================
// 函数名称: sub_404000
// 虚拟地址: 0x404000
// WARP GUID: b849930b-fabc-547f-8203-345c848452e7
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403de0
// [被调用的父级函数]: sub_4028d0, sub_402d10
// ============================================================

int32_t __thiscallsub_404000(void** arg1, int32_t arg2, char* arg3)
{
    // 第一条实际指令: void** esi = arg1
    void** esi = arg1
    int32_t result = esi[1]
    
    if (result == esi[2])
        result, arg1 = sub_403de0(arg1, 1)
    
    char* edx = esi[1]
    
    if (edx != 0)
        arg1.b = *arg3
        result.b = *arg2
        *edx = result.b
        edx[1] = arg1.b
    
    esi[1] += 2
    return result
}
