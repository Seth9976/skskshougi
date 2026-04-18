// ============================================================
// 函数名称: sub_401ae0
// 虚拟地址: 0x401ae0
// WARP GUID: 92e2ae0b-798f-582d-874e-a477dbb376be
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: memcpy
// [内部子函数调用]: sub_401990, sub_401d60
// [被调用的父级函数]: sub_4146d0, sub_40f5f0, sub_404680, sub_417d10, sub_4015a0, sub_40baa0, sub_401f70, sub_4169c0, sub_401050, sub_416730, sub_414c30, sub_4016e0, sub_414ac0, sub_415660, sub_411640, sub_409c90, sub_409400, sub_417f30, sub_4087d0, sub_415750, sub_414200, sub_406900, sub_418fa0, sub_401280, sub_40bee0, sub_4114c0, sub_40ce50, sub_401540, sub_417ba0, ?OnAsanReport@__vcasan@@YAXPBD0_N@Z, sub_418090, sub_407c50, sub_4181f0, sub_401900, sub_415470, sub_4014b0, sub_406f90, sub_40eea0, sub_417a30, sub_417760, sub_40e550, sub_410a20, ?CreatePrimary@UMSFreeVirtualProcessorRoot@details@Concurrency@@AAEXXZ
// ============================================================

int32_t* __thiscallsub_401ae0(int32_t* arg1, int32_t arg2, int32_t arg3)
{
    // 第一条实际指令: if (arg2 != 0)
    if (arg2 != 0)
        int32_t ecx = arg1[5]
        int32_t* eax_1
        
        if (ecx u< 0x10)
            eax_1 = arg1
        else
            eax_1 = *arg1
        
        if (arg2 u>= eax_1)
            int32_t* edx_1
            
            if (ecx u< 0x10)
                edx_1 = arg1
            else
                edx_1 = *arg1
            
            if (arg1[4] + edx_1 u> arg2)
                if (ecx u< 0x10)
                    return sub_401990(arg1, arg1, arg2 - arg1, arg3)
                
                return sub_401990(arg1, arg1, arg2 - *arg1, arg3)
    
    if (arg3 u> 0xfffffffe)
        std::_Xlength_error("string too long")
    
    int32_t eax_8 = arg1[5]
    
    if (eax_8 u>= arg3)
        if (arg3 != 0)
            goto label_401b73
        
        arg1[4] = arg3
        
        if (eax_8 u< 0x10)
            *arg1 = 0
            return arg1
        
        **arg1 = 0
        return arg1
    
    sub_401d60(arg1, arg3, arg1[4])
    
    if (arg3 != 0)
    label_401b73:
        int32_t* eax_9
        
        if (arg1[5] u< 0x10)
            eax_9 = arg1
        else
            eax_9 = *arg1
        
        if (arg3 != 0)
            memcpy(eax_9, arg2, arg3)
        
        bool cond:0_1 = arg1[5] u< 0x10
        arg1[4] = arg3
        
        if (not(cond:0_1))
            (*arg1)[arg3] = 0
            return arg1
        
        *(arg1 + arg3) = 0
    
    return arg1
}
