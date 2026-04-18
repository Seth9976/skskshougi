// ============================================================
// 函数名称: sub_405f80
// 虚拟地址: 0x405f80
// WARP GUID: 3218065d-794e-5e95-9685-fd55d801349b
// 源二进制: E:/torrent/Cursor/SkskShogi-1.022-win/SkskShogi.exe.bndb
// ------------------------------------------------------------
// [交叉引用字符串]: 无
// [外部 API 调用]: 无
// [内部子函数调用]: sub_408490, sub_406500, sub_406250, sub_4081f0, sub_40b730, sub_401ff0
// [被调用的父级函数]: sub_40db70
// ============================================================

int32_t __thiscallsub_405f80(int32_t* arg1, cocos2d::Touch* arg2)
{
    // 第一条实际指令: int32_t* ecx = *arg1
    int32_t* ecx = *arg1
    
    if (*(ecx + 0x2a6) != 0)
        return sub_40b730(ecx)
    
    void var_10
    void* var_2c = &var_10
    int32_t var_18
    int32_t var_14
    int32_t eax_2 = sub_4081f0(cocos2d::Touch::getLocation(arg2), &var_14, &var_18)
    int32_t ebx = eax_2
    
    if (ebx s>= 0)
        void* edi_1 = *arg1
        int32_t var_2c_2
        int32_t* ecx_5
        
        if (ebx != *(edi_1 + 0x2b4))
            if (*(edi_1 + 0x2b8) s>= 0)
                eax_2 = sub_401ff0(edi_1 + 0x2d4, ebx.b)
            
            if (*(edi_1 + 0x2b8) s>= 0 && eax_2.b != 0)
                int32_t* ecx_7 = *(edi_1 + 0x430)
                
                if (ecx_7 != 0)
                    (*(*ecx_7 + 0x12c))(1)
                    *(*arg1 + 0x430) = 0
                
                sub_408490(*arg1)
                ecx_5 = *arg1
                var_2c_2 = ebx
                
                if (*(ecx_5 + 0x2a9) == 0)
                    goto label_4060be
                
                sub_406250(ecx_5, var_2c_2)
                void* eax_9 = *arg1
                *(eax_9 + 0x2b8) = 0xffffffff
                return eax_9
            
            *(edi_1 + 0x2b8) = 0xffffffff
        else
            eax_2 = *(edi_1 + 0x2b8)
            
            if (eax_2 s>= 0 && eax_2 != ebx)
                int32_t* ecx_2 = *(edi_1 + 0x430)
                
                if (ecx_2 != 0)
                    (*(*ecx_2 + 0x12c))(1)
                    *(*arg1 + 0x430) = 0
                
                sub_408490(*arg1)
                int32_t* edi_2 = *arg1
                
                if (sub_401ff0(&edi_2[0xb5], ebx.b) != 0)
                    ecx_5 = edi_2
                    var_2c_2 = ebx
                    
                    if (*(edi_2 + 0x2a9) != 0)
                        sub_406250(ecx_5, var_2c_2)
                        void* eax_6 = *arg1
                        *(eax_6 + 0x2b8) = 0xffffffff
                        return eax_6
                    
                label_4060be:
                    sub_406500(ecx_5, var_2c_2)
                
                void* eax_10 = *arg1
                *(eax_10 + 0x2b8) = 0xffffffff
                return eax_10
    
    return eax_2
}
