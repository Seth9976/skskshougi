// ============================================================
// 函数名称: sub_401340
// 虚拟地址: 0x401340
// WARP GUID: 3538481a-889d-5863-90be-477be578ba64
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: 无
// ============================================================

uint32_tsub_401340()
{
    // 第一条实际指令: uint32_t result = std::_Random_device()
    uint32_t result = std::_Random_device()
    data_42f8b4 = 0xffffffff
    int32_t i = 1
    data_42e534 = result
    
    do
        result = (result u>> 0x1e ^ result) * 0x6c078965 + i
        (&data_42e534)[i] = result
        i += 1
    while (i s< 0x270)
    
    data_42e530 = 0x270
    return result
}
