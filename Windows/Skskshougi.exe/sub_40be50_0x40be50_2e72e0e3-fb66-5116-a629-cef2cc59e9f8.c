// ============================================================
// 函数名称: sub_40be50
// 虚拟地址: 0x40be50
// WARP GUID: 2e72e0e3-fb66-5116-a629-cef2cc59e9f8
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: 无
// [被调用的父级函数]: sub_40baa0, sub_40b730, sub_40b490, sub_40b620
// ============================================================

int32_t __fastcallsub_40be50(void* arg1)
{
    // 第一条实际指令: char eax = data_42e4d4
    char eax = data_42e4d4
    void* esi = arg1
    arg1.b = *(esi + 0x2a6)
    
    if (arg1.b != 0)
    label_40be7e:
        
        if (eax == 0)
            if ((*(esi + 0x2cc) & 1) == 0)
                (*(**(esi + 0x440) + 0xac))(0)
                return (*(**(esi + 0x444) + 0xac))(1)
        else if ((*(esi + 0x2cc) & 1) != 0)
            (*(**(esi + 0x440) + 0xac))(0)
            return (*(**(esi + 0x444) + 0xac))(1)
    else if (eax == 0)
        if ((*(esi + 0x2d0) & 1) == 0)
        label_40be7a:
            
            if (arg1.b != 0)
                goto label_40be7e
            
            (*(**(esi + 0x440) + 0xac))(0)
            return (*(**(esi + 0x444) + 0xac))(1)
    else if ((*(esi + 0x2d0) & 1) != 0)
        goto label_40be7a
    
    (*(**(esi + 0x440) + 0xac))(1)
    return (*(**(esi + 0x444) + 0xac))(0)
}
