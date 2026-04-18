// ============================================================
// 函数名称: __ehhandler$___std_fs_get_file_id@8
// 虚拟地址: 0x41ba1c
// WARP GUID: 4a6cf42c-5918-5ed7-acc8-c71570b26195
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: __CxxFrameHandler3
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: ?OnAsanReport@__vcasan@@YAXPBD0_N@Z
// ============================================================

void__ehhandler$___std_fs_get_file_id@8(void* arg1) __noreturn
{
    // 第一条实际指令: sub_4199b8(*(arg1 - 0x64) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 0x64) ^ (arg1 + 0xc))
    sub_4199b8(*(arg1 - 4) ^ (arg1 + 0xc))
    noreturn __CxxFrameHandler3() __tailcall
}
