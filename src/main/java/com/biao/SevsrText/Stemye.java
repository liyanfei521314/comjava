package com.biao.SevsrText;

import com.biao.haveuse.Xitong;
import com.biao.pojo.Permissiontb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/system",name = "系统模块")
public class Stemye {

    @Autowired
    RequestMappingHandlerMapping requestMappingHandlerMapping;

    @Autowired
    private Xitong xitong;

    @GetMapping(value = "/update", name = "更新系统权限")
    public String updateSystemPermission() {
        return "执行了"+this.modifySystemPermission()+"条操作";
    }

    /**
     * 更新系统权限
     * @return
     */

    private synchronized Integer modifySystemPermission() {

        //已存在是于据库的权限内容
        List<String> oldpermissionURLS =xitong.selectpermissiontb();

        Map<RequestMappingInfo, HandlerMethod> mappingInfoHandlerMethodMap =
                requestMappingHandlerMapping.getHandlerMethods();
//        得到所有被requestMapping所修饰的方法
        Collection<HandlerMethod> handlerMethods = mappingInfoHandlerMethodMap.values();

        if (handlerMethods == null || handlerMethods.isEmpty()) {
            return 0;
        }

        Integer sum=0;
        for (HandlerMethod method : handlerMethods) {
            RequestMapping methodRequestMapping = method.getMethodAnnotation(RequestMapping.class);
            if (!"".equals(methodRequestMapping.name())) {
                String methodURL = methodRequestMapping.value()[0];
                RequestMapping classRequestMapping =
                        method.getBeanType().getAnnotation(RequestMapping.class);
                //模块名称
                String module = "".equals(classRequestMapping.name()) ? "" : classRequestMapping.name();
                //方法名称
                String classURL = classRequestMapping.value()[0];
                //权限内容
                String permissionURL = (classURL + ":" + methodURL).replace("/", "");
                //权限名称
                String permissionNAME = methodRequestMapping.name();

                Permissiontb permissiontb = new Permissiontb();
                permissiontb.setPermissionValue(permissionURL);
                permissiontb.setPermissionModule(module);
                permissiontb.setPermissionName(permissionNAME);

                if (!oldpermissionURLS.contains(permissionURL)) {
                    int n = xitong.insertpermissiontb(permissiontb);
                    sum += n;
                }
            }

        }
        return sum;
    }
 }
