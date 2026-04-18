// ============================================================
// 函数名称: sub_415ca0
// 虚拟地址: 0x415ca0
// WARP GUID: cf1ddb41-1258-573c-99ca-162ff334023d
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_415950, sub_415c40, sub_416090, sub_415e50
// [被调用的父级函数]: sub_415b40
// ============================================================

int32_t __thiscallsub_415ca0(int32_t* arg1, int32_t arg2, int32_t arg3, int32_t arg4)
{
    // 第一条实际指令: int32_t edi = arg2
    int32_t edi = arg2
    int32_t result = ((arg3 - *arg1) s>> 2 << 5) + arg4
    
    if (edi != 0)
        int32_t ecx = arg1[3]
        
        if (0xffffffff - ecx u< edi)
            ecx = std::_Xlength_error("vector<bool> too long")
        
        arg2 = 0
        sub_415e50(arg1, (edi + 0x1f + ecx) u>> 5, &arg2)
        
        if (arg1[3] == 0)
            arg1[3] = edi
            return result
        
        int32_t* var_18
        sub_415950(arg1, &var_18)
        int32_t eax_7 = *arg1
        arg1[3] += edi
        int32_t var_10 = eax_7
        int32_t var_c_1 = 0
        void var_20
        int32_t* eax_8 = sub_415950(arg1, &var_20)
        int32_t edi_1 = *eax_8
        int32_t esi_1 = eax_8[1]
        void var_28
        int32_t* eax_9
        int32_t edx_1
        eax_9, edx_1 = sub_415c40(&var_10, &var_28, result)
        int32_t var_3c_5 = esi_1
        int32_t* var_14
        sub_416090(eax_9, edx_1, &var_18, arg2, *eax_9, eax_9[1], var_18, var_14, edi_1)
    
    return result
}
