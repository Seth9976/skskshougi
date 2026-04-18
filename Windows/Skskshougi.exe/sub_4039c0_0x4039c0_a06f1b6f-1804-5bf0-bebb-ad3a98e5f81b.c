// ============================================================
// 函数名称: sub_4039c0
// 虚拟地址: 0x4039c0
// WARP GUID: a06f1b6f-1804-5bf0-bebb-ad3a98e5f81b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_403d90, sub_403cd0
// [被调用的父级函数]: sub_40c770, sub_414c30
// ============================================================

int32_t __fastcallsub_4039c0(int32_t* arg1)
{
    // 第一条实际指令: int32_t eax = *arg1
    int32_t eax = *arg1
    
    if (eax == 0x270)
        sub_403d90(arg1)
    else if (eax u>= 0x4e0)
        sub_403cd0(arg1)
    
    int32_t eax_1 = *arg1
    int32_t edx = arg1[eax_1 + 1]
    *arg1 = eax_1 + 1
    int32_t edx_1 = edx ^ (arg1[0x4e1] & edx u>> 0xb)
    int32_t edx_2 = edx_1 ^ (edx_1 & 0xff3a58ad) << 7
    int32_t edx_3 = edx_2 ^ (edx_2 & 0xffffdf8c) << 0xf
    return edx_3 u>> 0x12 ^ edx_3
}
