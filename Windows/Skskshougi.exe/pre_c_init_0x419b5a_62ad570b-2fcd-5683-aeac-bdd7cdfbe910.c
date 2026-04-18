// ============================================================
// 函数名称: _pre_c_init
// 虚拟地址: 0x419b5a
// WARP GUID: 62ad570b-2fcd-5683-aeac-bdd7cdfbe910
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: __RTC_Initialize, __setdefaultprecision, sub_41a33d
// [被调用的父级函数]: 无
// ============================================================

int32_t_pre_c_init()
{
    // 第一条实际指令: data_42cdcc = 0
    data_42cdcc = 0
    __set_app_type(2)
    int32_t eax = EncodePointer(0xffffffff)
    data_42f954 = eax
    data_42f958 = eax
    *_fmode = data_42d114
    *_commode = data_42d108
    __RTC_Initialize()
    
    if (data_429010 == 0)
        __setusermatherr(sub_41a33d)
    
    __setdefaultprecision()
    
    if (data_429014 == 0xffffffff)
        _configthreadlocale(0xffffffff)
    
    return 0
}
