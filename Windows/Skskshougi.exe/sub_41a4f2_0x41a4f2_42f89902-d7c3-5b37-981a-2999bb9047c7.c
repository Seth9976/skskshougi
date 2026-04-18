// ============================================================
// 函数名称: sub_41a4f2
// 虚拟地址: 0x41a4f2
// WARP GUID: 42f89902-d7c3-5b37-981a-2999bb9047c7
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: sub_404290, sub_40f3c0, ??4?$basic_string@DU?$char_traits@D@std@@V?$allocator@D@2@@std@@QAEAAV01@$$QAV01@@Z, sub_4165d0, sub_410fb0
// ============================================================

voidsub_41a4f2(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0xc) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0xc) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
