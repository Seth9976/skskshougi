// ============================================================
// 函数名称: sub_401690
// 虚拟地址: 0x401690
// WARP GUID: 54bf4d29-d2ca-5ccb-afb6-49c2bb116686
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_4199b8
// [被调用的父级函数]: 无
// ============================================================

int32_tsub_401690()
{
    // 第一条实际指令: int32_t __saved_ebp
    int32_t __saved_ebp
    int32_t eax_1 = __security_cookie ^ &__saved_ebp
    int128_t var_20
    __builtin_memcpy(&var_20, 
        "\x08\x00\x00\x00\x08\x00\x00\x00\x08\x00\x00\x00\x08\x00\x00\x00\x18\x00\x00\x00\x08\x00\x00\x00", 
        0x18)
    int32_t result = cocos2d::GLView::setGLContextAttrs(&var_20)
    sub_4199b8(eax_1 ^ &__saved_ebp)
    return result
}
