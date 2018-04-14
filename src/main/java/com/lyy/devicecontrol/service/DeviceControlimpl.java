package com.lyy.devicecontrol.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DeviceControlimpl implements DeviceControl{
    @Override
    public String sendCMD(String cmds) {
        return "发送指令"+cmds;
    }

    @Override
    public String sendCMS(String cms, String deviceId) {
        return "设备"+deviceId+"发送命令"+cms;
    }


}
