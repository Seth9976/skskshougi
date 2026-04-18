// ============================================================
// 函数名称: sub_40b620
// 虚拟地址: 0x40b620
// WARP GUID: 81b4f780-c5b2-5201-93d5-9c52ad0c6b14
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_408ce0, ?QueryMiniPDBForTiDefnUDT2@GSI1@@UAEKPBDGPAG@Z, sub_409540, sub_40be50, sub_4067d0
// [被调用的父级函数]: sub_40da50
// ============================================================

void __fastcallsub_40b620(int32_t* arg1)
{
    // 第一条实际指令: if (arg1[0xa9].b != 0 || data_42e4d5 == 0 || arg1[0xaf] != 0 || arg1[0xb4] u>= ((arg1[0x11d] - arg1[0x11c]) s>> 1) - 1)
    if (arg1[0xa9].b != 0 || data_42e4d5 == 0 || arg1[0xaf] != 0
            || arg1[0xb4] u>= ((arg1[0x11d] - arg1[0x11c]) s>> 1) - 1)
        return 
    
    int32_t* ecx = arg1[0x10e]
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        arg1[0x10e] = 0
    
    int32_t* ecx_1 = arg1[0x10f]
    
    if (ecx_1 != 0)
        (*(*ecx_1 + 0x12c))(1)
        arg1[0x10f] = 0
    
    int32_t eax_6 = arg1[0x11c]
    int32_t ecx_3 = arg1[0xb4] + 1
    bool cond:0_1 = *(arg1 + 0x2a9) == 0
    arg1[0xb4] = ecx_3
    eax_6.w = *(eax_6 + (ecx_3 << 1))
    int16_t var_c_1 = eax_6.w
    int32_t ebx
    ebx.b = var_c_1:1.b
    long double x87_r0
    
    if (cond:0_1)
        sub_409540(arg1, x87_r0, zx.d(var_c_1.b), zx.d(ebx.b))
    else
        sub_408ce0(arg1, x87_r0, zx.d(var_c_1.b), zx.d((var_c_1.d u>> 8).b))
    *(arg1 + 0x2af) = *(arg1 + 0x2a9) == 0
    GSI1::QueryMiniPDBForTiDefnUDT2(arg1, zx.d(ebx.b))
    sub_4067d0(arg1)
    sub_40be50(arg1)
}
