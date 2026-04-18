// ============================================================
// 函数名称: ??_Etype_info@@UAEPAXI@Z
// 虚拟地址: 0x419ace
// WARP GUID: 4148a2a3-033f-514a-b2df-4b22b6a6718c
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: ??3@YAXPAX@Z, ??1type_info@@UAE@XZ
// [内部子函数调用]: ??_M@YGXPAXIHP6EX0@Z@Z
// [被调用的父级函数]: 无
// ============================================================

int32_t* __thiscall??_Etype_info@@UAEPAXI@Z(type_info* arg1, char arg2)
{
    // 第一条实际指令: int32_t* result = arg1
    int32_t* result = arg1
    
    if ((arg2 & 2) == 0)
        type_info::~type_info(arg1)
        
        if ((arg2 & 1) != 0)
            operator delete(result)
        
        return result
    
    `eh vector vbase constructor iterator'(result, 0xc, result[-1], type_info::~type_info)
    
    if ((arg2 & 1) != 0)
        operator delete(&result[-1])
    
    return &result[-1]
}
