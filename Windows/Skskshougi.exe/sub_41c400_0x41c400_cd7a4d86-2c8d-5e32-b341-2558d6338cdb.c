// ============================================================
// 函数名称: sub_41c400
// 虚拟地址: 0x41c400
// WARP GUID: cd7a4d86-2c8d-5e32-b341-2558d6338cdb
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_401d30, sub_40d140
// [被调用的父级函数]: sub_401180
// ============================================================

void __fastcallsub_41c400(int32_t arg1)
{
    // 第一条实际指令: int32_t var_8 = arg1
    int32_t var_8 = arg1
    
    if (data_42e4e0 == 0)
        return 
    
    operator delete(data_42e4e0)
    data_42e4e0 = 0
    data_42e4e4 = 0
    data_42e4e8 = 0
}
