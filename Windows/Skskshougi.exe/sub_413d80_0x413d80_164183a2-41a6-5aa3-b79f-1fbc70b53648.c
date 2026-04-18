// ============================================================
// 函数名称: sub_413d80
// 虚拟地址: 0x413d80
// WARP GUID: 164183a2-41a6-5aa3-b79f-1fbc70b53648
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_404290
// [被调用的父级函数]: ?_Do_call@?$_Func_impl@U?$_Callable_obj@V<lambda_a950f64d47c771b1d34af4af122ee0c4>@@$0A@@std@@V?$allocator@V?$_Func_class@XPAV?$message@W4agent_status@Concurrency@@@Concurrency@@U_Nil@std@@U34@U34@U34@U34@U34@@std@@@2@XPAV?$message@W4agent_status@Concurrency@@@Concurrency@@U_Nil@2@U62@U62@U62@U62@U62@@std@@UAEX$$QAPAV?$message@W4agent_status@Concurrency@@@Concurrency@@@Z
// ============================================================

void __thiscallsub_413d80(void* arg1, int32_t arg2)
{
    // 第一条实际指令: int32_t* ecx = *(arg1 + 0x308)
    int32_t* ecx = *(arg1 + 0x308)
    
    if (ecx != 0)
        (*(*ecx + 0x12c))(1)
        *(arg1 + 0x308) = 0
    
    *(arg1 + 0x2a4) = 0
    
    if (arg2 != 1)
        return 
    
    data_42e4d5 = 0
    class cocos2d::Scene* eax_2 = cocos2d::Scene::create()
    (*(*eax_2 + 0x100))(sub_404290())
    class cocos2d::Director* eax_4
    int32_t ecx_2
    eax_4, ecx_2 = cocos2d::Director::getInstance()
    int32_t var_14_1 = ecx_2
    cocos2d::Director::pushScene(eax_4, cocos2d::TransitionFlipX::create(1f, eax_2))
}
